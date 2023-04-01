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

public class DisplayGithubLCController {
    private final String LC_FIND = "leetcode find";
    private final String SITE_DOWN = "SITE is down";
    private final String INCORRECT_URL = "URL is incorrect";


    @GetMapping("/lukegit")
    // public String getLCNumber(@RequestParam(required = false) String url){
    public String getLCNumber(@RequestParam(required = false) String url){

        String returnMessage = "didn't find lc";
        Map<String, String> lcNames = new HashMap();
        try {
            URL urlObj = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) urlObj.openConnection();
        } catch (MalformedURLException e) {
            returnMessage = INCORRECT_URL;
            e.printStackTrace();
        } catch (IOException e) {
            returnMessage = SITE_DOWN;
            e.printStackTrace();
        }          




        return returnMessage;
    }
}
