package com.steel.app.engine;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Document {

    private static String word;
    private static String archiveName;
    private static String archivePath;

    public String getName(){
        return archiveName;
    }
    public void setName(String newName){
        this.archiveName = newName;
    }

    public String getArchivePath(){
        return archivePath;
    }

    public void setArchivePath(String newPath){
        this.archivePath = newPath;
    }

    Map<String, Map<String, Integer>> dados = new HashMap();

    public void setWord(String newWord){
        this.word = newWord;
        dados
        .computeIfAbsent(word, k -> new HashMap<>())
        .merge(getArchivePath(),1,Integer::sum);
    }
    public Map<String,Integer> getWord(String dWord){
        Map<String, Integer> resultados = dados.get(dWord);
        return resultados;
    }

}
