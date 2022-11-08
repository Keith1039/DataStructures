
import java.util.Random;
public class BubbleSort {

    public static void main(String[] args){
        Random random = new Random();
        
        
        int[] array = new int[]{random.nextInt(100),random.nextInt(100),random.nextInt(100),random.nextInt(100),random.nextInt(100)};
        BSort(array);
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    public static void BSort(int[] array) {
        boolean flag =false;
        while(flag == false){
                int swap =0;
                for(int i=0;i<array.length;i++){
                    if(i<=array.length-2 && array[i]>array[i+1]){
                        int tmp = array[i];
                        array[i]=array[i+1];
                        array[i+1] = tmp;
                        swap++;
                    }
                }
                if(swap == 0){
                    flag = true;
                }
        }
    }
}
