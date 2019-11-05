package com.example.songsapi;

import com.example.songsapi.model.Song;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class SongsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SongsApiApplication.class, args);
	}

	@RequestMapping("/")
	public String home() {
		return "some songs";
	}

	@GetMapping("/list")
	public Iterable<Song> listSongs() {
		return new ArrayList<Song>();
	}

}
