class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int size = temperatures.length;


        if(size == 0)
            return new int[]{};


        int[] result = new int[size];
        Deque<Integer> stack = new ArrayDeque<>();
        int prevIndex;

        stack.push(0);
        for(int i = 1;i < temperatures.length;i++){
            if(temperatures[stack.peek()] >= temperatures[i])
                stack.push(i);
            else{
                while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]){
                    prevIndex = stack.pop();
                    result[prevIndex] = i - prevIndex;
                }
                stack.push(i);
            }
        }
        return result;
    }
}
