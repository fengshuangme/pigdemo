package Number;



public class Change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int [][]arr1= {{1,2,3},{4,5,6},{7,8,9}};
         
          int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int i, j;
       
        for (i=0;i<arr1.length;i++ ) {
        	
	        	for(j=i;j<arr1[i].length;j++)
	        	{
	        		if (i!=j) {
	        			int tmp=arr1[i][j];
	        			arr1[i][j]=arr1[j][i];
	        			arr1[j][i]=tmp;
	        		}	
	        		//arr2[i][j]=arr1[i][j];
	        	}
	        
        	}
        for(int k=0;k<arr1.length;k++ ) {
        	for (int m=0;m<arr1[k].length;m++){
        		
				System.out.print(arr1[k][m]);
				System.out.print(" ");
        	}
        	System.out.println();
        	 
        }
        
        for(int l=0;l<arr.length;l++ ) {
         	for (int n=0;n<arr[l].length;n++){
         		
 				System.out.print(arr[l][n]);
 				System.out.print(" ");
         	}
         	System.out.println();
        }  
	}
}




