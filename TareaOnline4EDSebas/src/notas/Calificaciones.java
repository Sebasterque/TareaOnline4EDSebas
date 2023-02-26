package notas;

import java.util.Scanner;

public class Calificaciones {

public static void main(String[] args) {

final Scanner Entrada = new Scanner(System.in); 
System.out.println("Introduzca el valor de una calificación: "); 
int n = Entrada.nextInt(); 
Entrada.close();
cali(n); 
}

public static void cali(int n) {
	String c;
	if (n >= 0 && n< 5) {	c  = "Suspenso";}

	else if (n >= 5 && n< 7){	c  = "Aprobado";}

	else if (n >= 7 && n <9){	c  = "Notable";}

	else if (n >= 9 && n<= 10){	c  = "Sobresaliente";}

	else {c  = "El valor de la calificación introducida no es correcta";}

	System.out.println(c );
}
}
