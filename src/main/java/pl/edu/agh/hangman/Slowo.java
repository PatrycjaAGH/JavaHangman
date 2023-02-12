package pl.edu.agh.hangman;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Random;

public class Slowo {

   public ArrayList<String> slowa = new ArrayList();


    // Wczytywanie pliku:

    public void readFile(String file)
    {

        File wordsFile = new File(file);
        try (BufferedReader reader = Files.newBufferedReader(wordsFile.toPath()))
        {
            String line = null;
            while ((line = reader.readLine()) != null) {
                if (!line.contains(" ")) {
                    line.toLowerCase();
                    slowa.add(line);
                }
            }
        } catch (IOException x) {
            System.err.format("IOException: %s", x);
        }
    }

    // Losowanie slowa:

    public String Losowanie() {

        Random generator = new Random();
        return slowa.get(generator.nextInt(slowa.size()));
    }
}
