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