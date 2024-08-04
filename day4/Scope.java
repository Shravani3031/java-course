public class Scope {
    public static void main(String args[]){

        //you cannot use x over here

        int x = 5;

        //you can use x over here
        System.out.println(x);


        {
            int y = 10;
            //you can use y over here
            System.out.println(y);
        }
        
        //you cannot use y here

    }
    
}
