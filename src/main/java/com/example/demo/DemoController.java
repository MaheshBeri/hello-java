package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {
		@RequestMapping("/hello")
		public String greeting2(HttpServletRequest request, HttpServletResponse response) throws Exception {

			return "Hello World1";
		}	
		@RequestMapping(value = "/test", method = RequestMethod.GET)
		@ResponseBody
		public ResponseEntity sendViaResponseEntity(HttpServletRequest request) {
			String key= request.getHeader("access-demo");
			if(key==null || ! key.equals("secret123")){
				return new ResponseEntity(HttpStatus.FORBIDDEN);	
			}
			String sBody="Good boy";
			return ResponseEntity.ok(sBody);
		}
}
