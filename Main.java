package com.company;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ListaDoblementeEnlazada l1 = new ListaDoblementeEnlazada();

        l1.addPrimero("Juan");
        l1.addPrimero(22);
        l1.addPrimero("Hola");
        l1.addPrimero(44);
        l1.addPrimero(55);
        l1.addPrimero("Pepe");
        l1.addFinal("Jorge");
        l1.addFinal(28);
        l1.addPorPosicion(21, 5);
        l1.eliminarPorPosicion(2);
        System.out.println("Esta vacía: " + l1.estaVacio());
        System.out.println("Tamaño: " + l1.getTamano());
        l1.mostrar();
    }
}
