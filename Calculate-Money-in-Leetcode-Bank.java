class Solution {
    public int totalMoney(int n) {
       int weeks = n / 7;
       int days = n % 7;
       int weeksum = weeks * (2 * 28 + (weeks - 1) * 7) / 2;
       int first_term = weeks + 1;
       int last_term = days + weeks;
       int no_of_terms = days;
       int daysum = days * (first_term + last_term) / 2;

       return weeksum + daysum; 
    }
}