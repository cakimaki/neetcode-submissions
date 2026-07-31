class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]> pairs = new Stack<>(); // pair : temperature, index
        int[] res = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; i++){
            int t = temperatures[i];

            while(!pairs.isEmpty() && t > pairs.peek()[0]){
                int[] pair = pairs.pop();

                res[pair[1]] = i - pair[1];
            }

            pairs.push(new int[]{t,i});
        }

        return res;
    }
}
