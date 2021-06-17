package program;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class program {
    public static void main(String[] args){
        Map<String,  Integer> candidatos = new TreeMap<>();
        String path = "/media/basis/D/Documentos para teste/teste";
            try(BufferedReader br = new BufferedReader(new FileReader(path))){
                String line = br.readLine();
                while(line != null){
                        String [] lista = line.split(";");
                        Integer bux = candidatos.get(lista[0]);
                        if (bux == null){
                            candidatos.put(lista[0],Integer.parseInt(lista[1]));
                            line = br.readLine();
                        }else{
                            candidatos.put(lista[0], (Integer.parseInt(lista[1]) + bux));
                            line = br.readLine();
                        }

                    }
                } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        for (String key : candidatos.keySet()){
                    System.out.println(key +": "+ candidatos.get(key));
                }
        }
}
