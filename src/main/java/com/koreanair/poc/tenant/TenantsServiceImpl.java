package com.koreanair.poc.tenant;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

@Service
@Transactional
public class TenantsServiceImpl implements TenantsService {

	private final TenantsDao tenantsDao;
	
	public TenantsServiceImpl(TenantsDao tenantsDao) {
		this.tenantsDao = tenantsDao;
	}
	
	@Override
	public List<TenantsVo> getTenantList() {
		
		List<TenantsVo> list = new ArrayList<TenantsVo>();
		
		for(Tenants tenants: tenantsDao.findAll()) {
			TenantsVo tenantsVo = new TenantsVo();
			tenantsVo.setId(tenants.getId());
			tenantsVo.setName(tenants.getName());
			tenantsVo.setDescription(tenants.getDescription());
			tenantsVo.setRegisterdate(tenants.getRegisterdate());
			tenantsVo.setUpdateddate(tenants.getUpdateddate());
			
			list.add(tenantsVo);
		}
		
		return list;
	}

	@Override
	public TenantsVo getUser(Integer id) {
		return null;
	}

	@Override
	public TenantsVo postUser(TenantsVo tenantsVo) {
		tenantsVo.setRegisterdate(OffsetDateTime.now());
		tenantsVo.setUpdateddate(OffsetDateTime.now());
        
		Tenants users = new Tenants();
		users.setName(tenantsVo.getName());
		users.setDescription(tenantsVo.getDescription());
		users.setRegisterdate(tenantsVo.getRegisterdate());
		users.setUpdateddate(tenantsVo.getUpdateddate());
		
		tenantsDao.save(users);
		
		return tenantsVo;
	}

	@Override
	public int putUser(TenantsVo tenantsVo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteUser(TenantsVo tenantsVo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
