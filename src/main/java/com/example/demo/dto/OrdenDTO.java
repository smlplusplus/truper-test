package com.example.demo.dto;

import java.util.Date;
import java.util.Set;
import com.example.demo.model.Producto;
import com.example.demo.model.Sucursal;

public class OrdenDTO {
	private Long id;
	private Date date;
	private Float total;
	private Sucursal sucursal;
	private Set<Producto> productos;

	public OrdenDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrdenDTO(Long id, Date date, Float total, Sucursal sucursal, Set<Producto> productos) {
		super();
		this.id = id;
		this.date = date;
		this.total = total;
		this.sucursal = sucursal;
		this.productos = productos;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Float getTotal() {
		return total;
	}

	public void setTotal(Float total) {
		this.total = total;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

	public Set<Producto> getProductos() {
		return productos;
	}

	public void setProductos(Set<Producto> productos) {
		this.productos = productos;
	}

}
