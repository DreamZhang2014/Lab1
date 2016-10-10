package com.hit.edu.fristproject.model;

import com.hit.edu.firstproject.view.Element;
import com.hit.edu.firstproject.view.view;
import java.util.Vector;
public class model {
 view in = new view();
 public Vector <Element> ele= new Vector <Element>();
 public String in(){
	 String w=in.inp();
	 return w;
 }
 public int sim(String str_in){
	 ele = in.ele;
	 return in.simplify(str_in);
 }
 public String der(String str_in){
	 return in.derivative(str_in);
 }
 //String str = "12+3";

 
}
