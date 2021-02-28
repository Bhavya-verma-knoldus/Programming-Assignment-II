# Sorting without using Mutation in Scala

## What is Scala?

Scala is a general-purpose programming language providing support for both object-oriented programming and functional programming. The language has a strong static type system. Designed to be concise, many of Scala's design decisions are aimed to address criticisms of Java.

## Description
I have implemented bubble sort without using mutation. I have used tail recursion to implement the method. There are 2 nested methods, one is getLargest() which is responsible to find out the largest value from the list, other one is bubbleSortNested() which is responsible to add the largest element at the end of the list. These 2 methods combined are used to sort the list.

## Commands
* sbt compile - To compile the code
* sbt test - To execute unit test cases
* sbt scalastyleGenerateConfig - To generate scalastyle config file
* sbt scalastyle - To execute scalastyle plugin for API
* sbt test:scalastyle - To execute scalastyle plugin for test cases