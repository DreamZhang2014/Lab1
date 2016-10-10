package com.hit.edu.fristproject.model;

public class element {
	int num;
	char operator;
	String letter;
	boolean tag1;
	boolean tag2;
	boolean tag3;
	public  element(int n){
		num = n;
		tag1 = true;
		tag2 = false;
		tag3 = false;
	}
	public  element(char s){
		if(s=='+'||s=='-'||s=='*'||s=='/'){
			operator = s;
			tag1 = false;
			tag2 = true;
			tag3 = false;
		}
	  
	}
	public element(String s){
				letter = s;
				tag1 = false;
				tag2 = false;
				tag3 = true;
			
		
	}
	
	
	
}
