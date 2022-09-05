package kr.co.greenart.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;

// src/main/webapp/WEB-INF/spring/root-context.xml �� ����־ ����ִ�.
@Configuration
@PropertySource("classpath:kr/co/greenart/config/mysql.properties")
public class RootConfig {
	@Value("${jdbc.drivername}")
	private String drivername;
	@Value("${jdbc.url}")
	private String url;
	@Value("${jdbc.username}")
	private String username;
	@Value("${jdbc.password}")
	private String password;

//	��ü �����ϴ� ��� 2����
//	1. �ʵ常�� �����ش޶� / 2. parameter �κп� ���� �����ش޶�
//	@Autowired
//	private DataSource ds;

	@Bean
	public DataSource dataSource() {
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName(drivername);
		ds.setUrl(url);
		ds.setUsername(username);
		ds.setPassword(password);
		return ds;
	}

	@Bean
	@Autowired
	public JdbcTemplate jdbcTemplate(DataSource ds) {
		return new JdbcTemplate(ds);
	}
}