public class solution {
    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        long r = 0;
        long temp = x; 

        while (temp != 0) {
           int di = (int) (temp % 10);
            r = r * 10 + di;
            temp /= 10;
        }
        return (r == x);
    }

    public static void main(String[] args) {
        // Example usage
        solution solution = new solution();

        // Test case 1: palindrome number
        int palindromeNumber = 121;
        boolean isPalindrome1 = solution.isPalindrome(palindromeNumber);
        System.out.println(palindromeNumber + " is a palindrome: " + isPalindrome1);

        // Test case 2: non-palindrome number
        // int nonPalindromeNumber = 123;
        // boolean isPalindrome2 = solution.isPalindrome(nonPalindromeNumber);
        // System.out.println(nonPalindromeNumber + " is a palindrome: " + isPalindrome2);
    }
}