package com.koreanair.poc.tenant;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.koreanair.poc.api.TenantsApi;
import com.koreanair.poc.api.model.TenantsDto;

import io.swagger.annotations.Api;

@Controller
@Api(tags = "tenants")
public class TenantsController implements TenantsApi{
	
	private final TenantsService tenantsService;
	
	public TenantsController(TenantsService tenantsService) {
		this.tenantsService = tenantsService;
	}
	@Override
	public ResponseEntity<List<TenantsDto>> getTenantList() {
		List<TenantsDto> list = new ArrayList<>();
		for(TenantsVo tenantsVo : tenantsService.getTenantList()) {
			TenantsDto tenantsDto = new TenantsDto();
			tenantsDto.setId((int) tenantsVo.getId());
			tenantsDto.setName(tenantsVo.getName());
			tenantsDto.setDescription(tenantsVo.getDescription());
			tenantsDto.setRegisterdate(tenantsVo.getRegisterdate());
			tenantsDto.setUpdateddate(tenantsVo.getUpdateddate());
			list.add(tenantsDto);
		}
		return ResponseEntity.ok().body(list);
	}

	@Override
	public ResponseEntity<TenantsDto> postTenant(@Valid TenantsDto tenantsDto) {
		TenantsVo tenantsVo = new TenantsVo();
		tenantsVo.setName(tenantsDto.getName());
		tenantsVo.setDescription(tenantsDto.getDescription());
		
		tenantsService.postUser(tenantsVo);
		
        return ResponseEntity.status(HttpStatus.CREATED).body(tenantsDto);
	}

	@Override
	public ResponseEntity<TenantsDto> deleteTenant(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<TenantsDto> getTenant(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<TenantsDto> putTenant(Integer id, @Valid TenantsDto tenantsDto) {
		// TODO Auto-generated method stub
		return null;
	}

}
