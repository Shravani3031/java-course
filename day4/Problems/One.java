
public class One {


    public static void main(String args[]){
        int arr[] = {10,11,16,4,8,6,25,100,20,21};
        int max = arr[0];
        for(int i=0; i<10; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);

    }
    
}
