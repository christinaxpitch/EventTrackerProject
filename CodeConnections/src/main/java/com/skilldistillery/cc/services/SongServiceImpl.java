package com.skilldistillery.cc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skilldistillery.cc.entities.Song;
import com.skilldistillery.cc.repositories.SongRepository;

@Service
public class SongServiceImpl implements SongService {

	@Autowired
	private SongRepository repo;

	@Override
	public List<Song> getAllSongs() {
		return repo.findAll();
	}

	@Override
	public List<Song> songsByArtist(String artist) {
		return repo.findByArtist(artist);
	}

	@Override
	public Song getSong(Integer songID) {
		Optional<Song> songOpt = repo.findById(songID); 
			Song song = null;
			if (songOpt.isPresent()) {
				song = songOpt.get();
		}
		
		return song;
	}

	@Override
	public Song create(Song song) {
		repo.saveAndFlush(song);
		return song;
	}

	@Override
	public boolean delete(Integer songID) {
		boolean deleted = false;
		Optional<Song> songOpt = repo.findById(songID);
		Song song = null;
		if(songOpt.isPresent()) {
			song = songOpt.get();
			repo.delete(song);
			deleted = true;
		}
		return deleted;
	}

	@Override
	public Song updateSong(Integer songID, Song song) {
		Optional<Song> songOpt = repo.findById(songID);
		Song oldSong = null;
		if(songOpt.isPresent()) {
			oldSong = songOpt.get();
			if(song.getAlbum() != null) {
				oldSong.setAlbum(song.getAlbum());
			}
			if(song.getArtist() != null) {
				oldSong.setArtist(song.getArtist());
			}
			if(song.getSongTitle() != null) {
				oldSong.setSongTitle(song.getSongTitle());
			}
			if(song.getDate() != null) {
				oldSong.setDate(song.getDate());
			}
			if(song.getAlbumURL() != null) {
				oldSong.setAlbumURL(song.getAlbumURL());
			}
			if(song.getAppleMusicLink() != null) {
				oldSong.setAppleMusicLink(song.getAppleMusicLink());
			}
			if(song.getDescription() != null) {
				oldSong.setDescription(song.getDescription());
			}
		}
		
		return oldSong;
	}

	@Override
	public List<Song> keywordSearch(String keyword, String keyword2) {
		return repo.findBySongTitleLikeOrArtistLike(keyword, keyword2);
	}

}
