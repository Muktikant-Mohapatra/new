package test;

public class LongestCommonSubstring {

	public static void main(String[] args) {
	 String longestCommonSubstring = getLongestCommonSubstring("abcbcdef", "abbccdef");
	 System.out.println(longestCommonSubstring);
	 

	}

		public static String getLongestCommonSubstring(String str1, String str2)
		{
			int m=str1.length();
			int n=str2.length();
			int maxlen = 0; 		
			int endingIndex = m;	
			int[][] lookup = new int[m + 1][n + 1];
			for (int i = 1; i <= m; i++)
			{
				for (int j = 1; j <= n; j++)
				{
					if (str1.charAt(i - 1) == str2.charAt(j - 1))
					{
						lookup[i][j] = lookup[i - 1][j - 1] + 1;
						if (lookup[i][j] > maxlen)
						{
							maxlen = lookup[i][j];
							endingIndex = i;
						}
					}
				}
			}
			return str1.substring(endingIndex - maxlen, endingIndex);
		}
}
