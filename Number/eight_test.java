package Number;

public class eight_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]= {"89","12","10","18","35"};
		int arr[]= {1,6,7,4,3,10,30};
		//int sum=0;
		for(int i=0;i<str.length;i++) {
			int myint=Integer.parseInt(str[i]);
			System.out.println(+myint);
		    System.out.print(" ");
		
		}
		for(int j=0;j<arr.length;j++) {
		
			 String  mystring=Integer.toString(arr[j]);
				System.out.println(mystring);
		}
			
		System.out.println();
		
	}
}
