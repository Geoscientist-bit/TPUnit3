package org.example.ejercicios;

public class CalculaAreaTriangulo5
{

	record Triangulo(String color,
					 Double base,
					 Double altura){}

	public static Double calcularArea(Triangulo triangulo)
	{
		Double valorAreaTriangulo = 0.0;
		valorAreaTriangulo = (triangulo.base * triangulo.altura)/ 2;
		return valorAreaTriangulo;
	}

	public static void mostrarValoresTriangulo(Triangulo triangulo)
	{
		System.out.println("Datos del triangulo de color: " + triangulo.color());
		System.out.println("Altura del triángulo: " + triangulo.altura());
		System.out.println("Base del triángulo: " + triangulo.base());
		System.out.println("Área del triangulo: " + calcularArea(triangulo) + "\n");
	}

	public static void main(String[] args)
	{
		Triangulo triangulo1 = new Triangulo("rojo", 4.0, 5.0);
		Triangulo triangulo2 = new Triangulo("verde", 6.0, 5.0);

		mostrarValoresTriangulo(triangulo1);
		mostrarValoresTriangulo(triangulo2);

	}


}
