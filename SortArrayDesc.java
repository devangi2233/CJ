import java.util.Arrays;

public class SortArrayDesc{
    int[] descending(int[] array){
        for(int i=0;i < array.length; i++){
            for(int j = i + 1;j < array.length; j++){
                int temp;
                if (array[i] < array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
    public static void main(String[] args){
        int[] array = new int[]{2, 35, 65, 9, 10, 23};
        SortArrayDesc sorting = new SortArrayDesc();
        System.out.println("Array elements after sorting : ");
        System.out.println("Descending : ");
        System.out.println(Arrays.toString(sorting.descending(array)));
    }
}
