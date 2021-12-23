package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import model.Cita;
import service.CitaService;

@RestController
public class CitaController {

	@Autowired
	CitaService citaService;
	
	@PostMapping(value = "cita", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public String crearCita(@RequestBody Cita cita) {
		return String.valueOf(citaService.crearCita(cita));
	}
	
	@GetMapping(value = "cita/{idCita}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Cita recuperarCita(@PathVariable("idCita") int idCita) {
		return citaService.recuperarCita(idCita);
	}
	
	@DeleteMapping(value = "cita/{idCita}")
	public void eliminarCita(int idCita) {
		citaService.eliminarCita(idCita);
	}
	
	@GetMapping(value = "citas", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Cita> recuperarCitas(){
		return citaService.recuperarCitas();
	}
	
	@PutMapping(value = "cita", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void actualizarCita(@RequestBody Cita cita) {
		citaService.actualizarCita(cita);
	}
	 
}
