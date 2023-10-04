package com.example.searchengine;

import com.opencsv.CSVWriter;
import org.springframework.scheduling.concurrent.ConcurrentTaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.*;

public class MultithreadCrawler extends Crawler {

    private ThreadPoolTaskExecutor executorService;



    private CopyOnWriteArraySet<String> visited;

    private CopyOnWriteArraySet<String[]> lines;



    private ObserveRunnable observeRunnable;

    private boolean done = false;

    public MultithreadCrawler(String indexFileName){
        //TODO: initialize
        super(indexFileName);
    }

    public void crawl(String startUrl){
        double startTime = System.currentTimeMillis();
        //TODO: complete
        double endTime = System.currentTimeMillis();
        double duration = endTime - startTime;
        System.out.println("duration: "+duration);

    }


    /*
      TODO: complete class.
      The purpose of this runnable is to do two tasks:
      1. Process the page at the given url (startUrl).
      2. Create new jobs for the hyperlinks found in the page.
      The instances of this class are used as input to the executorService.submit method.
       */
    class CrawlerRunnable implements Runnable{

        MultithreadCrawler crawler;

        String startUrl;

        public CrawlerRunnable(MultithreadCrawler crawler, String startUrl){
            this.crawler = crawler;
            this.startUrl = startUrl;

        }

        @Override
        public void run() {

        }
    }

    class ObserveRunnable implements Runnable {
        private MultithreadCrawler crawler;


        public ObserveRunnable(MultithreadCrawler crawler) {
            this.crawler = crawler;
        }

        @Override
        public void run() {
            //TODO: complete
        }
    }
}
