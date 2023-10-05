/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Logica_Negocio.Empleado;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaracion de variables
        String Nombre="";
        String Codigo="";
        int Año_Ingreso= 0;
        int Año_Actual= 2023; 
        int Resultado=0;
        
        //creacion de objetos no parametrizados
        
        Empleado objempleado=new Empleado();
        Scanner scan= new Scanner (System.in);
       
        System.out.println("digite el nombre");
        Nombre= scan.nextLine();
        objempleado.setNombre(Nombre);
        
        System.out.println("digite el codigo");
        Codigo= scan.nextLine();
        objempleado.setCodigo(Codigo);
          
        System.out.println("digite el año de ingreso");
        Año_Ingreso= scan.nextInt();
        objempleado.setAño_Ingreso(Año_Ingreso);
        
        
        int resta=(Año_Actual-objempleado.getAño_Ingreso());
        
        System.out.println("el nombre es :----------"+"\t"+objempleado.getNombre());
        System.out.println("el codigo es :----------"+"\t"+objempleado.getCodigo());
        System.out.println("el año de ingreso es :------"+"\t"+objempleado.getAño_Ingreso());
        System.out.println("los años laborados son :-------"+"\t"+resta);
  
        
        
        
        
        
        
    }
    
}
