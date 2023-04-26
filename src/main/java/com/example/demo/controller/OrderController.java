package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.OrdenDTO;
import com.example.demo.service.OrdenService;

@RestController
@RequestMapping("/api/order")
public class OrderController {

	@Autowired
	private OrdenService ordenService;

	@PostMapping
	public ResponseEntity<OrdenDTO> createOrder(@RequestBody OrdenDTO ordenDTO) {
		return new ResponseEntity<>(ordenService.createOrder(ordenDTO), HttpStatus.CREATED);
	}
}
