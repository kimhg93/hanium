package com.pjt;

import com.pjt.VO;
import com.pjt.PjtDao;

import java.io.IOException;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController

public class RestfulAdapter {

	@Autowired
	private PjtDao Pjtdao;
	
	@RequestMapping(value = "/write", method = {RequestMethod.GET, RequestMethod.POST})
	public String insert(@RequestParam HashMap<String, Object> param, VO vo) {
		System.out.println(param);
		String price = (String)param.get("price");
		String dprt = (String)param.get("dprt");
		String dprt_date = (String)param.get("dprt_date");
		String ariv = (String)param.get("ariv");
		String ariv_date = (String)param.get("ariv_date");
		String cargo = (String)param.get("cargo");
		String cargo_kind = (String)param.get("cargo_kind");
		String cargo_weight = (String)param.get("cargo_wieght");
		String via = (String)param.get("via");
		
		vo.setPrice(price);
		vo.setDprt(dprt);
		vo.setDprt_date(dprt_date);
		vo.setAriv(ariv);
		vo.setAriv_date(ariv_date);
		vo.setCargo(cargo);
		vo.setCargo_kind(cargo_kind);
		vo.setCargo_weight(cargo_weight);
		vo.setVia(via);		
		
		Pjtdao.insert(vo);
		
		String callback = (String) param.get("callback");
		System.out.println(callback);
		
		HashMap<String, Object> hashmap = new HashMap<String, Object>();	

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
		
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public void delete() {
		System.out.println("delete");
	}

	@RequestMapping("/list")
	public ModelAndView list(Model model){
		model.addAttribute("list", Pjtdao.listForBeanPropertyRowMapper());
		return new ModelAndView("redirect:http://127.0.0.1:8090/list.html");
	}

	@RequestMapping(value = "/listdetail", method = RequestMethod.GET)
	public void listdetail() {
		System.out.println("listdetail");
	}
}
