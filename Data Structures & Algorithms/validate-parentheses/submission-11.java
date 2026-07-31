class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int n = s.length();
        if(n % 2 == 1) return false;

        Map<Character,Character> map = new HashMap<>();
        map.put(']','[');
        map.put('}','{');
        map.put(')','(');

        for(int i = 0; i<n ; i++){
            Character currChar = s.charAt(i);

            if(map.containsKey(currChar)){
                if(stack.isEmpty()){
                    return false;
                }
                if(stack.pop()!=map.get(currChar)){
                    return false;
                }
            }else{
                stack.push(currChar);
            }
        }

        return stack.isEmpty();
    }
}
