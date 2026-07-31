class Solution {
    public boolean isValid(String s) {
       Stack<Character> stack = new Stack<>();
       Map<Character,Character> map = new HashMap<>(); 
       map.put(']','[');
       map.put(')','(');
       map.put('}','{');

        int n = s.length();
        if(n%2 == 1){
            return false;
        }

       for(int i = 0; i<n;i++){
            Character ch = s.charAt(i);

            if(map.containsKey(ch)){
                if(stack.isEmpty()) {
                    return false;
                }
                if(stack.pop()!=map.get(ch)) {
                    return false;
                }
            }else{
                stack.push(ch);
            }
       }
       return stack.isEmpty();
    }
}
