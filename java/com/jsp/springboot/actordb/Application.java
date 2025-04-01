
package com.jsp.springboot.actordb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jsp.springboot.actordb.controller.ActorController;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(Application.class, args);

		ActorController cc = ac.getBean(ActorController.class);
	}

}
