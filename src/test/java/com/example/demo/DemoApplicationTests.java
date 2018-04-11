package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.net.URI;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class DemoApplicationTests {

	@Autowired
	private TestRestTemplate restTemplate;
	
	//@Autowired
	//private WebApplicationContext webApplicationContext;

	//private MockMvc mockMvc;
	
	@Before
	public void setup() {
		//mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}
	
	@Test
	public void contextLoads() {
	}
	
	/*@Test
	public void testGreeting() throws Exception {
		String body = this.restTemplate.getForObject("/demo", String.class);
		assertThat(body).isEqualTo("Hello World1");
		
		//mockMvc.perform(get(new URI("/"))).andExpect(status().isOk());
	.andExpect(content().contentType("application/json;charset=UTF-8"))
		.andExpect(jsonPath("$.name").value("emp1")).andExpect(jsonPath("$.designation").value("manager"))
		.andExpect(jsonPath("$.empId").value("1")).andExpect(jsonPath("$.salary").value(3000));
	}*/
}
