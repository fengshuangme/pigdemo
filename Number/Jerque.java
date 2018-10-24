package Number;

public class Jerque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="";
        long starTime=System.currentTimeMillis();
        for (int i=0;i<10000;i++) {
        	str=str+i;
        }
        long endTime=System.currentTimeMillis();
        long time =endTime-starTime ;
        System.out.println("String 消耗的时间："+time);
        StringBuilder builder=new StringBuilder("");
        starTime=System.currentTimeMillis();
        for(int j=0;j<10000;j++) {
        	builder.append(j);
        }
        endTime=System.currentTimeMillis();
        time=endTime-starTime;
        System.out.println("StringBuilder消耗时间："+time);
        	String str3=new String("andjfjkdjjakdjfj");
        	String str1=str3.toUpperCase();
        	System.out.println("str1="+str1);
        	String str2=new String("ANDKFJjdkjfjkdjj");
        	String str4=str2.substring(3, 8);
        	String str5=str3.substring(6, 11);
        	boolean ret=str4.equalsIgnoreCase(str5);
        	System.out.println(ret);
        	String text=new String();
        	text="\\d{11}";
        	String one="18810191799";
        	String two="01839873830";
        	if (one.matches(text)) {
        		System.out.println(one+"是一个合法的电话号码");
            	}
        	else {
        		System.out.println(one+"不是一个合法的电话号码");
        	}
        	if (two.matches(text)) {
        		System.out.println(two+"是一个合法的电话号码");
            	}
        	else {
        		System.out.println(two+ "不是一个合法的电话号码");
        	}

	}

}
