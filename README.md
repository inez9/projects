### Welcome! 👋

This repository contains various Computer Science projects I've worked on. More projects will be added, so please check back!

---

## Projects

###   [ArrayDeque61B](https://github.com/inez9/projects/blob/main/ArrayDeque61B%20(1).java)

   * **Description:** This project implements a double-ended queue (deque) data structure using a resizing array in Java. The naming convention "61B" likely aligns with specific course or project requirements.

   * **Features:**

        * **Dynamic Resizing:** Automatically resizes the underlying array to handle more elements and prevent overflow. It also shrinks the array to conserve memory when it's sparsely populated.
        * **Efficient Add/Remove:** Provides efficient methods for adding and removing elements from both the front and back of the deque.
        * **Circular Array Implementation:** Uses a circular array to optimize add/remove operations at both ends.
        * **Deque Operations:**
            * `addFirst(T x)`: Adds an item to the front of the deque.
            * `addLast(T x)`: Adds an item to the back of the deque.
            * `removeFirst()`: Removes and returns the item at the front.
            * `removeLast()`: Removes and returns the item at the back.
            * `get(int index)`: Gets the item at the specified index.
            * `size()`: Returns the number of items in the deque.
            * `isEmpty()`: Checks if the deque is empty.
            * `toList()`: Returns a `List` representation of the deque.

   * **Implementation Details:**

        * Uses a generic array (`T[] items`) to store elements.
        * `front`: Tracks the index of the first element.
        * `sizing`: Stores the current number of elements.
        * `indexing`: (Consider renaming this for clarity, e.g., `backIndex`) Tracks the index for adding to the back.
        * Resizing occurs when the array is full (add) or less than 25% full (remove). The array doubles when growing and halves when shrinking.
        * Circular array management uses the modulo operator (`%`).

   * **How to Use:**

        1.  **Include:** Add the `ArrayDeque61B.java` file to your Java project.
        2.  **Instantiate:** Create an instance of `ArrayDeque61B`.

            ```java
            ArrayDeque61B<Integer> deque = new ArrayDeque61B<>();
            ```

        3.  **Use Methods:** Call the various deque methods.

            ```java
            deque.addFirst(10);
            deque.addLast(20);
            int first = deque.removeFirst(); // first will be 10
            ```

---

###   [cats](https://github.com/inez9/projects/blob/main/cats.py)

   * **Description:** This Python code provides functions for analyzing typing accuracy, calculating typing speed (WPM), and implementing autocorrect functionality. It also includes functions for a multiplayer typing test component.

   * **Functions:**

        * `accuracy(typed, source)`: Calculates accuracy percentage by comparing typed and source strings (word-by-word).
        * `wpm(typed, elapsed)`: Calculates words-per-minute (WPM) from a typed string and elapsed time.
        * `autocorrect(typed_word, word_list, diff_function, limit)`: Returns the closest matching word from a word list to a typed word (using a difference function).
        * `feline_fixes(typed, source, limit)`: A difference function for autocorrect, counting letter substitutions and length differences.
        * `minimum_mewtations(typed, source, limit)`: A difference function calculating the edit distance between two words.
        * `final_diff(typed, source, limit)`: A placeholder for a final (unimplemented) difference function.
        * `report_progress(typed, source, user_id, upload)`: Calculates and reports typing progress for a multiplayer setting.
        * `time_per_word(words, timestamps_per_player)`: Calculates the time each player took to type each word.
        * `fastest_words(match)`: Determines which player typed each word fastest in a match.
        * `match(words, times)`: A data abstraction for a typing match (words and times).

        * **Utility Functions:**
            * `get_word(match, word_index)`: Gets a word from a match.
            * `time(match, player_num, word_index)`: Gets the time for a player and word in a match.
            * `get_all_words(match)`: Gets all words from a match.
            * `get_all_times(match)`: Gets all times from a match.
            * `match_string(match)`: Returns a string representation of a match.

        * `run_typing_test(topics)`: Runs a typing test from the command line.

   * **Notes:**

        * `final_diff` is a placeholder.
        * The code uses a `match` data abstraction.
        * `enable_multiplayer` controls multiplayer functionality.

---

###   [hogs](https://github.com/inez9/projects/blob/main/hog.py)

   * **Description:** This is a strategic dice game project involving rolling dice, scoring points, and applying game rules like Boar Brawl and Sus Fuss. Players compete to reach a goal score using different strategies.

   * **Game Mechanics:**

        * **Key Rules:**
            * **Boar Brawl:** A scoring mechanism that modifies points based on the current and opponent's scores.
            * **Sus Fuss:** A rule that adjusts scores based on the number of factors in the current score.
        * Players can choose different rolling strategies.

   * **Implemented Strategies:**

        * `always_roll(n)`: Always rolls a fixed number of dice.
        * `catch_up`: Adjusts dice rolls based on the opponent's score.
        * `boar_strategy`: Optimizes dice rolls using Boar Brawl scoring.
        * `sus_strategy`: Optimizes dice rolls considering the Sus Fuss rule.

   * **Project Structure:**

        * Game simulation functions
        * Scoring calculation methods
        * Strategy selection algorithms
        * Experimental win rate analysis

   * **Function Highlights:**

        * `play()`: Simulates a complete game between two players.
        * `sus_points()`: Applies the Sus Fuss scoring rule.
        * `make_averaged()`: Calculates the average performance of strategies.
        * `run_experiments()`: Conducts strategy performance tests.

   * **How to Run:** (Add specific instructions if applicable, e.g., "Run `python hog.py` in your terminal")

   * **Experimental Results:** The `run_experiments()` function provides win rates for various strategies.
