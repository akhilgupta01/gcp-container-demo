package com.guptakh.gcp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class JobsController {

    @GetMapping("/jobs/{jobName}")
    public String runJob(@PathVariable String jobName){
        System.out.println("Starting job " + jobName);
        List<Integer> primeNumbers = new ArrayList<>();
        for(int i=2; i<100000; i++){
            if(i%2 == 0){
                continue;
            }
            for(int primeNum : primeNumbers){
                if(i % primeNum == 0){
                    continue;
                }
            }
            primeNumbers.add(i);
        }
        return String.valueOf(primeNumbers);
    }
}
