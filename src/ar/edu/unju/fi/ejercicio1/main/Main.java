package ar.edu.unju.fi.ejercicio1.main;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio1.model.Producto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Producto> producto = new ArrayList<Producto>();
		Scanner sc=new Scanner(System.in);
		boolean ingresoCorrecto = false;
		do {
			try {
				byte op=0;
				
					do {
						System.out.println("---MENU---");
						System.out.println("-1 Crear producto");
						System.out.println("-2 Mostrar todos los Productos");
						System.out.println("-3 Modificar producto");
						System.out.println("-4 SALIR");
						System.out.println("--------ingrese opcion-----------");
						op=sc.nextByte();
						
						switch (op) {
						case 1:
							//crearProducto();
							break;
						case 2:
							//mostrarProductos();
							break;
						case 3:
							//modificarProducto();
							break;
						case 4:
							System.out.println("FIN DEL PROGRAMA-- <3 --");
							ingresoCorrecto=true;
							break;
							
						default:
							System.out.println("VALOR INCORRECTO INTENTE NUEVMAENTE");
							break;
						}
						
					} while (op != 4);
					
				}catch(InputMismatchException e) {
					System.err.println("Error: Ingresa una opción válida (número).");
			        sc.next(); 
				}
	} while (!ingresoCorrecto);

	}
	}

}
