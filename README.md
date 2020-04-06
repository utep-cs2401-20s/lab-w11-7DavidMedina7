# CS2401 – Week 11
With this lab assignment, you are going to get a chance to practice on n.log(n) sorting algorithms. This lab assignment should be reasonably straightforward. We need you to read it very carefully before you start doing anything. You should be able to rephrase the instructions and split the lab into smaller units before you start. Let’s get started!

## What problem will you be addressing in this lab?
In this lab, you are implement a new sorting algorithm to recursively sort arrays of integers as follows: 

````
newSorting(int[] A, int size):
    If A has fewer elements than size:
        Sort A using recursive QuickSort
    Otherwise:
        call newSorting of left half of A
        call newSorting of right half of A
        call mergeSortedHalves on the two sorted halves of A
````

## What do you have to do? 
1. Write the newSorting method as described above. 
<br/>Your method called newSorting should take:
    - an array A of integers (positive and/or negative; duplicates are also allowed); and 
    - an integer size that represents the size of the array at or below which your algorithm should switch to QuickSort to sort your array.
<br/>___Note___: your method newSorting should be a __void__ method.
2. Test this method on at least 5 test cases using JUnit test cases. For this, you will create a file called newSortingTester.java. You are expected to describe each of the test cases in java comments right before each test case’s code.

## What should you submit on Git?
You should submit:
1. `newSorting.java`, and
2. `newSortingTester.java`.

## How should you submit your work?
You should submit on Git.
<br/>However, if you are not yet fully familiar with Git, you can submit using a link provided by your TA (for a penalty of only 3 pts). 
<br/>Failing to follow submission instructions and guidelines given by your respective TA will result in up to 15 points off your overall grade in this lab. So please pay attention. 
<br/>Additionally, your java files are expected to be neat and clear (indentation and clear, meaningful variable naming for the java files). Failing to do so will result in up to 15 points off. On the other hand, extra neat and clear work will be rewarded by up to 10 extra points.

## By when should you submit your work?
Due date: __Friday April 10 at 11:59 pm__
<br/>Lateness rule: -10 pts for 1 day of lateness / - 20 pts for 2 days of lateness / 0 after that, __but you still have to turn in your work__.

## Grading
| Points | Item | 
| ---- | ----- | 
| 50 pts | Method newSorting |
| 50 pts | JUnit tests for method newSorting in `newSortingTester.java` |
| | 10 pts per test case: <br/>5 pts for the justification, and <br/>5 pts for the implementation |

## Example(s)
See the included `LabW11 Instructions.pdf` file for examples.