package com.in28minutes.learnspringframework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PacMan;
import com.in28minutes.learnspringframework.game.SuperContra;



public class App02HelloWorldSpring {

	public static void main(String[] args) {
		int count=1;
		
		try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){//1: We need a Spring Context to start the spring APP
		//Added Try with resources block to avaoid Context leak error
			//2: Configure the things that we want to manage with Spring -
			  //-@Configuration(Here HelloWorldConfiguration.class is a configuration class
			    
			    //Retrieving bean managed by Spring
			    System.out.println(context.getBean("name"));
			    System.out.println(context.getBean("age"));
			    System.out.println(context.getBean("person"));
			    System.out.println(context.getBean("person2MethodCall"));
			    System.out.println(context.getBean("person3Parameters"));
			    System.out.println(context.getBean("address2"));//1 way of invoking the bean
			    System.out.println(context.getBean(Address.class));//2 way of invoking the bean
			    
			    System.out.println(context.getBeanDefinitionCount());//To get the count of the beans managed by the current context
			    for(String str: context.getBeanDefinitionNames()) {//Fetching all the bean names
			    	System.out.println("Bean "+count+": "+str);
			    	count++;
			    }
		
	}

	}
}
