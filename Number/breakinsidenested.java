package Number;

public class breakinsidenested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  loop: for(int i=0;i<3;i++) {
	   
	   for(int j=0;j<6;j++) {
		   
		   if (j==4) {
			   
			   break loop;
		   }
		   System.out.println("i="+i +"j=" +j);
	   }
   }
	   
	}

}
