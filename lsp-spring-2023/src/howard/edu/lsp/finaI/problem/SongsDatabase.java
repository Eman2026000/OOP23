package howard.edu.lsp.finaI.problem;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 
 * @author @ Aeman Almotairi (@02959924)
 *
 */



public class SongsDatabase {
	
	
	/* Key is the genre, HashSet contains associated songs */
	
	private Map<String, HashSet<String>> map = new HashMap<String, HashSet<String>>();
	
	
	
	
	/* Add a song title to a genre */
	
	public void addSong(String genre, String songtitle) {
		
		 //getting the set of songs if it is there in the map already other wise initializing it with new HashSet as Set is the abstract class
        HashSet<String> songs =  new HashSet<String>();
    
        //adding songTitle into the set
        songs.add(songtitle);
		map.put(genre,songs);
		System.out.println("Song " + songs + " has been added into " + genre);
		}

	
	/* Return the Set that contains all songs for a genre */
		public Set<String> getSongs(String genre ) {
			
    			return map.get(genre);
    			 
    			
		}
		
		/* Return genre, i.e., jazz, given a song title */
		public String getGenreOfSong(String songTitle) {
    		
			  String ss = "";
		       
		       //iterating over each genre if any one have the songTitle then return that genre
		        for(String genre : map.keySet()){
		            if(map.get(genre).contains(songTitle)){
		                ss =  genre;
		                break;
		            }
		        }
		        return ss;

		}


}
