package com.capgemini.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Table(name="ofertas")
public class Oferta implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
	
	@ManyToOne
	@NotNull
	private OfertaStatus status;
	
	
	@NotNull
	@NotEmpty(message = "Inserte un título para su oferta")
	@Size(min = 3, max = 50, message = "El título debe contener entre 3 y 50 caracteres")
	private String titulo;
	
	@NotNull
	@NotEmpty(message = "Inserte una descripción para su oferta")
	@Size(min = 3, max = 400, message = "La descripción del producto debe contenter entre  3 y 400 caracteres")
	private String descripcion;
	
	@NotNull
	@NotEmpty(message = "Inserte una descripción para su oferta")
	@Size(min = 3, max = 400, message = "La descripción del producto debe contenter entre  3 y 400 caracteres")
	private Double precio;
	
	@ManyToOne
	public Usuario usuario;
	
	@OneToMany(mappedBy="oferta")
	public List<OfertaImagenes> ofertaImagenes;
	
	
} 
	
	


