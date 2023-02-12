package pl.edu.agh.hangman;

import java.util.Scanner;

public class UserInputHandler {

    public boolean isGameActive;
    public String word;
    public GameDisplayator display;

    public UserInputHandler(GameDisplayator displayator, String word) {
        this.display = displayator;
        this.isGameActive = true; // TODO to be stored in different class
        this.word = word;
    }

    public void getUserInput() {
        Scanner scanner = new Scanner(System.in);
        String input = null;
        do {
            System.out.println("Type single letter:");
            input = scanner.nextLine();

            validateLetter(input); //TODO add if not single letter provided

        } while (this.isGameActive);

        System.out.println("Bye!");

        scanner.close();

    }

    public void validateLetter(String letter) {
        if(this.word.contains(letter)){
            System.out.println("CONTAINS");
            this.display.revealLetters(letter);
        } else {
            System.out.println("NOT CONTAINS");
            // add another segment to guy
        }
    }
}



    //user picks letter

    // validate if letter exists

    //add letters instead of lines / draw a guy

    // if last el from list is printed -> THE END


