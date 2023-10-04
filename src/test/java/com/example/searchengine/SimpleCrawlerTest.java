package com.example.searchengine;

public class SimpleCrawlerTest extends CrawlerTest {

    @Override
    public Crawler generateCrawler() {
        return new SimpleCrawler(indexFileName);
    }
}
