package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.SucursalDTO;
import com.example.demo.service.SucursalService;

@RestController
@RequestMapping("/api/sucursal")
public class SucursalController {

	@Autowired
	private SucursalService sucursalService;

	@PostMapping
	public ResponseEntity<SucursalDTO> crearSucursal(@RequestBody SucursalDTO sucursalDTO) {
		return new ResponseEntity<>(sucursalService.createSucursal(sucursalDTO), HttpStatus.CREATED);
	}

}
