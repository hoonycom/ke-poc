package com.koreanair.poc.tenant;

import java.util.List;

public interface TenantsService {
	List<TenantsVo> getTenantList();
	TenantsVo getUser(Integer id);  
	TenantsVo postUser(TenantsVo tenantsVo);
	int putUser(TenantsVo tenantsVo);
	int deleteUser(TenantsVo tenantsVo);
}
