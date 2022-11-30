/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author SALA I
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String nombre;
        String opcion = " ";
        String cadena = " ";
        boolean bandera = true;
        int cedula;
        int horasMatutinas;
        int horasNocturnas;
        String ciudadEmpresa;
        int valorMatutina = 10;
        int totalMatutinas;
        int totalNocturnas;
        int valorNocturna = 15;
        double subtotal;
        double valorCancelar;
        double adicional = 0.10;
        double seguro = 0.18;
        int contador = 1;
        
        while(bandera){
            
            System.out.println("Ingrese su nombre");
            nombre = entrada.nextLine();
            System.out.println("Ingrese la ciudad donde se ubica su empresa");
            ciudadEmpresa = entrada.nextLine();
            
            System.out.println("Ingrese su numero de cedula");
            cedula = entrada.nextInt();
            System.out.println("Ingrese las horas matutinas trabajadas");
            horasMatutinas = entrada.nextInt();
            System.out.println("Ingrese las horas nocturnas trabajadas");
            horasNocturnas = entrada.nextInt();
            entrada.nextLine();
            
            totalMatutinas = valorMatutina * horasMatutinas;
            
            if(horasNocturnas >= 10){
                
                adicional = adicional * valorNocturna;
                valorNocturna = (int) (valorNocturna + adicional);
                totalNocturnas = valorNocturna * horasNocturnas;  
            } else{
                totalNocturnas = valorNocturna * horasNocturnas; 
            }  
            
            subtotal = totalNocturnas + totalMatutinas;
            
            seguro = subtotal * seguro;
            
            valorCancelar = subtotal - seguro;
            
            cadena = String.format("%s Rol del trabajador de nombre %s y "
                    + "%d\n Horas Matutinas trabajadas: %d\nHoras Nocturnas "
                    + "trabajadas: %d\n Subtotal: %.2f\n Seguro Social: %.2f\n "
                    + "Total a cancelar %.2f\n", cadena, nombre, cedula, 
                    horasMatutinas, horasNocturnas, subtotal, seguro,
                    valorCancelar );
            contador = contador + 1;
            
            System.out.println("Si desea terminar el proceso ingrese la "
                    + "letra s");
            
            opcion = entrada.nextLine();
            
            if("s".equals(opcion)){
                bandera = false; 
            }
        }
        System.out.println(cadena);
    }
    
}
