package com.steel.app;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import com.steel.app.engine.Document;
import com.steel.app.engine.CLI;
import com.steel.app.engine.Indexer;
import java.util.ArrayList;
public class Main 
{
    public static void main( String[] args ) throws IOException
    {
        Indexer ind = new Indexer();
        CLI.Ask();
        ind.Init();
    }

}
