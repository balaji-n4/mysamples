package com.cts.paypal.mysamples.Impl;

import java.util.Optional;

public class OptionalDemo{   
    public static void main(String[] args) {   
        String[] words = new String[10];   
       /* String word = words[5].toLowerCase();   
        System.out.print(word);*/   
        Optional<String> ofNullable = Optional.ofNullable(words[5]);
        
        if (ofNullable.isPresent()) {   
            String word = words[5].toLowerCase();   
            System.out.print(word);   
        } else  
            System.out.println("word is null");   
    }   
} 