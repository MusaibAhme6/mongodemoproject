package com.ty.mongodemoproject.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class User {

	@Id
	private int id;
	private String name;
	private String email;
	private int age;
	
}
