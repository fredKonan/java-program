package com.techelevator;
import java.util.*;
import java.io.*;

public class FindAndReplace {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("What is the search word? ");
        String searchWord = input.nextLine();
        System.out.println("What is the replace word? ");
        String replaceWord = input.nextLine();
        System.out.println("What is the source file? ");
        String sourceFile = input.nextLine();
        System.out.println("What is the destination file? ");
        String destinationFile = input.nextLine();
        File dataFile = new File(sourceFile);
        try(
                PrintWriter dataOutput = new PrintWriter(destinationFile);
                Scanner dataInput = new Scanner(dataFile))
                {

            while(dataInput.hasNext()){
                String lineOfInput = dataInput.nextLine();
                if(lineOfInput.contains(searchWord)){
                    dataOutput.println(lineOfInput.replaceAll(searchWord,replaceWord));
                }
                else
                    dataOutput.println(lineOfInput);
            }
        }
        catch (FileNotFoundException ex){
            System.err.println("cannot open file");
        }
    }

}
