import java.util.Arrays;

public class TestCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ar = {20,10,30,50,40};
		
		Arrays.sort(ar);
		
		for (int i : ar) {
			System.out.println(i);
		}
		
		StringBuilder sb = new StringBuilder("I love Java"); 
		int count = sb.append(" and SpringBoot").length();
		System.out.println("The length of the string is "+ count);
		
	}
}
