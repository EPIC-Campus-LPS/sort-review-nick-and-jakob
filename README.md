# Lab 4: Sort Review
## Objective
- Create a class called ```QuadSorts``` with the following methods.
    - ```public static int[] bubbleSort(int[] arr)``` - sorts an array *arr* using bubble sort and returns the sorted array
    - ```public static int[] selectionSort(int[] arr)``` - sorts an array *arr* using selection sort and returns the sorted array
    - ```public static int[] insertionSort(int[] arr``` - sorts an array *arr* using insertion sort and returns the sorted array
    - ```public static int[] mergeSort(int[] arr)``` - sorts an array *arr* using merge sort and returns the sorted array
## 4.1 - Review on Paper
1. With a partner and a deck of cards - act out how bubble, selection, insertion, and merge sort.
2. Write out **on paper** a method to sort  an array of numbers *on paper* for each of the four sorts.
3. Scan in your handwritten code add at it to your GitHub project or turn in your handwritten code to me in person.
## 4.2 Get Coding
- Define group roles - these should parallel the pair programming model but you may make modifications (such as deciding to switch at different time instead of every 15 minutes). _Hint: document these in reflection questions as soon as you decide on your norms._
- Pull the project starter from GitHub and start coding
## 4.3 - Try Them Against Tester
- To test your code, run the main in SortingTester. This will run your methods against three  random number arrays. Make sure your code passes all three test cases for each of the four sorts.
## 4.4 - Deliverables and Style
- Make sure you consult the style guidelines below for this assignment. They will explain how to add and general JavaDoc documentation for your code.
- Your submission should be pushed to GitHub classroom. It should include ```QuadSorts```, ```QuadSorts.html```, and answer the reflection questions in ```README.md```.
- Your handwritten code may be included as part of your GitHub submission or turned in in-person.
### Reflection Questions
1. What group roles did you define for your team? 
2. What differences are there between your handwritten code and your completed code?
3. What aspects of "good code" does this project demonstrate?
4. What challenges did you face during this project?
5. What is the difference between interative and recursive design?
6. Why do you think software engineers generate Javadoc references or equivalent for their projects? What is effective about Javadoc comments?


---
# Lab 4: Style Guidelines
## Lab 4: Sort Review  Style Guide

### Comments

For this lab, we will generate a Javadoc reference. **Throughout the remainder of the course, it is expected that you use Javadoc comments and generate a Javadoc reference for every project.** You must also place relevant single-line comments in your code to explain any logic that is not immediately understandable.

The Javadoc tool allows users to generate an API reference for your project in HTML using comments placed above classes, methods, or fields in your source code. Javadoc comments provide a description of the code element listed below it.

The general format of a Javadoc comment for a class is as follows:

```java
/**  
* Description of the class  
*  
* @author Ms. Ormes  
* @version 1.0, 09/12/2023  
* @see packages, interfaces, imports etc. you are referencing from another location  
*/
public class ExampleClass{
	...
}
```

The general format of a Javadoc comment for a method is as follows:
```java
/**
* This explains what the method does
* 
* @param exampleParameter this explains what this parameter does
* @return this describes what the method returns
*/
public int exampleMethod(int exampleParameter){
	return null;
}
```

If you type ```/**``` and hit enter directly above a block of code, it will generate general structure and any necessary tags (the keywords preceded by @) for you.

The Javadoc tool to generate a Javadoc reference should already be installed with IntelliJ. To use it [follow this documentation](https://www.jetbrains.com/help/idea/javadocs.html) from IntelliJ. *Note: when it asks you what output directory you want to use, create a new directory within your project first! The Javadoc tool will generate A Lot of files.* Make sure to double check that QuadSorts.html generated correctly before you submit.

---
# Data Structures Style Guide

In this course, we will not only practice writing code but how to write good code. Learning how to write good code  
includes a number of stylistic conventions. As we move further into the course, the expectations for appropriate  
style and documentation will become more extensive as we continue to practice. It is expected that you keep the style  
guidelines introduced in previous assignments in mind during the current assignment. This document will include a  
generic introduction to aspects of style relevant to this class in addition to specifics regarding this assignment.

## Types of Style Guidelines

There are six main categories of guidelines to look out for during this course.

### Formatting

_IntelliJ will automatically reformat code for us, so we won't have to worry about it too much in  
this course._

Formatting refers to the way code is structured. This includes indentations, brackets, and whitespace. Using clear and  
consistent formatting throughout makes writing and reading code easier. It is even more important when multiple people  
are working on the same program. In IntelliJ, there are built-in formatting rules which you can apply by:

- Going in the _Code_ menu and selecting _Reformat Code_.
- Using the keyboard shortcut, which by default is Ctrl+Alt+L on Windows and Opt+Cmd+L on Mac.

### Comments

Comments are statements of code that are not executed by the compiler or interpreter. We use them to explain what  
different pieces of do. Regardless of the complexity of the program, commenting all of your work appriately is a good  habit to get into.

In general, your comments should:

- Be concise: only write as much as is necessary to convey relevant information
- Help the reader: write them with the intention of a third party using them to understand your code, especially if it  
  is not immediately obvious
- Break the code into smaller units: Comments help separate code at logical breaks like the beginning of a loop, a new  
  step in a larger calculation, or at the beginning of a function

Commenting can be used as part of an effective code writing strategy as well. Instead of commenting after the code is  
written, try commenting before writing the code. By breaking down your program logically into smaller chunks and then  
working on those small chunks individually, you can avoid some bugs and logical errors

#### Javadoc

Javadoc is a tool that generates Java code documentation in the HTML format from Java source code. The documentation is  
formed from Javadoc comments that are usually placed above classes, methods, or fields. There are specific comment  
formats used to generate Javadocs that we will discuss and use later in the course.

### Naming

Naming variables, constants, functions, and classes is key to writing good code. Names should help the reader understand  
what is going on in your program.

In general, names should be:

- Accurate and informative: Names should reflect the contents or purpose of the entity as much as possible
- Concise: Names should be as concise as possible without sacrificing the above bullet point too much. It's a balance.
- Consistent: Use consistent names and naming conventions throughout your programs. See the section below for more  
  information about Java-specific conventions.

#### Java Conventions

In Java there are a few different conventions programmers use.

- For variables and functions, we will typically use camelCase
- For constants, we use CAPS_SNAKE_CASES
- For files, we use UpperCamelCase

### Maintainability

Maintainable code is easy to work on, update, and change without the original author needing to be present.  
Maintainability is a broad catch-all category for other aspects of good code that make it easy for you and others on  
your team to work on and debug code.

### Efficiency

It is important to not only write code that is correct, but efficiently uses resources (primarily memory and time). We  
will talk about this more extensively later in the course, but is something to keep in mind. Efficient code is  
increasing important as we write code to handle larger and larger inputs.

### Concision

Your code should be as concise as possible without sacrificing readability. Just like with commenting, this is a  
balance.
