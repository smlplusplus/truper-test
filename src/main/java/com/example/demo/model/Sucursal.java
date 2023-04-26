package com.example.demo.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "sucursales")
public class Sucursal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)
	private String nombre;

	@OneToMany(mappedBy = "sucursal", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Orden> ordenes = new HashSet<>();

	public Sucursal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sucursal(Long id, String nombre) {
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

	public Set<Orden> getOrdenes() {
		return ordenes;
	}

	public void setOrdenes(Set<Orden> ordenes) {
		this.ordenes = ordenes;
	}

}
