
#  Linear Search

## What is Linear Search?

**Linear Search** is the simplest searching technique used to find a particular element in a collection such as an array, string, or matrix.
It checks each element one by one until the desired element is found or the entire collection has been traversed.

It is also known as a **sequential search**, since the search proceeds in a sequential (left-to-right) manner.

---

## How Linear Search Works

1. Start from the first element of the array or list.
2. Compare the current element with the target value.
3. If they match, return the index (or position).
4. If not, move to the next element.
5. Continue until the element is found or the collection ends.
6. If the element isn’t found, return `-1` (or indicate “not found”).

---

## Example Code

```java
static int linearSearchInArray(int value, int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        if (value == arr[i]) {
            return i; // element found
        }
    }
    return -1; // element not found
}
```

**Example Run:**

```java
int[] numbers = {10, 20, 30, 40, 50};
System.out.println(linearSearchInArray(30, numbers)); // Output: 2
System.out.println(linearSearchInArray(99, numbers)); // Output: -1
```

---

## Time and Space Complexity

| Case             | Description                    | Time Complexity |
| ---------------- | ------------------------------ | --------------- |
| **Best Case**    | Target is the first element    | **O(1)**        |
| **Worst Case**   | Target is last or not present  | **O(N)**        |
| **Average Case** | Target somewhere in the middle | **O(N)**        |

**Space Complexity:** O(1)
(Only a few extra variables are used regardless of array size)

---

## Problems Solved Using Linear Search

All the following problems in the code are variations or applications of the **linear search** technique:

| #   | Problem                                   | Description                                                     | Method                               |
| --- | ----------------------------------------- | --------------------------------------------------------------- | ------------------------------------ |
| 1️ | **Search an element in an integer array** | Find the index of a given number in a 1D array.                 | `linearSearchInArray(int, int[])`    |
| 2️ | **Search a character in a string**        | Find the index of a specific character within a string.         | `linearSearchInString(char, String)` |
| 3️| **Find the minimal value in an array**    | Traverse all elements and return the smallest value.            | `minimal(int[])`                     |
| 4️| **Search an element in a 2D matrix**      | Use nested linear search to locate a number in a 2D array.      | `search2D(int, int[][])`             |
| 5️ | **Count even and odd numbers**            | Traverse an array and count how many elements are even and odd. | `EvenOdd(int[])`                     |

---

## Summary

Linear search may not be the most efficient for large datasets,
but it is **simple, reliable, and universally applicable**, even for **unsorted data**.

It forms the foundation for understanding more advanced search algorithms like:

* Binary Search
* Hash-based Search
* Jump Search, etc.
