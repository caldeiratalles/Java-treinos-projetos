package Application;

import Entities.Manipulando;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o diretorio do arquivo");
        String diretorio = sc.next();
        System.out.println("Digite o seu nome");
        String name = sc.next();
        System.out.println("Digite o novo nome do arquivo: ");
        String new_name = sc.next();

        Manipulando a1 = new Manipulando(diretorio,name, new_name);

        a1.adicionar();
        a1.status();


    }
}
