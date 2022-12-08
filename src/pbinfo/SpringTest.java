package pbinfo;

public class SpringTest {

	public static void main(String[] args) {
		
		 String pin = "";
	        String nrCard = "";
	        String combinatie = "123123";
	        for(int i = 0; i <= 2; i++) {
	            nrCard += combinatie.charAt(i);
	        }
	        for(int j = 3; j <= 5; j++){
	            pin += combinatie.charAt(j);
	        }
	        
	        System.out.println(nrCard);
	        System.out.println(pin);


	}

}
