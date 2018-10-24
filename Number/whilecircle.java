package Number;

public class whilecircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		double sum=0;
		double tmp=1;
        while(i<21) {
        	tmp=tmp*1/i;
        	sum=sum+tmp;
        	i++;
        }  
        System.out.println("结果为："+sum);
	}

}
