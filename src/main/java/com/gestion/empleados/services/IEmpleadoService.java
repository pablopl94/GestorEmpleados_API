package com.gestion.empleados.services;

import java.util.List;

import com.gestion.empleados.model.Empleado;

public interface IEmpleadoService {

	List<Empleado> findAll ();
	
	Empleado findByIdEmpleado (int idEmpleado);
	
	Empleado insertEmpleado (Empleado empleado);
	
	Empleado updateEmpleado (Empleado empleado);
	
	void deleteEmpleado (int idEmpleado);
	
}
