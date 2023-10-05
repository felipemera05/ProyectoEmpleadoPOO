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
public class Main3 {
    
    //Creamos los metodos de funcionalidades
    
    public static void main(String[] args) {
        //creamos las diferentes variables
        String nombre,codigo;
        ArrayList<Empleado> empleado_array = new ArrayList();
        int ano_ingreso;
        boolean menu = true;
        Empleado objemEmpleado;
        int opc=0;

        Scanner scan = new Scanner(System.in);        
        //llamamos el metodo del menu
        
        System.out.println("**************************************************************\n");
            System.out.println("Ingresa alguna de las opcones\n");
            System.out.println("1.Agregar Empleado\n");
            System.out.println("2.Listar Empelado\n");

            System.out.println("3.Buscar Empelado\n");
            System.out.println("4.Eliminar Empelado\n");
            System.out.println("5.Editar Empleado Empelado\n");  
            System.out.println("6.Salir\n");            

            System.out.println("**************************************************************\n");
            opc =scan.nextInt();
            switch (opc) {
                case 1:
                     System.out.println("cuantos clientes desea agregar?");
                     int numero_Empleado = 0;
                     numero_Empleado = scan.nextInt();

        //iteramos sobre la cantidad de clientes agregamos a una lista y enviamos a la funcion agregar
                    for (int i = 0; i < numero_Empleado; i++) {
                        System.out.println("Ingresa el nombre del empleado");
                        nombre = scan.nextLine();
                        System.out.println("Ingresa codigo del empleado");
                        codigo = scan.nextLine();
                        System.out.println("Ingresa el ano_ingreso");
                        ano_ingreso = scan.nextInt();
                        objemEmpleado= new Empleado(nombre, codigo, ano_ingreso);
                        empleado_array.add(objemEmpleado);
                          
                    } 
                    break;
                case 2:
                    for (int i = 0; i < empleado_array.size(); i++) {
                                System.out.println("\n");
                                System.out.println("Empleado"+"\t"+(i+1));
                                System.out.println("El nombre del empleado es:"+"\t"+empleado_array.get(i).getNombre());
                                System.out.println("El codigo del empleado es:"+"\t"+empleado_array.get(i).getCodigo());
                                System.out.println("El año de ingreso del empleado es:"+"\t"+empleado_array.get(i).getAño_Ingreso());
                            }
                    break;
                case 3:
                    System.out.println("Ingresa el codigo del empleado");
                    String codigo_empleado = scan.nextLine();
                     double startTime = System.currentTimeMillis();
                        for (int i = 0; i <= empleado_array.size(); i++) {
                            if(empleado_array.get(i).getCodigo().equals(codigo_empleado))
                            {

                                System.out.println("\n");
                                System.out.println("Empleado"+"\t"+(i+1));
                                System.out.println("El nombre del empleado es:"+"\t"+empleado_array.get(i).getNombre());
                                System.out.println("El codigo del empleado es:"+"\t"+empleado_array.get(i).getCodigo());
                                System.out.println("El codigo del empleado es:"+"\t"+empleado_array.get(i).getAño_Ingreso());

                            }else{
                                System.out.println("El empleado no existe");
                            }
                            }
                    
                    break;
                case 4:
                    System.out.println("Ingresa el codigo del empleado que deseas elominar");
                     String Codigo_Eliminar_Emplado = scan.nextLine();
                        for (int i = 0; i < empleado_array.size(); i++) {
                            if(empleado_array.get(i).getCodigo().equals(Codigo_Eliminar_Emplado))
                            {

                                System.out.println("\n");
                                System.out.println("Empleado"+"\t"+(i+1));
                                System.out.println("El nombre del empleado es:"+"\t"+empleado_array.get(i).getNombre());
                                System.out.println("El codigo del empleado es:"+"\t"+empleado_array.get(i).getCodigo());
                                System.out.println("El codigo del empleado es:"+"\t"+ empleado_array.get(i).getAño_Ingreso());

                            }
                            }
                    
                    
                    break; 
                case 5:
                    scan.nextLine();
                    System.out.println("Digite el id del empleado a modificar");
                    String id_empelado=scan.nextLine();
                    for (int i = 0; i < empleado_array.size(); i++) {
                        if(empleado_array.get(i).getCodigo().equals(id_empelado))
                        {
                            scan.nextLine();
                            System.out.println("Digite el nombre del empleado");
                            nombre= scan.nextLine();
                            System.out.println("Digite el codigo del empleado");
                            codigo= scan.nextLine();
                            System.out.println("Digite el año de ingreso del empleado");
                            int año_ingreso= scan.nextInt();
                           
                            empleado_array.get(i).setNombre(nombre);
                            empleado_array.get(i).setCodigo(codigo);
                            empleado_array.get(i).setAño_Ingreso(año_ingreso);
                           
                        }
                        }
                    break;    
                            
                case 6:
                    break;
                default:
                    System.out.println("Opción invalida por favor ingresa otra opción dentro del menú");
                    break;
            }
   
        
        
        
        
      
        
        
        
        
        
        
    }

   
    
    
}
