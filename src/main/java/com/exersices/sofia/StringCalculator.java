package com.exersices.sofia;

public class StringCalculator {


    public int add(String inputValue)
    {

        if (inputValue.isEmpty())
        {
            return 0;

        }
        else if (!inputValue.contains("\\d"))
        {

            int total = 0;

            String[] values = inputValue.split(",|\n");

            for (String value : values)

            {

                    for (String value2 : values2) {
                        total+=Integer.parseInt(number);
                    }

            }

                int number = Integer.parseInt(value);
                total += number;
        }

            return total;

    }
    else
    {
        return -1;
    }
    }
}

