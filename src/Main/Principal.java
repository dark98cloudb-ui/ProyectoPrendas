package Main;

import java.util.Scanner;

import Dominio.Ropas;
import Implementacion.LogicaMetodos;

public class Principal {
	
	@SuppressWarnings("resource")
	public static void main(String[]arg) {
		// TODO Auto-generated method stub
		
		Scanner lectura = null;
		
		LogicaMetodos imp = new LogicaMetodos();
		
		 String marca;
		 char talla;
		 float precio;
		 int existencia, menuPrin;
		 
		 Ropas ropa = null;
		 
		 System.out.println("Primera oportunida");
		 
		 
		 do {
			 System.out.println("MENU PRINCIPAL");
			 System.out.println("1--ALTA");
			 System.out.println("2--MOSTRAR");
			 System.out.println("3--BUSCAR");
			 System.out.println("4--EDITAR");
			 System.out.println("5--ELIMINAR");
			 System.out.println("6--SALIR");
			 
			 lectura = new Scanner(System.in);
			 menuPrin = lectura.nextInt();
			 
			 switch (menuPrin) {
			case 1:
				try {
					System.out.println("Ingresa la marca");
					lectura = new Scanner(System.in);
					marca = lectura.nextLine();
					
					System.out.println("Ingrese la talla");
					lectura = new Scanner(System.in);
					talla = lectura.next().charAt(0);
					
					System.out.println("Ingrese el precio");
					lectura = new Scanner(System.in);
					precio = lectura.nextFloat();
					
					System.out.println("Ingrese la existencia");
					lectura = new Scanner(System.in);
					existencia = lectura.nextInt();
					
					//Crear el objeto
					ropa = new Ropas(marca, talla, precio, existencia);
					
					//Agregar el hashmap
					imp.guardar(ropa);
					System.out.println("Se guardo");
							
					
				} catch (Exception e) {
					// TODO: handle exception
					
					System.out.println("Error al guardar " + e.getMessage());
				}
				break;
			case 2:
				if (imp.contarRegHashm() > 0)
					imp.mostar();
				else
					System.out.println("No hay registros");
				break;
			case 3:
				if (imp.contarRegHashm() > 0) {
					
					System.out.println("Ingresa la marca a buscar");
					lectura = new Scanner(System.in);
					marca = lectura.nextLine();
					
					//buscar
					ropa = imp.buscar(marca);
					
					if (ropa != null)
						System.out.println(ropa);
					else
						System.out.println("No existe esa marca");
					
				}else
					System.out.println("No hay registros para buscar");
				break;
			case 4:
				
				if (imp.contarRegHashm() > 0) {
					
				
				
					System.out.println("Ingresa la marca del registro a editar");
					lectura = new Scanner(System.in);
					marca = lectura.nextLine();
					
					//Buscar
					ropa = imp.buscar(marca);
					
					if (ropa != null) {
						System.out.println("Se encontrol la prende: " + ropa.getMarca());
						
						System.out.println("Ingrese el nuevo precio");
						lectura = new Scanner(System.in);
						precio = lectura.nextFloat();
						
						//Actualizar el objeto
						ropa.setPrecio(precio);
						
						//Actualizar el objeto en el hashmap
						imp.editar(ropa);
						System.out.println("Se edito");
						
					}else
						System.out.println("No se encontro esa marca");
				}else 
					System.out.println("No hay registros para editar");				
				break;
			case 5:
				System.out.println("Ingrese la marca para eliminar");
				lectura = new Scanner(System.in);
				marca = lectura.nextLine();
				
				//Eliminar
				imp.eliminar(marca);
				System.err.println("Se elimino");
				break;
			case 6:
				break;
			}
			 
		 }while(menuPrin < 6);
	}
	
	
}
