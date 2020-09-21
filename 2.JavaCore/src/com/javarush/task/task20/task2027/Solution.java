package com.javarush.task.task20.task2027;

import java.util.ArrayList;
import java.util.List;

/* 
Кроссворд
*/
public class Solution {
    public static void main(String[] args) {
        int[][] crossword = new int[][]{
                {'f', 'd', 'e', 'r', 'l', 'k'},
                {'u', 's', 'a', 'm', 'e', 'o'},
                {'l', 'n', 'g', 'r', 'o', 'v'},
                {'m', 'l', 'p', 'r', 'r', 'h'},
                {'p', 'o', 'e', 'e', 'j', 'j'}
        };

        detectAllWords(crossword, "home", "same");

        /*
Ожидаемый результат
home - (5, 3) - (2, 0)
same - (1, 1) - (4, 1)
         */
    }

    public static List<Word> detectAllWords(int[][] crossword, String... words) {
        List<Word> result = new ArrayList<>();
        for (String worder : words) {
            Word word = new Word(worder);
            // For efficiency, so we can cancel the below loops
            Boolean foundWord = false;

            for (int i = 0; i < crossword.length; i++) {
                for (int j = 0; j < crossword[i].length; j++) {
                    // check if we found a start of any of the words by comparing the current letter in the crossword to the first letter of each word
                    if (crossword[i][j] == word.getWord().charAt(0)) {
                        // We found a plausible starting point! Let's search
                        // It looks a little messy, but the if statement OR condition is lazy, it will stop evaluating each part, as soon as one returns TRUE - which in our case, is the first correct direction which the word is found in - all directions below it won't be searched - so it's quite efficient
                        if (search(word, crossword, j, i, word.getWord().substring(1), 1, 0) // search right
                                || search(word, crossword, j, i, word.getWord().substring(1), -1, 0) // search left
                                || search(word, crossword, j, i, word.getWord().substring(1), 0, 1) // search up
                                || search(word, crossword, j, i, word.getWord().substring(1), 0, -1) // search down

                                // Diagonal searches in all directions below
                                || search(word, crossword, j, i, word.getWord().substring(1), -1, -1) // search top left direction
                                || search(word, crossword, j, i, word.getWord().substring(1), 1, -1) // search top right direction
                                || search(word, crossword, j, i, word.getWord().substring(1), 1, 1) // search bottom right direction
                                || search(word, crossword, j, i, word.getWord().substring(1), -1, 1) // search bottom left direction
                        ) {
                            // We found the word!
                            // Let's set the starting point!
                            word.setStartPoint(j, i);
                            foundWord = true;
                            result.add(word);
                            break; // stop the loop
                        }

                        // ************* MORE EFFICIENT SOLUTION BELOW ************
                        // You can also do the above, in a shorter way (but less intuitive)
                  /* for (int xOffset = -1; xOffset <= 1; xOffset++) {
                    for (int yOffset = -1; yOffset <= 1; yOffset++) {
                      if (search(word, crossword, j, i, word.getWord().substring(1), xOffset, yOffset)) {
                        // We found the word!
                        // Let's set the starting point!
                        word.setStartPoint(j, i);
                        foundWord = true;
                        break; // stop the loop
                      }
                    }
                  } */
                    }
                }

                if (foundWord)
                    break; // don't keep looking - we found the word
            }
        }

        return result;
    }



    public static Boolean search(Word word, int[][] crossword, int currentX, int currentY, String wordRemainder, int xOffset, int yOffset) {
        // Recursive base case
        if (wordRemainder.length() == 0) {
            word.setEndPoint(currentX, currentY);
            return true; // success! We've found all of the word
        }

        // calculcate the next position we need to check
        int nextX = currentX + xOffset;
        int nextY = currentY + yOffset;

        // check boundaries
        // Second check will only happen in nextY is in bounds so we can safely check like this
        if (nextY >= crossword.length || nextX >= crossword[nextY].length)
            return false;

        // Check if the next cell in line, matches the first letter of the remaining part of the word
        if (crossword[nextY][nextX] == wordRemainder.charAt(0)) {
            // Success! Let's continue the search in the same direction
            // wordRemainder.substring(1) basically skips the first letter and takes the rest of the word
            return search(word, crossword, nextX, nextY, wordRemainder.substring(1), xOffset, yOffset); // Keep offsets the same, to make sure we go in the same direction in the next phase of the search
        }
        else {
            // No match - abort mission
            return false;
        }
    }

    public static class Word {
        private String text;
        private int startX;
        private int startY;
        private int endX;
        private int endY;

        public Word(String text) {
            this.text = text;
        }

        public void setStartPoint(int i, int j) {
            startX = i;
            startY = j;
        }

        public void setEndPoint(int i, int j) {
            endX = i;
            endY = j;
        }

        // I added this so that we don't need to keep 2 lists of words (one String, and one Word) - instead, we can now keep a single list
        public String getWord() {
            return text;
        }

        @Override
        public String toString() {
            return String.format("%s - (%d, %d) - (%d, %d)", text, startX, startY, endX, endY);
        }
    }
}
