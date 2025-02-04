package com.graymatter;

import java.util.ArrayList;
import java.util.Collection;

public class DemoOnGenerics<T> {

//	public int add(int a, int b) {
//		return a+b;
//	}
//	public double add(double a, double b) {
//		return a+b;
//	}
//	public String add(String a, String b) {
//		return a+b;
//	}
	
	//GENERIC METHOD
	public T add(T a, T b) {
		if(a instanceof Integer ) {
			Integer sum = (Integer) a + (Integer) b;
			return (T) sum;
			}
		else if(a instanceof Double ) {
			Double sum = (Double) a + (Double) b;
			return (T) sum;
			}
		else if(a instanceof String ) {
			String sum = (String) a + (String) b;
			return (T) sum;
			}
		else {
			throw new IllegalArgumentException("Invalid Argument");
		}
		}
	
	public static <T> void printDetails(Collection<T> collection) {
		
		for(T t: collection) {
			System.out.println(t);
		}
		
	}
	public static void main(String[] args) {
		
//		DemoOnGenerics dg = new DemoOnGenerics();
//		System.out.println(dg.add(22.3, 13.2));
//		System.out.println(dg.add(22, 3));
//		System.out.println(dg.add("HEllo", "World"));

		ArrayList<String> al = new ArrayList<String>();
		
		al.add("aaa");
		al.add("bbb");
		al.add("ccc");
		al.add("ddd");
		al.add("eee");
		al.add("fff");
		printDetails(al);
		
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(3);
		al1.add(4);
		al1.add(5);
		al1.add(41);
		printDetails(al1);
		
	}
	
}
