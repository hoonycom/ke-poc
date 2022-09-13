package com.koreanair.poc.tenant;

import java.time.OffsetDateTime;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TenantsVo {
	private long id;
	private String name;
	private String description;
	private OffsetDateTime registerdate;
	private OffsetDateTime updateddate;
}
