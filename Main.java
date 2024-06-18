// 12.9

public class Main {
    public static int bin2Dec(String binaryString) throws BinaryFormatException {
        // Validate the input string
        for (int i = 0; i < binaryString.length(); i++) {
            char ch = binaryString.charAt(i);
            if (ch != '0' && ch != '1') {
                throw new BinaryFormatException("Invalid binary string: " + binaryString);
            }
        }

        // Convert binary string to decimal
        int decimal = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            char ch = binaryString.charAt(i);
            decimal = decimal * 2 + (ch - '0');
        }

        return decimal;
    }

    public static void main(String[] args) {
        String[] testStrings = {"1101", "10102", "111", "10a01"};

        for (String binaryString : testStrings) {
            try {
                int decimalValue = bin2Dec(binaryString);
                System.out.println("The decimal value of " + binaryString + " is " + decimalValue);
            } catch (BinaryFormatException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}