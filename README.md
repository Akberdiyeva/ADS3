# ADS3
# Assignment 3: Sorting and Searching Algorithm Analysis System
## Project Overview

In this project I implemented and compared several sorting and searching algorithms in Java.  
The main goal was to see how their performance changes depending on the size of the input data and whether the array is sorted or not.

---

## Implemented Algorithms

### Insertion Sort
Insertion Sort works by taking one element at a time and placing it in the correct position in the sorted part of the array.

- Best case: O(n)
- Worst case: O(n²)

---

### Quick Sort
Quick Sort uses a divide-and-conquer approach. It selects a pivot and splits the array into smaller parts, then sorts them recursively.

- Average case: O(n log n)
- Worst case: O(n²)

---

### Binary Search
Binary Search works only on sorted arrays. It repeatedly divides the array in half to find the target element.

- Time complexity: O(log n)

---

## Experiment Setup

I tested the algorithms on arrays of different sizes:

- 100
- 1000
- 5000
- 10000

For each size I used:
- a random array
- a sorted array

Execution time was measured using `System.nanoTime()`.

To make the results more accurate, each operation was executed multiple times and the average time was calculated.

---

## Results and Observations

From the results, it is clear that:

- Insertion Sort becomes very slow as the array size increases because of its quadratic complexity.
- Quick Sort is much faster on larger arrays and scales better.
- Binary Search is very fast compared to sorting algorithms.
- Binary Search works correctly only on sorted arrays, which is why sorting is required before using it.

---

## Analysis

The experiment confirms the theoretical time complexities:

- O(n²) algorithms (like Insertion Sort) become inefficient for large inputs.
- O(n log n) algorithms (like Quick Sort) perform much better as data grows.
- O(log n) algorithms (Binary Search) are extremely efficient.

The difference between algorithms becomes more noticeable as the input size increases.

---

## Screenshots

Screenshots of the program output are included in the repository.

---

## Reflection

While working on this assignment, I understood how important algorithm choice is for performance.  
At first, the differences between algorithms were not obvious on small arrays, but with larger data sizes the gap became very clear.

One of the challenges was getting stable timing results. Running each algorithm multiple times helped reduce random fluctuations.

Overall, this project helped me better understand both the theory and practical behavior of sorting and searching algorithms.
