package com.example.demo.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.OrdenDTO;
import com.example.demo.model.Orden;
import com.example.demo.repository.OrdenRepository;

@Service
public class OrdenServiceImpl implements OrdenService {

	@Autowired
	private OrdenRepository ordenRepository;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public OrdenDTO createOrder(OrdenDTO ordenDTO) {
		return modelMapper.map(ordenRepository.save(modelMapper.map(ordenDTO, Orden.class)), OrdenDTO.class);
	}

}
