package com.steel.app.engine;
import java.io.*;
import java.util.ArrayList;
import com.steel.app.engine.Document;
public class Indexer  {
    Document doc = new Document();
    
    public  void Init () throws IOException{
        ArrayList<String> archives = ScanPast(doc.getArchivePath());
        Reader(archives,doc.getName());
    }


    public  ArrayList ScanPast(String directoryPath){

         File directory = new File(directoryPath);          
            File[] files = directory.listFiles();
            ArrayList<String> nameArchives = new ArrayList<>();
            if(files!=null){
                for(File file:files){
                    nameArchives.add(file.getName());
                }
            }  
        return nameArchives;

    }

    // Fluxo do caramba
    
    public  void Reader(ArrayList<String> arquivos,String target_word)throws IOException{
       Integer i = 0;
       for(String arquivo:arquivos){
        if(arquivo.endsWith(".txt")){
            BufferedReader reader = new BufferedReader(new FileReader(arquivo));
            String linha ;
            while ((linha = reader.readLine()) !=null){
                
                //Regex para evitar "não-palavras"
                String [] palavras = linha.split("[^a-zA-ZáéíóúãõâêîôûÁÉÍÓÚÃÕÂÊÎÔÛ]+");
                palavras[i] = linha;
                
                for(String palavra:palavras){

                    // Seção responsável por exibir o local e o nome do arquivo 
                    // Setando novas palavras no "dicionário"
                    doc.setWord(palavra);
                }
                System.out.print(doc.getWord(target_word));
            }

        }
       }
       
       
    }
}
