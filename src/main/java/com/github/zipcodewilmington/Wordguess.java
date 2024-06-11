package com.github.zipcodewilmington;

import java.util.ArrayList;
import java.util.Random;

public class Wordguess {
    public Wordguess() {}
    String[] arrayList = {"cat", "dog", "bog", "cut"};
    Random random = new Random();


    public static void main(String[] args) {
        Wordguess game = new Wordguess();
        game.runGame();
    }

    public void runGame(){

    }

}
//
//
//    public void runGame()` metho//'s logic will roughly follow this pseudo-code.
//    There is a nest loop here, the outer one for each game the player plays,
//    the inner one handling each game.
//
//            ```
//  //  choose a random word from a list
//
//while (you want to play) { //outer loop
//        start the game
//        set word guessed to false
//        while (the word isn't guessed) { //inner loop
//        print the current game state
//        ask for a guess (a single letter)
//
//        check the letter against the word
//        using the two character arrays discussed above
//        increment the number of guesses
//
//        if the word is guessed
//        player won, congrats
//
//        if too many guesses
//        player lost, too bad, quit game
//    }
//    ask if player wants to play again
//}
//display game over
//```
//
//The `printArray(char[] a)` method just print out the characters array `a` with a space between each letter.
//You'll need a `for` loop to print each character and a space right after.
//
//In addition to `runGame()` and `printArray`, I'd also suggest you think about creating each of these methods in the Wordguess class.
//
//        - announce_game() prints a welcome
//- game_over() prints "game over"
//        - initialize_game_state() sets up char[] for secret word and guesses
//- get_next_guess() returns a char from player input
//- is_word_guessed() returns boolean
//- ask_to_play_again() returns boolean
//- print_current_state() uses printArray to show player where they are at
//- process() loops thru the word array, looking for the inputed guess, and replaces the "_" with the guesses char if found
//- player_won() prints happy message
//- player_lost() print sad message
//
//Some hints
//
//-// all output or input must be in specialized methods, not in `runGame()`
//   //     - you should use instance variables to sync all the game state
//-// use "this." to call all your methods in class Wordguess
//-// You need to use the Scanner class to get the player's guess
//    //    - You need to use the Random class to get a random int to choose the secret word
////- when a method name like "player_won()" is used you need to translate it in to "camelCase" so it would appear as "playerWon()" in your code.
//
//        _kyounger_
//
//}
