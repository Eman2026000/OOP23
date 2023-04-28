package howard.edu.lsp.finaI.problem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.HashSet;


public class SongsDatabaseTest {

	
	SongsDatabase db;
	
	
	@BeforeEach
	protected void setUp() {
		db = new SongsDatabase();
		

	}

	

	@Test
	@DisplayName("Test case for Add a song title to a genre method")
	public void testaddSong() {
		
		
		
		Map<String, HashSet<String>> mp1 = new HashMap<String, HashSet<String>>();
		db.addSong("Rap", "Gin and Juice");
		String gener="Rap";
		HashSet<String> ss=new HashSet<String>();
		ss.add("Gin and Juice");
		
        mp1.put(gener,ss);
        
        
		assertEquals(db,mp1);
		
	
		
	
	}
	
	@Test
	@DisplayName("Test case for getSongs method")
	public void testgetSongs() {
		
		db.addSong("Rap", "Savage");
		
		String gener="Rap";
		
		assertEquals(db.getSongs(gener),"Savage");
		System.out.println( db.getSongs(gener));// prints
	}
	
	
	@Test
	@DisplayName("Test case for Return genre method")
	public void testgetGenreOfSong() {
		
		db.addSong("Rap","Savage");
		
		String ss="Savage";
		
		assertEquals(db.getGenreOfSong(ss),"Rap");
		
		
		
		
		
		
		
		
		
	}
	
}
