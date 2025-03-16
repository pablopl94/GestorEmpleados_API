package com.gestion.empleados.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Builder
@Table(name = "empleados")
public class Empleado {

	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_empleado")
	private int idEmpleado;
	
	@Column(name = "nombre", length = 60, nullable = false)
	private String nombre;
	
	@Column(name = "apellidos", length = 60, nullable = false)
	private String apellidos;
	
	@Column(name = "email", length = 60, nullable = false, unique = true)
	private String email;
	
}
