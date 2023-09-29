/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author usuario
 */
public class Empleado {
    //atributos
    
    public String Nombre;
    public String Codigo;
    public int Año_Ingreso;
    
    //contructor no parametrizado
    public Empleado()
    {
    
    
    }
    
    //constructor parametrizado

    public Empleado(String Nombre, String Codigo, int Año_Ingreso) {
        this.Nombre = Nombre;
        this.Codigo = Codigo;
        this.Año_Ingreso = Año_Ingreso;
        
    }
    
    //setters

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public void setAño_Ingreso(int Año_Ingreso) {
        this.Año_Ingreso = Año_Ingreso;
    }
    //getters

    public String getNombre() {
        return Nombre;
    }

    public String getCodigo() {
        return Codigo;
    }

    public int getAño_Ingreso() {
        return Año_Ingreso;
    }
    
    

    
    
  
    
}
