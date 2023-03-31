package com.luke.lukelc.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DisplayAllLeetcodeController {
    private final String LC_FIND = "leetcode find";
    private final String SITE_DOWN = "SITE is down";
    private final String INCORRECT_URL = "URL is incorrect";


    @GetMapping("/check")
    // public String getLCNumber(@RequestParam(required = false) String url){
    public String getLCNumber(@RequestParam(required = false, value = "number") String number){

        String returnMessage = "didn't find lc";
        Map<String, String> lcNames = new HashMap();
        File[] files = new File("src/test/java/com/luke/lukelc/LC/Grammly").listFiles();
        //If this pathname does not denote a directory, then listFiles() returns null. 

        for (File file : files) {
            if (file.isFile()) {

                BufferedReader reader;
                try {
                    reader = new BufferedReader(new FileReader(file));
                    StringBuilder stringBuilder = new StringBuilder();
                    String line = null;
                    String ls = System.getProperty("line.separator");
                    while ((line = reader.readLine()) != null) {
                        stringBuilder.append(line);
                        stringBuilder.append(ls);
                    }
                    // delete the last new line separator
                    stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                    reader.close();
                    
                    String content = stringBuilder.toString();
    
                    lcNames.put(file.getName(), content);
                } catch (FileNotFoundException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }
        }

        for (String name : lcNames.keySet()){
            if (name.contains(number)){
                return lcNames.get(name);
                // return name;
            }
        }

        // try {
        //     URL urlObj = new URL(url);
        //     HttpURLConnection conn = (HttpURLConnection) urlObj.openConnection();
        // } catch (MalformedURLException e) {
        //     returnMessage = INCORRECT_URL;
        //     e.printStackTrace();
        // } catch (IOException e) {
        //     returnMessage = SITE_DOWN;
        //     e.printStackTrace();
        // }  

        return returnMessage;
    }
}
