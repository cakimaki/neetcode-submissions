class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]> oldTemps = new Stack<>(); // pair {temp, i};
        int[] res = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; i++){
            int temp = temperatures[i];

            while(!oldTemps.isEmpty() && temp > oldTemps.peek()[0]){
                int[] popped = oldTemps.pop();
                res[popped[1]] = i - popped[1];
            }

            oldTemps.push(new int[]{temp,i});
        }
        return res;
    }
}
