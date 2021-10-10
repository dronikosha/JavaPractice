package ru.practice_12.four;

public class PhoneNumber {
    private final String formattedNumber;

    PhoneNumber(String number) {
        StringBuilder stringBuffer = new StringBuilder(number);
        String code = stringBuffer.substring(0, stringBuffer.length() - 10);
        if (code.equals("8")) {
            code = "+7";
        }

        String first_digit = stringBuffer.substring(stringBuffer.length() - 10, stringBuffer.length() - 7);
        String middle_digit = stringBuffer.substring(stringBuffer.length() - 7, stringBuffer.length() - 4);
        String last_digit = stringBuffer.substring(stringBuffer.length() - 4, stringBuffer.length());
        this.formattedNumber = code + first_digit + "-" + middle_digit + "-" + last_digit;
    }

    public String getFormattedNumber() {
        return this.formattedNumber;
    }
}
