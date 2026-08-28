class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        int n = s.length();

        for (int i=0 ; i<n ; i++) {
            char next = s.charAt(i);
            if (next == '(' || next == '{' || next == '[') {
                stack.push(next);
                continue;
            }
            else if (stack.isEmpty()) {
                return false;
            }
            else if (next == ')' && stack.peek() != '(') {
                return false;
            }
            else if (next == ']' && stack.peek() != '[') {
                return false;
            }
            else if (next == '}' && stack.peek() != '{') {
                return false;
            }
            stack.pop();
        }

        if (!stack.isEmpty()) {
            return false;
        }
        
        return true;
    }
}
