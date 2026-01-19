# BridgeLabz Training — Daily Progress Log 📘

**Name:** Prakhar Tripathi  
**ID:** 2215001266  

This repository tracks my **daily and weekly progress during BridgeLabz training**, with a strong emphasis on **Java fundamentals**, **OOPs**, **problem-solving**, and **clean repository structuring**.  
All work is version-controlled with **incremental commits** to reflect real learning progression.

🔗 **Repository:**  
👉 https://github.com/imprakhartripathi/BridgeLabz-Training

📌 **Branching Note:**
- **Default branch:** `main`
- **This Branch:** `dsa-practice`  

---

## 📂 Repository Structure

The codebase is organized by concept for clarity and scalability:

- **[`gcr-codebase`](https://github.com/imprakhartripathi/BridgeLabz-Training/tree/dsa-practice/gcr-codebase) ↗️**  Data Structures & Algorithms practice aligned with GCR curriculum
  - [`linkedlist`](https://github.com/imprakhartripathi/BridgeLabz-Training/tree/dsa-practice/gcr-codebase/linkedlist) ↗️ LinkedList Implementation & Problems

- **[`scenario-based`](https://github.com/imprakhartripathi/BridgeLabz-Training/tree/dsa-practice/scenario-based) ↗️**  Scenario-driven DSA and algorithmic problems

---

## 🗓️ Weekly Log

### **Week 4 Contd. — Data Structures & Algorithms**

📅 *Started: 5-Jan-2026 (Monday)*

**Focus:**  
Fundamental data structures, linked lists, algorithmic problem-solving, and DSA optimization.

---

### 📅 **8 Jan — LinkedList Implementation & Questions**

**LinkedList Data Structure Practice**

Includes:
- LinkedList basic operations (insert, delete, search, traverse)
- LinkedList problems and algorithms
- Reverse LinkedList, Detect cycle, Merge sorted lists
- Other advanced LinkedList operations

Checkout Files at: [`gcr-codebase/linked-lists`](https://github.com/imprakhartripathi/BridgeLabz-Training/tree/dsa-practice/gcr-codebase/linked-lists) ↗️

**How to Run LinkedList Programs:**

```bash
# Compile all LinkedList files
javac gcr-codebase/linked-lists/*.java

# Run a specific program (replace ClassName with actual file)
java -cp gcr-codebase linked-lists.ClassName
```

**Or compile & run from IDE:**
- Open any LinkedList file in your IDE
- Right-click → Run
- Observe the output for list operations and algorithm results

---

### 📅 **9 Jan — 3 Scenario Based DSA Questions**

**3 Advanced Scenario Based Questions - DSA Applications**

Includes scenario-based problems applying data structures and algorithms to real-world problems.

Checkout Files at: [`scenario-based`](https://github.com/imprakhartripathi/BridgeLabz-Training/tree/dsa-practice/scenario-based) ↗️

**Files Included:**
- [`scenario-based/hospital/`](https://github.com/imprakhartripathi/BridgeLabz-Training/tree/dsa-practice/scenario-based/hospital) ↗️ - Hospital Management System with Patient, Doctor, Bill management using OOPs
- [`scenario-based/flightbooking/`](https://github.com/imprakhartripathi/BridgeLabz-Training/tree/dsa-practice/scenario-based/flightbooking) ↗️ - Flight Booking System with booking management
- [`scenario-based/vehiclerental/`](https://github.com/imprakhartripathi/BridgeLabz-Training/tree/dsa-practice/scenario-based/vehiclerental) ↗️ - Vehicle Rental System with different vehicle types

**How to Run Scenario-Based Programs:**

```bash
# Navigate to workspace root and compile
javac scenario-based/hospital/*.java scenario-based/flightbooking/*.java scenario-based/vehiclerental/*.java

# Run the hospital system
java -cp scenario-based hospital.HospitalDriver

# Run the flight booking system
java -cp scenario-based flightbooking.FlightBookingDriver

# Run the vehicle rental system
java -cp scenario-based vehiclerental.RentalDriver
```

**Or compile & run from IDE:**
- Open the main scenario file in your IDE
- Right-click → Run
- Follow any interactive prompts or observe algorithm output

---

### 📅 **12 Jan — Hospital Management System**

**Advanced Hospital Management System - OOPs Implementation**

A comprehensive hospital management system implementing core OOPs concepts with proper encapsulation, inheritance, and polymorphism.

Checkout Files at: [`scenario-based/hospital`](https://github.com/imprakhartripathi/BridgeLabz-Training/tree/dsa-practice/scenario-based/hospital) ↗️

**Files Included:**
- `HospitalDriver.java` - Main driver class
- `impl/Patient.java` - Patient class with patient details
- `impl/Doctor.java` - Doctor class with specialization
- `impl/Bill.java` - Billing system implementation
- `impl/InPatient.java` - In-patient extends Patient
- `impl/OutPatient.java` - Out-patient extends Patient
- `impl/IPayable.java` - Interface for payable entities

**How to Run:**

```bash
# Compile and run from project root
javac scenario-based/hospital/*.java
java -cp scenario-based hospital.HospitalDriver
```

---

### 📅 **14 Jan — Stack, Queue, HashMap & Hashing**

**Core Data Structures Implementation & Problems**

Implementation of fundamental data structures with algorithmic problem-solving applications.

Checkout Files at: [`gcr-codebase/stack_queue_hashmap_hashfunctions`](https://github.com/imprakhartripathi/BridgeLabz-Training/tree/dsa-practice/gcr-codebase/stack_queue_hashmap_hashfunctions) ↗️

**Files Included:**
- `Driver.java` - Main driver class with menu-driven interface
- `impl/CustomHashMap.java` - Custom HashMap implementation with hashing functions
- `impl/Stack.java` - Stack implementation
- `impl/Queue.java` - Queue implementation
- `impl/CircularTour.java` - Gas station circular tour problem
- `impl/QueueUsingStacks.java` - Implement queue using two stacks
- `impl/SortStackRecursion.java` - Sort stack using recursion
- `impl/StockSpan.java` - Stock span problem
- `impl/TwoSum.java` - Two sum problem using hash map
- `impl/PairWithGivenSum.java` - Find pairs with given sum
- `impl/LongestConsecutiveSequence.java` - Longest consecutive sequence
- `impl/ZeroSumSubarrays.java` - Find all subarrays with zero sum
- `impl/SlidingWindowMaximum.java` - Sliding window maximum problem

**How to Run:**

```bash
# Compile all files
javac gcr-codebase/stack_queue_hashmap_hashfunctions/*.java

# Run the driver
java -cp gcr-codebase stack_queue_hashmap_hashfunctions.Driver
```

---

### 📅 **14 Jan — Sorting Algorithms**

**Comprehensive Sorting Algorithms Implementation**

Implementation of major sorting algorithms with visualization and analysis of time complexities.

Checkout Files at: [`gcr-codebase/sorting`](https://github.com/imprakhartripathi/BridgeLabz-Training/tree/dsa-practice/gcr-codebase/sorting) ↗️

**Files Included:**
- `Driver.java` - Main driver class with menu and performance analysis
- `impl/BubbleSort.java` - Bubble Sort implementation
- `impl/SelectionSort.java` - Selection Sort implementation
- `impl/InsertionSort.java` - Insertion Sort implementation
- `impl/MergeSort.java` - Merge Sort implementation (O(n log n))
- `impl/QuickSort.java` - Quick Sort implementation
- `impl/HeapSort.java` - Heap Sort implementation
- `impl/CountingSort.java` - Counting Sort implementation (non-comparative)

**How to Run:**

```bash
# Compile all sorting files
javac gcr-codebase/sorting/*.java

# Run the sorting driver
java -cp gcr-codebase sorting.Driver
```

**Features:**
- Compare time complexities of different algorithms
- Test with random, sorted, and reverse-sorted arrays
- Visualize sorting steps for understanding

---

### 📅 **16 Jan — Linear and Binary Search, String Manipulation & I/O**

**Search Algorithms, String Handling, and File I/O Implementations**

Comprehensive implementation of linear and binary search algorithms, StringBuffer/StringBuilder utilities, and file handling operations.

---

**Linear & Binary Search**

Checkout Files at: [`gcr-codebase/searching`](https://github.com/imprakhartripathi/BridgeLabz-Training/tree/dsa-practice/gcr-codebase/searching) ↗️

**Files Included:**
- `Driver.java` - Main driver class with menu-driven interface
- `impl/LinearSearchWordInSentence.java` - Linear search to find word positions in a sentence
- `impl/LinearSearchFirstNegative.java` - Linear search to find first negative number in array
- `impl/BinarySearch2DMatrix.java` - Binary search in a 2D sorted matrix
- `impl/BinarySearchFirstLastOccurrence.java` - Binary search to find first and last occurrence of element
- `impl/BinarySearchPeakElement.java` - Binary search to find peak element in array
- `impl/BinarySearchRotationPoint.java` - Binary search to find rotation point in rotated sorted array
- `impl/ChallengeSearch.java` - Challenge problem for search algorithm optimization

**How to Run:**
```bash
javac gcr-codebase/searching/*.java gcr-codebase/searching/impl/*.java
java -cp gcr-codebase searching.Driver
```

---

**StringBuffer Implementations**

Checkout Files at: [`gcr-codebase/stringbuffer`](https://github.com/imprakhartripathi/BridgeLabz-Training/tree/dsa-practice/gcr-codebase/stringbuffer) ↗️

**Files Included:**
- `StringBufferConcatenate.java` - String concatenation using StringBuffer
- `StringBufferVsBuilderBenchmark.java` - Performance comparison between StringBuffer and StringBuilder

**How to Run:**
```bash
javac gcr-codebase/stringbuffer/*.java
java -cp gcr-codebase stringbuffer.ClassName
```

---

**StringBuilder Implementations**

Checkout Files at: [`gcr-codebase/stringbuilder`](https://github.com/imprakhartripathi/BridgeLabz-Training/tree/dsa-practice/gcr-codebase/stringbuilder) ↗️

**Files Included:**
- `StringBuilderReverse.java` - String reversal using StringBuilder
- `StringBuilderRemoveDuplicates.java` - Remove duplicate characters from string

**How to Run:**
```bash
javac gcr-codebase/stringbuilder/*.java
java -cp gcr-codebase stringbuilder.ClassName
```

---

**FileReader Operations**

Checkout Files at: [`gcr-codebase/filereader`](https://github.com/imprakhartripathi/BridgeLabz-Training/tree/dsa-practice/gcr-codebase/filereader) ↗️

**Files Included:**
- `FileReaderReadLines.java` - Read and display all lines from a file
- `FileReaderWordCount.java` - Count words in a file

**How to Run:**
```bash
javac gcr-codebase/filereader/*.java
java -cp gcr-codebase filereader.ClassName
```

---

**InputStreamReader Operations**

Checkout Files at: [`gcr-codebase/inputstreamreader`](https://github.com/imprakhartripathi/BridgeLabz-Training/tree/dsa-practice/gcr-codebase/inputstreamreader) ↗️

**Files Included:**
- `InputStreamReaderConsoleToFile.java` - Read from console and write to file
- `InputStreamReaderReadFile.java` - Read content from file using InputStreamReader

**How to Run:**
```bash
javac gcr-codebase/inputstreamreader/*.java
java -cp gcr-codebase inputstreamreader.ClassName
```

---

### 📅 **17 Jan — 2 Scenario Based Questions**

**2 Advanced Scenario Based Systems - Book Management & Browser History**

Includes scenario-based problems applying data structures and algorithms to real-world problems.

---

**Bookshelf Management System**

Checkout Files at: [`scenario-based/bookshelf`](https://github.com/imprakhartripathi/BridgeLabz-Training/tree/dsa-practice/scenario-based/bookshelf) ↗️

**Files Included:**
- `Driver.java` - Main driver class with menu-driven interface
- `impl/Book.java` - Book data model with title, author, ISBN
- `impl/Library.java` - Library class for managing book collections

**How to Run:**
```bash
javac scenario-based/bookshelf/*.java scenario-based/bookshelf/impl/*.java
java -cp scenario-based bookshelf.Driver
```

---

**Browser Buddy - Tab History Manager**

Checkout Files at: [`scenario-based/browserbuddy`](https://github.com/imprakhartripathi/BridgeLabz-Training/tree/dsa-practice/scenario-based/browserbuddy) ↗️

**Files Included:**
- `Driver.java` - Main driver class with menu-driven interface
- `impl/TabManager.java` - Tab management system implementation
- `impl/TabHistory.java` - History tracking for browser tabs
- `impl/PageNode.java` - Node class for page history linked list

**How to Run:**
```bash
javac scenario-based/browserbuddy/*.java scenario-based/browserbuddy/impl/*.java
java -cp scenario-based browserbuddy.Driver
```

**Features:**
- ✅ Tab opening, closing, and switching
- ✅ Back/Forward navigation simulation
- ✅ History tracking with linked list
- ✅ LRU-style page management

---

### 📅 **19 Jan — Algorithm Runtime Analysis & Big-O Notation with 4 Scenario Based Questions (OOPs & Data Structures)**

**Algorithm Complexity Analysis & Performance Comparison**

Comprehensive analysis of algorithm time and space complexities with practical comparisons.

Checkout Files at: [`gcr-codebase/runtimeanalysis`](https://github.com/imprakhartripathi/BridgeLabz-Training/tree/dsa-practice/gcr-codebase/runtimeanalysis) ↗️

**Files Included:**
- `DataStructureSearchComparison.java` - Compare search operations across data structures (O(n) vs O(log n))
- `FibonacciComparison.java` - Compare recursive vs iterative Fibonacci with Big-O analysis
- `FileReadingComparison.java` - Compare file reading methods performance
- `SearchComparison.java` - Linear search vs Binary search time complexity comparison
- `SortingComparison.java` - Compare sorting algorithms (Bubble, Selection, Merge, Quick)
- `StringConcatenationComparison.java` - Compare String vs StringBuffer vs StringBuilder performance

**How to Run:**
```bash
javac gcr-codebase/runtimeanalysis/*.java
java -cp gcr-codebase runtimeanalysis.ClassName
```

**Concepts Covered:**
- ✅ Big-O Notation (O(1), O(n), O(log n), O(n log n), O(n²))
- ✅ Time Complexity Analysis
- ✅ Space Complexity Analysis
- ✅ Practical performance benchmarks
- ✅ Algorithm optimization strategies


---

**4 Advanced Scenario Based Systems - Banking, Employee Management, Exam Proctoring & Parcel Tracking**

Comprehensive OOPs implementations with inheritance, polymorphism, and data structure applications.


**Bank Account Hierarchy**

Checkout Files at: [`scenario-based/bank_account_hierarchy`](https://github.com/imprakhartripathi/BridgeLabz-Training/tree/dsa-practice/scenario-based/bank_account_hierarchy) ↗️

**Files Included:**
- `Driver.java` - Main driver class with menu-driven interface
- `impl/BankAccount.java` - Base bank account class
- `impl/SavingsAccount.java` - Savings account with interest calculation
- `impl/CheckingAccount.java` - Checking account with transaction limits

**How to Run:**
```bash
javac scenario-based/bank_account_hierarchy/*.java scenario-based/bank_account_hierarchy/impl/*.java
java -cp scenario-based bank_account_hierarchy.Driver
```

**Features:**
- ✅ Inheritance hierarchy (BankAccount → SavingsAccount, CheckingAccount)
- ✅ Polymorphic behavior for deposits and withdrawals
- ✅ Account-specific features (interest, transaction limits)

---

**Employee Role Polymorphism**

Checkout Files at: [`scenario-based/employee_role_polymorphism`](https://github.com/imprakhartripathi/BridgeLabz-Training/tree/dsa-practice/scenario-based/employee_role_polymorphism) ↗️

**Files Included:**
- `Driver.java` - Main driver class with menu-driven interface
- `impl/Employee.java` - Base employee class
- `impl/Developer.java` - Developer role with specific responsibilities
- `impl/Manager.java` - Manager role with team management

**How to Run:**
```bash
javac scenario-based/employee_role_polymorphism/*.java scenario-based/employee_role_polymorphism/impl/*.java
java -cp scenario-based employee_role_polymorphism.Driver
```

**Features:**
- ✅ Polymorphic employee roles
- ✅ Method overriding for role-specific behavior
- ✅ Salary calculation based on role

---

**Exam Proctoring System**

Checkout Files at: [`scenario-based/examproctor`](https://github.com/imprakhartripathi/BridgeLabz-Training/tree/dsa-practice/scenario-based/examproctor) ↗️

**Files Included:**
- `Driver.java` - Main driver class with menu-driven interface
- `impl/ExamSession.java` - Exam session management
- `impl/ScoringService.java` - Automated scoring and grading service

**How to Run:**
```bash
javac scenario-based/examproctor/*.java scenario-based/examproctor/impl/*.java
java -cp scenario-based examproctor.Driver
```

**Features:**
- ✅ Exam session creation and management
- ✅ Automated scoring based on answers
- ✅ Student performance tracking

---

**Parcel Tracking System**

Checkout Files at: [`scenario-based/parceltracker`](https://github.com/imprakhartripathi/BridgeLabz-Training/tree/dsa-practice/scenario-based/parceltracker) ↗️

**Files Included:**
- `Driver.java` - Main driver class with menu-driven interface
- `impl/ParcelTracker.java` - Main tracking system implementation
- `impl/ParcelNode.java` - Node class for tracking history linked list

**How to Run:**
```bash
javac scenario-based/parceltracker/*.java scenario-based/parceltracker/impl/*.java
java -cp scenario-based parceltracker.Driver
```

**Features:**
- ✅ Parcel tracking with status updates
- ✅ Linked list for tracking history
- ✅ Delivery status management

---

## 🧾 Commit History (Chronological)

The following commit history reflects **actual work progression**:
> Note: Commit entries are documented post-commit. Therefore, the branch history on GitHub may occasionally be ahead of this log.


```
2026-01-08 025e5df [Prakhar Tripathi] Added - LinkedList Questions in GCR
2026-01-09 096c648 [Prakhar Tripathi] Added - 3 Scenario Based Questions (Hospital, FlightBooking, VehicleRental) | Refactored - GitIgnore
2026-01-09 2a5eaf4 [Prakhar Tripathi] Refactored - Readme.md for log updation
2026-01-12 470e0d6 [Prakhar Tripathi] Added - Hospital Management System (Patient, Doctor, Bill classes with OOPs implementation)
2026-01-14 5a04eba [Prakhar Tripathi] Added - Stack, Queue, HashMap and Hashing Function implementations in GCR
2026-01-14 eb0bd53 [Prakhar Tripathi] Added - Sorting Algorithms (Bubble, Selection, Insertion, Merge, Quick, Heap, Counting Sort) in GCR
2026-01-16 bef1fad [Prakhar Tripathi] Refactored - Readme.md
2026-01-16 2a0b304 [Prakhar Tripathi] Added - "Submission of Linear and Binary Search" in GCR
2026-01-16 6e441fe [Prakhar Tripathi] Refactored - Readme.md for log updation
2026-01-17 5db4cd9 [Prakhar Tripathi] Added - 2 Scenario Based Questions
2026-01-19 04badd7 [Prakhar Tripathi] Added - "Submission of Algorithm's Runtime Analysis & Big-O Notation" in GCR (runtimeanalysis)      
2026-01-19 ff2c1c9 [Prakhar Tripathi] Refactored - Readme for daily log updation
2026-01-19 582ed9e [Prakhar Tripathi] Added - 4 Scenario Based Questions
```

To Get This Log Use: 
```bash
git log --pretty=format:"%ad %h %s" --date=short --reverse
```

---

## 🔄 How This Log Will Be Maintained

* Weekly sections will be extended as training progresses
* Daily summaries will stay **short and factual**
* Commit history will remain the **single source of truth**