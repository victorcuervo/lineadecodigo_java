package com.lineadecodigo.java.json;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsonable;

public class Alumno implements Jsonable {
	
	private String name;
	private int age;
	
	Alumno(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	 @Override
	 public String toJson() {
        final StringWriter writable = new StringWriter();
        try {
            this.toJson(writable);
        } catch (final IOException e) {
        }
        return writable.toString();
	 }
	 
	 @Override
	 public void toJson(Writer writer) throws IOException {
        final JsonObject json = new JsonObject();
        json.put("name", this.getName());
        json.put("age", this.getAge());
        json.toJson(writer);
	   }
	

}
