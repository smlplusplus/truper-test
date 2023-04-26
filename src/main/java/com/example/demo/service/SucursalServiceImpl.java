package com.example.demo.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.SucursalDTO;
import com.example.demo.model.Sucursal;
import com.example.demo.repository.SucursalRepository;

@Service
public class SucursalServiceImpl implements SucursalService {

	@Autowired
	private SucursalRepository sucursalRepository;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public SucursalDTO createSucursal(SucursalDTO sucursalDTO) {
		return modelMapper.map(sucursalRepository.save(modelMapper.map(sucursalDTO, Sucursal.class)),
				SucursalDTO.class);
	}

}
