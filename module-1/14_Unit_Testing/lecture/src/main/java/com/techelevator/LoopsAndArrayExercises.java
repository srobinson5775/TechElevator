package com.techelevator;

public class LoopsAndArrayExercises {

    /*
   Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle
   elements.
   middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
   middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
   middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
   */
    public int[] middleWay(int[] a, int[] b)
    {
        int middleArry[] = new int[] { a[1], b[1] };
        //return new int[] { a[1], b[1] };
        return middleArry;
    }


    /*
    Given an array of ints length 3, figure out which is larger between the first and last elements
    in the array, and set all the other elements to be that value. Return the changed array.
    maxEnd3([1, 2, 3]) → [3, 3, 3]
    maxEnd3([11, 5, 9]) → [11, 11, 11]
    maxEnd3([2, 11, 3]) → [3, 3, 3]
    */
    public int[] maxEnd3(int[] nums)
    {
        int largerNum = (nums[0] > nums[nums.length - 1]) ? nums[0] : nums[nums.length - 1];

        for (int i = 0; i < nums.length; i++)
        {
            nums[i] = largerNum;
        }

        return nums;
    }

}
