package com.in28minutes.learnspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
record Person(String name,int age, Address address) {};
record Address(String firstLine,String city) {};
@Configuration //used to configure/handle beans
public class HelloWorldConfiguration {
	
	@Bean //A bean that we created to be used by Spring Context
	public String name() { 
		return "Mani";
	}
	@Bean
	public int age() {
			return 23;
	}
	@Bean
	@Primary
	public Address address1() {
		return new Address("ManiRoad","HYD");
	}
	@Bean
	@Primary//It is the primary object if we try to invoke bean using .class
	public Person person() {
		return new Person("Kalyani",24,new Address("ManiRoad-CHN","CHN"));
	}
	@Bean(name="address2")//We can add custom name to a bean
	@Qualifier("address3")//Can be used to solve the problem of @Primary conflicts while accessing beans using Context/Spring Container 
	public Address address() {
		return new Address("ManiRoad","HYD");
	}
	@Bean(name="address3")//We can add custom name to a bean
	public Address address3() {
		return new Address("ManiRoad","HYD");
	}
	
	
	@Bean //Creating Relationship b/w beans using MethodCall
	public Person person2MethodCall() {
		return new Person(name(),age(),address());
	}
	@Bean //Creating Relationship b/w beans using Parameters(Need to pass bean names as params with types)
	public Person person3Parameters(String name, int age, Address address3) {//used address2 bean
			return new Person(name,age,address3);
	}

}
