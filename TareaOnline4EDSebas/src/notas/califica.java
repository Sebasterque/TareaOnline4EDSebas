package notas;

import java.util.Scanner;

public class califica {

public static void main(String[] args) {

final Scanner Entrada = new Scanner(System.in); 
System.out.println("Introduzca el valor de una calificación: "); 
int num_nota = Entrada.nextInt(); 
Entrada.close();
califica(num_nota); 
}

public static void califica(int num_nota) {
	String c;
	if (num_nota >= 0 && num_nota< 5) {	c  = "Suspenso";}

	else if (num_nota >= 5 && num_nota< 7){	c  = "Aprobado";}

	else if (num_nota >= 7 && num_nota <9){	c  = "Notable";}

	else if (num_nota >= 9 && num_nota<= 10){	c  = "Sobresaliente";}

	else {c  = "El valor de la calificación introducida no es correcta";}

	System.out.println(c );
}
}
