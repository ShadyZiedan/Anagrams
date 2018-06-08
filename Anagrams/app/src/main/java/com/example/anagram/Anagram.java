package com.example.anagram;



public class Anagram {


    private static String lettersOnly(String s){

        char[] str = s.toCharArray();
        int numberOfLetters = 0;
        for (int i = 0; i <str.length ; i++) {
            if (Character.toString(str[i]).matches("[a-zA-Z]")){
                numberOfLetters++;
            }
        }
        char[] word = new char[numberOfLetters];
        int j=0;
        for (int i = 0; i <str.length ; i++) {
            if (Character.toString(str[i]).matches("[a-zA-Z]")){
                word[j] = str[i];
                j++;
            }
        }

        return new String(word);
    }

    public static String reverseWord(String s){

        String[] str = s.split(" ");
        String[] reversedStr = new String[str.length];
        String result; // Desired result
        int j=0; // reversedStr index
        for (String element: str) {

            char[] original = element.toCharArray();
            char[] word = lettersOnly(element).toCharArray();


            for (int i = 0; i < word.length/2 ; i++) {
                char temp;
                temp = word[i];
                word[i] = word[word.length - 1 - i];
                word[word.length - 1 - i] = temp;

            }

            //add special characters
            char[] temp = new char[original.length];
            int k = 0;
            for (int i = 0; i <original.length ; i++) {
                if (Character.toString(original[i]).matches("[^a-zA-Z]")){
                    temp[i] = original[i];
                } else {
                    temp[i] = word[k];
                    k++;
                }
            }

            reversedStr[j] = new String(temp);
            j++;

        }

        //Final String
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < reversedStr.length ; i++) {
            if (i == reversedStr.length-1){
                sb.append(reversedStr[i]);
            } else {
                 sb.append(reversedStr[i] + " ");
            }
        }

        result = sb.toString();
        return result;
    }
}
