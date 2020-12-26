
/*

Stringbuilder cost more memory than char[] array


class Solution {
    public String restoreString(String s, int[] indices) {
        
        StringBuilder result = new StringBuilder(s);
        int index = 0;
        
        for (char c : s.toCharArray())
        {
            result.setCharAt(indices[index], c);
            index++;
        }
        
        return result.toString();
    }
}

*/

class Solution {
    public String restoreString(String s, int[] in) {
        char[] c = new char[in.length];
        for(int i = 0; i < in.length; i++)
            c[in[i]] = s.charAt(i);
        return new String(c);
    }
}
