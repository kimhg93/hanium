package com.board;

import java.io.IOException;
import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController

public class RestfulAdapter {

	@RequestMapping(value = "/insert", method = {RequestMethod.GET, RequestMethod.POST})
	public String insert(@RequestParam HashMap<String, Object> param) {
		System.out.println(param);
		String callback = (String) param.get("callback");
		System.out.println(callback);
		
		HashMap<String, Object> hashmap = new HashMap<String, Object>();
		hashmap.put("price", param.get("price"));
		hashmap.put("dprt", param.get("dprt"));
		hashmap.put("dprt_date", param.get("dprt_date"));
		hashmap.put("ariv", param.get("ariv"));
		hashmap.put("ariv_date", param.get("ariv_date"));

		String result = null;
		ObjectMapper mapper = new ObjectMapper();
		try {
			result = mapper.writeValueAsString(hashmap);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(result);
		return callback + "(" + result + ")";
	}

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public void update() {
		System.out.println("update");
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public void delete() {
		System.out.println("delete");
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(@RequestParam HashMap<String, Object> param) {
		System.out.println(param);
		String callback = (String) param.get("callback");
		System.out.println(callback);
		
		HashMap<String, Object> hashmap = new HashMap<String, Object>();
		hashmap.put("price", param.get("price"));
		hashmap.put("dprt", param.get("dprt"));
		hashmap.put("dprt_date", param.get("dprt_date"));
		hashmap.put("ariv", param.get("ariv"));
		hashmap.put("ariv_date", param.get("ariv_date"));

		String result = null;
		ObjectMapper mapper = new ObjectMapper();
		try {
			result = mapper.writeValueAsString(hashmap);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(result);	
		
		return callback + "(" + result + ")";	
	}

	@RequestMapping(value = "/listdetail", method = RequestMethod.GET)
	public void listdetail() {
		System.out.println("listdetail");
	}
}
