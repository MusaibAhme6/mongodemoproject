package com.ty.mongodemoproject.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Ticket {
	
	@Id
	private int ticketId;
	private String ticketNumber;
	private User user;

}
