package RegexReplace;

/* Write a function removeUnits that returns the string where the units cm and € are removed if they follow directly a number and followed by a space. Write a function obfuscateEmail that returns a string where parts of email addresses are replaced by '*' if they follow the rules below:

    Hide from the username any character next to -, . or _ if they exist. Otherwise, hide 3 characters from the username if its length > 3
    If the remaining part after @ is in the format @<third level domain>.<second level domain>.<top level domain>, then hide the third and top level domains, otherwise hide the second level domain and the top level domain if it is not included in .com, .org and .net.
 */

 /*
  * input examples
          System.out.println(RegexReplace.removeUnits("32cm et 50€"));
        System.out.println(RegexReplace.removeUnits("32 cm et 50 €"));
        System.out.println(RegexReplace.removeUnits("32cms et 50€!"));

        System.out.println(RegexReplace.obfuscateEmail("john.doe@example.com"));
        System.out.println(RegexReplace.obfuscateEmail("jann@example.co.org"));
        System.out.println(RegexReplace.obfuscateEmail("jackob@example.fr"));
    expected outputs:
    32 et 50
    32 cm et 50 €
    32cms et 50€!
    joh****@*******.com
    jan*@*******.co.***
    jac***@*******.**
  */

public class RegexReplace {
    public static String removeUnits(String s) {
        // it only replaces when the unit is followed by a space or end of input or end of line and the unit is connected to a number
        return s.replaceAll("(?<=\\d)(cm|€)(?=\\s|$)", "");
    }

    public static String obfuscateEmail(String s) {
        String[] parts = s.split("@");

        if (parts.length != 2) {
            return s; // Invalid email format
        }

        String username = parts[0];
        String domain = parts[1];

        String obfuscatedUsername = obfuscateUsername(username);
        String obfuscatedDomain = obfuscateDomain(domain);

        return obfuscatedUsername + "@" + obfuscatedDomain;
    }

    private static String obfuscateUsername(String username) {
        int length = username.length();
        if (length <= 3) {
            return username; // Keep short usernames intact
        }

        String obfuscatedPart = username.substring(0, 3) + username.substring(3).replaceAll(".", "*");
        return obfuscatedPart;
    }

    private static String obfuscateDomain(String domain) {
        String[] parts = domain.split("\\.");
        if (parts.length < 2) {
            return domain; // Invalid domain format
        }

        String tld = parts[parts.length - 1];
        String obfuscatedPart = parts[0].substring(0, Math.min(3, parts[0].length())) + parts[0].substring(3).replaceAll(".", "*");
        return obfuscatedPart + "." + tld;
    }

}
