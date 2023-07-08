package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        // 3° Passo
        // Criar uma estrutura de dados (Usei o ArrayList) para armazenar o conteúdo do arquivo.
        // Assim tornando possível aplicar regras no conteúdo.

        List<String> list = new ArrayList<>();

        // 1° Passo definir o caminho do arquivo
        // Inicializei o objeto para receber o caminho como parâmetro.

        File file = new File("C:\\Users\\diego\\OneDrive\\Documentos\\Projetos Java\\" +
                "AlgoritmoDeArquivo\\src\\main\\resources\\text.txt");

        //2° Passo
        // Criar um algoritmo que faz a interação texto contido no arquivo

        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            String line;
            while((line = br.readLine()) != null){
                list.add(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 4° Passo
        // Aplicar regras sobre o conteúdo.

        for (String i:list){
            System.out.println(i+"\n");
        }

    }
}
