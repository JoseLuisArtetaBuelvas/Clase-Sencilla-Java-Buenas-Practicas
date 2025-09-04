/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.buenaspracticas;

/**
 *
 * @author zaduking
 */
public class BuenasPracticas {
    private String nombre;
    private int edad;
    public static void main(String[] args) {
        //Hacemos un trycath para atrapar posibles errores
        try {
            BuenasPracticas persona1 = new BuenasPracticas("Jose", 21);
            BuenasPracticas persona2 = new BuenasPracticas("Luis", 21);
            
            //Mostramos en consola los resultados
            System.out.println("Datos guardados correctamte");
            System.out.println(persona1.nombre + persona1.edad);
            System.out.println(persona2.nombre + persona2.edad);
        } catch (Exception e) {
        }
    }
    
    public BuenasPracticas(String nombre, int edad){
        if(nombre == null || nombre.trim().isEmpty()){
            throw new IllegalArgumentException("El nombre se encuentra vacio");
        }else if(edad < 0 || edad >= 150){
            throw new IllegalArgumentException("Error en tu edad" + " " + edad);
        }
        
        //inicializacion de las instancias de atributos
        this.nombre = nombre.trim();
        this.edad = edad;
    }
}
