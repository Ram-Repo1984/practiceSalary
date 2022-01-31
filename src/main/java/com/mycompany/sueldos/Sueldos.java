/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sueldos;

import Entidades.Vendedores;
import Servicio.VendedorServicio;
import java.util.*;

/**
 *
 * @author Usuario
 */
public class Sueldos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        VendedorServicio vs = new VendedorServicio();
        Vendedores v1 = vs.altaVendedor();
        Vendedores v2 = vs.altaVendedor();

        vs.sueldoMensual(v1);
        vs.vacaciones(v1);
        System.out.println("*******");
        vs.sueldoMensual(v2);
        vs.vacaciones(v2);
    }

}
