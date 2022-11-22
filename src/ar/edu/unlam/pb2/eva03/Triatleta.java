package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;
import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;
import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;
import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Triatleta extends Deportista implements ICiclista, ICorredor, INadador{

	private Integer codigoDeSocio;
	private String nombre;
	private String distanciaPreferida;
	private TipoDeBicicleta tipoBicicleta;
	
	public Triatleta(Integer codigoDeSocio, String nombre, String distanciaPreferida, TipoDeBicicleta tipoBicicleta) {
		super(codigoDeSocio, nombre);
		this.distanciaPreferida=distanciaPreferida;
		this.tipoBicicleta=tipoBicicleta;
	}

	
	public Integer getCodigoDeSocio() {
		return codigoDeSocio;
	}


	public void setCodigoDeSocio(Integer codigoDeSocio) {
		this.codigoDeSocio = codigoDeSocio;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDistanciaPreferida() {
		return distanciaPreferida;
	}


	public void setDistanciaPreferida(String distanciaPreferida) {
		this.distanciaPreferida = distanciaPreferida;
	}


	public TipoDeBicicleta getTipoDeBicicleta() {
		return tipoBicicleta;
	}


	public void setTipoBicicleta(TipoDeBicicleta tipoBicicleta) {
		this.tipoBicicleta = tipoBicicleta;
	}


	@Override
	public void setCantidadDeKilometrosEntrenados(Integer km) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer getCantidadDeKilometrosEntrenados() {
		// TODO Auto-generated method stub
		return null;
	}


}
