package com.aftab.ANTally;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface tranrepo extends JpaRepository<transac, Integer> {
public List<transac> findByTranstype(String transtype);
public List<transac> findByTo(String to);
}
