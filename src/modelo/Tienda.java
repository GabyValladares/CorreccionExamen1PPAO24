/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Tienda {
//         Nombre de la tienda.
//     Propietario de la tienda.
//     Identificador tributario de la tienda.
   // 1)ATRIBUTOS
            private String nombreTienda;
            private String propietario;
            private String ruc;
            private Computadora[] listaComputadoras;

            //  2) CONSTRUCTORES
    public Tienda() {
    }

    public Tienda(String nombreTienda, String propietario, String ruc, Computadora[] listaComputadoras) {
        this.nombreTienda = nombreTienda;
        this.propietario = propietario;
        this.ruc = ruc;
        this.listaComputadoras = listaComputadoras;
    }

   
    
      //3) ENCAPSULAMIENTO

    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public Computadora[] getListaComputadoras() {
        return listaComputadoras;
    }

    public void setListaComputadoras(Computadora[] listaComputadoras) {
        this.listaComputadoras = listaComputadoras;
    }
    
    
    //4)MÉTODOS DE REGLA DE NEGOCIO
    public void imprimir(){
        System.out.println("DATOS DE LA TIENDA+\n"+
                "Nombre:"+getNombreTienda()+"\n"+
                "Propietario:"+getPropietario()+"\n"+
                "RUC:"+getRuc()+
                "Computadoras Disponibles"+getListaComputadoras());
    }
}
