/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Computadora {
//         Marca del computador.
//     Cantidad de memoria.
//     Características del procesador.
//     Sistema operativo.
//     Precio del computador.
    private String marca;
    private int cantidadMemoria;
    private String caracteristicasProcesador;
    private String sistemaOperativo;
    private double precio;

    public Computadora() {
    }

    public Computadora(String marca, int cantidadMemoria, String caracteristicasProcesador, String sistemaOperativo, double precio) {
        this.marca = marca;
        this.cantidadMemoria = cantidadMemoria;
        this.caracteristicasProcesador = caracteristicasProcesador;
        this.sistemaOperativo = sistemaOperativo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantidadMemoria() {
        return cantidadMemoria;
    }

    public void setCantidadMemoria(int cantidadMemoria) {
        this.cantidadMemoria = cantidadMemoria;
    }

    public String getCaracteristicasProcesador() {
        return caracteristicasProcesador;
    }

    public void setCaracteristicasProcesador(String caracteristicasProcesador) {
        this.caracteristicasProcesador = caracteristicasProcesador;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void imprimir(){
    
        System.out.println("DATOS DE LA COMPUTADORA\n"+
                "Marca:"+getMarca()+"\n"+
                "Memoria RAM:"+getCantidadMemoria()+"\n"+
                "Procesador:"+getCaracteristicasProcesador()+"\n"+
                "Sistema Operativo:"+getSistemaOperativo()+"\n"+
                "Precio:"+getPrecio());
    }
}
