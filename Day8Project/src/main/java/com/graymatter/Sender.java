package com.graymatter;

public class Sender<T> {
	
	 T msg;
	 public void setMsg(T msg) {
		 this.msg = msg;
	 }
	 
	 public void sendMessage() {
		 System.out.println("Hello from sender");
	 }
	
	public static void main(String[] args) {
		
		Sender<String> strMsg = new Sender<String>();
		strMsg.setMsg("Hello");
		strMsg.sendMessage();
		
	}
}
