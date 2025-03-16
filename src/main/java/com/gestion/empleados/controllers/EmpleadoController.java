package com.gestion.empleados.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.empleados.exceptions.ResourceNotFoundException;
import com.gestion.empleados.model.Empleado;
import com.gestion.empleados.services.IEmpleadoService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/empleados/")
public class EmpleadoController {

	@Autowired
	private IEmpleadoService empleadoService;
	
	//Ruta para obtener todos los empleados
	@GetMapping("/")
	public List<Empleado> listarTodosLosEmpleados() {
		return empleadoService.findAll();
	}	
	
	//Ruta para obtener un empleado por su id
	@GetMapping("/{idEmpleado}")
	public ResponseEntity<Empleado> buscarEmpleado(@PathVariable int idEmpleado) {
		return ResponseEntity.ok(empleadoService.findByIdEmpleado(idEmpleado));				
	}
	
	//Ruta para dar de alta un empleado
	@PostMapping("/alta")
	public ResponseEntity<Empleado> altaEmpleado(@RequestBody Empleado empleado) {
		return ResponseEntity.ok(empleadoService.insertEmpleado(empleado));		
	}
	
	//Ruta para actualizar un empleado
	@PutMapping("/actualizar/{idEmpleado}")
	public ResponseEntity<Empleado> actualizarEmpleado (@PathVariable int idEmpleado,@RequestBody Empleado empleado) {
		Empleado newEmpleado = empleadoService.findByIdEmpleado(idEmpleado);
		return ResponseEntity.ok(empleadoService.updateEmpleado(newEmpleado));	
	}
	
	@DeleteMapping("/{idEmpleado}")
	public ResponseEntity<Empleado> eliminarEmpleado(@PathVariable int idEmpleado) {
	    Empleado empleado = empleadoService.findByIdEmpleado(idEmpleado); // Obtener antes de eliminar
	    if (empleado == null) {
	        throw new ResourceNotFoundException("Empleado no encontrado con ID: " + idEmpleado);
	    }
	    
	    empleadoService.deleteEmpleado(idEmpleado); 

	    return ResponseEntity.ok(empleado); 
	}


	   
}
