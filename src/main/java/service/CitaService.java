package service;

import java.util.List;

import model.Cita;

public interface CitaService {

	boolean crearCita(Cita cita);
	
	Cita recuperarCita(int idCita);
	
	void eliminarCita(int idCita);
	
	List<Cita> recuperarCitas();
	
	void actualizarCita(Cita cita);
}
