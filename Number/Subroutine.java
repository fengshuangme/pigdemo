package Number;

	class Parent{
		Parent(){
			System.out.println("diaoyong parent de method");
		}
	}
   class SubParent extends Parent {
	   SubParent() {
		   System.out.println("children  method");
	}
   }
   public class Subroutine extends SubParent {
	   Subroutine(){
        	System.out.println("diaoyong subroutine d method");
        }
        public static void main(String[] args) {
    		// TODO Auto-generated method stub
        	Subroutine s=new Subroutine();
        	boolean k=s.equals(s);
        	System.out.println(k);
        	
        
       } 
   }
   
   
	

//}
