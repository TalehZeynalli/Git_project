package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.domain.Ticket;

public interface TicketRepo extends JpaRepository<Ticket, Integer> {



}
