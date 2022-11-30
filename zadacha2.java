// Реализуйте алгоритм сортировки пузырьком числового массива, результат после 
// каждой итерации запишите в лог-файл.
package Seminar2;


import java.util.logging.Level;
import java.util.logging.Logger;

public class zadacha2 {
    public static void main(String[] args) {
        int[] arr = {7, 0,2,5,4,8,3,4};
        Logger log = Logger.getLogger(zadacha2.class.getName());
        
        for (int i = 0; i < arr.length; i++ ){
            System.out.print(arr[i] + " ");
        }
      
        int temp = 0;

        for (int i = arr.length - 1; i >= 1; i--){
            for (int j = 0; j < i; j++){
                if (arr[j] > arr[j + 1]){
                    temp = arr[j + 1];
                    arr[j + 1] = arr [j] ;
                    arr[j] = temp;
                    log.log(Level.INFO, "Element sorted");
                }
           
        }
          
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++ ){
            System.out.print(arr[i] + " ");
        
        
        }
    }
    
}
