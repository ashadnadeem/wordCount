/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordcount;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Ashad Nadeem
 */
public class Wordcount {
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        String line;
        int sentence = 0, para = 1,characters = 0,whitespaces = 0,word = 0;
        try (Scanner inFile = new Scanner(new FileReader("data.txt"))) {
            while(inFile.hasNextLine()){
                line = inFile.nextLine();
                for(int i=0;i<line.length();i++){
                    if(line.charAt(i) == ' ') whitespaces++;
                    if(line.charAt(i) == '.')sentence++;
                }
                if (line.equals("")) para++;
                characters = characters + line.length();
                String words[] = line.split(" ");
                whitespaces++;
                
                word = word + words.length;
            }
            whitespaces--;
       
            
            System.out.println("Number of words present in given file: "+word);
            System.out.println("Number of sentence present in given file: "+sentence);
            System.out.println("Number of charachters present in given file: "+characters);
            System.out.println("Number of whitespaces present in given file: "+whitespaces);
            System.out.println("Number of paragraphs present in given file: "+para);
            inFile.close();
        }
;
    }
    
}
