1) Why can't we rely on CPU execution time to measure algorithm efficiency?
We can’t rely on CPU execution time because it depends on many factors such as:
The computer’s hardware
Other programs running at the same time
Programming language
So, CPU time depends on hardware, system load, and compiler, not only on the algorithm itself.

2. How many operations does this code execute?
There are only two simple operations:
Initialize sum
Add 5 to sum
The code executes a constant number of operations → O(1)

3. Give the final time complexity of the code
a)
The loop runs n time
Time complexity = O(n)

b)
Outer loop runs n times.
Inner loop runs n times for each outer loop.
Total = n × n = n²
Time complexity = O(n²)

c)
Each loop divides n by 2.
It stops when n becomes 1.
Number of divisions = log₂(n)
Time complexity = O(log n)
