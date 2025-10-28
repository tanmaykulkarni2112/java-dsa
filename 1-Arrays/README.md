# Arrays and ArrayLists in Java

## Arrays

Arrays are one of the most common ways of storing data in **contiguous memory**.
However, in **Java**, we don’t have direct access to memory through pointers.
As a result, whether data is actually stored contiguously depends on how the **JVM (Java Virtual Machine)** manages memory.
This is because objects (including arrays) are stored inside the **heap**, and the heap itself is not guaranteed to be continuous.

All elements within an array must be of the **same data type**.
For example, an array of type `int` can only contain integers.

---

### Syntax

```java
// Syntax: datatype[] variable_name = new datatype[size];

// Example: storing 5 numbers
int[] rollNumbers = new int[5];

// Or directly initialize with values
int[] rolls = {1, 2, 3, 4, 5};
```

>  Go through `basics.java` (Section 1) for a better understanding.

---

## Traversal Without Indexing

Instead of dealing with indexes directly, we can iterate over array values using an **enhanced for loop (for-each loop)**:

```java
int[] ids = {1, 2, 3, 4, 5};
for (int id : ids) {
    System.out.println(id);
}
```

This approach is simpler and avoids index-related errors.

---

## Indexes

An **index** is the mechanism that helps us access specific elements from an array.
We can print or access data at a particular index using the syntax:

```java
array[index]
```

### Default Values

* In an empty `int` array, all elements default to **0**:

  ```java
  int[] intExample = new int[3];
  // intExample = [0, 0, 0]
  ```

* In an empty `String` array, all elements default to **null**:

  ```java
  String[] strExample = new String[3];
  // strExample = [null, null, null]
  ```

>  Run the code in `basics.java` for a hands-on understanding.

---

## Useful Methods

Here, `variableName` refers to the name of the array.

* `variableName.length` → Returns the **size** of the array.
* `Arrays.toString(variableName)` → Returns a **string representation** of the array, making it easier to print its elements.

> Code for this section can be found in **Section 2** of `basics.java`.

---

# 2D Arrays

A **2D array** is like a matrix:

```
| 1  2 |
| 3  4 |
```

Here:

* x₁,y₁ = 1
* x₁,y₂ = 2
* x₂,y₁ = 3
* x₂,y₂ = 4

In Java, a 2D array is essentially an **array of arrays**.
The same matrix can be represented as:

```java
int[][] matrix = { {1, 2}, {3, 4} };
```

> Implementation for this can be seen in `Array2D.java`.

---

# ArrayList

An **ArrayList** is a dynamic alternative to traditional arrays.
Unlike arrays, ArrayLists **do not have a fixed size** — they can grow or shrink as needed.

ArrayList is part of the **Java Collections Framework** and is defined in the `java.util` package.

---

### Syntax

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ourList = new ArrayList<>(10);
        // <WrapperClass> → Wrapper class for the primitive datatype
        // 10 → initial capacity of the ArrayList
    }
}
```

---

## Behind the Scenes of Dynamic Sizing

Whenever the ArrayList becomes **half full**, a **new internal array** of **double the previous size** is created.
The existing elements are **copied** into the new array, and the old one is **discarded** by the garbage collector.

This resizing operation happens automatically and ensures that ArrayLists can grow dynamically.

---

## Commonly Used Methods in ArrayList

Here, `variable` refers to the name of the ArrayList.

| Method                          | Description                               |
| ------------------------------- | ----------------------------------------- |
| `variable.get(index)`           | Retrieves an element from the ArrayList   |
| `variable.add(value)`           | Adds an element to the ArrayList          |
| `variable.contains(value)`      | Checks if a value exists in the ArrayList |
| `variable.set(index, newValue)` | Updates the value at a specific index     |
| `variable.remove(index)`        | Removes an element at the given index     |

> Refer to `ArrayLists.java` for examples of each method.

---

## Additional Notes 

* Always **import `java.util.*`** or specifically `java.util.ArrayList` before using ArrayLists.

* Remember that ArrayLists **can only store objects**, not primitives — hence the need for **wrapper classes** like `Integer`, `Double`, `Boolean`, etc.

* You can convert an ArrayList back to an array using:

  ```java
  Integer[] arr = ourList.toArray(new Integer[0]);
  // Despite the size that we pass, the array arr will have the size equal to that of the arraylist.
  ```

* Similarly, you can sort an ArrayList using:

  ```java
  Collections.sort(ourList);
  ```
