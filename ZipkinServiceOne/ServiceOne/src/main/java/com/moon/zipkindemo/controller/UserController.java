package com.moon.zipkindemo.controller;
import java.util.ArrayList;

import java.util.List;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import com.splunk.logging.*;
import org.slf4j.*;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.moon.zipkindemo.model.Item;
import com.moon.zipkindemo.model.Location;
import com.moon.zipkindemo.model.Message;
import com.moon.zipkindemo.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;

@RestController
@RequestMapping("/users")
public class UserController {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
	
<<<<<<< HEAD
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	//private static final Logger logger = LoggerFactory.getLogger("splunk.logger");

	@RequestMapping(value="/{name}",method=RequestMethod.GET)
	public List<User> getUsers(@PathVariable String name){
		logger.info("User service "+name);
		//logger2.info("User service "+name);
=======
    @Autowired
    private RestTemplate restTemplate;
	
	@RequestMapping(value="/{name}",method=RequestMethod.GET)
	public List<User> getUsers(@PathVariable String name){
		LOGGER.info("User service "+name);
>>>>>>> 93ab5e56767d454b3655deb8b89b6c234e70124a
		List<User> usersList = new ArrayList<User>();
		
		//app2
		List<Item> itemList = (List<Item>)restTemplate.exchange("http://localhost:9001/users/"+name+"/items"
										,HttpMethod.GET,null
										,new ParameterizedTypeReference<List<Item>>() {}).getBody();
		//app3
		List<Location> locationList = (List<Location>)restTemplate.exchange("http://localhost:9002/users/"+name+"/location"
				,HttpMethod.GET,null
				,new ParameterizedTypeReference<List<Location>>() {}).getBody();
		
		//app3
		List<Message> messageList = (List<Message>)restTemplate.exchange("http://localhost:9002/users/"+name+"/location2"
				,HttpMethod.GET,null
				,new ParameterizedTypeReference<List<Message>>() {}).getBody();
		
		usersList.add(new User(name, name+"@mygoogle.com",itemList, locationList, messageList));
	
		
		return usersList;
	}

}