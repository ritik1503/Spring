package org.example.jpasetup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class JpaSetupApplication {

	public static void main(String[] args) {
		ApplicationContext  context = SpringApplication.run(JpaSetupApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
//		User user = new User();
//		user.setName("Rohan");
//		user.setAge(23);
//
//		User user1 = new User();
//		user1.setName("LOLita");
//		user1.setAge(25);
//		List<User> storedUsers = new ArrayList<>();
//		storedUsers.add(user);
//		storedUsers.add(user1);
//		Iterable<User> responseOfStoredUsers = userRepository.saveAll(storedUsers);
//		responseOfStoredUsers.forEach(System.out::println);
//        List<User> names = userRepository.findByName("LOL");
//		names.forEach(e-> System.out.println(e));
        List<User> names = userRepository.findByNameStartingWith("LOL");
		names.forEach(e-> System.out.println(e));

	}


}
