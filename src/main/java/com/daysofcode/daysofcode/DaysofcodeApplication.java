package com.daysofcode.daysofcode;


import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DaysofcodeApplication {

	/*Ejercicio 1: Crear variable numerica que se llame clave departamento, para ingresar la cave 1, 2 o 3
	* armar funcion con estructura de condiciones if para cada clave comparando con los años de ss y entregando el dato de días de vacaciones
	* Preguntar al usuario : nombre trabajador, clave del departamento y antiguedad del trabajador.
	* crear una variable para cada dato consultado al usuario.
	* iniciar scanner y almacenar las variables consultadas al usuario.
	* llamar a la funcion con los datos de la variable.
	*/
   
	
   public static String ejercicio (String nombre, int claveDepartamento, int antiguedad){

	System.out.println("");
	   if(claveDepartamento==1){
		   if(antiguedad==1){
			   System.out.println("El trabajador " + nombre+ " recibe 6 días");
		   }
		   else if(antiguedad<=6){
			   System.out.println("El trabajador" + nombre+ " recibe 14 días de vacaciones");
		   }
		   //puedo poner else sin condición y se va a asumir que la antiguedad será mayor a 7? o mejor
		   //un else con >7
		   else if(antiguedad>7){
			   System.out.println("El trabajador" + nombre+ " recibe 20 días de vacaciones");
		   }
	   }
	   else if(claveDepartamento==2){
		   if(antiguedad==1){
			   System.out.println("El trabajador" + nombre+ " recibe 7 días");
		   }
		   else if(antiguedad<=6){
			   System.out.println("El trabajador" + nombre+ " recibe 15 días de vacaciones");
		   }
	   
		   else if(antiguedad>7){
			   System.out.println("El trabajador" + nombre+ "recibe 22 días de vacaciones");
	   }
	   }
   
	   else{
		   if(antiguedad==1){
			   System.out.println("El trabajador " + nombre+ " recibe 10 días");
		   }
		   else if(antiguedad<=6){
			   System.out.println("El trabajador " + nombre+ " recibe 20 días de vacaciones");
		   }
	   
		   else if(antiguedad>7){
			   System.out.println("El trabajador " + nombre+ " recibe 30 días de vacaciones");
		   }
	   }
   
	   return "Los días de vacaciones del trabajor son: ";
   } 	
   
   

	/*Ejercicio 2.  Pedir al usuario que ingrese una cantidad de alumnos, a quienes se les asignará una nota. Luego 
	 de ingresar la cantidad de alumno y la cantidad de notas por alumnos, se desplegará un menú con las siguientes
	 opciones:
	 * mostrar el promedio de notas
	 * mostrar si la nota es aprobatria y reprobatoria
	 * mostrar si la nota está por sobre o por debajo del promedio del curso
	 */ 



	public static void main(String[] args) {
		
	Scanner teclado = new Scanner (System.in);

	//Ejercicio 1

	String nombre = "";	
	int claveDepartamento= 0;
	int antiguedad =0;
		
	
		System.out.print("Ingrese nombre del trabajador: ");
			nombre = teclado.nextLine();
	
		System.out.print("Ingrese número clave del departamento: ");
			claveDepartamento = teclado.nextInt();
	
		System.out.print("Ingrese antiguedad laboral: ");
			antiguedad = teclado.nextInt();
	
		ejercicio(nombre, claveDepartamento, antiguedad);
		
		System.out.println("");
		System.out.println("Fin ejercicio 1");
		System.out.println("");


//Ejercicio 2

		
	System.out.println("Ingrese cantidad de alumnos: ");
	int inQAlumnos = teclado.nextInt();

	System.out.println("Ingrese la cantidad de notas por alumno: ");
	int inQNotas = teclado.nextInt();

	for (int i = 1; i <= inQAlumnos; i++) {
		for(int x=1; x<=inQNotas; x++)
		{System.out.print("Ingrese notas para el alumno " + i + " :");
		int inNotasIndividuales = teclado.nextInt();
		}
	}

	int QTotalDeNotas = inQAlumnos*inQNotas; 
	
System.out.println("Bienvenidos al menú");

int promedioGral = 0;
int inOpcionMenu =0;

promedioGral = QTotalDeNotas/inQAlumnos;
do{
System.out.println("1 Mostrar promedio, 2 mostrar si la nota es reprobatoria, 3 mostrar si la notá está por sobre el promedio, 0 para salir del menú");
inOpcionMenu = teclado.nextInt();

if(inOpcionMenu==1){
	System.out.println("El promedio general de notas es: " + promedioGral);
}else if(inOpcionMenu==2){
	for(int i= 1; i<=QTotalDeNotas; i++){
		if(i<4){
			System.out.println("La nota "+i+" es reprobatoria ");
		}else{
			System.out.println("La nota "+i+" es aprobatoria ");
		}
	}
}else if(inOpcionMenu==3){
	for(int i= 1; i<=QTotalDeNotas; i++){
		if(i<promedioGral){
			System.out.println("La nota "+i+" está por debajo del promedio del curso");
		}else{
			System.out.println("La nota "+i+" está por sobre el promedio del curso ");
		}

	}
}else if(inOpcionMenu ==0){
System.out.println("Hasta pronto, gracias por consultar el menú");
}

}while (inOpcionMenu != 0);

System.out.println("Fin ejercicio 2");

}
}
