package com.example.searchengine;

import com.opencsv.CSVReader;
import org.springframework.stereotype.Component;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

@Component
public class Searcher {
    /**
     *
     * @param keyword to search
     * @param flippedIndexFileName the file where the search is performed.
     * @return the list of urls
     */
    public List<String> search(String keyword, String flippedIndexFileName){
        long duration = 0; //TODO: update the value in the code
        List<String> urls = new ArrayList<>();
        //TODO: complete
        System.out.println("duration searcher flipped: "+duration);
        return urls;
    }


}
