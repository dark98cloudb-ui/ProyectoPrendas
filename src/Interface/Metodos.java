package Interface;

import Dominio.Ropas;

public interface Metodos {
	
	public void guardar(Ropas ropa);
	
	public void mostrar();
	
//Se selecciona la llave, en este caso es marca
	public Ropas buscar(String marca);
	
	public void editar(Ropas ropa);
	
	public void eliminar(String marca);
	

}
