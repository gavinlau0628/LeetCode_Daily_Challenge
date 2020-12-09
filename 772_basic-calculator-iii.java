class Solution {
    public int calculate(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
 
        // remove leading and trailing spaces and white spaces.
        //
        s = s.trim().replaceAll("[ ]+", "");
 
        if (s == null || s.length() == 0) {
            return 0;
        }
 
        Stack<Character> opStack = new Stack<>();
        Stack<Integer> numStack = new Stack<>();
 
        int i = 0;
        while (i < s.length()) {
            if (Character.isDigit(s.charAt(i))) {
                int num = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + Character.getNumericValue(s.charAt(i));
                    i++;
                }
                numStack.push(num);
            } else {
                char op = s.charAt(i);
                if (opStack.isEmpty()) {
                    opStack.push(op);
                    i++;
                } else if (op == '+' || op == '-') {
                    char top = opStack.peek();
                    if (top == '(') {
                        opStack.push(op);
                        i++;
                    } else {
                        calculate(numStack, opStack);
                    }
                } else if (op == '*' || op == '/') {
                    char top = opStack.peek();
                    if (top == '(') {
                        opStack.push(op);
                        i++;
                    } else if (top == '*' || top == '/') {
                        calculate(numStack, opStack);
                    } else if (top == '+' || top == '-') {
                        opStack.push(op);
                        i++;
                    }
                } else if (op == '(') {
                    opStack.push(op);
                    i++;
                } else if (op == ')') {
                    while (opStack.peek() != '(') {
                        calculate(numStack, opStack);
                    }
                    opStack.pop();
                    i++;
                }
            }
        }
 
        while (!opStack.isEmpty()) {
            calculate(numStack, opStack);
        }
 
        return numStack.peek();
    }
     
    private void calculate(Stack<Integer> numStack, Stack<Character> opStack) {
        int num2 = numStack.pop();
        int num1 = numStack.pop();
         
        char op = opStack.pop();
         
        int ans = 0;
         
        switch(op) {
            case '+':
                ans = num1 + num2;
            break;
            case '-':
                ans = num1 - num2;
            break;
            case '*':
                ans = num1 * num2;
            break;
            case '/':
                ans = num1 / num2;
            break;
        }
         
        numStack.push(ans);
    }
}
