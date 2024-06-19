import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Assign1_Q1 {
	
	public static boolean isPalindrome1(String s){
		int left = 0, right=s.length()-1;
		
		while(left < right){
			if(s.charAt(left)!=s.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
		
	}
	public static boolean isPalindrome2(String s) {
		String reversed = new StringBuilder(s).reverse().toString();
		if(s.equals(reversed)) {
			return true;
		}
		return false;
	}
	public static boolean isPalindrome3(String s) {
		return isPalindromeHelper(s, 0, s.length()-1);
	}
	public static boolean isPalindromeHelper(String s, int left, int right) {
		if(left >= right) {
			return true;
		}
		if(s.charAt(left) != s.charAt(right)) {
			return false;
		}
		return isPalindromeHelper(s, left+1, right-1);
	}
	
	public static boolean isPalindrome4(String s){
		Stack<Character>stack = new Stack<>();
		int n = s.length();
		for(int i =0; i<n/2; i++) {
			stack.push(s.charAt(i));
		}
		int start = n%2 == 0 ? n/2 : n/2+1;
		for(int j=start; j<n ;j++) {
			if(stack.pop()!=s.charAt(j)) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isPalindrome5(String s) {
		Deque <Character> deque = new LinkedList<>();
		for(char c : s.toCharArray()) {
			deque.add(c);
		}
		while(deque.size()>1) {
			if(deque.pollFirst() != deque.pollLast()) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Palindrome check 1"+ " "+isPalindrome1("Sneha"));
		System.out.println("Palindrome check 1"+" "+isPalindrome1("snehens"));
		System.out.println("Palindrome check 2"+ " "+isPalindrome2("Sneha"));
		System.out.println("Palindrome check 2"+" "+isPalindrome2("snehens"));
		System.out.println("Palindrome check 3"+ " "+isPalindrome3("Sneha"));
		System.out.println("Palindrome check 3"+" "+isPalindrome3("snehens"));
		System.out.println("Palindrome check 4"+ " "+isPalindrome4("Sneha"));
		System.out.println("Palindrome check 4"+" "+isPalindrome4("snehens"));
		System.out.println("Palindrome check 5"+ " "+isPalindrome5("Sneha"));
		System.out.println("Palindrome check 5"+" "+isPalindrome5("snehens"));
	}

}
