package com.example.jpa.demo;

import com.example.jpa.demo.entity.Course;
import com.example.jpa.demo.repository.CourseRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	private Logger logger = LoggerFactory.getLogger(this.getClass());


	@Autowired
	private CourseRepository courseRepository;

	@Override
	public void run(String... args) throws Exception {

		Course course = courseRepository.findById(10001L);

		logger.info("Course details,{}",course.toString());
	}
}
