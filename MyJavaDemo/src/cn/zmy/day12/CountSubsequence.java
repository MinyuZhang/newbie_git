package cn.zmy.day12;

public class CountSubsequence {
	public static void main(String[] args) {
		String str = "jfwqjpigopjabccabqpezzzjiiqpjabcdefghijtheworldtruthislike the sun,youmayshutitoutfor a time, but it ain't goin' away";
		int count = countSubsequence(str, "abc");
		System.out.println("str中'abc'出现的次数为" + count);
		System.out.println("str123trabs".indexOf("tr"));
		System.out.println("str123trabs".substring(1 + 2));
	}
	/**
	 * 
	 * @param str
	 * @param subsequence
	 * @return
	 */
	public static int countSubsequence(String str, String subsequence) {
		int num = 0;
		while(true) {
			int index = str.indexOf(subsequence);
			if (index < 0) {
				break;
			} else {
				str = str.substring(index + subsequence.length());
				num ++;
			}
		}
		return num;
	}
}
