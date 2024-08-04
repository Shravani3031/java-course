public class BreakContinue{
    public static void main (String args[]){
        int i = 0;
        while(i<20){
            if (i == 12){
                i++;
                continue;
            }

            if(i == 5){
                break;
            }
          
            System.out.println(i);
            i++;
        }
    }
}
    