package howard.edu.lsp.finaI.problem;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SongsDatabase db = new SongsDatabase();
		
       db.addSong("Rap","Savage");
		
		String ss="Savage";
		System.out.println( db );// prints
		
		System.out.println( db.getGenreOfSong(ss));
db.addSong("Rap","Savage");
		
		String ss2="Savage";
		
		System.out.println( db.getGenreOfSong(ss2));
	}

}
