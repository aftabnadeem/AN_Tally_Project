package com.aftab.ANTally;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class homecontroller {
	@Autowired
	private datrepo acc;
	@Autowired
	private tranrepo er;
	@Autowired
    private querrepo qr;
	@RequestMapping("home")
	public ModelAndView home() {
		ModelAndView m=new ModelAndView();
		m.setViewName("Home.jsp");
		return m;
	}
	
	
	@RequestMapping("execute")
public String acceptQuery(@RequestParam("transaction")String a,RedirectAttributes rd) {
	String[] b=a.split(" ");
	transac tr;
	String res;
	
	Accounts ac=new Accounts();
if((b[0].equals("purchased") || b[0].equals("bought")) && b[2].equals("from") && b[4].equals("through") && b[6].equals("Rs")) {
		
		Pattern p=Pattern.compile("\\d+");
		Matcher m=p.matcher(b[7]);
		boolean t=m.matches();
		double d=Double.parseDouble(b[7]);
		
		if(t) {
			ac=acc.getById("Nadeem");
			double balance=ac.getBalance()-d;
			ac.setBalance(balance);
			acc.save(ac);
			tr=new transac("purchase",b[3],"Nadeem",d,d, balance);
			er.save(tr);
			res="Executed Statement: "+a;
			}
			
	       else {
	    	   res="Enter number only";
	    	   }
	}
	
	else if(b[0].equals("sold") && b[2].equals("to") && b[4].equals("for") && b[6].equals("Rs")) {
		Pattern pa=Pattern.compile("\\d+");
		Matcher mm=pa.matcher(b[7]);
		boolean t=mm.matches();
		double d=Double.parseDouble(b[7]);
		
		if(t) {
			ac=acc.getById("Nadeem");
			double balance=ac.getBalance()+d;
			ac.setBalance(balance);
			acc.save(ac);
			tr=new transac("sales",b[3],"Nadeem",d,d, balance);
			er.save(tr);
			res="Executed Statement: "+a;
			
			}
		else {
			res="Enter number only";
		  }
		
	}
	
	else {
		res="invalid query";
		}
	
	rd.addFlashAttribute("query",res);
	return "redirect:/Home.jsp";
}
	@RequestMapping("viewacc")
	public String view() {
		return "viewacc.jsp";
	}
	
	@RequestMapping("display")
	public ModelAndView disp(@RequestParam("val")String val) {
		List<transac> t=new ArrayList<transac>();
		ModelAndView m=new ModelAndView();
		m.setViewName("display.jsp");
		if(val.equals("purchase") || val.equals("sales")) {
		t=er.findByTranstype(val);
		m.addObject("title", val);
		}
		else {
			t=er.findByTo(val);
			m.addObject("title", val);
		}
		
		
		
		m.setViewName("display.jsp");
		m.addObject("list",t);
		
		return m;
	}
}
