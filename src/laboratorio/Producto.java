/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio;

/**
 *
 * @author Mabel
 */
public class Producto {
    private String Nombre;
    private int Existencia, precio_compra;
    
    public Producto(){
    }
   public String getNombre(){
       return Nombre;
   }
   
   public void setNombre(String Nombre){
       this.Nombre=Nombre;
   }
   
   public int getExistencia(){
       return Existencia;
   }
   
   public void setExistencia( int Existencia){
       this.Existencia=Existencia;
   }
   
    public int getprecio_compra(){
       return precio_compra;
    }
    
    public void setprecio_compra(int precio_compra){
        this.precio_compra=precio_compra;
    }

}



