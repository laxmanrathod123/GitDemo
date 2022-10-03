package qaclickacademy;

public class ReverseString {

	public static void main(String[] args) {

		
		String str= "ABCD";
		int length=str.length();
		String rev;
		
		for(int i=length-1 ; i<length; i--) {
			
		System.out.println(str.charAt(i));
		
			
		}
	}

}
