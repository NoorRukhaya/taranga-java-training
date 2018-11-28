package com.tharanga.multithreading;


class Resource {

	public void doSomething(){
		//do some operation, DB read, write etc
	}
	
	public void doLogging(){
		//logging, no need for thread safety
	}
}

public class JavaLockDemo implements Runnable{

	private Resource resource;
	
	public JavaLockDemo(Resource r){
		this.resource = r;
	}
	

	public void run() {
		synchronized (resource) {
			resource.doSomething();
		}
		resource.doLogging();
	}
}