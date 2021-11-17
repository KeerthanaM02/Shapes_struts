package com.shape;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONObject;

public class ShapeService {
	

	 //private static final Map<String, Shapes> shapes = new HashMap<String,Shapes>();
	 
	 /*static{
		 Shapes shape = new Shapes();
		 	 
		 shape.setShape("rectangle");
		 shape.setColor("orange");
		 shape.setLength(15);
		 shape.setWidth(9);
		 shape.setArea(shape.getLength()*shape.getWidth());
		 
		 //shapes.put("rectangle",shape);
		
	 }*/
	 
	 /*public static Shapes getShape(String shape){
		 return shapes.get(shape);
	 }*/

	 public static void getArea(Shapes s){
		 String shape = s.getShape();
		 double area = s.getLength()*s.getWidth();
		 s.setArea(area);
		 //shapes.put(shape, s);	 
	 }
	 
	 public static void triangle(Shapes s){
		 String shape = s.getShape();
		 double area = (s.getLength()*s.getWidth())/2;
		 s.setArea(area);
	 }
	 
	 public static void square(Shapes s){
		 String shape = s.getShape();
		 double area = s.getLength()*s.getWidth();
		 s.setArea(area);
	 }
	 
	 public static void circle(Shapes s){
		 String shape = s.getShape();
		 double pi = 3.14;
		 double area = pi*s.getRadius()*s.getRadius();
		 s.setArea(area);
	 }
	 
	 
	 
	 /*public static List<Shapes> getShapeDetails() {
	  return new ArrayList(shapes.values());
	 }
*/
	 /*public static void printAllShapeDetails() {
	   for(String  shape : shapes.keySet()){
		   System.out.println(shape + " : " + shapes.get(shape).toString() );
	   }
	 }*/
}
