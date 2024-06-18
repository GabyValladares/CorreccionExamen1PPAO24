/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;
import modelo.Computadora;
import modelo.Tienda;

/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String[] args) {
        Scanner es=new Scanner(System.in);
        System.out.println("Ingrese el número de Computadoras que va a tener la Tienda");
        Computadora[] listaComputadoras=new Computadora[es.nextInt()];
        
        //TIENDA
        Tienda lolita=new Tienda();
        lolita.setNombreTienda("Lolita");
        lolita.setPropietario("Gabriela Valladares");
        lolita.setRuc("1002003001001");
        //lolita.setListaComputadoras("1,2,3");
        for (int i = 0; i < listaComputadoras.length; i++) {
            
        
        
        //COMPUTADORAS
        Computadora c1=new Computadora();
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
        listaComputadoras[i]=c1;
        }
        System.out.println("El Número de Computadoras que posee la tienda: " + 
                listaComputadoras.length);
        System.out.println("Ingrese la marca a buscar: ");
        String marcaBusqueda = es.next();
        for(Computadora p : listaComputadoras){
            if (marcaBusqueda==p.getMarca());
            p.imprimir();
            
          
        }
        for (int i = 0; i < listaComputadoras.length; i++)
           
        {
          listaComputadoras[i].imprimir();
        }
    }
    //LISTA DE PROCESADORES
    //LISTA DE PROCESADORES +MEMORIAS RAM
    
    //LISTA DE PRECIOS
}
