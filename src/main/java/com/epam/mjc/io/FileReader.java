package com.epam.mjc.io;

import java.io.File;

import java.io.IOException;


public class FileReader {
    private String nameR;
    private Integer ageR;
    private String emailR;
    private Long phoneR;

    public Profile getDataFromFile(File file)  {
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

    private static String[] getStrings(File file) {
        java.io.FileReader sdf = null;
        String input ="";
        try {
            int ch;
            sdf = new java.io.FileReader(file);
            while ((ch=sdf.read())!=-1){
                String str = Character.toString( (char) ch);
                //System.out.println(ch);
                input = input + str;}
        } catch (IOException e){}
        finally {
            assert sdf != null;
            try {
                sdf.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        String[] sentences = input.split("\\\n");
        return sentences;
    }
}


