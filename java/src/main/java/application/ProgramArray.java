package application;

import entities.ProductArray;

import java.util.Scanner;

public class ProgramArray {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos produtos quer cadastrar?");
        int n = sc.nextInt();
        ProductArray[] vect = new ProductArray[n];
        for (int i=0 ; i<vect.length; i++){
            System.out.println("Nome do produto:");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.println("Preço do produto:");
            double price = sc.nextDouble();
            vect[i] = new ProductArray(name,price);
        }
        double sum = 0.0;
        for (int i=0; i<vect.length; i++){
            sum+=vect[i].getPrice();
        }
        double avf = sum / vect.length;
        System.out.println("Média dos produtos cadastrados:"+avf);
        sc.close();
    }
}
