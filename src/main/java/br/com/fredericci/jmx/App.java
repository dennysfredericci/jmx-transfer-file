package br.com.fredericci.jmx;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) throws InterruptedException {
		
		new ClassPathXmlApplicationContext("application-context.xml");
		
		Thread.currentThread().join();
		
	}
}
