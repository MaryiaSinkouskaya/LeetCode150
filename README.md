# LeetCode Top Interview 150 Solutions

This repository contains solutions for the LeetCode Top Interview 150 problems organized by category.

## Top Interview 150 Problem List

### Arrays
- Remove Element
- Merge Sorted Array
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

### Two Pointers
- Container With Most Water
- Trapping Rain Water
- Two Sum II - Input Array Is Sorted
- 3Sum
- 3Sum Closest
- 4Sum
- Move Zeroes
- Sort Colors
- Minimum Window Substring
- Substring with Concatenation of All Words
- Minimum Size Subarray Sum

### Sliding Window
- Longest Substring Without Repeating Characters
- Longest Repeating Character Replacement
- Permutation in String
- Find All Anagrams in a String
- Minimum Window Substring
- Sliding Window Maximum
- Longest Substring with At Most Two Distinct Characters
- Longest Substring with At Most K Distinct Characters
- Fruit Into Baskets
- Maximum Points You Can Obtain from Cards
- Subarray Product Less Than K
- Maximum Average Subarray I

### Stack
- Valid Parentheses
- Min Stack
- Evaluate Reverse Polish Notation
- Generate Parentheses
- Daily Temperatures
- Car Fleet
- Largest Rectangle in Histogram
- Trapping Rain Water
- Basic Calculator
- Basic Calculator II
- Remove K Digits
- Decode String
- 132 Pattern
- Next Greater Element I
- Next Greater Element II
- Online Stock Span
- Asteroid Collision
- Simplify Path
- Valid Parentheses
- Remove Invalid Parentheses
- Longest Valid Parentheses
- Score of Parentheses

### Binary Search
- Binary Search
- Search a 2D Matrix
- Koko Eating Bananas
- Find Minimum in Rotated Sorted Array
- Search in Rotated Sorted Array
- Time Based Key-Value Store
- Median of Two Sorted Arrays
- Find First and Last Position of Element in Sorted Array
- Search Insert Position
- Valid Perfect Square
- Sqrt(x)
- Guess Number Higher or Lower

### Linked List
- Reverse Linked List
- Merge Two Sorted Lists
- Reorder List
- Remove Nth Node From End of List
- Copy List with Random Pointer
- Add Two Numbers
- Linked List Cycle
- Find the Duplicate Number
- LRU Cache
- Merge k Sorted Lists
- Reverse Nodes in k-Group
- Remove Duplicates from Sorted List
- Remove Duplicates from Sorted List II
- Rotate List
- Partition List

### Trees
- Maximum Depth of Binary Tree
- Same Tree
- Invert Binary Tree
- Binary Tree Level Order Traversal
- Binary Tree Level Order Traversal II
- Binary Tree Zigzag Level Order Traversal
- Construct Binary Tree from Preorder and Inorder Traversal
- Construct Binary Tree from Inorder and Postorder Traversal
- Populating Next Right Pointers in Each Node
- Populating Next Right Pointers in Each Node II
- Lowest Common Ancestor of a Binary Tree
- Serialize and Deserialize Binary Tree
- Binary Tree Maximum Path Sum
- Sum Root to Leaf Numbers
- Path Sum
- Path Sum II
- Binary Tree Right Side View

### Tries
- Implement Trie (Prefix Tree)
- Design Add and Search Words Data Structure
- Word Search II
- Replace Words
- Design Search Autocomplete System
- Stream of Characters

### Heap/Priority Queue
- Kth Largest Element in an Array
- Find Median from Data Stream
- Merge k Sorted Lists
- Top K Frequent Elements
- Find K Pairs with Smallest Sums
- Reorganize String
- Task Scheduler

### Backtracking
- Subsets
- Combination Sum
- Combination Sum II
- Permutations
- Permutations II
- Word Search
- Palindrome Partitioning
- Letter Combinations of a Phone Number
- N-Queens

### Graphs
- Number of Islands
- Clone Graph
- Max Area of Island
- Pacific Atlantic Water Flow
- Surrounded Regions
- Rotting Oranges
- Walls and Gates
- Course Schedule
- Course Schedule II
- Redundant Connection
- Number of Connected Components in an Undirected Graph
- Graph Valid Tree
- Word Ladder

### Advanced Graphs
- Reconstruct Itinerary
- Min Cost to Connect All Points
- Network Delay Time
- Swim in Rising Water
- Alien Dictionary
- Cheapest Flights Within K Stops

### 1-D Dynamic Programming
- Climbing Stairs
- Min Cost Climbing Stairs
- House Robber
- House Robber II
- Longest Palindromic Substring
- Palindromic Substrings

### 2-D Dynamic Programming
- Longest Common Subsequence
- Best Time to Buy and Sell Stock with Cooldown
- Coin Change
- Coin Change II
- Target Sum
- Interleaving String
- Longest Increasing Path in a Matrix
- Distinct Subsequences
- Edit Distance
- Burst Balloons
- Regular Expression Matching
- Wildcard Matching
- Longest Valid Parentheses
- Unique Paths
- Unique Paths II
- Minimum Path Sum
- Triangle

### Greedy
- Jump Game
- Jump Game II
- Gas Station
- Hand of Straights
- Merge Triplets to Form Target Triplet
- Partition Labels
- Valid Parenthesis String
- Lemonade Change

### Intervals
- Insert Interval
- Merge Intervals
- Non-overlapping Intervals
- Meeting Rooms
- Meeting Rooms II
- Minimum Interval to Include Each Query

### Math & Geometry
- Rotate Image
- Spiral Matrix
- Set Matrix Zeroes
- Happy Number
- Plus One
- Pow(x, n)
- Multiply Strings
- Detect Squares
- Single Number
- Number of 1 Bits
- Counting Bits
- Reverse Bits
- Missing Number

### Bit Manipulation
- Sum of Two Integers
- Reverse Integer
- Add Binary
- Counting Bits
- Missing Number

### Design
- LRU Cache
- LFU Cache
- Find Median from Data Stream
- Design Twitter
- Design Hit Counter
- Design Underground System

---

## Project Structure

```
├── README.md
├── pom.xml                           # Maven configuration
├── src/
│   ├── arrays/                       # Package: arrays
│   ├── strings/                      # Package: strings
│   ├── linkedLists/                 # Package: linkedlists
│   ├── trees/                        # Package: trees
│   ├── graphs/                       # Package: graphs
│   ├── dynamic-programming/          # Package: dynamicprogramming
│   ├── binary-search/                # Package: binarysearch
│   ├── two-pointers/                 # Package: twopointers
│   ├── sliding-window/               # Package: slidingwindow
│   ├── stack/                        # Package: stack
│   ├── heap/                         # Package: heap
│   ├── greedy/                       # Package: greedy
│   ├── backtracking/                 # Package: backtracking
│   ├── math/                         # Package: math
│   └── design/                       # Package: design
├── test/
│   └── arrays/                       # Test files mirror src structure
└── solutions.md
```

## Package Organization

Each category has its own package:
- **`arrays`**: Array manipulation problems
- **`strings`**: String operations problems
- **`linkedlists`**: Linked list problems
- **`trees`**: Tree and binary tree problems
- **`graphs`**: Graph algorithm problems
- **`dynamicprogramming`**: Dynamic programming problems
- **`binarysearch`**: Binary search problems
- **`twopointers`**: Two pointer technique problems
- **`slidingwindow`**: Sliding window problems
- **`stack`**: Stack-based problems
- **`heap`**: Heap and priority queue problems
- **`greedy`**: Greedy algorithm problems
- **`backtracking`**: Backtracking problems
- **`math`**: Mathematical problems
- **`design`**: System design problems

## How to Use

1. Navigate to the appropriate category folder
2. Find the problem file (e.g., `RemoveElement.java`)
3. Each file contains a class with the problem name and the required method signature
4. Implement your solution in the provided method

## Building and Testing with Maven

### Prerequisites
- Java 17 or higher
- Maven 3.6 or higher

### Basic Commands

```bash
# Compile the project
mvn compile

# Run all tests
mvn test

# Clean build artifacts
mvn clean

# Package the project
mvn package
```

### Running Specific Test Categories

```bash
# Run only array tests
mvn test -Prun-arrays-tests

# Run only string tests
mvn test -Prun-strings-tests

# Run only linked list tests
mvn test -Prun-linked-lists-tests

# Run only tree tests
mvn test -Prun-trees-tests

# Run only dynamic programming tests
mvn test -Prun-dp-tests

# Run all tests
mvn test -Prun-all-tests
```

### Running Individual Tests

```bash
# Run a specific test class
mvn test -Dtest=RemoveElementTest

# Run a specific test method
mvn test -Dtest=RemoveElementTest#testRemoveElementExample1

# Run tests from a specific package
mvn test -Dtest="arrays.*Test"
```

### Test Reports

After running tests, you can view detailed reports:

```bash
# Generate test reports
mvn surefire-report:report

# View reports in browser (open target/site/surefire-report.html)
```

## Template Format

Each solution file follows this template:

```java
package arrays; // or appropriate package

class TaskName {
    public int removeElement(int[] nums, int val) {
        // Your solution here
        return 0;
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