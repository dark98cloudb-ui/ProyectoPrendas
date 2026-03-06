package Implementacion;

import java.util.HashMap;

import Dominio.Ropas;

public class LogicaMetodos {
	
	//declamar un hashmap en vez de un alista
	//al pasarle los paramatro al hashmap tipos de datos primitivos 
	//deben de ir parseados
	
	private HashMap<String, Ropas> registroHash = new HashMap<String, Ropas>();
	
	public void guardar(Ropas ropa) {
	registroHash.put(ropa.getMarca(), ropa);
	}
	
	public void mostar() {
	System.out.println(registroHash);
	}
	
	public Ropas buscar(String marca) {
		return registroHash.get(marca);
	}
	
	public void editar(Ropas ropa) {
		registroHash.put(ropa.getMarca(), ropa);
	}
	
	public void eliminar(String marca) {
	registroHash.remove(marca);
	}
	
	//quitar si se muestra el hashmap o no
	
	public int contarRegHashm() {
		return registroHash.size();
	}
	
}
