package ar.edu.unlam.pb2.eva03;

import java.util.Objects;

public class Deportista {
	private Integer numeroDeSocio;
	private String nombre;
	
	public Deportista (Integer codigoDeSocio, String nombre) {
		this.numeroDeSocio=codigoDeSocio;
		this.nombre=nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numeroDeSocio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Deportista other = (Deportista) obj;
		return Objects.equals(numeroDeSocio, other.numeroDeSocio);
	}

	public Integer getNumeroDeSocio() {
		return numeroDeSocio;
	}

	public void setNumeroDeSocio(Integer codigoDeSocio) {
		this.numeroDeSocio = codigoDeSocio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
