# Java Multithreading Lessons

## Part 1 - Multithreading basics

### Lesson 01 (Java Threads)
- class ```Thread```, interface ```Runnable```
- ```start(), run(), stop()```
- ```interrupt()```
- ```sleep(), join(), yield()```

### Lesson 02 (Synchronization)
- Data race (race condition)
- ```synchronized``` keyword
- Deadlock

### Lesson 03 (Mutex/Lock and Monitors)
- Java objects as locks and monitors
- ```synchronized``` methods
- ```wait(), notify(), notifyAll()```

### Lesson 04 (Volatile)
- ```volatile``` keyword
- ```long``` and ```double``` types problems

### Lesson 05 (Atomics)
- Atomic primitives
- ```long``` and ```double``` types problems
- Atomic references
- Atomic operations

### Lesson 06 (CAS-operations)
- Compare-And-Set
- Compare-And-Swap

### Lesson 07 (Acquire-Release semantics)
- Load/Store barriers
- ```volatile``` details
- ```synchronized``` block details

### Lesson 08 (Concurrent API's Locks)
- ```ReentrantLock```
- ```ReentrantReadWriteLock```
- ```StampedLock```

### Lesson 09 (Thread pools)
- ```Executor``` interface
- ```Executors``` class
- ```Callable, Future``` interfaces
- fixed/single/cashed/workStealing pools

## Part 2 - Synchronization algorithms

### Lesson 01 (Coarse-grained)
### Lesson 02 (Fine-grained)
### Lesson 03 (Optimistic)
### Lesson 04 (Lazy)
### Lesson 05 (Nonblocking)
### Lesson 06 (Wait-free consensus algorithm)