package h1;

public class H1_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double guthaben = -57;
        double monEingang = 42;
        int rating = -1;
        boolean warnhinweis;
        boolean negativ;
        
        if (guthaben < 0) {
        	negativ = true;
        } else {
        	negativ = false;
}	
        if (guthaben > 0) {
        	rating +=3;
        } else if (guthaben == 0) {
        	rating += 2;
        } else { 
        	if (monEingang >= Math.abs((guthaben)) ) {
        		rating += 1;
        	} else {
        		rating -= 1;
        	}
}
        
        if (guthaben < 0 && monEingang < Math.abs(guthaben) && rating < 0) {
        	warnhinweis = true;
        } else {
        	warnhinweis = false;
        }
        
        System.out.println("Aktuelle Guthaben: " + guthaben);
        System.out.println("Monatlicher Eingang: " + monEingang);
        System.out.println("Rating: " + rating);
        System.out.println("Negativ: " + negativ);
        System.out.println("Warnhinweis: " + warnhinweis);
        }
      
	}


