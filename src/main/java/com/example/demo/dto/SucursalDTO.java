package com.example.demo.dto;

public class SucursalDTO {
	private Long id;
	private String nombre;

	public SucursalDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SucursalDTO(Long id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
