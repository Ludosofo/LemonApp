package com.capgemini.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
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
@Table(name="usuarios")
public class Usuario implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@NotEmpty(message = "ERROR su alias no puede estar vacio")
	@Size( min = 4, max = 20, message = "El nombre tiene que estar entre 4 y 20 caracteres")
	private String alias;
	
	@NotNull
	@NotEmpty(message = "ERROR su nombre no puede estar vacio")
	@Size( min = 4, max = 20, message = "El nombre tiene que estar entre 4 y 20 caracteres")
	private String nombre;
	
	@NotNull
	@NotEmpty(message = "ERROR su apellidos no puede estar vacio")
	@Size( min = 4, max = 20, message = "El nombre tiene que estar entre 4 y 20 caracteres")
	private String apellidos;
	
	@NotNull
	@NotEmpty(message = "ERROR su password no puede estar vacio")
	@Size( min = 8, message = "El password tiene que tener minimo 8 caracteres")
	private String pass; // TODO: Investigar sobre seguridad
	
	// Añadimos un regex para la comprobación del email
	@NotNull
	@Email(message = "Correo no es valido", regexp = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])")
	private String mail;

	// Estos atributos pueden ser null
	private String telefono;
	private String geo;
	
	private String avatar; // Esto sería un dato obtenido de una imagen
	
	@OneToOne(cascade = CascadeType.ALL)
	private UsuarioImagen usuarioImage;
	
	//@OneToMany(mappedBy = "valoracion")
	//private List<Valoracion> nuestrasValoraciones; // Valoraciones de nuestro usuario
	
	//@OneToMany(mappedBy = "valoracion")
	//private List<Valoracion> valoracionesHaciaNosotros; // Valoraciones de nuestro usuario
}
