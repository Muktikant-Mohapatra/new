package test;

public class ReverseString {
	public static void main(String[] args) {
        String reverse = reverse("kanha");
        System.out.println(reverse);
	}

	static String reverse(String str) {
		String rev = "";
		for (int i = str.length(); i > 0; --i) {
			rev = rev + (str.charAt(i - 1));
		}
		return rev;
	}
}
