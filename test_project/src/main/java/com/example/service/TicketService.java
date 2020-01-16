package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Ticket;
import com.example.repository.TicketRepo;

@Service
public class TicketService {

	@Autowired
	TicketRepo ticketRepo;

	public Ticket createTicket(Ticket ticket) {
		return ticketRepo.save(ticket);
	}

	   public Optional<Ticket> findById(Integer id) {
	        return ticketRepo.findById(id);
	    }

	
	
	
}
