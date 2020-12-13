/* 
    the difference between the lower case and upper case ascii value is 32
    
        public String toLowerCase(String str) {
        char[] a = str.toCharArray();
        for (int i = 0; i < a.length; i++)
        
            // if the current character is bewteen A -> Z
            // then we - A + a to get its lowercase
            if ('A' <= a[i] && a[i] <= 'Z')
                a[i] = (char) (a[i] - 'A' + 'a');
        return new String(a);
    }

*/


class Solution {
    public String toLowerCase(String str) {
        return str.toLowerCase();
    }
}
