class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum = 0;
          for (int num : nums) {
            List<Integer> divisors = new ArrayList<>();

            for (int i = 1; i * i <= num; i++) {
                if (num % i == 0) {
                    divisors.add(i);
                    if (i != num / i) {
                        divisors.add(num / i);
                    }
                }
            }

            if (divisors.size() == 4) 
                for (int j = 0; j < divisors.size(); j++){
                    sum += divisors.get(j);
                }
            }
        return sum; 
    }
}