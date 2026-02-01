package com.steel.app.engine;

import java.util.ArrayList;
import java.util.Scanner;
import com.steel.app.engine.Document;

public class CLI {

        public static void Ask(){
        String directoryPath = " ";
        Scanner myObj = new Scanner (System.in);

        System.out.println("Escanear esta pasta? Y/N");
        String answer = myObj.nextLine();
        System.out.println("Qual palavra está buscando ?");
        String magic_word = myObj.nextLine();

        if(answer.equalsIgnoreCase("Y")){
            directoryPath = System.getProperty("user.dir");
        }
        if (answer.equalsIgnoreCase("N")){
            System.out.println("Insira o caminho para a pasta");
            directoryPath = myObj.nextLine();
        }
        ArrayList<String> answers = new ArrayList<String>();
        Document doc = new Document();
        doc.setArchivePath(directoryPath);
        doc.setName(magic_word);

    }
}
