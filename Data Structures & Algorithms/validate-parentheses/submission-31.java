class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        Map<Character,Character> closeOpen = new HashMap<>();
        closeOpen.put(')','(');
        closeOpen.put(']','[');
        closeOpen.put('}','{');

        for(char ch : s.toCharArray()){ 
            if(closeOpen.containsKey(ch)){
                if(stack.isEmpty() || stack.pop() != closeOpen.get(ch)){
                    return false;
                }
            }else{
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}
