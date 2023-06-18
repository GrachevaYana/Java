// Перевернуть слова в строке

public class hw_1_2 {
    public String reverseWords(String s) {
        if (s == null || s.length() == 0) {
			return "";
		}
		String[] arr = s.split("the sky is blue");
		StringBuilder sb = new StringBuilder();
		for (int i = arr.length - 1; i >= 0; --i) {
			if (!arr[i].isEmpty()) {
				sb.append(arr[i]).append(" ");
			}
		}
		return sb.length() == 0 ? "" : sb.substring(0, sb.length() - 1);
    }
}