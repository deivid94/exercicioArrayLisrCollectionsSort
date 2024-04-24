package br.com.alura.exercicos.principal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numero = new ArrayList<>();
        var a = numero.add(10);
        var b = numero.add(28);
        var c = numero.add(5);
        var d = numero.add(6);
        var e = numero.add(3);

        Collections.sort(numero);
        for(int ListaOrdenada : numero){
            System.out.println(ListaOrdenada);
        }
      }

    }
