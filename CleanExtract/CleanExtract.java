package CleanExtract;

public class CleanExtract {
    public static String extract(String s) {
        StringBuilder result = new StringBuilder();

        String[] substrings = s.split("\\|");
        for (String substring : substrings) {

            int firstDotIndex = substring.indexOf('.');
            int lastDotIndex = substring.lastIndexOf('.');

            // Check if both dots are present and the first dot is before the last dot
            if (firstDotIndex != -1 && lastDotIndex != -1 && firstDotIndex < lastDotIndex) {
                String extracted = substring.substring(firstDotIndex + 1, lastDotIndex).trim();
                if (!extracted.isEmpty()) {
                    result.append(extracted).append(" ");
                }
            } else if (firstDotIndex != -1) {
                String extracted = substring.substring(firstDotIndex + 1).trim();
                if (!extracted.isEmpty()) {
                    result.append(extracted).append(" ");
                }
            } else {
                String extracted = substring.trim();
                if (!extracted.isEmpty()) {
                    result.append(extracted).append(" ");
                }
            }
        }

        return result.toString().trim();
    }
}
