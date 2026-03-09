public class UseCase2PalindromeCheckerApp {
    public static void main(String[] args) {

        String input = "madam";
        boolean palindrome = true;

        for(int i = 0; i < input.length() / 2; i++) {
            if(input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                palindrome = false;
                break;
            }
        }

        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome? : " + palindrome);
    }
}