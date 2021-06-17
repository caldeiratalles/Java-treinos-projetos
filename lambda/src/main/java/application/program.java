package application;

import entitites.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class program {
    public static void main(String[] args){
        List<Employee> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("How many employes?");
        Integer aux = sc.nextInt();
        for(int i=0; i<aux ; i++){
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.println("Salary: ");
            Double salary = sc.nextDouble();
            list.add(new Employee(name,email,salary));
        }
        List<String> emails = list.stream()
                .filter(x -> x.getSalary() > 50000)
                .map(Employee::getEmail)
                .sorted()
                .collect(Collectors.toList());
        emails.forEach(System.out::println);

        double sum = list.stream()
                .filter(x -> x.getName().charAt(0) == 'M')
                .map(Employee::getSalary)
                .reduce(0.0, Double::sum);
        System.out.println(sum);
    }
}
