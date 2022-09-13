package com.koreanair.poc;


import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.koreanair.poc.tenant.TenantsController;
import com.koreanair.poc.tenant.TenantsService;
import com.koreanair.poc.tenant.TenantsVo;

@ExtendWith(MockitoExtension.class)
@WebMvcTest(TenantsController.class)
public class TenantControllerTests {
	@Autowired
	private MockMvc mvc;

	@MockBean
	private TenantsService tenantService;

	@Test
	public void test_getTenantList() throws Exception {
		List<TenantsVo> list = new ArrayList<TenantsVo>();
		TenantsVo tenantVo = new TenantsVo();
		tenantVo.setId(1);
		tenantVo.setName("tenant1");
		tenantVo.setDescription("test1");
		list.add(tenantVo);

		tenantVo = new TenantsVo();
		tenantVo.setId(2);
		tenantVo.setName("tenant2");
		tenantVo.setDescription("test2");
		list.add(tenantVo);

		when(tenantService.getTenantList()).thenReturn(list);

		this.mvc.perform(get("/api/v1/tenants")).andExpect(status().isOk()).andExpect(jsonPath("$.[0].id", is(1)))
				.andExpect(jsonPath("$.[0].name", is("tenant1"))).andExpect(jsonPath("$.[1].id", is(2)))
				.andExpect(jsonPath("$.[1].name", is("tenant2")));
	}
}
