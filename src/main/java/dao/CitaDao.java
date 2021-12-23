package dao;

import java.util.List;

import model.Cita;

public interface CitaDao {

	void crearCita(Cita cita);
	
	Cita recuperarCita(int idCita);
	
	void eliminarCita(int idCita);
	
	List<Cita> recuperarCitas();
	
	void actualizarCita(Cita cita);


	
}
