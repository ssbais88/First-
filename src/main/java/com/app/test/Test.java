package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.bean.Student;

public class Test {

	public static void main(String[] arfs) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		Student s1 = (Student) ac.getBean("stud");
		Student s2 = (Student) ac.getBean("std1");

		System.out.println(s1);
		System.out.println(s2);

	}

}
