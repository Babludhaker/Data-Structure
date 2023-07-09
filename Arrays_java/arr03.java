public class arr03 {
    public static void compareValue(int nums[]){

        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    System.out.print("Your Duplicate key is : "+nums[i]);
                }
            }
        }
       

    }
public static void main(String args[]){
int nums[] = {2,3,3,1};
compareValue(nums);
}
}