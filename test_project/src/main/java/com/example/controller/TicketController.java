package com.example.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Person;
import com.example.domain.Ticket;
import com.example.service.TicketService;

@RestController
@RequestMapping("/api/ticket")
public class TicketController {

	@Autowired
	private TicketService ticketService;
	
	@PostMapping("create")
	public Ticket create(Ticket ticket) {
		
		return ticketService.createTicket(ticket);
	}
	
	@GetMapping("/ticket")
	public List<Person> getExample(@RequestParam(value = "personId", defaultValue = "0") String id) {
		List<Person> personList = new ArrayList<>();
		Person person1 = new Person("1", "ilkay", "günel");
		personList.add(person1);

		Person person2 = new Person("2", "alican", "akkuş");
		personList.add(person2);

		Person person3 = new Person("3", "mustafa", "demir");
		personList.add(person3);

		if (id.equals("0")) {
			return personList;
		}
		else {
			return personList.subList(Integer.parseInt(id)-1, Integer.parseInt(id));
		}
	}
	}
	

