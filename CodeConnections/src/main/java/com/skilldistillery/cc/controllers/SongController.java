package com.skilldistillery.cc.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.aspectj.lang.annotation.DeclareMixin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skilldistillery.cc.entities.Song;
import com.skilldistillery.cc.services.SongService;

@RequestMapping("api")
@RestController
public class SongController {
	
	@Autowired
	private SongService svc;
	
//	@GetMapping("ping")
//	public String ping() {
//		return "pong!";
//	}
	
	@GetMapping("songs/{songID}")
	public Song getSong(@PathVariable Integer songID, HttpServletResponse response, HttpServletRequest request) {
		Song song = svc.getSong(songID);
		if (song == null) {
			response.setStatus(404);
		}
		return song;
	}
	
	@GetMapping("songs")
	public List<Song> getAllSongs() {
		return svc.getAllSongs();
	}
	
	
	@GetMapping("songs/artist/{artist}")
	public List<Song> getSongsByArtist(@PathVariable String artist, HttpServletResponse response) {
		List<Song> songs = svc.songsByArtist(artist);
		if (songs == null) {
			response.setStatus(404);
		}
		return songs;
	}
	
	@PostMapping("songs")
	public Song createSong(@RequestBody Song song, HttpServletResponse response) {
		Song songAdded = null;
		try {
			songAdded = svc.create(song);
			response.setStatus(201);
			response.setHeader("Location", "http://localhost:8085/api/songs/" + song.getId());
		} catch (Exception e) {
			response.setStatus(404);
		}
		return songAdded;
	}
	
	@DeleteMapping("songs/delete/{songID}") 
	public void deleteSongFromApp(@PathVariable Integer songID, HttpServletResponse response) {
		if (svc.delete(songID)) {
			response.setStatus(204);
		}
		else {
			response.setStatus(404);
		}
	}

	@PutMapping("songs/{songID}")
	public Song updateSong (@RequestBody Song song, Integer songID, HttpServletResponse response) {
		try {
			song = svc.updateSong(songID, song);
			if (song == null) {
				response.setStatus(404);
			}
			
		} catch (Exception e) {
			response.setStatus(400);
		}
		return song;
	}
	
	@GetMapping("songs/search/{keyword}")
		public List<Song> getSongByKeyword (@PathVariable String keyword, HttpServletResponse response) {
		String keyword2 = keyword;
		List<Song> songs = svc.keywordSearch("%" + keyword + "%","%" + keyword2 + "%");
		
		return songs;
	}
	
}
