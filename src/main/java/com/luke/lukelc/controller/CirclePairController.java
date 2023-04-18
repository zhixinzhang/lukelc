package com.luke.lukelc.controller;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.luke.lukelc.model.Flights;
import com.luke.lukelc.model.FlightsRepository;


@Controller // This means that this class is a Controller
@RequestMapping(path="/circle/") // This means URL's start with /demo (after Application path)
public class CirclePairController {

    @Autowired
    private FlightsRepository flightsRepository;

    // curl -s -X GET "http://localhost:8080/circle/getSome?source=BOS&destination=LAX&departure=2022-10-1%2016:00:00"
    @GetMapping(path="/getSome")
    @ResponseBody
    public Map<Integer, Flights> getSomeTickets(
        @RequestParam(name = "source") String source,
        @RequestParam(name = "destination") String destination, 
        @RequestParam(name = "departure") java.sql.Timestamp departure) {

        // This returns a JSON or XML with the users

        Map<Integer, Flights> ans = new HashMap<>();
        Iterable<Flights> res = flightsRepository.findAll();
        Iterator iterator = res.iterator();
        while (iterator.hasNext()){
            Flights flight = (Flights)iterator.next();
            if (flight.getSource().equals(source) && flight.getDestination().equals(destination))
                ans.put(flight.getId(), flight);
        }
        
        return ans;
    }

    // curl -X POST -F 'source=BOS' -F 'destination=LAX' -F 'count=3' http://localhost:8080/circle/booktickets
    @PostMapping(path="/booktickets")
    @ResponseBody
    public Map<Integer, Flights> bookTickets(
        @RequestParam(name = "source") String source,
        @RequestParam(name = "destination") String destination, 
        @RequestParam(name = "count") int count) {

        Map<Integer, Flights> ans = new HashMap<>();
        Iterable<Flights> res = flightsRepository.findAll();
        Iterator iterator = res.iterator();

        while (iterator.hasNext()){
            Flights flight = (Flights)iterator.next();
            if (flight.getSource().equals(source) && flight.getDestination().equals(destination))
                ans.put(flight.getId(), flight);
        }

        
        if (ans.keySet().size() >= count){

        }
        return ans;
    }
}
