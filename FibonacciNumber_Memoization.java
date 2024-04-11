class FibonacciNumber_Memoization {
    public static Map<Integer, Integer> hm = new HashMap<>();

    public int fib(int n) {
        if (hm.containsKey(n)) 
            return hm.get(n);
        
        int result;
        if (n == 0) 
            result = 0;
        else if (n == 1) 
            result = 1;
        else
            result = fib(n-1) + fib(n-2);

        return result;
    }
}
