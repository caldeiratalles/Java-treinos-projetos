package apllication;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.enums.OrderStatus;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o nome do cliente: ");
        String name = sc.nextLine();
        System.out.println("Entre com o email do cliente: ");
        String email = sc.nextLine();
        System.out.println("Entre com data de aniversario: ");
        String data = sc.next();
        Client c1 = new Client(name,email,data);
        System.out.println("-------------------------------");
        System.out.println("Quantos pedidos serão feitos: ");
        int aux = sc.nextInt();
        for(int i = 0; i<=aux; i++){
            System.out.println("Entre com os dados do pedidos: ");
            System.out.println("Status do pedido: ");
            String status = sc.nextLine();
            System.out.println("Quantos items serão pedidos: ");
            Integer quantity = sc.nextInt();
            System.out.println("Valor do produto: ");
            Double price = sc.nextDouble();
            OrderItem oi1 =  new OrderItem(quantity,price);
            Date now = new Date();
            Order o2 = new Order(now,OrderStatus.valueOf(status));
        }
        System.out.println("Nome do cliente: "+c1.getName());
        System.out.println("Email do cliente: "+c1.getEmail());
        System.out.println("Data de aniversario do cliente"+c1.getEmail());
        System.out.println("Pedidos: "+aux);
        System.out.println("Status do pedido: "+);


    }
}
