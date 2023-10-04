package com.example.searchengine;

import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearcherTest extends TestBase {

    @Test
    public void testSearch(){
        Searcher searcher = new Searcher();
        Set<String> urls = new HashSet<>(searcher.search("peace", flippedIndexFileName));
        assertEquals(urls, createSet("https://api.interactions.ics.unisg.ch/hypermedia-environment/8a5ab92512fe56f2", "https://api.interactions.ics.unisg.ch/hypermedia-environment/57050a8402c6623c", "https://api.interactions.ics.unisg.ch/hypermedia-environment/9f8b163241d1839e"));
    }

}
