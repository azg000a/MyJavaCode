package InterviewPracticeMore;

public class InterviewQuestionNeww {

//	public static String processString(String sentence) {
//
////		String res = "";
////
////		String[] words = sentence.split(" ");
////		for (String x : words) {
////			res += x.charAt(0) + "" + x.charAt(x.length() - 1) + " ";
////		}
////
////		return res;
////
////	}
////
////	public static void main(String[] args) {
////
////		String input = "Freedom Mortgage";
////		System.out.println(processString(input));
////
////	}
////
//}

	public static String processString(String input) {
		String result = "";

		String[] random = input.split(" ");
		for (String w : random) {
			if (w.length() > 1) {
				result += w.charAt(0) + "" + w.charAt(w.length() - 1) + " ";
			} else {
				result += w.charAt(0) + " ";
			}

		}
		return result;
	}

	public static void main(String[] args) {

		String input = "It is a rainy day today";
		System.out.println(processString(input));

	}

}