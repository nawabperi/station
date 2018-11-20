package com.example.myBatis.myBatisTest;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.example.myBatis.myBatisTest.Repo.StationMyBatisRepository;
import com.example.myBatis.myBatisTest.controller.MyController;
import com.example.myBatis.myBatisTest.model.Station;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyBatisInsertTest {

	@Autowired
	private WebApplicationContext webApplicationContext;

	private MockMvc mockMvc;
	
	@Autowired
	private StationMyBatisRepository mockController;
	
	@Autowired
	private MyController control;
	
	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}

	@Test
	public void getAllStation() throws Exception {
	    Station station = new Station();
	    station.setCallSign("12334");
	    station.setHdEnabled(true);
	    station.setName("mock");
	    station.setStationId("45");
	    
	   
	    
	   
        String result=  control.insert(station);
        assertEquals("inserted", result);

       
                

       
				
	}
}
