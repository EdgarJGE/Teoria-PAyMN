package principal;

import leer.Leer;


public class Test {

	public static void main(String[] args) {

		System.out
				.println("Bienvenido a la tienda de JUEGOS, MÚSICA Y PELÍCULAS\n--------\n"
						+ "Los artículos sólo se pueden vender si están disponibles en la tienda\n"
						+ "¿Que deseas hacer?:\n"
						+ "\t Comprar productos de los existentes.\n"
						+ "\t Añadir nuevos productos a la cesta.\n"
						+ "\t Consultar el importe de la cuenta.");

		boolean continuar = true;
		int lecturaProducto, lecturaCantidad; // Variables para seleccionar el
												// producto y la cantidad que se
												// quiere comprar

		// Se instancian y cargan los productos
		Producto disco1 = new Musica("Metallica", 150, 6, true, "Metal");
		Producto disco2 = new Musica("Radiohead", 200, 20, true, "Rock");
		Producto cine1 = new Cine("Star Wars", 490, 5, true, "George Lucas");
		Producto juego1 = new Videojuego("Destiny", 550, 0, false,
				"MMO FPS");

		// Se crea el array "catálogo" para contener los productos. Su dimensión
		// viene del número de veces que se
		// instancia el contructor de Producto
		Producto catalogo[] = new Producto[Producto.dimesionArray];
		// Se crea el objeto gestion para trabajar (mostrar y vender productos,
		// y mostrar caja)
		Gestion gestion = new Gestion();

		// Se rellena el array catálogo
		catalogo[0] = disco1;
		catalogo[1] = disco2;
		catalogo[2] = cine1;
		catalogo[3] = juego1;

		do {
			System.out.println("\n\nIntroduzca la opción que desea realizar:\n"
					+ "1. Mostrar productos\n" + "2. Vender productos\n"
					+ "3. Mostrar caja\n"
					+ "SALIR --> Pulse cualquier otro número\n");
			switch (Leer.datoInt()) {
			case 1:
				gestion.mostrarProductos(catalogo);
				break;
			case 2:
				System.out.println("¿Que producto desea comprar?");
				gestion.mostrarNombreProductos(catalogo);
				lecturaProducto = Leer.datoInt();
				System.out.println("¿Cuánta cantidad desea comprar?");
				lecturaCantidad = Leer.datoInt();
				// Se carga el producto y la cantidad solicitada por el usuario
				gestion.comprarProducto(catalogo, lecturaProducto,
						lecturaCantidad);
				break;
			case 3:
				System.out.println(gestion.mostrarCaja() + " $");
				break;
			default:
				// Se sale del programa
				continuar = false;
			}

		} while (continuar);

		System.out.println("---- Gracias por usar la aplicación. ----");

	}

}
