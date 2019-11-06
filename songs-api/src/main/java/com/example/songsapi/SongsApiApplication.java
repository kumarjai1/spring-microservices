package com.example.songsapi;

import com.example.songsapi.model.Song;
import com.example.songsapi.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class SongsApiApplication {

	@Autowired
	SongService songService;
	public static void main(String[] args) {
		SpringApplication.run(SongsApiApplication.class, args);
	}

//	@RequestMapping("/")
//	public String home() {
//		return "some songs";
//	}

	@GetMapping("/list")
	public Iterable<Song> listSongs() {
		return songService.listSongs();
	}

	@PostMapping("/song")
	public Song createSong(@RequestBody Song song) {
		return songService.createSong(song);
	}

	@DeleteMapping("/{songId}")
	public Long deleteSong(@PathVariable Long songId) {
		return songService.deleteSong(songId);
	}


}
