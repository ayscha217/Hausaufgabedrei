package h2;

public class H2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int jahr = 1900;
        boolean schalt;
        
        if (jahr % 4 == 0) {
        	if (jahr % 100 == 0) {
        		if (jahr % 400 == 0) {
        			schalt = true;
        		} else {
        			schalt = false;
        		}
        	} else {
        		schalt = true;
        	}
        } else { 
        	schalt = false;
        }
 System.out.println("Jahr: " + jahr);
 System.out.println("Schaltjahr: " +schalt);
        		}
        	}
        
	


