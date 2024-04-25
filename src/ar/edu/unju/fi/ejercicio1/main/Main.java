package ar.edu.unju.fi.ejercicio1.main;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio1.model.Producto;
import ar.edu.unju.fi.ejercicio1.model.Producto.Categoria;
import ar.edu.unju.fi.ejercicio1.model.Producto.OrigenFabricacion;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		List<Producto> productos = new ArrayList<Producto>();	
		
        int opcion = 0;

        do {
            System.out.println("\n\tMENÚ DE PRODUCTO");
            System.out.println("------------------------");
            System.out.println("1. Crear producto");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Modificar producto");            
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");

            try {
                opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        altaProducto(scanner, productos);
                        break;
                    case 2:
                        //mostrarDatosJugador(scanner,jugadores);
                        break;
                    case 3:
                        //mostrarJugadoresOrdenadosApellido(jugadores);
                        break;                    
                    case 4:
                        System.out.println("Saliendo del menú...");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente nuevamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número entero.");
                scanner.nextLine(); 
            } catch (Exception e) {
                System.out.println("Ocurrió un error inesperado. Motivo: " + e.getMessage());
            }
        } while (opcion != 8);

        scanner.close();
	}
	
	

private static void altaProducto(Scanner scanner, List<Producto> productos) {
	try {
        System.out.print("Ingrese el codigo del producto: ");
        String codigo =scanner.nextLine();

        System.out.print("Ingresar la descripcion del producto: ");
        String descripcion = scanner.nextLine();

        System.out.print("Ingrese el precio unitario del producto: ");
        double precioU = scanner.nextDouble();
        scanner.nextLine();
        
        int op=0;
        System.out.print("----ORIGEN DE FABRICACION---- ");
        System.out.println("1. ARGENTINA");
        System.out.println("2. CHINA");
        System.out.println("3. BRASIL");            
        System.out.println("4. URUGUAY");
        System.out.print("Ingrese una opción: ");
        ar.edu.unju.fi.ejercicio1.model.Producto.OrigenFabricacion origen = null;
        
        try {
            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1:
                     origen = OrigenFabricacion.ARGENTINA;
                    break;
                case 2:
                	origen = OrigenFabricacion.CHINA;
                    break;
                case 3:
                	origen = OrigenFabricacion.BRASIL;
                    break;
                case 4:
                	origen = OrigenFabricacion.URUGUAY;
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar un número entero.");
            scanner.nextLine(); 
        } catch (Exception e) {
            System.out.println("Ocurrió un error inesperado. Motivo: " + e.getMessage());
        }       
        
        op=0;
        System.out.print("----ORIGEN DE FABRICACION---- ");
        System.out.println("1. ARGENTINA");
        System.out.println("2. CHINA");
        System.out.println("3. BRASIL");            
        System.out.println("4. URUGUAY");
        System.out.print("Ingrese una opción: ");
        ar.edu.unju.fi.ejercicio1.model.Producto.Categoria categoria = null;
        
        try {
            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1:
                     categoria = Categoria.ELECTROHOGAR;
                    break;
                case 2:
                	categoria = Categoria.HERRAMIENTAS;
                    break;
                case 3:
                	categoria = Categoria.INFORMATICA;
                    break;
                case 4:
                	categoria = Categoria.TELEFONIA;
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar un número entero.");
            scanner.nextLine(); 
        } catch (Exception e) {
            System.out.println("Ocurrió un error inesperado. Motivo: " + e.getMessage());
        }        

        Producto producto = new Producto(codigo, descripcion, precioU, origen, categoria);
        productos.add(producto);     
        
        System.out.println("Producto agregado correctamente.");
    } catch (Exception e) {
        System.out.println("Error al dar de alta el producto. Motivo: " + e.getMessage());
    }
	
	}



}


