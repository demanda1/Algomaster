package com.algomaster.searching;

public class Searching {

    public static void main(String[] args) {
        long[] arr = {43, 87, 12, 65, 99, 31, 58, 76, 24, 90};

        SearchingAlgorithms search = new BinarySearch();
        System.out.println(search.binarySearchAlgo(arr, 24));
    }
}
