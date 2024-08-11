public class CAO3 {
    int a = 5;
    int b = 8;

    static void method1(){
        System.out.println("method 1");
    }

    public void method2(){
        System.out.println("method 2");
    }

    static void method3(){
        System.out.println("method 3");
    }

    public static void main(String args[]){
        method1();
        CAO3 myCao3 = new CAO3();
        myCao3.method2();

        CAO3 myCao4 = new CAO3();
        myCao4.method3();




        
        
    }
    

    
    
}
