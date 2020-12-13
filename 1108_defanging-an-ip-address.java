class Solution {
    public String defangIPaddr(String address) {
        int length = address.length()+6;
        int currentIndex = 0;
        
        char[] addressArray = new char[length];
        
        for (int i=0; i<address.length(); i++)
        {
            char currentChar = address.charAt(i);
            
            if(currentChar != '.') 
            {
                addressArray[currentIndex] = currentChar;
                currentIndex ++;
            }
            else 
            {
                addressArray[currentIndex] = '[';
                addressArray[currentIndex+1] = currentChar;
                addressArray[currentIndex+2] = ']';
                currentIndex += 3;
            }
        }  
        
        String result = new String(addressArray);
        return result;
        
        /*
            //Can use replace to replace the character inside the String
            
            public String defangIPaddr(String address) {
                return address.replace(".", "[.]");
            }
        */
    }
}
