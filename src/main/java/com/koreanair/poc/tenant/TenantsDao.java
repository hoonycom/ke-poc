package com.koreanair.poc.tenant;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TenantsDao extends JpaRepository<Tenants, Long> {

	@Override
	List<Tenants> findAll();
	
}

