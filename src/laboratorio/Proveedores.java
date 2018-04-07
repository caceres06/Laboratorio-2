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
public class Proveedores {
    private String Empresa, TelEmpresa, prodAdquirido;
    private int cantProducto;
    
    public Proveedores(){
    }
    
    public String getEmpresa(){
        return Empresa;
    }
    
    public void setEmpresa(String Empresa){
        this.Empresa=Empresa;
    }
    
    public String getTelEmpresa(){
        return TelEmpresa;
    }
    
    public void setTelEmpresa(String TelEmpresa){
        this.TelEmpresa=TelEmpresa;
    }
    
    public String getprodAdquirido(){
        return prodAdquirido;
    }
    
    public void setprodAdquirido(String prodAdquirido){
        this.prodAdquirido=prodAdquirido;
    }
    
    public int getcantProducto(){
        return cantProducto;
    }
    
    public void setcantProdcuto(int cantProducto){
        this.cantProducto=cantProducto;
    }
}
