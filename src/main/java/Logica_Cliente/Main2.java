/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Logica_Negocio.Empleado;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Main2 {
    
    //Creamos los metodos de funcionalidades
    
    static void agregarEmpleado(Empleado objempelado)
    {
       
        
    }
    static Scanner resetScan(){
        Scanner scan = new Scanner(System.in);
        return scan;
        
    }
    static void eliminarEmpleado(String codigo){
        
    }
    static void buscarEmpleado(String codigo){
        
    }
    static void editarEmpleado(String nombre,String codigo,int Año_Ingreso){
        
    }
    //creamos el menu para motrar como interfaz grafica temporal
    static void menuEmpleado()
        {
            System.out.println("**************************************************************\n");
            System.out.println("Ingresa alguna de las opcones\n");
            System.out.println("1.Agregar Empleado\n");
            System.out.println("2.Listar Empelado\n");

            System.out.println("3.Buscar Empelado\n");
            System.out.println("4.Eliminar Empelado\n");
            System.out.println("5.Editar Empleado Empelado\n");            
            System.out.println("**************************************************************\n");

            
            
            
        }
  
    public static void main(String[] args) {
        //creamos las diferentes variables
        String nombre,codigo;
        int numero_Empleado;
        ArrayList empleado_array = new ArrayList();
        int ano_ingreso;
        Empleado objemEmpleado;
        int opcion;
        //instanciamos el metodo scan
        Scanner scan = resetScan();
        //llamamos el metodo del menu
        menuEmpleado();
        
        try {
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    //preguntamos cuantos clientes queremos subir
                    System.out.println("cuantos clientes desea agregar?");
                    numero_Empleado = scan.nextInt();
                    //iteramos sobre la cantidad de clientes agregamos a una lista y enviamos a la funcion agregar
                    for (int i = 0; i < numero_Empleado; i++) {
                        System.out.println("Ingresa el nombre del empleado");
                        scan = resetScan();
                        nombre = scan.nextLine();
                        System.out.println("Ingresa codigo del empleado");
                        scan = resetScan();
                        codigo = scan.nextLine();
                        System.out.println("Ingresa el nombre del ano_ingreso");
                        scan = resetScan();
                        ano_ingreso = scan.nextInt();
                        objemEmpleado= new Empleado(nombre, codigo, ano_ingreso);
                        empleado_array.add(objemEmpleado);
                        

                        
                    }
                   

                    
                    
                    
                    break;
                default:
                    throw new AssertionError();
            }
        } catch (Exception e) {
            System.out.println("Opción no valida.");
        }
        
        
        
        
        
        
        
      
        
        
        
        
        
        
    }
    
    
}
