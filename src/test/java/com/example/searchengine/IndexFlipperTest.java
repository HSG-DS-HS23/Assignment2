package com.example.searchengine;

import com.opencsv.CSVReader;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.io.FileReader;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class IndexFlipperTest extends TestBase {

    @BeforeAll
    public void flipIndex(){
        IndexFlipper flipper = new IndexFlipper();
        flipper.flipIndex(indexFileName, flippedIndexFileName);
    }

    @Test
    public void testFlipper(){
        try {
            CSVReader csvReader = new CSVReader(new FileReader(flippedIndexFileName));
            List<String[]> lines = csvReader.readAll();
            boolean hasPeaceKeyword = false;
            for (String[] line: lines){
                boolean b = testKeyword(line, "peace", createSet("/8a5ab92512fe56f2", "/57050a8402c6623c", "/9f8b163241d1839e"));
                if (b){
                    hasPeaceKeyword = true;
                }
            }
            if (!hasPeaceKeyword){
                fail();
            }
        } catch (Exception e){
            e.printStackTrace();
            fail();
        }
    }

    public boolean testKeyword(String[] line, String keyword, Set<String> urls){
        boolean b = false;
        if (line[0].equals(keyword)){
            Set<String> set = new HashSet<>(Arrays.asList(line).subList(1, line.length));
            assertEquals(set, urls);
            b = true;
        }
        return b;

    }
}
