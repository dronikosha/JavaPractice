package ru.practice_12_to_15.four;

public class PhoneNumber {
    private final String formattedNumber;

    PhoneNumber(String number) {
        StringBuilder stringBuilder = new StringBuilder(number);
        String code = stringBuilder.substring(0, stringBuilder.length() - 10);
        if (code.equals("8")) {
            code = "+7";
        }

        String first_digit = stringBuilder.substring(stringBuilder.length() - 10, stringBuilder.length() - 7);
        String middle_digit = stringBuilder.substring(stringBuilder.length() - 7, stringBuilder.length() - 4);
        String last_digit = stringBuilder.substring(stringBuilder.length() - 4, stringBuilder.length());
        this.formattedNumber = code + first_digit + "-" + middle_digit + "-" + last_digit;
    }

    public String getFormattedNumber() {
        return this.formattedNumber;
    }
}
