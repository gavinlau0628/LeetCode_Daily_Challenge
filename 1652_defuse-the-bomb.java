class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] result = new int[code.length];
        if (k==0) return result;
        
        if(k > 0)
        {
            for (int i=0; i<result.length; i++)
            {
                int counter = 1;
                while (counter <= k)
                {
                    if (i+counter>=result.length)
                    {
                        result[i]=result[i]+code[i+counter-result.length];
                        counter++;
                    }
                    else 
                    {
                        result[i]=result[i]+code[i+counter];
                        counter++;
                    }
                }
            }
        }
        else
        {
            k=k*(-1);
            for (int i=result.length-1; i>=0; i--)
            {
                int counter = 1;
                while (counter <= k)
                {
                    if(i-counter<0)
                    {
                        result[i]=result[i]+code[i-counter+result.length];
                        counter++;
                    }
                    else
                    {
                        result[i] = result[i]+code[i-counter];
                        counter++;
                    }
                }
            }
        }
        
        return result;
    }
}
