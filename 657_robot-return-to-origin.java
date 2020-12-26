class Solution {
    public boolean judgeCircle(String moves) {
        
        int x_Axis = 0;
        int y_Axis = 0;
        
        for (int i = 0; i < moves.length(); i++)
        {
            char c = moves.charAt(i);
            
            switch(c)
            {
                case 'U':
                    y_Axis++;
                    break;
                case 'D':
                    y_Axis--;
                    break;
                case 'R':
                    x_Axis++;
                    break;
                case 'L':
                    x_Axis--;
                    break;
            }
        }
        
        return true ? (x_Axis==0 && y_Axis==0) : false;
        
    }
}
