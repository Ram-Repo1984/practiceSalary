package Servicio;

import Entidades.Vendedores;
import java.util.*;

public class VendedorServicio {

    Scanner read = new Scanner(System.in);

    public Vendedores altaVendedor() {
        ///instancio un objeto
        Vendedores v1 = new Vendedores();
        ///completo los atributos del primer ingreso

        System.out.println("Ingrese el nombre del vendedor");
        v1.setNombre(read.next());
        System.out.println("Ingrese el DNI del vendedor");
        v1.setDni(read.nextInt());
        System.out.println("Ingrese el sueldo básico del vendedor");
        v1.setSueldoBasico(read.nextDouble());
        System.out.println("Ingrese la fecha de inicio del vendedor");
        System.out.println("--------------------------");
        System.out.println("Día");
        int dia = read.nextInt();
        System.out.println("Mes");
        int mes = read.nextInt();
        System.out.println("Año");
        int anio = read.nextInt();

        Date fecha = new Date(anio, mes, dia);
        v1.setFechaInicio(fecha);
        return v1;
    }

    // creo un metodo para calcular las comisiones, sueldo mensual
    public void sueldoMensual(Vendedores v1) {
        System.out.println("Ingrese el monto del total de sus ventas");
        Double ventas = read.nextDouble();
        v1.setComisiones(ventas * 0.15);
        v1.setSueldoMensual(v1.getSueldoBasico() + v1.getComisiones());
        System.out.println("");
        System.out.println("Las comisiones del mes son " + v1.getComisiones());
        System.out.println("El sueldo a cobrar este mes es de :" + v1.getSueldoMensual());
    }

    public void vacaciones(Vendedores v1) {
        Date hoy = new Date();
        ///System.out.println(" Ingrese la cantidad de años de antiguedad");
        int antiguedad = hoy.getYear() - v1.getFechaInicio().getYear();

        if (antiguedad <= 5) {
            System.out.println("Corresponden 14 días");
        } else if (antiguedad <= 10) {
            System.out.println("Corresponden 21 días");
        } else if (antiguedad <= 20) {
            System.out.println("Corresponden 28 días");
        } else if (antiguedad > 20) {
            System.out.println("Corresponden 35 días");
        } else {
            System.out.println("Le corresponde un proporcional");
        }
    }

}
