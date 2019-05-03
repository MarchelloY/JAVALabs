package com.marchello.labs.Lab9;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
8.Прочитать текст Java-программы и удалить из него
все “лишние” пробелы и табуляции, оставив только
необходимые для разделения операторов.
*/

public class Lab9{
    public static void main (String[] args){
        File fileIN = new File("C:\\Users\\Marchello\\IdeaProjects\\Labs\\src\\com\\marchello\\labs\\Lab9\\Old.java");
        File fileOUT = new File("C:\\Users\\Marchello\\IdeaProjects\\Labs\\src\\com\\marchello\\labs\\Lab9\\New.java");
        int b;
        char[] tempChar = new char[5000];
        try{
            FileReader fileReader = new FileReader(fileIN);
            FileWriter fileWriter = new FileWriter(fileOUT);
            for(int i = 0;(b = fileReader.read()) != -1; i++){tempChar[i] = (char)b;}
            String tempString = new String(tempChar);
            System.out.println("Программа перед редактированием: \n" + tempString);
            tempString = tempString
                    .trim()
                    .replaceAll("public class Old","public class New")
                    .replaceAll("\\+"," + ")
                    .replaceAll("="," = ")
                    .replaceAll("(\\s)+", "$1");
            System.out.println("Программа после редактирования: \n" + tempString);
            char[] resultText = tempString.toCharArray();
            fileWriter.write(resultText);
        fileReader.close();
        fileWriter.close();
        }catch (IOException e) {
            System.err.println("Ошибка файла: " + e);
        }
    }
}