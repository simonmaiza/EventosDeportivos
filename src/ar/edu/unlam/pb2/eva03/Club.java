package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;
import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;
import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;
import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Club {
	private String nombre;
	private Set<Deportista> socios;
	private Map<String, Evento> competencias;
	private Evento evento;
	
	public Club(String nombre) {
		this.nombre=nombre;
		this.socios= new HashSet<>();
		this.competencias=new HashMap<>();
	}

	public void agregarDeportista(Deportista deportista) {
		socios.add(deportista);
	}

	public Integer getCantidadSocios() {
		return socios.size();
	}

	public void crearEvento(TipoDeEvento tipoEvento, String nombre) {
		this.evento = new Evento(tipoEvento);
		competencias.put(nombre, evento);
	}
	
	public Integer inscribirEnEvento(String nombreEvento, Deportista deportista) throws NoEstaPreparado {
		Evento eventoEncontrado=buscarTipoDeEvento(nombreEvento);
		switch(eventoEncontrado.getTipo()) {
		case CARRERA_NATACION_EN_AGUAS_ABIERTAS:
			if(deportista instanceof INadador) {
				evento.agregarParticipante(deportista.getNumeroDeSocio(), deportista);
			} else throw new NoEstaPreparado();
			break;
			
		case CARRERA_42K:
			if(deportista instanceof ICorredor){
				evento.agregarParticipante(deportista.getNumeroDeSocio(), deportista);
			}else throw new NoEstaPreparado();
			break;
			
		case TRIATLON_IRONMAN:
			if(deportista instanceof INadador&&deportista instanceof ICorredor&&deportista instanceof ICiclista) {
				evento.agregarParticipante(deportista.getNumeroDeSocio(), deportista);
			}else throw new NoEstaPreparado();
			break;
		default:
			break;
		}
		return evento.cantidadInscriptos(eventoEncontrado);
	}

	private Evento buscarTipoDeEvento(String nombreEvento) {
		for (Map.Entry<String, Evento> entry : competencias.entrySet()) {
			String nombreEventoEncontrado=entry.getKey();
			Evento valorEventoEncontrado=entry.getValue();
			if(nombreEvento.equals(nombreEventoEncontrado)){
				return valorEventoEncontrado;
			};
		}
		return null;
	}

	public Integer getCantidadDeEventos() {
		return competencias.size();
	}
	
	
}
