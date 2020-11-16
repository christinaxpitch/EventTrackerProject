package com.skilldistillery.cc.entities;

import static org.junit.jupiter.api.Assertions.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SongTest {

	
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Song song;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("CCPU");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		song = em.find(Song.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		song = null;
	}

	@Test
	void test_Song_entity_mapping() {
		assertNotNull(song);
		assertEquals("Bombay Bicycle Club", song.getArtist());
		assertEquals("A Different Kind of Fix", song.getAlbum());
		assertEquals(2020, song.getDate().getYear());
		assertEquals(11, song.getDate().getMonthValue());
		assertEquals(13, song.getDate().getDayOfMonth());
		assertEquals("Lights Out, Words Gone", song.getSongTitle());
	}

}
