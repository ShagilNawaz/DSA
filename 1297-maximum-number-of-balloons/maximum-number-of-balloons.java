class Solution {
    public int maxNumberOfBalloons(String text) {
        
        int k = text.length();
        int b = 0, a = 0, l = 0,o = 0,n = 0;

        int output = 0;
        for(int i = 0; i < k; i++){
            if (text.charAt(i) == 'b'){
                b++;
            }
            if (text.charAt(i) == 'a'){
                a++;
            }
            if (text.charAt(i) == 'l'){
                l++;
            }
            if (text.charAt(i) == 'o'){
                o++;
            }
            if (text.charAt(i) == 'n'){
                n++;
            }
        }

        int l_count = l/2;
        int o_count = o / 2;
        output = Math.min(a,b);
        output = Math.min(output,l_count);
        output = Math.min(output,o_count);
        output = Math.min(output,n);

        return output;

    }
}