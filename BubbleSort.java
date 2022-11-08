import java.sql.Array;

public class BubbleSort {

    public static void main(String[] args){
        
    }
    public static void BSort(int[] array) {
        boolean flag =false;
        while(flag == false){
                int swap =0;
                for(int i=0;i<array.length;i++){
                    if(i<array.length-2 && array[i]>array[i+1]){
                        int tmp = array[i];
                        array[i+1]=array[i];
                        array[i] = tmp;
                        swap++;
                    }
                }
                if(swap == 0){
                    flag = true;
                }
        }
    }
}
