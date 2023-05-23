import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        String phoneNumber = "(123) 456-7890";
        String invalidPhoneNumber = "123-456-7890";

        String date = "05/23/2023";
        String invalidDate = "23/05/2023";

        String url = "https://www.example.com";
        String invalidURL = "example.com";

        String creditCardNumber = "1234-5678-9012-3456";
        String invalidCreditCardNumber = "1234567890123456";

        String zipCode = "12345";
        String invalidZipCode = "12345-67890";

        String javaIdentifier = "_myVariable";
        String invalidJavaIdentifier = "123abc";

        String hexColorCode = "#FF0000";
        String invalidHexColorCode = "FF0000";

        String time = "12:30";
        String invalidTime = "25:00";

        System.out.println("Valid Phone Number: " + isValidPhone(phoneNumber));
        System.out.println("Invalid Phone Number: " + isValidPhone(invalidPhoneNumber));

        System.out.println("Valid Date: " + isValidDate(date));
        System.out.println("Invalid Date: " + isValidDate(invalidDate));

        System.out.println("Valid URL: " + isValidUrl(url));
        System.out.println("Invalid URL: " + isValidUrl(invalidURL));

        System.out.println("Valid Credit Card Number: " + isValidCard(creditCardNumber));
        System.out.println("Invalid Credit Card Number: " + isValidCard(invalidCreditCardNumber));

        System.out.println("Valid Zip Code: " + isValidZip(zipCode));
        System.out.println("Invalid Zip Code: " + isValidZip(invalidZipCode));

        System.out.println("Valid Java Identifier: " + isValidJava(javaIdentifier));
        System.out.println("Invalid Java Identifier: " + isValidJava(invalidJavaIdentifier));

        System.out.println("Valid Hexadecimal Color Code: " + isValidHex(hexColorCode));
        System.out.println("Invalid Hexadecimal Color Code: " + isValidHex(invalidHexColorCode));

        System.out.println("Valid Time: " + isValidTime(time));
        System.out.println("Invalid Time: " + isValidTime(invalidTime));
    }


    public static boolean isValidEmail(String email) {
        String emailPattern = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        return Pattern.matches(emailPattern, email);
    }

    public static boolean isValidPhone(String phone){
        String phonePattern = "^\\(\\d{3}\\) \\d{3}-\\d{4}$";
        return Pattern.matches(phonePattern, phone);
    }

    public static boolean isValidDate(String date){
        String datePattern = "^(0[1-9]|1[0-2])/([0-2][0-9]|3[01])/\\d{4}$";
        return Pattern.matches(datePattern, date);
    }

    public static boolean isValidUrl(String url) {
        String urlPattern = "^(http|https)://[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return Pattern.matches(urlPattern, url);
    }

    public static boolean isValidCard(String card){
        String cardPattern = "^(\\d{4}[- ]){3}\\d{4}$";
        return Pattern.matches(cardPattern, card);
    }

    public static boolean isValidZip(String zip){
        String zipPattern = "^\\d{5}(-\\d{4})?$";
        return Pattern.matches(zipPattern, zip);
    }

    public static boolean isValidJava(String java) {
        String javaIdentifierPattern = "^[a-zA-Z_$][a-zA-Z0-9_$]*$";
        return Pattern.matches(javaIdentifierPattern, java);
    }

    public static boolean isValidHex(String hex){
        String hexColorPattern = "^#[0-9A-Fa-f]{6}$";
        return Pattern.matches(hexColorPattern, hex);
    }

    public static boolean isValidTime(String time){
        String timePattern = "^([01][0-9]|2[0-3]):[0-5][0-9]$";
        return Pattern.matches(timePattern, time);
    }
}
