package com.gestion.empleados.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.gestion.empleados.exceptions.ResourceNotFoundException;
import com.gestion.empleados.model.Empleado;
import com.gestion.empleados.repositories.IEmpleadoRepository;


@Service
public class EmpleadoServiceImpl implements IEmpleadoService{

	@Autowired
	private IEmpleadoRepository empleadoRepository;
	
	@Override
	public List<Empleado> findAll() {
		return empleadoRepository.findAll();
	}

	@Override
	public Empleado findByIdEmpleado(int idEmpleado) {
		return empleadoRepository.findById(idEmpleado)
				.orElseThrow(()-> new ResourceNotFoundException(("Empleado no encontrado con ID: " + idEmpleado)));
	}

	@Override
	public Empleado insertEmpleado(Empleado empleado) {
	    if (empleadoRepository.existsById(empleado.getIdEmpleado())) {
	        throw new ResourceNotFoundException("Empleado no encontrado con ID: " + empleado.getIdEmpleado());
	    }
	    return empleadoRepository.save(empleado);
	}


	@Override
	public Empleado updateEmpleado(Empleado empleado) {
	    if (!empleadoRepository.existsById(empleado.getIdEmpleado())) {
	        throw new ResourceNotFoundException("Empleado no encontrado con ID: " + empleado.getIdEmpleado());
	    }
	    return empleadoRepository.save(empleado);
	}


	@Override
	public void deleteEmpleado(int idEmpleado) {
	    if (!empleadoRepository.existsById(idEmpleado)) {
	        throw new ResourceNotFoundException("Empleado no encontrado con ID: " + idEmpleado);
	    }
	    try {
	        empleadoRepository.deleteById(idEmpleado);
	    } catch (DataIntegrityViolationException e) {
	        throw new IllegalStateException("No se puede eliminar el empleado porque está asociado a otros registros.");
	    } catch (Exception e) {
	        throw new RuntimeException("Error inesperado al eliminar el empleado.");
	    }
	}




	
}
