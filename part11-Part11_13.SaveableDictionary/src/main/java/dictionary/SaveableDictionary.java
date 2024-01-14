package dictionary;

 

import java.io.File;

import java.io.FileWriter;

import java.util.ArrayList;

import java.util.HashMap;

import java.util.Map;

import java.util.Scanner;

 

public class SaveableDictionary {

 

    private Map<String, String> dictionary;

    private String file;

 

    public SaveableDictionary(){

        this.dictionary = new HashMap<>();

        this.file = "";

    }

 

    public SaveableDictionary(String file){

        this.file = file;

        this.dictionary = new HashMap<>();

 

    }

 

    public boolean load(){

 

        File inputFile = new File(this.file);

        try (Scanner scanner = new Scanner(inputFile)){

            while (scanner.hasNextLine()){

 

                String line = scanner.nextLine();

                String[] parts = line.split(":");

                this.dictionary.putIfAbsent(parts[0], parts[1]);

                this.dictionary.putIfAbsent(parts[1], parts[0]);

            }

 

            return true;

        }

        catch (Exception e) {

            System.out.println("could not find or load the file.");

            return false;

 

        }

 

    }

 

    public void add(String words, String translation){

        this.dictionary.putIfAbsent(words, translation);

        this.dictionary.putIfAbsent(translation, words);

    }

 

    public String translate(String word){

        return this.dictionary.getOrDefault(word, null);

    }

 

    public void delete(String word){

 

        //key or value

        String translation = this.dictionary.get(word);

 

        this.dictionary.remove(translation);

        this.dictionary.remove(word);

       

    }

 

    public boolean save(){

        StringBuilder dict = new StringBuilder();

 

        ArrayList<String> alreadyInDictionary = new ArrayList<>();

 

        for (String key : this.dictionary.keySet()){

 

            if(alreadyInDictionary.contains(key)) continue;

           

            String toAdd = key + ":" + this.dictionary.get(key) + "\n";

            alreadyInDictionary.add(this.dictionary.get(key));

            dict.append(toAdd);

        }

 

        try{

            FileWriter writer = new FileWriter(this.file);

            writer.write(dict.toString());

            writer.close();

            return true;

        }

        catch( Exception e){

            System.out.println("didn't work");

            return false;

        }

    }

 

   

}

 