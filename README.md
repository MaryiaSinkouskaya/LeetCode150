# LeetCode Top Interview 150 Solutions

This repository contains solutions for the LeetCode Top Interview 150 problems organized by category.

## Top Interview 150 Problem List

### Section 1: Arrays & Strings

- Merge Sorted Array
- Remove Element
- Remove Duplicates from Sorted Array
- Remove Duplicates from Sorted Array II
- Majority Element
- Rotate Array
- Best Time to Buy and Sell Stock
- Best Time to Buy and Sell Stock II
- Jump Game
- Jump Game II
- H-Index
- Insert Delete GetRandom O(1)
- Product of Array Except Self
- Gas Station
- Candy
- Trapping Rain Water
- Roman to Integer
- Integer to Roman
- Length of Last Word
- Longest Common Prefix
- Reverse Words in a String
- Zigzag Conversion
- Find the Index of the First Occurrence in a String
- Text Justification

### Section 2: Two Pointers & Sliding Window

- Valid Palindrome
- Is Subsequence
- Two Sum II - Input Array Is Sorted
- Container With Most Water
- 3Sum
- Minimum Size Subarray Sum
- Longest Substring Without Repeating Characters
- Substring with Concatenation of All Words
- Minimum Window Substring

### Section 3: Matrix & 2D Arrays

- Valid Sudoku
- Spiral Matrix
- Rotate Image
- Set Matrix Zeroes
- Game of Life

### Section 4: Hash Maps & Sets

- Ransom Note
- Isomorphic Strings
- Word Pattern
- Valid Anagram
- Group Anagrams
- Two Sum
- Happy Number
- Contains Duplicate II
- Longest Consecutive Sequence

### Section 5: Intervals

- Summary Ranges
- Merge Intervals
- Insert Interval
- Minimum Number of Arrows to Burst Balloons

### Section 6: Stack & Queue

- Valid Parentheses
- Simplify Path
- Min Stack
- Evaluate Reverse Polish Notation
- Basic Calculator

### Section 7: Linked Lists

- Linked List Cycle
- Add Two Numbers
- Merge Two Sorted Lists
- Copy List with Random Pointer
- Reverse Linked List II
- Reverse Nodes in k-Group
- Remove Nth Node From End of List
- Remove Duplicates from Sorted List II
- Rotate List
- Partition List
- LRU Cache

### Section 8: Trees - Basic

- Maximum Depth of Binary Tree
- Same Tree
- Invert Binary Tree
- Symmetric Tree
- Construct Binary Tree from Preorder and Inorder Traversal
- Construct Binary Tree from Inorder and Postorder Traversal
- Populating Next Right Pointers in Each Node II
- Flatten Binary Tree to Linked List
- Path Sum
- Sum Root to Leaf Numbers
- Binary Tree Maximum Path Sum
- Binary Search Tree Iterator
- Count Complete Tree Nodes
- Lowest Common Ancestor of a Binary Tree

### Section 9: Trees - Level Order & Views

- Binary Tree Right Side View
- Average of Levels in Binary Tree
- Binary Tree Level Order Traversal
- Binary Tree Zigzag Level Order Traversal

### Section 10: Binary Search Trees

- Minimum Absolute Difference in BST
- Kth Smallest Element in a BST
- Validate Binary Search Tree

### Section 11: Graphs - Basic

- Number of Islands
- Surrounded Regions
- Clone Graph
- Evaluate Division
- Course Schedule
- Course Schedule II

### Section 12: Graphs - Advanced

- Snakes and Ladders
- Minimum Genetic Mutation
- Word Ladder

### Section 13: Tries

- Implement Trie (Prefix Tree)
- Design Add and Search Words Data Structure
- Word Search II

### Section 14: Backtracking

- Letter Combinations of a Phone Number
- Combinations
- Permutations
- Combination Sum
- N-Queens II
- Generate Parentheses
- Word Search

### Section 15: Divide & Conquer

- Convert Sorted Array to Binary Search Tree
- Sort List
- Construct Quad Tree
- Merge k Sorted Lists

### Section 16: Kadane's Algorithm

- Maximum Subarray
- Maximum Sum Circular Subarray

### Section 17: Binary Search

- Search Insert Position
- Search a 2D Matrix
- Find Peak Element
- Search in Rotated Sorted Array
- Find First and Last Position of Element in Sorted Array
- Find Minimum in Rotated Sorted Array
- Median of Two Sorted Arrays

### Section 18: Heap & Priority Queue

- Kth Largest Element in an Array
- IPO
- Find K Pairs with Smallest Sums
- Find Median from Data Stream

### Section 19: Bit Manipulation

- Add Binary
- Reverse Bits
- Number of 1 Bits
- Single Number
- Single Number II
- Bitwise AND of Numbers Range

### Section 20: Math

- Palindrome Number
- Plus One
- Factorial Trailing Zeroes
- Sqrt(x)
- Pow(x, n)
- Max Points on a Line

### Section 21: 1D Dynamic Programming

- Climbing Stairs
- House Robber
- Word Break
- Coin Change
- Longest Increasing Subsequence

### Section 22: 2D Dynamic Programming

- Triangle
- Minimum Path Sum
- Unique Paths II
- Longest Palindromic Substring
- Interleaving String
- Edit Distance
- Best Time to Buy and Sell Stock III
- Best Time to Buy and Sell Stock IV
- Maximal Square

---

## Project Structure

```
├── README.md
├── pom.xml                           # Maven configuration
├── src/
│   ├── section1_arrays_strings/      # Package: section1_arrays_strings
│   ├── section2_two_pointers_sliding_window/ # Package: section2_two_pointers_sliding_window
│   ├── section3_matrix_2d_arrays/    # Package: section3_matrix_2d_arrays
│   ├── section4_hash_maps_sets/      # Package: section4_hash_maps_sets
│   ├── section5_intervals/           # Package: section5_intervals
│   ├── section6_stack_queue/         # Package: section6_stack_queue
│   ├── section7_linked_lists/        # Package: section7_linked_lists
│   ├── section8_trees_basic/         # Package: section8_trees_basic
│   ├── section9_trees_level_order_views/ # Package: section9_trees_level_order_views
│   ├── section10_binary_search_trees/ # Package: section10_binary_search_trees
│   ├── section11_graphs_basic/       # Package: section11_graphs_basic
│   ├── section12_graphs_advanced/    # Package: section12_graphs_advanced
│   ├── section13_tries/              # Package: section13_tries
│   ├── section14_backtracking/       # Package: section14_backtracking
│   ├── section15_divide_conquer/     # Package: section15_divide_conquer
│   ├── section16_kadanes_algorithm/  # Package: section16_kadanes_algorithm
│   ├── section17_binary_search/      # Package: section17_binary_search
│   ├── section18_heap_priority_queue/ # Package: section18_heap_priority_queue
│   ├── section19_bit_manipulation/   # Package: section19_bit_manipulation
│   ├── section20_math/               # Package: section20_math
│   ├── section21_1d_dynamic_programming/ # Package: section21_1d_dynamic_programming
│   └── section22_2d_dynamic_programming/ # Package: section22_2d_dynamic_programming
├── test/
│   └── section1_arrays_strings/      # Test files mirror src structure
└── solutions.md
```

## Package Organization

Each section has its own package following the Top Interview 150 curriculum:

- **`section1_arrays_strings`**: Arrays and strings problems
- **`section2_two_pointers_sliding_window`**: Two pointers and sliding window techniques
- **`section3_matrix_2d_arrays`**: Matrix and 2D array problems
- **`section4_hash_maps_sets`**: Hash maps and sets problems
- **`section5_intervals`**: Interval-related problems
- **`section6_stack_queue`**: Stack and queue problems
- **`section7_linked_lists`**: Linked list problems
- **`section8_trees_basic`**: Basic tree operations
- **`section9_trees_level_order_views`**: Tree traversal and views
- **`section10_binary_search_trees`**: Binary search tree problems
- **`section11_graphs_basic`**: Basic graph algorithms
- **`section12_graphs_advanced`**: Advanced graph problems
- **`section13_tries`**: Trie data structure problems
- **`section14_backtracking`**: Backtracking algorithms
- **`section15_divide_conquer`**: Divide and conquer problems
- **`section16_kadanes_algorithm`**: Kadane's algorithm problems
- **`section17_binary_search`**: Binary search variations
- **`section18_heap_priority_queue`**: Heap and priority queue problems
- **`section19_bit_manipulation`**: Bit manipulation problems
- **`section20_math`**: Mathematical problems
- **`section21_1d_dynamic_programming`**: 1D dynamic programming
- **`section22_2d_dynamic_programming`**: 2D dynamic programming

## How to Use

### Running Tests

```bash
# Run all tests
mvn test

# Clean and run tests
mvn clean test
```

### Compiling

```bash
# Compile all source files
mvn compile

# Clean and compile
mvn clean compile
```

### Packaging

```bash
# Create JAR file
mvn package

# Clean and package
mvn clean package
```

### Project Structure

Each problem follows this template:

```java
package section1_arrays_strings; // Package matches directory

class ProblemName {
    public ReturnType methodName(Parameters params) {
        // Your solution here
        return defaultValue;
    }
}
```

### Adding New Problems

1. Create a new Java file in the appropriate section directory
2. Use the correct package declaration (see package organization above)
3. Follow the naming convention: `ProblemName.java`
4. Add corresponding test file in the `test/` directory

## Template Format

Each solution file follows this template:

```java
package section1_arrays_strings; // Package matches directory

class ProblemName {
    public ReturnType methodName(Parameters params) {
        // Your solution here
        return defaultValue;
    }
}
```

## Categories

- **Arrays**: Array manipulation, sorting, searching
- **Strings**: String operations, pattern matching
- **Linked Lists**: Linked list operations and algorithms
- **Trees**: Binary trees, BST operations
- **Graphs**: Graph algorithms, DFS, BFS
- **Dynamic Programming**: DP problems and optimization
- **Binary Search**: Binary search variations
- **Two Pointers**: Two-pointer technique problems
- **Sliding Window**: Sliding window algorithm problems
- **Stack**: Stack-based problems
- **Heap**: Priority queue and heap problems
- **Greedy**: Greedy algorithm problems
- **Backtracking**: Backtracking and recursion
- **Math**: Mathematical problems
- **Design**: System design and data structure design

## Progress Tracking

Check `solutions.md` for a complete list of all 150 problems with their status (solved/unsolved) and links to solutions. 