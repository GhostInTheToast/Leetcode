class ValidParentheses {
    public boolean isValid(String s) {
        if (s.length() % 2 == 1) 
            return false;

        Stack<Character> stk = new Stack<>();
        Set<Character> set = new HashSet<>();
        set.add('[');
        set.add('(');
        set.add('{');

        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                stk.push(s.charAt(i));
            } else if (stk.isEmpty() == true) {
                return false;
            } else if (s.charAt(i) == ']') {
                if (stk.peek() == '[') {
                    stk.pop();
                } else {return false;}
            } else if (s.charAt(i) == '}') {
                if (stk.peek() == '{') {
                    stk.pop();
                } else {return false;}
            } else if (s.charAt(i) == ')') {
                if (stk.peek() == '(') {
                    stk.pop();
                } else {return false;}
            } 
        }
        return stk.isEmpty();
    }
}
