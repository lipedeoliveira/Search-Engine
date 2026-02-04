package com.steel.app.engine;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Document {

    private static String magic_word;
    private static String word;
    private static String directoryPath;
    private static String archiveName;

    public String getMagicWord(){
        return magic_word;
    }
    public void setMagicWord(String newName){
        this.magic_word = newName;
    }

    public String getDirectoryPath(){
        return directoryPath;
    }

    public void setDirectoryPath(String newPath){
        this.directoryPath = newPath;
    }

    public void setArchiveName(String newArchiveName){
        this.archiveName = newArchiveName;

    }
    public String getArchiveName(){
        return archiveName;
    }
    Map<String, Map<String, Integer>> dados = new HashMap();

    public void setWord(String newWord){
        this.word = newWord;
        dados
        .computeIfAbsent(word, k -> new HashMap<>())
        .merge((getDirectoryPath()+"/"+getArchiveName()+"\t Quantia de vezes::"),1,Integer::sum);
        
    }
    public Map<String,Integer> getWord(String dWord){
        Map<String, Integer> resultados = dados.get(getMagicWord());
        return resultados;
    }

}
