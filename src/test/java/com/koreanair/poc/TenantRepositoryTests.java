package com.koreanair.poc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.tuple;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.context.TestPropertySource;

import com.koreanair.poc.tenant.Tenants;
import com.koreanair.poc.tenant.TenantsDao;


@MybatisTest
@TestPropertySource(properties = { "spring.config.location=classpath:application-test.properties" })
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class TenantRepositoryTests {

    @Autowired
    private TenantsDao tenantsDao;
    
	@Test
    public void test_getTenantList() {

        List<Tenants> list = tenantsDao.findAll();
        assertThat(list).extracting("id", "name").contains(
                tuple(1, "hanium"),
                tuple(2, "hanium2")
                );
    }
}
