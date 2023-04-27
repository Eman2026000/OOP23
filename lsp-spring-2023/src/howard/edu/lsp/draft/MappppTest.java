package howard.edu.lsp.draft;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MappppTest {
	Mapppp pp;
	
	@BeforeEach
	protected void setUp() {
		pp=new Mapppp();
		
	}
	
	@Test
    @DisplayName("test insert method")
	public void testinsert() {
		pp.insert("waten", 3);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
	    map.put("waten", 3);
	    assertTrue(pp.getstring().equals(map.keySet()));
	    
	    
	    

	}
		
		

}
