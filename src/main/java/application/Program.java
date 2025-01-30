package application;

import dominio.Pessoa;

public class Program {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(1,"Ícaro","icaro@email");
        Pessoa p2 = new Pessoa(2,"Nico","Nico@email");
        Pessoa p3 = new Pessoa(3,"Manu","Manu@email");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

    }
}