public class Students {
    String name = "Student";
    double marks = 0;
    boolean pass = true;


    static void name (String name){
        System.out.println("The name of the student is " +name );

       
    }

    static void marks(double marks){

        System.out.println("Marks obtained by the student is "+ marks);

        

    }

    static void pass(boolean pass ){
        if(pass){
            System.out.println("Student is passed");
            
        }else{
            System.out.println("Student failed the examination");
        }
    }

        
    
    public static void main(String[] args){
       Students student1 = new Students();
       Students student2 = new Students();
       Students student3 = new Students();
       Students student4 = new Students();
       Students student5 = new Students();

       student1.name = "A";
       student2.name = "P";
       student3.name = "Q";
       student4.name = "W";
       student5.name = "R";

       student1.marks = 20;
       student2.marks = 90;
       student3.marks = 87;
       student4.marks = 66;
       student5.marks = 98;


student1.pass = false;
       student2.pass = true;
       student3.marks = 87;
       student4.marks = 66;
       student5.marks = 98;


       




       name(student1.name);
       name(student2.name);
       name(student3.name);
       name(student4.name);
       name(student5.name);

       marks(student1.marks);
       marks(student2.marks);
       marks(student3.marks);
       marks(student4.marks);
       marks(student5.marks);

       pass(student1.pass);




       


       

        




    }


    
}
