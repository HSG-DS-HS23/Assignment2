package com.example.searchengine;

public class MultithreadCrawlerTest extends CrawlerTest{
    @Override
    public Crawler generateCrawler() {
        return new MultithreadCrawler(indexFileName);
    }
}
