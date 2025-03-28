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

3.  **Use the methods:** Call the various methods to perform deque operations.

    ```java
    deque.addFirst(10);
    deque.addLast(20);
    int first = deque.removeFirst(); // first will be 10
    ```

## Notes

* The `getRecursive()
