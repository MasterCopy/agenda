package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the citas database table.
 * 
 */
@Entity
@Table(name="citas")
@NamedQuery(name="Cita.findAll", query="SELECT c FROM Cita c")
public class Cita implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_citas")
	private int idCitas;

	private String activado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dia_cita")
	private Date diaCita;

	@Temporal(TemporalType.DATE)
	@Column(name="dia_creacion")
	private Date diaCreacion;

	private String nombre;

	public Cita() {
	}

	public int getIdCitas() {
		return this.idCitas;
	}

	public void setIdCitas(int idCitas) {
		this.idCitas = idCitas;
	}

	public String getActivado() {
		return this.activado;
	}

	public void setActivado(String activado) {
		this.activado = activado;
	}

	public Date getDiaCita() {
		return this.diaCita;
	}

	public void setDiaCita(Date diaCita) {
		this.diaCita = diaCita;
	}

	public Date getDiaCreacion() {
		return this.diaCreacion;
	}

	public void setDiaCreacion(Date diaCreacion) {
		this.diaCreacion = diaCreacion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}