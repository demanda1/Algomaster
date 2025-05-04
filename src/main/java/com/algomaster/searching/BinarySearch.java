package com.algomaster.searching;

import java.util.Arrays;

/**
 * Time complexity - log(n)
 * principle - divide & conquer
 * on sorted data
 */
public class BinarySearch implements SearchingAlgorithms {

    @Override
    public String binarySearchAlgo(long[] arr, long target) {

        /* Step1 : Sort the array */
        //Two ways of sorting
        Arrays.sort(arr); //sorts entire array
        Arrays.sort(arr, 0, arr.length-1); // sorts from-to index

        /* Step2 : Select the high and low item in the array */
        int high = arr.length -1;
        int low = 0;

        return binarySearchService(arr, low, high, target);
    }

    private String binarySearchService( long[] arr, int low, int high, long target){

         /* Step3 : Find the middle item and check if target matches with the middle item. */
        int mid = low + (high-low)/2;

        if( low < high) {
            if(target == arr[mid])
                return "Element found at sorted index =" + mid;

                /* Step4 :  If not in middle, then check if the value is less than or more than the middle */
            else if(target > arr[mid])
                return binarySearchService(arr, mid+1, high, target);

            else if(target < arr[mid])
                return binarySearchService(arr, low, mid-1, target);
            else
                return "Unsuccessful Search";
        } else {
            return "Unsuccessful Search";
        }
    }
}
