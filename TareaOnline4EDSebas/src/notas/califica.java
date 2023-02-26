//Usara el paquete notas para la clase
package notas;

import java.util.Scanner;

// @Autor: Sebastián Galindo
// Versión actualizada con todos los ejercicios


public class califica {

public static void main(String[] args) {

//Pedimos un número entero que utilizaremos en el metodo Califica
final Scanner Entrada = new Scanner(System.in); 
System.out.println("Introduzca el valor de una calificación: "); 
int num_nota = Entrada.nextInt(); 
Entrada.close();
califica(num_nota); 
}

//Metodo califica publico para mostrar la calificación segun la nota introducida
public static void califica(int num_nota) {
	String calificacion;
	if (num_nota >= 0 && num_nota< 5) {	calificacion  = "Suspenso";}

	else if (num_nota >= 5 && num_nota< 7){	calificacion  = "Aprobado";}

	else if (num_nota >= 7 && num_nota <9){	calificacion  = "Notable";}

	else if (num_nota >= 9 && num_nota<= 10){	calificacion  = "Sobresaliente";}

	else {calificacion  = "El valor de la calificación introducida no es correcta";}

//Indicamos el resultado de la nota
	System.out.println(calificacion );
}
}
