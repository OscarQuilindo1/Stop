/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stop;

import java.util.Scanner;
import stop.View.JstopIniciar;

/**
 *
 * @author COMPUTECNICOS
 */

public class Basta{
    public static void main(String arg[]){
        
        
        
         JstopIniciar frameinicial = new JstopIniciar();
         frameinicial.setVisible(true);
         
         
   /*    //Generar variables
        Scanner in = new Scanner(System.in);
        String titulo[] = {"Nombre","Apellido","Animal","Color","Cosa","País","Fruta"};
        String valores1[] = new String [7]; //Aquí se almacenarán los datos del jugador 1
        String valores2[] = new String [7]; //Aquí se almacenarán los datos del jugador 2
        int puntos1[] = {100,100,100,100,100,100,100}; //Puntuacion del jugador 1, declarada en 100 para ahorrar código
        int puntos2[] = {100,100,100,100,100,100,100}; //Puntuacion del jugador 2
        int c=0; //variable de control
        
        //Generar caracter aleatorio
        int aux=(int)(Math.random()*26+65); //Genera un numero aleatorio acorde al codigo ASCII
        char caracter=(char)aux; //Combierte el número en un caracter (letra mayuscula de la A a la Z)
        
        //Solicitar valores al jugador 1
        for(c=0;c<7;c++){
            System.out.print("(Jugador 1)(Letra "+caracter+") Ingrese "+titulo[c]+": "); //Solicita valores acorde al arreglo titulo que creamos anteriormente.
            valores1[c]=in.next(); //Almacena el valor correpondiente en el arreglo
            if((valores1[c].toUpperCase()).charAt(0) != caracter){ //Convertimos el String a Char (Mayuscula) para pode r compararlo
                puntos1[c]=0; //Valida que la palabra inicie con la letra correspondiente al juego
            }
        }
        for(c=0;c<50;c++){
            System.out.println("");
        }
        //Solicitar valores al jugador 2
        for(c=0;c<7;c++){
            System.out.print("(Jugador 2)(Letra "+caracter+") Ingrese "+titulo[c]+": ");
            valores2[c]=in.next();
            if((valores2[c].toUpperCase()).charAt(0) != caracter){
                puntos2[c]=0;
            }
        }
        for(c=0;c<50;c++){
            System.out.println("");
        }
        
        //Comparar si las palabras se repiten
        for(c=0;c<7;c++){
            if((valores1[c].toLowerCase()).equals((valores2[c].toLowerCase())) && (puntos1[c]==100 || puntos2[c]==100)){
                puntos1[c]=50;
                puntos2[c]=50;
            } //En esta condición convertimos ambos valores del arreglo a minusculas y si son iguales y la puntuación aún es 100, asignamos la puntuación de 50.
        }
        
        //Calcular total del jugador 1
        int total1=0; //Crea variable para total del jugador 1
        for(c=0;c<7;c++){
            total1=total1+puntos1[c];
        }
        
        //Calcular total del jugador 2
        int total2=0;
        for(c=0;c<7;c++){
            total2=total2+puntos2[c]; //Esto es un acumulador para obtener el total de los puntos
        }
        
        //Imprimir puntuacion del jugador 1
        System.out.println("\nJugador 1:");
        for(c=0;c<7;c++){
            System.out.println(titulo[c]+": "+valores1[c]+"("+puntos1[c]+")");
        }
        
        //Imprimir puntuacion del jugador 2
        System.out.println("\nJugador 2:");
        for(c=0;c<7;c++){
            System.out.println(titulo[c]+": "+valores2[c]+"("+puntos2[c]+")");
        }
        
        //Mostrar al ganador
        if(total1 == total2){
            System.out.println("\nEmpate!");
        }
        else{
            if(total1>total2){
                System.out.println("\nEl jugador 1 gana!");
            }
            else{
                System.out.println("\nEl jugador 2 gana!");
            }
        }
        
        //Solo falta compilar y corregir los errores de dedo.
   */ }
}