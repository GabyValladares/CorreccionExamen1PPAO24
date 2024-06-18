/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Tienda {
    private String nombreTienda;
    private String propietario;
    private String ruc;
    private Computadora[] listaComputadoras;

    public Tienda() {
    }

    public Tienda(String nombreTienda, String propietario, String ruc, Computadora[] listaComputadoras) {
        this.nombreTienda = nombreTienda;
        this.propietario = propietario;
        this.ruc = ruc;
        this.listaComputadoras = listaComputadoras;
    }

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

    public void imprimir() {
        System.out.println("DATOS DE LA TIENDA\n" +
                "Nombre: " + getNombreTienda() + "\n" +
                "Propietario: " + getPropietario() + "\n" +
                "RUC: " + getRuc() + "\n" +
                "Computadoras Disponibles: ");
        for (Computadora computadora : getListaComputadoras()) {
            computadora.imprimir();
        }
    }

    public void listaProcesadores() {
        System.out.println("LISTA DE PROCESADORES:");
        for (Computadora computadora : listaComputadoras) {
            System.out.println(computadora.getCaracteristicasProcesador());
        }
    }

    public void listaProcesadoresMemorias() {
        System.out.println("LISTA DE PROCESADORES + MEMORIAS RAM:");
        for (Computadora computadora : listaComputadoras) {
            System.out.println("Procesador: " + computadora.getCaracteristicasProcesador() + 
                               ", Memoria RAM: " + computadora.getCantidadMemoria());
        }
    }

    public void listaPrecios() {
        System.out.println("LISTA DE PRECIOS:");
        for (Computadora computadora : listaComputadoras) {
            System.out.println(computadora.getPrecio());
        }
    }
}
