package Number;
import java.text.DecimalFormat; 

public class nine_test {
	static public void SimgleFormat(String pattern,double value) {
		DecimalFormat myFormat =new DecimalFormat(pattern);
		String output=myFormat .format(value);
		System.out.println(value+" "+pattern+" "+output);
	}
    static public void UseApplyPatternMethodFormat(String pattern,double value) {
    	DecimalFormat myFormat =new DecimalFormat();
    	myFormat .applyPattern(pattern);
    	System.out.println(value+" "+pattern+" "+myFormat.format(value));
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimgleFormat("###,###.###", 123456.789);
		SimgleFormat("00000000.###kg", 123456.789);
		double randomnum=Math.random();
		System.out.println(+randomnum );
	}

}
