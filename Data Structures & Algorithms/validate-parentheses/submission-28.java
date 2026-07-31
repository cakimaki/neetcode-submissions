class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        Map<Character,Character> correspondBracket = new HashMap<>();
        correspondBracket.put(')','(');
        correspondBracket.put(']','[');
        correspondBracket.put('}','{');

        for(char ch : s.toCharArray()){
            if(correspondBracket.containsKey(ch)){
                if(stack.isEmpty() || correspondBracket.get(ch) != stack.pop()){
                    return false;
                }
            }else{
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}
