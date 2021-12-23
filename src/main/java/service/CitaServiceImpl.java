package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.CitaDao;
import model.Cita;

@Service
public class CitaServiceImpl implements CitaService{

	@Autowired
	CitaDao citaDao;
	
	@Override
	public boolean crearCita(Cita cita) {
		citaDao.crearCita(cita);
		return true;
	}

	@Override
	public Cita recuperarCita(int idCita) {
		return citaDao.recuperarCita(idCita);
	}

	@Override
	public void eliminarCita(int idCita) {
		citaDao.eliminarCita(idCita);
	}

	@Override
	public List<Cita> recuperarCitas() {
		return citaDao.recuperarCitas();
	}

	@Override
	public void actualizarCita(Cita cita) {
		citaDao.actualizarCita(cita);		
	}

}
