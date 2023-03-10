package com.ty.mongodemoproject.mongoconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DBProperties {

	@Value("${spring.data.mongodb.db1.host}")
	private String host1;

	@Value("${spring.data.mongodb.db1.port}")
	private String port1;

	@Value("${spring.data.mongodb.db1.database}")
	private String db1;

	@Value("${spring.data.mongodb.db2.host}")
	private String host2;

	@Value("${spring.data.mongodb.db2.port}")
	private String port2;

	@Value("${spring.data.mongodb.db2.database}")
	private String db2;

	public String getHost1() {
		return host1;
	}

	public void setHost1(String host1) {
		this.host1 = host1;
	}

	public String getPort1() {
		return port1;
	}

	public void setPort1(String port1) {
		this.port1 = port1;
	}

	public String getDb1() {
		return db1;
	}

	public void setDb1(String db1) {
		this.db1 = db1;
	}

	public String getHost2() {
		return host2;
	}

	public void setHost2(String host2) {
		this.host2 = host2;
	}

	public String getPort2() {
		return port2;
	}

	public void setPort2(String port2) {
		this.port2 = port2;
	}

	public String getDb2() {
		return db2;
	}

	public void setDb2(String db2) {
		this.db2 = db2;
	}
}
