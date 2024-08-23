public class ArrayToString {
    public static void main(String[] args) {
        String[] arr = new String[] {"I", "am", "an", "Engineering", "student."};
        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            sb.append(str).append(" ");
        }
        System.out.println(sb);
    }
}
