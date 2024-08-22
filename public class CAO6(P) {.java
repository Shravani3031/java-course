public class CAO6(P) {
    public void isEligible(String name, int age){
        if (age <18){
            System.out.println(name+ "IS NOT ELIGIBLE FOR DRIVING LISENSCE");
            }
        } else{

            System.out.println(name+"IS ELIGIBLE FOR DRIVING LISENSCE");

        }
    }
    
    public static void main(String args[]){

        CAO6 obj = new CAO6;
        obj.isEligible("Shravani",18);
    }
}
