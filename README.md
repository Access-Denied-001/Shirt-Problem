In this repository I have implemented growable deque DS with arrays in Part A.
In Part B, I used this deque to implement a stack and solve a problem of shirt finding in a heap of shirts.


The problem is that you have a heap of dirty shirts and a stack of clean shirts made out of the heap. But each shirt has a score to it b/w [0,10000]. Whenever you are free you take a shirt from your heap make it clean and then put it in your stack of clean shirts. Also whenever you want to go out and party take out the shirt with highest score from the stack of clean shirts and all the shirts (including the one which you wore to party) above the shirt you picked are now dirty. 
You will be given two operation named as 1 and 2. 1 corresponds to picking the shirts from heap and putting it in clean stack you will be given a list of scores of shirts read this list from left to right precedence and 2 corresponds to find the the shirt in clean stack.
