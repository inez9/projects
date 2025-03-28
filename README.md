###Welcome! These are the CS projects I have wokred on, I still need to import some over so please be patient!


[ArrayDeque61B](https://github.com/inez9/projects/blob/main/ArrayDeque61B%20(1).java)

This project implements a double-ended queue (deque) data structure using a resizing array in Java. It's named `ArrayDeque61B` likely to align with specific course or project naming conventions (e.g., "61B").

## Features

* **Dynamic Resizing:** The deque automatically resizes its underlying array to accommodate more elements, avoiding overflow. It also shrinks the array when it becomes sparsely populated to conserve memory.
* **Efficient Add/Remove:** Implements efficient methods for adding and removing elements from both the front and the back of the deque.
* **Circular Array Implementation:** Uses a circular array approach to optimize the add/remove operations at both ends.
* **Deque Operations:**
    * `addFirst(T x)`:   Adds an item to the front of the deque.
    * `addLast(T x)`:    Adds an item to the back of the deque.
    * `removeFirst()`: Removes and returns the item at the front of the deque.
    * `removeLast()`:  Removes and returns the item at the back of the deque.
    * `get(int index)`: Gets the item at the given index.
    * `size()`:        Returns the number of items in the deque.
    * `isEmpty()`:     Checks if the deque is empty.
    * `toList()`:      Returns a `List` representation of the deque.

## Implementation Details

* The deque uses a generic array (`T[] items`) to store the elements.
* `front`: Index of the first element in the deque.
* `sizing`: Current number of elements in the deque.
* `indexing`: Index where the next element added to the back will be placed. (could be named better)
* Resizing is triggered when the array is full (addFirst/addLast) or becomes less than 25% full (removeFirst/removeLast). When resizing, the array doubles in size when growing and halves in size when shrinking.
* The circular array is managed using the modulo operator (`%`) to wrap around the array indices.

## How to Use

1.  **Include in your project:** Add the `ArrayDeque61B.java` file to your Java project.
2.  **Instantiate:** Create an instance of `ArrayDeque61B` to use it.

    ```java
    ArrayDeque61B<Integer> deque = new ArrayDeque61B<>();
    ```



    
[cats](https://github.com/inez9/projects/blob/main/cats.py)
# Typing Test Analysis

This Python code provides functions for analyzing typing accuracy, calculating typing speed (WPM), and implementing autocorrect functionality. It also includes functions for a multiplayer typing test component.

## Functions

###   `accuracy(typed, source)`

   * Calculates the accuracy percentage between a typed string and a source string.
   * Splits both strings into words and compares them.
   * Returns a float representing the percentage of correctly typed words.
   * Handles edge cases where one or both input strings are empty.

###   `wpm(typed, elapsed)`

   * Calculates the words-per-minute (WPM) of a typed string, given the elapsed time.
   * Divides the total number of characters by 5 (assuming an average word length) to get the number of words.
   * Adjusts for time (seconds to minutes) to get WPM.
   * Raises an assertion error if the elapsed time is not positive.

###   `autocorrect(typed_word, word_list, diff_function, limit)`

   * Returns the word from `word_list` that is the closest match to `typed_word`, based on a provided difference function.
   * If `typed_word` is in `word_list`, it returns `typed_word`.
   * If multiple words have the smallest difference, it returns the first one found in `word_list`.
   * If the smallest difference is greater than `limit`, it returns `typed_word`.

###   `feline_fixes(typed, source, limit)`

   * A difference function for autocorrect that calculates the number of letter substitutions needed to transform `typed` into `source`, plus the difference in their lengths.
   * Recursively calculates the differences.
   * Takes a limit to avoid excessive calculations.

###   `minimum_mewtations(typed, source, limit)`

   * A difference function that computes the edit distance (minimum number of insertions, deletions, or substitutions) from `typed` to `source`.
   * Recursively calculates the edit distance.
   * Takes a limit to avoid excessive calculations.

###   `final_diff(typed, source, limit)`

   * A placeholder for a final difference function (not implemented).
   * Raises an `AssertionError` if called.

###   `report_progress(typed, source, user_id, upload)`

   * Calculates and uploads a user's typing progress to a multiplayer server.
   * Calculates progress based on the number of correctly typed words in sequence.
   * Calls an `upload` function (provided as an argument) to send the progress data.

###   `time_per_word(words, timestamps_per_player)`

   * Calculates the time taken by each player to type each word.
   * Takes a list of words and a list of timestamps per player.
   * Returns a "match" data abstraction containing the words and the time taken by each player for each word.

###   `fastest_words(match)`

   * Given a "match" data abstraction, returns a list of lists indicating which words each player typed fastest.
   * Determines the fastest typist for each word.

###   `match(words, times)`

   * A data abstraction representing a typing match, containing the words and the typing times for each player.

###   Utility Functions

   * `get_word(match, word_index)`: Gets the word at a specific index in the match.
   * `time(match, player_num, word_index)`: Gets the time taken by a player to type a specific word.
   * `get_all_words(match)`: Gets all words from a match.
   * `get_all_times(match)`: Gets all typing times from a match.
   * `match_string(match)`: Returns a string representation of a match.

###   `run_typing_test(topics)`

   * A function to run a typing test from the command line.
   * Reads paragraphs from a file, selects paragraphs based on topics (if provided), and presents the text to the user.

## Notes

* The code includes placeholders for functions that are not fully implemented (`final_diff`).
* The code uses helper functions and a data abstraction (`match`) to organize and manage the data for a typing test.
* There's a flag `enable_multiplayer` to control whether multiplayer functionality is enabled.
3.  **Use the methods:** Call the various methods to perform deque operations.

    ```java
    deque.addFirst(10);
    deque.addLast(20);
    int first = deque.removeFirst(); // first will be 10
    ```


[hogs](https://github.com/inez9/projects/blob/main/hog.py)
Dice Game Project
Overview
This is a strategic dice game that involves rolling dice, scoring points, and applying unique game rules such as Boar Brawl and Sus Fuss. Players compete to reach a goal score through various strategies and game mechanics.
Game Mechanics
Key Rules

Boar Brawl: A scoring mechanism that modifies points based on the current and opponent's scores.
Sus Fuss: A special rule that adjusts scores based on the number of factors in the current score.
Players can choose different rolling strategies.

##Implemented Strategies

always_roll(n): Always roll a fixed number of dice
catch_up: Dynamically adjust dice rolls based on opponent's score
boar_strategy: Optimize dice rolls using Boar Brawl scoring
sus_strategy: Optimize dice rolls considering Sus Fuss rule

##Project Structure

#Game simulation functions
Scoring calculation methods
Strategy selection algorithms
Experimental win rate analysis

#Functions Highlights

play(): Simulates a complete game between two players
sus_points(): Applies Sus Fuss scoring rule
make_averaged(): Calculates average performance of strategies
run_experiments(): Conducts strategy performance tests

##How to Run


Experimental Results
The run_experiments() function provides win rates for various strategies, helping analyze their effectiveness.
