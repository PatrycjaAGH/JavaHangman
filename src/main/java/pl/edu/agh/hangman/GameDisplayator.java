package pl.edu.agh.hangman;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static pl.edu.agh.hangman.Hangman.HANGMANPICS;

public class GameDisplayator {

    public ArrayList<String> word;
    public ArrayList<String> hiddenWord;

    public GameDisplayator(String word) {
        this.word = new ArrayList<>(Arrays.asList(word.split("")));
        this.hiddenWord = new ArrayList<String>();
        
        for(int i=0; i<word.length(); i++){
            this.hiddenWord.add("_");
        }
    }

    public void revealLetters(String letter) {
        for(int i=0; i<this.hiddenWord.size(); i++){
            if(this.word.get(i).equals(letter)){
                this.hiddenWord.set(i, letter);
            }
        }
        System.out.println(this.hiddenWord.toString());
    }

        public void print() {
            System.out.println(HANGMANPICS[0]);
        }

}
