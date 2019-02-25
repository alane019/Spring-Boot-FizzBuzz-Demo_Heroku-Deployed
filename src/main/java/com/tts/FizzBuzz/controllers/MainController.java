package com.tts.FizzBuzz.controllers;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
		@RequestMapping("/")
		public String home(){
			
		ArrayList<String> solution = new ArrayList<String>();
			
			for(int i=1; i<=100; i++) {
				
				if(i % 3 == 0 && i % 5 == 0 ) {
					solution.add("fizz-buzz");
				}
					
			else if(i % 3 == 0) {
				solution.add("Fizz");
			}
			else if(i % 5 == 0) {
				solution.add("buzz");
			}
			
			else {
			  solution.add(Integer.toString(i));
			}
					
			}
			
			return("<h1>FizzBuzz</h1><div style=\"letter-spacing: 2px; padding: 5px; color:#333;\""><p>" 
					+ solution.toString()
					+ "</p></div>");		
		}

	}


