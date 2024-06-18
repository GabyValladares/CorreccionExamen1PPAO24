/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;
import modelo.Computadora;
import modelo.Tienda;

public class Main {
    public static void main(String[] args) {
        Scanner es = new Scanner(System.in);
        System.out.println("Ingrese el número de Computadoras que va a tener la Tienda");
        int numComputadoras = es.nextInt();
        Computadora[] listaComputadoras = new Computadora[numComputadoras];

        // TIENDA
        Tienda lolita = new Tienda();
        lolita.setNombreTienda("Lolita");
        lolita.setPropietario("Gabriela Valladares");
        lolita.setRuc("1002003001001");

        // CREACIÓN DE COMPUTADORAS
        for (int i = 0; i < listaComputadoras.length; i++) {
            Computadora c1 = new Computadora();
            System.out.println("Ingrese la Marca:");
            c1.setMarca(es.next());
            System.out.println("Ingrese la Cantidad de Memoria RAM:");
            c1.setCantidadMemoria(es.nextInt());
            System.out.println("Ingrese la información del Procesador:");
            c1.setCaracteristicasProcesador(es.next());
            System.out.println("Ingrese el sistema operativo:");
            c1.setSistemaOperativo(es.next());
            System.out.println("Ingrese el precio:");
            c1.setPrecio(es.nextDouble());
            listaComputadoras[i] = c1;
        }

        lolita.setListaComputadoras(listaComputadoras);

        // INFORMACIÓN DE LA TIENDA Y BÚSQUEDA DE COMPUTADORAS POR MARCA
        System.out.println("El Número de Computadoras que posee la tienda: " + listaComputadoras.length);
        System.out.println("Ingrese la marca a buscar: ");
        String marcaBusqueda = es.next();

        for (Computadora p : listaComputadoras) {
            if (marcaBusqueda.equals(p.getMarca())) {
                p.imprimir();
            }
        }

        // IMPRESIÓN DE TODAS LAS COMPUTADORAS
        for (Computadora computadora : listaComputadoras) {
            computadora.imprimir();
        }

        // LLAMA MÉTODOS DE LISTA
        lolita.listaProcesadores();
        lolita.listaProcesadoresMemorias();
        lolita.listaPrecios();
    }
}
