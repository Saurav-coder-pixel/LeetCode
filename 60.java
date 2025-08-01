public class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> numbers = new ArrayList<>();
        int[] factorial = new int[n + 1];

        factorial[0] = 1;
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
            factorial[i] = factorial[i - 1] * i;
        }

        k--;  
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            int index = k / factorial[n - i];
            result.append(numbers.get(index));
            numbers.remove(index);
            k %= factorial[n - i];
        }

        return result.toString();
    }
}
