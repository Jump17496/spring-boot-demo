
package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {
		private List<Item> itemList = new ArrayList<>();

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/items")
	public List<Item> getAllItems() {
		return itemList;
    }

	@GetMapping("/items/{id}")
	public Item getItemByID(@PathVariable long id) {
		return itemList.stream()
				.filter(item -> item.getId() == (id))
				.findFirst()
				.orElse(null);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}
}