package com.shape;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.struts2.json.annotations.JSON;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ShapesController implements ModelDriven<Shapes>  {
	
	Shapes shape = new Shapes();
	
	public String getArea(){
		
		ShapeService.getArea(shape);
		//ShapeService.printAllShapeDetails();
		return "success";
	}
	
	public String square(){
		
		ShapeService.square(shape);
		return "success";
	}
	
	public String triangle(){
		
		ShapeService.triangle(shape);
		return "success";
	}
	
	public String circle(){
		
		ShapeService.circle(shape);
		return "success";
	}

	@Override
	public Shapes getModel() {
		return shape;
	}
		
}
