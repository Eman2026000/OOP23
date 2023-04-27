package howard.edu.lsp.draft;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mapppp {
	private HashMap<String,Integer > hm ; 
	
	
	public Mapppp() {
		this.hm=new HashMap<String, Integer>();
	}
	
	
	
	public void printmappp( ) {
		for (Map.Entry<String, Integer> me :
            hm.entrySet()) {

           // Printing keys
           System.out.print(me.getKey() + ":");
           System.out.println(me.getValue());
       }
	}

	public void insert(String ss, int i) {
	hm.put(ss,i);
	
	
		
		// TODO Auto-generated method stub
		
	}

	public  Set<String> getstring()
	{
		return hm.keySet();
		
		
	}



	
	

}
