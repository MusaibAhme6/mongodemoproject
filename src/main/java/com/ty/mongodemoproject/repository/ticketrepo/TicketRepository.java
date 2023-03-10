package com.ty.mongodemoproject.repository.ticketrepo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ty.mongodemoproject.dto.Ticket;


public interface TicketRepository extends MongoRepository<Ticket, Integer>{
	
	

}
