package com.ruperttwind.algorithm.dp;

import java.util.List;


/**
 *  |  Explanation:
 *  |-------------------------------------------------------------
 *     Idea of the Kadane's algorithm is to look for  all positive
 *     contiguous segments of the array. And keep track of maximum
 *     sum contiguous  segment among  all positive  segments. Each
 *     time we get a positive sum compare it and update.
 *
 *  |  Psuedo Code
 *  |-------------------------------------------------------------
 *
 *  1  def get_max_contiguous_sub_array_sum(IntegerArray):
 *  2      max_ending_here <-- max_so_far <-- IntegerArray[0]
 *  3
 *  4      for integer in IntegerArray[1:]:
 *  5          max_ending_here <-- max(x, max_ending_here + x)
 *  6          max_so_far      <-- max(max_so_far, max_ending_here)
 *  7
 *  8      return max_so_far
 *
 *  |  Links
 *  |-------------------------------------------------------------
 *     wiki      ---> https://en.wikipedia.org/wiki/Maximum_subarray_problem
 *     geek4geeks --> https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
 *
 */
public class Kadane {

  public static Integer getMaxContiguousSum(final List<Integer> integerList) {

    Integer maxSumSoFar = 0;

    for (int index = 0; index < integerList.size(); index++) {

      Integer currentMax = maxSumSoFar + integerList.get(index);

      if (currentMax < 0) {
        maxSumSoFar = 0;
        continue;
      }

      if (currentMax > maxSumSoFar) {
        maxSumSoFar = currentMax;
        continue;
      }
    }

    return maxSumSoFar;
  }
}
