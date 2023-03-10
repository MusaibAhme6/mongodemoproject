package com.ty.mongodemoproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ty.mongodemoproject.dto.Ticket;
import com.ty.mongodemoproject.repository.ticketrepo.TicketRepository;

@RestController
@RequestMapping("/tickets")
public class TicketController {

	@Autowired
	private TicketRepository repository;
	
	@PostMapping(value = "/save")
	public Ticket saveTicket(@RequestBody Ticket ticket) {
		
		return repository.save(ticket);
	}
	
	@GetMapping(value = "getall")
	public List<Ticket> getAllTickets(){
		return repository.findAll();
	}
	
	@GetMapping(value = "/getbyid/{id}")
	public Ticket getById(@PathVariable int id) {
		return repository.findById(id).get();
		
	}
}
