package ru.netology.sqr;

public class SQRService {
    public int calcSqrOfNumber(int minLimit, int maxLimit) {

        int x = 0; // число попаданий в заданный диапазон
        for (int randomNumber = 10; randomNumber <= 99; randomNumber++) {
            if (randomNumber * randomNumber >= minLimit && randomNumber * randomNumber <= maxLimit) {
                x++;
            }

        }

        return x;
    }

}

