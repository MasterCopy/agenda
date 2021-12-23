package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Cita;

@Repository
public class CitaDaoImpl implements CitaDao {

	@Autowired
	CitaJpaSpring citaRepository;
	
	@Override
	public void crearCita(Cita cita) {
		citaRepository.save(cita);
	}

	@Override
	public Cita recuperarCita(int idCita) {
		return citaRepository.findById(idCita).orElse(null);
	}

	@Override
	public void eliminarCita(int idCita) {
		citaRepository.deleteById(idCita);
	}

	@Override
	public List<Cita> recuperarCitas() {
		return citaRepository.findAll();
	}

	@Override
	public void actualizarCita(Cita cita) {
		citaRepository.save(cita);	
	}

}
