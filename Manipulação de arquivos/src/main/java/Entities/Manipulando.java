package Entities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Manipulando {
    //Declarando atributos
    private String destino;
    private String name;
    private ArrayList<String[]> lista = new ArrayList<>();
    private String new_name;

    //Construtor de objetos
    public Manipulando(String destino, String name, String new_name ) {
        this.destino = destino;
        this.name = name;
        this.new_name = new_name;
    }
    //Métodos implementados
    public ArrayList adicionar(){
        try (BufferedReader br = new BufferedReader(new FileReader(destino))){

            String line = br.readLine();
            line = br.readLine();

            while (line != null){

                lista.add(line.split(";"));
                line = br.readLine();
            }

            //como acessar um array multidimensional System.out.println(lista.get(0)[1]);

        } catch (IOException e){
            System.out.println("Error: "+e.getMessage());
        }

        return lista;
    }


    public void status(){
        String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        System.out.println("Nome do criado: "+name);
        System.out.println("Data: "+date);
        for (String[] s:lista)
            System.out.print("Nome da pessoa: "+s[0]+" Idade: "+s[1]+ " Local de nascimentos: "+ s[2]+"\n");
    }


    //Métodos get and setters
    public String getDestino() {
        return destino;
    }

}
