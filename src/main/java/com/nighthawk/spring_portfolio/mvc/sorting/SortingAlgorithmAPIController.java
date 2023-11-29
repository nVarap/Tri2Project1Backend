package com.nighthawk.spring_portfolio.mvc.sorting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sorting")
public class SortingAlgorithmAPIController {

    // Your sorting algorithms can be called here as needed
    // For example, you can create separate methods for each sorting algorithm

    @GetMapping("/insertionSort")
    public String insertionSort() {
        // Call insertion sort method from SortingAlgorithm class
        // Return result as JSON or any desired format
        return "Insertion Sort Executed";
    }

    @GetMapping("/bubbleSort")
    public String bubbleSort() {
        // Call bubble sort method from SortingAlgorithm class
        // Return result as JSON or any desired format
        return "Bubble Sort Executed";
    }

    @GetMapping("/mergeSort")
    public String mergeSort() {
        // Call merge sort method from SortingAlgorithm class
        // Return result as JSON or any desired format
        return "Merge Sort Executed";
    }

    // Additional endpoints for other sorting algorithms or actions can be added here
}
