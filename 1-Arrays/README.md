The arrays are the most common ways of storing the data in the contiguous memory form. BUT ion JAVA we do not have the pointers as a result whether the data will be stored in the continuous memory or not will totally depend on how JVM manages it. It is because the data inside the heap is not continous

All the data within the Arrays will be of the same datatype. The array of the `int` type will only contain the integers.

The syntax for the arrays is :

```java
// syntax datatype[] variable_name = new datatype[size];

// storing of 5 numbers
int[] rollnumber = new int[5];

// or we can store the numbers directly like -
int[] rolls = {1,2,3,4,5};

```

Go through the basics.java for better understanding. {section 1}

## Traversal without indexing

Instead of dealing with the indexes we can direcly deal with the values of the array, below is the code snippet for the same 


```java
int[] ids = {1,2,3,4,5};
for (int id: ids) {
    System.out.println(id);
}

```

## Indexes

The mechanism is present which helps us access the specific data from array. This is called the index.

Whenever we want to print the data at specific index will be print it like `array[index]`

By default, everything in empty int array will be 0. 

```java
int[] intExample = new int[3];
// intExample will be [0,0,0] in such case
```

Similar the `null` literals will be present within the String array

```java
String[] strExample = new String[3];
// intExample will be [null,null,null] in such case
```

Code is present in the basics.java execute it to get a better understanding 

## Useful methods

`Here variableName refers to the name of the array`

- variableName.length --> this is used to get the size of the array

- Arrays.toString(variableName) --> returns traversed array but will typecast the data within the arrays to string while printing


Code for the same can be found in {section 2} of basics.java


# 2D arrays 


2d Arrays are like matrix 

```
| 1  2 |
| 3  4 |
```

here 
- x1,y1 = 1
- x1,y2 = 2
- x2,y1 = 3
- x2,y2 = 4

Similary for making the 2D arrays inside java we make use of the nested arrays inside one another the similar presentation of the above above matrix will be like  `[ [1,2],[3,4] ]`

Implementation for the same can be seen in `Array2D.java`