package com.koreanair.poc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.tuple;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.koreanair.poc.tenant.Tenants;
import com.koreanair.poc.tenant.TenantsDao;
import com.koreanair.poc.tenant.TenantsService;
import com.koreanair.poc.tenant.TenantsServiceImpl;
import com.koreanair.poc.tenant.TenantsVo;

@ExtendWith(MockitoExtension.class)
public class TenantServiceTests {
	
	@Mock
	private TenantsDao tenantsDao;
    
	@Test
    public void test_getTenantList() {
    	
		List<Tenants> list = new ArrayList<>();
		Tenants tenantEntity = new Tenants();
		tenantEntity.setId(1);
		tenantEntity.setName("tenant1");
		tenantEntity.setDescription("tenant1 desc");
		list.add(tenantEntity);

		tenantEntity = new Tenants();
		tenantEntity.setId(2);
		tenantEntity.setName("tenant2");
		tenantEntity.setDescription("tenant2 desc");
		list.add(tenantEntity);

        when(tenantsDao.findAll()).thenReturn(list);
        
        TenantsService tenantService = new TenantsServiceImpl(tenantsDao);

        List<TenantsVo> tenantList = tenantService.getTenantList();
        assertThat(tenantList).extracting("id", "name").contains(
                tuple(1, "tenant1"),
                tuple(2, "tenant2")
                );
    }
}
