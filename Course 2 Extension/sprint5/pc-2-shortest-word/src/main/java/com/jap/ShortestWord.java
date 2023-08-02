package com.jap;


public class ShortestWord {
    public static void main(String[] args) {

        //Declare and initialize a String array.
        String words[]={"Java","Programming","Language"};
        // Create an object of the class ShortestWord
        ShortestWord shortestWord=new ShortestWord();
        //Call the method findShortestWord() and pass the array.
        String shortest = shortestWord.findShortestWord(words);
        System.out.println(shortest);
    }

    //Write the logic to find the shortest word from the String array inside
    // the below method and return the shortest word.
    public String findShortestWord(String[] words) {
        String notFound="Cannot find shortest word as array is empty";
        for (int i=0;i<words.length;i++)
        {
            if(words[i].length() < words[i+1].length() && words[i].length() < words[i+2].length())
            {
                return words[i];
            }
            else if(words[i+1].length() < words[i].length() && words[i+1].length() < words[i+2].length())
            {
                return words[i+1];
            }
            else if (words[i+2].length() < words[i].length() && words[i+2].length() < words[i+1].length())
            {
                return words[i+2];
            }
            else if(words[i].length()==words[i+1].length() || words[i].length()==words[i+2].length())
            {
                return words[i];
            }
        }
        return notFound;
    }
}
