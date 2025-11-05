package h3;

public class H3_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int max = 9;
       int fix = 6;
       int wartend = 5;
       boolean istVoll;
       
       int frei = max - fix;
       
       if (frei > 0 && wartend > 0) {
    	   if (wartend <= frei) {
    	   wartend = 0;
    	   } else {
    		   fix += frei;
    		   wartend -= frei;
    	   }
       }
   
 if (fix >= max) {
	 istVoll = true;
 } else {
	 istVoll = false;
 }
 
 System.out.println("Maximale Plätze: " + max);
 System.out.println("Fixe Plätze: " + fix);
 System.out.println("Wartende Personen: " + wartend);
 System.out.println("Veranstaltung voll: " + istVoll);
	}
}
