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
    
    static ArrayList agregarEmpleado()
    {
        String nombre,codigo;
        ArrayList empleado_array = new ArrayList();
        int ano_ingreso;
        Empleado objemEmpleado;
        int opcion;
        Scanner scan = resetScan();
        System.out.println("cuantos clientes desea agregar?");
        int numero_Empleado = scan.nextInt();
        //iteramos sobre la cantidad de clientes agregamos a una lista y enviamos a la funcion agregar
                    for (int i = 0; i < numero_Empleado; i++) {
                        System.out.println("Ingresa el nombre del empleado");
                        scan = resetScan();
                        nombre = scan.nextLine();
                        System.out.println("Ingresa codigo del empleado");
                        scan = resetScan();
                        codigo = scan.nextLine();
                        System.out.println("Ingresa el ano_ingreso");
                        scan = resetScan();
                        ano_ingreso = scan.nextInt();
                        objemEmpleado= new Empleado(nombre, codigo, ano_ingreso);
                        empleado_array.add(objemEmpleado);
                          
                    } 
                    
                    return empleado_array;
       
        
    }
    static Scanner resetScan(){
        Scanner scan = new Scanner(System.in);
        return scan;
        
    }
     private static void listarEmpleado(ArrayList<Empleado> listaempleados) {
         Empleado objemEmpleado= new Empleado();
         for (int i = 0; i < listaempleados.size(); i++) {
                                System.out.println("\n");
                                System.out.println("Empleado"+"\t"+(i+1));
                                System.out.println("El nombre del empleado es:"+"\t"+listaempleados.get(i).getNombre());
                                System.out.println("El codigo del empleado es:"+"\t"+listaempleados.get(i).getCodigo());
                                System.out.println("El año de ingreso del empleado es:"+"\t"+listaempleados.get(i).getAño_Ingreso());
                            }
    }
    static int validad_numeros_negativos(int numero){
        try {
         
            if (numero<0) {
                numero=numero*-1;
                
            }
        } catch (Exception e) {
        }
        
        return numero;
        
    }
    static void eliminarEmpleado(ArrayList<Empleado> listaempleado, String codigo){
     
      
                        
                        double startTime = System.currentTimeMillis();
                        for (int i = 0; i < listaempleado.size(); i++) {
                            if(listaempleado.get(i).getCodigo().equals(codigo))
                            {

                                System.out.println("\n");
                                System.out.println("Empleado"+"\t"+(i+1));
                                System.out.println("El nombre del empleado es:"+"\t"+listaempleado.get(i).getNombre());
                                System.out.println("El codigo del empleado es:"+"\t"+listaempleado.get(i).getCodigo());
                                System.out.println("El codigo del empleado es:"+"\t"+ listaempleado.get(i).getAño_Ingreso());

                            }
                            }
    }
    static void buscarEmpleado(ArrayList<Empleado> listaempleados,String codigo){
        Scanner scan = resetScan();
                        
                        double startTime = System.currentTimeMillis();
                        for (int i = 0; i <= listaempleados.size(); i++) {
                            if(listaempleados.get(i).getCodigo().equals(codigo))
                            {

                                System.out.println("\n");
                                System.out.println("Empleado"+"\t"+(i+1));
                                System.out.println("El nombre del empleado es:"+"\t"+listaempleados.get(i).getNombre());
                                System.out.println("El codigo del empleado es:"+"\t"+listaempleados.get(i).getCodigo());
                                System.out.println("El codigo del empleado es:"+"\t"+listaempleados.get(i).getAño_Ingreso());

                            }else{
                                System.out.println("El empleado no existe");
                            }
                            }
        
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
            System.out.println("6.Salir\n");            

            System.out.println("**************************************************************\n");

            
            
            
        }
  
    public static void main(String[] args) {
        //creamos las diferentes variables
        String nombre,codigo;
        int numero_Empleado;
        ArrayList empleado_array = new ArrayList();
        int ano_ingreso;
        boolean menu = true;
        Empleado objemEmpleado;
        
        int opcion;
        
        //instanciamos el metodo scan
        Scanner scan = resetScan();
        //llamamos el metodo del menu
       
        do {
            menuEmpleado();
            opcion=0;
        try {
            opcion = scan.nextInt();
            validad_numeros_negativos(opcion);           
            
            switch (opcion) {
                case 1:
                    empleado_array= agregarEmpleado();
                                    
                    
                    break;
                case 2:
                    listarEmpleado(empleado_array);
                    break;
                case 3:
                    System.out.println("Ingresa el codigo del empleado");
                    scan = resetScan();
                    String id_empelado = scan.nextLine();
                    buscarEmpleado(empleado_array, id_empelado);
                    
                    break;
                case 4:
                    System.out.println("Ingresa el codigo del empleado que deseas elominar");
                     scan = resetScan();
                     String Codigo_Eliminar_Emplado = scan.nextLine();
                    eliminarEmpleado(empleado_array,Codigo_Eliminar_Emplado);
                    
                    
                    break; 
                case 5:
                    break;    
                            
                case 6:
                   menu =false;
                    break;
                default:
                    System.out.println("Opción invalida por favor ingresa otra opción dentro del menú");
                    break;
            }
            
            
        } catch (Exception e) {
            System.out.println("Opción no valida.");
        }
            
            
        } while (menu);
        
        
        
        
        
        
        
      
        
        
        
        
        
        
    }

   
    
    
}
