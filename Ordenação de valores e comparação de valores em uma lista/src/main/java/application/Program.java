package application;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args){
        //cria uma lista de objetos do Employee
        List<Employee> list = new ArrayList<>();
        String path = "caminho do arquivo";
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String employeeCsv = br.readLine();
            while (employeeCsv != null){
                //quebrando os campos em um array de string
                String[] fileds = employeeCsv.split(",");
                list.add(new Employee(fileds[0], Double.parseDouble(fileds[1])));
                employeeCsv = br.readLine();
            }
            Collections.sort(list);
            for (Employee emp : list) {
                System.out.println(emp.getName()+", "+ emp.getSalary());
            }
        }catch (IOException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
