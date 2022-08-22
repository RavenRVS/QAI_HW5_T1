package ru.netology.qai.task1.services;

public class SQRService {
    public int numericInRange(int lowerLimit, int upperLimit) {
        int trueLowerLimit;
        int trueUpperLimit;
        if (lowerLimit <= upperLimit) {
            trueLowerLimit = lowerLimit;
            trueUpperLimit = upperLimit;
        } else {
            trueLowerLimit = upperLimit;
            trueUpperLimit = lowerLimit;
        }
        int countNumbers = 0;
        for (int i = 10; i < 100; i++) {
            int number = i * i;
            if (trueLowerLimit < number & number < trueUpperLimit) {
                countNumbers += 1;
            }
        }
        return countNumbers;
    }
}
