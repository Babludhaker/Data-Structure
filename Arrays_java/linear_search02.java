import java.util.Scanner;

public class linear_search02 {
    public static int linearSearch(int number[], int key){
        for(int i=0; i<number.length; i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;


    }
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int number[] = new int [10];
 number[0] = sc.nextInt(); 
 number[1] = sc.nextInt(); 
 number[2] = sc.nextInt(); 
 number[3] = sc.nextInt(); 
 number[4] = sc.nextInt(); 
 number[5] = sc.nextInt(); 
 number[6] = sc.nextInt(); 
 System.out.println("Enter key");
 int key = sc.nextInt();
 int index = linearSearch(number, key);
 if(index== -1){
System.out.println("not found");
 }else{
    System.out.println("key found");
 }
 }
}
