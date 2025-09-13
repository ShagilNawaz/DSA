class Solution {
   public int findNumbers(int[] nums){
        int count = 0;
        for(int num: nums){
            if (isEven(num)){
                count++;
            }
        }
        return count;
    }
    boolean isEven(int num){
        int numbersOfDigit = countNumbers(num);
        return numbersOfDigit % 2 == 0;
    }
    int countNumbers(int num){
        int count = 0;

            while (num > 0){
                num /= 10;
                count++;
            }
        return count;
    }

}