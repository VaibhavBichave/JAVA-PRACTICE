package oopl;

public class EvenNum {
	   public static void main(String args[]) {
		
			int month=8;
			String season;
			switch (month) {
			case 12, 1, 2: 
			    season = "Winter"; 
			    break; 
			case 3, 4, 5: 
			    season = "Summer"; 
			    break; 
			case 6, 7, 8: 
			    season = "Spring"; 
			    break; 
			case 9, 10, 11: 
			    season = "Autumn"; 
			    break; 
			default: 
				season="invalid";
			
			}
			System.out.println(season);
			}

}