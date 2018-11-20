package com.example.myBatis.myBatisTest.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.myBatis.myBatisTest.Repo.StationMyBatisRepository;
import com.example.myBatis.myBatisTest.model.Station;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(description = "Set of endpoints for Creating, Retrieving, Updating and Deleting of.")
public class MyController {
	
	@Autowired
	StationMyBatisRepository repository;
    
    @RequestMapping(value ="/find", method = RequestMethod.GET)
    @ApiOperation("find all data")
    public List<Station> greeting() {
        return repository.findAll();
    }
    
    @RequestMapping(value ="/findAllID", method = RequestMethod.POST)
   
    public Station findById(@RequestParam(value="id", defaultValue="A10001") String id) {
        return repository.findById(id);
    }
    
    @RequestMapping(value= "/delete", method= RequestMethod.POST)
   
    public String delete(@RequestParam(value="id", defaultValue="A10001") String id) { 
       repository.deleteById(id);
       return "Deleted";
    }
    
    @RequestMapping(value="/insert", method=RequestMethod.POST)
   
    public String insert(@RequestBody Station station) { 
    	System.out.println("inside method");
    	System.out.println("__-+++++++++++++++++++++++++++++++++++++++");
    	System.out.println(station.getName());
    	System.out.println(station.getStationId());
       repository.insert(station);
       return "inserted";
    }
    
    @RequestMapping(value="/update", method=RequestMethod.POST)
  
    public String update(@RequestBody Station station) { 
    	System.out.println("inside method");
    	System.out.println("__-+++++++++++++++++++++++++++++++++++++++");
    	System.out.println(station.getName());
    	System.out.println(station.getStationId());
       repository.update(station);
       return "Data updated";
    }
    
    
}