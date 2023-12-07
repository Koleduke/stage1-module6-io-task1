package com.epam.mjc.io;

import java.io.File;

import java.io.IOException;


public class FileReader {
    private String nameR;
    private Integer ageR;
    private String emailR;
    private Long phoneR;

    public Profile getDataFromFile(File file) throws StudentNotFoundException {
        String[] sentences = getStrings(file);
        for (int i = 0; i<sentences.length;i++ ){
            String[] sentences1 = sentences[i].split("\\s+");
            if(i==0){
                nameR = sentences1[1];}
            if(i==1){
                ageR = Integer.valueOf(sentences1[1]);}
            if(i==2){
                emailR = sentences1[1];}
            if(i==3){
            phoneR = Long.valueOf(sentences1[1]);}
        }
                return new Profile(nameR,ageR,emailR,phoneR);
    }

    private static String[] getStrings(File file) throws StudentNotFoundException {
        StringBuilder input = new StringBuilder();
        try (java.io.FileReader sdf = new java.io.FileReader(file)){
            int ch;
            while ((ch = sdf.read()) != -1) {
                String str = Character.toString((char) ch);
                input.append(str);}
        } catch (IOException e) {
            throw new StudentNotFoundException(e);
        }
        return input.toString().split("\n");
    }
}


