# kiran_simplyfi

Algorithm to print the permutations lexicographic-ally:
Step 1. Sort the given string in non-decreasing order and print it. The first permutation is always the string sorted in non-decreasing order.
Step 2. Start generating next higher permutation. Do it until next higher permutation is not possible. If we reach a permutation where all characters are sorted and in non-increasing order, then that permutation is the last permutation.

Steps to generate the next higher permutation: 
Step 1. Take the previously printed permutation and find the rightmost character in it, which is smaller than its next character. Let us call this character as ‘first character’.
Step 2. Now find the ceiling of the ‘first character’. 
Ceiling is the smallest character on right of ‘first character’, which is greater than ‘first character’. Let us call the ceil character as ‘second character’.
Step 3. Swap the two characters found in above 2 steps.
Step 4. Sort the substring (in non-decreasing order) after the original index of ‘first character’.
