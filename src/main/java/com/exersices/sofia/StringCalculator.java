package com.exersices.sofia;

public class StringCalculator {


    public int add(String inputValue) {

        if (inputValue.equals("")) {
            return 0;

        } else if (inputValue.contains(",")) {

            int total = 0;

            String[] values = inputValue.split(",");

            for (String value : values)

            {

                if (value.contains("\\n")) {
                    String[] values2 = value.split(System.getProperty("line.separator"));
                    for (String value2 : values2) {
                        int number = Integer.parseInt(value2);
                        total += number;
                    }

                }

                int number = Integer.parseInt(value);
                total += number;
            }

            return total;

        } else if (!inputValue.contains(",")) {
            return Integer.parseInt(inputValue);
        } else {

            return -1;
        }
    }
}

