package com.company;

import java.math.*;

public class Main {

    public static void main(String[] args) {
	// métodos
       /* Scanner sc = new Scanner(System.in);
        System.out.print("¿Cual es tu nombre? : ");
        String nom = sc.nextLine();

        String mensaje = saludar(nom);
        System.out.println(mensaje);
        System.out.println(suma(5,2));
        despedida(nom);*/

        //Libreria math
        //imprime PI
        //System.out.println(Math.PI);
        //redondea el valor hacia arriba
        //System.out.println(Math.ceil(Math.PI));
        //raiz cuadrada
        //System.out.println(Math.sqrt(9));
        String mensaje1 = "Hola";
        String mensaje2 = "Adios !";
        System.out.println(mensaje1.length());
        //compara cadenas y devuelve un 0 si es verdadero, otro numero de es falso
        System.out.println(mensaje1.compareTo("Hola"));
        //equals compara cadenas y objetos y devuelve true o false
        System.out.println(mensaje1.equals(mensaje2));
        //equalsIgnoreCase compara cadenas e ignora si son mayusculas o minusculas
        System.out.println(mensaje1.equalsIgnoreCase("hola"));

    }

    /*public static  String saludar(String nombre){
        return "Hola, ¿como estas " + nombre + " ?";
    }

    public static int suma(int a, int b){
        return a + b;
    }

    public static void despedida(String nombre){
        System.out.println("Adios " + nombre);
    }*/
}
