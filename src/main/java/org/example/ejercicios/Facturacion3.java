package org.example.ejercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
//@author jhon Edison Muñoz


public class Facturacion3 {
	record Factura(String cliente,
				   LocalDate fechafactura,
				   List<Double> precioProducto) {}

	public static Double sumarPreciosFactura(Factura factura)
	{
		Double total = 0.0;
		for (Double precio : factura.precioProducto) {
			total += precio;
		}
		return total;
	}
	public static void mostrarDatosFactura(Factura factura, String idFactura)
	{
		System.out.println("Factura "+ idFactura);
		System.out.println("Fecha de la factura: " + factura.fechafactura);
		System.out.println("Cliente: " + factura.cliente());
		System.out.println("Total: " + sumarPreciosFactura(factura) + "\n");
	}

	public static void main(String[] args) {
		Factura factura1 = new Factura("Maria Sanabria",
				LocalDate.parse(" 01/07/1999 ", DateTimeFormatter.ofPattern(" dd/MM/uuuu ")),
				List.of(4500D, 5000D, 2500D));

		Factura factura2 = new Factura("Juan Perez",
				LocalDate.parse(" 15/08/2000 ", DateTimeFormatter.ofPattern(" dd/MM/uuuu ")),
				List.of(3500.0, 6000D, 2800D));

		mostrarDatosFactura(factura1, "1");
		mostrarDatosFactura(factura2, "2");

	}


}
