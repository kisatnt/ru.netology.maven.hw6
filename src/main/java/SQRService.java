package ru.netology.sqr;

public class SQRService {

    public int countSquaredNumbersInRange(int lowerBound, int upperBound) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int square = i * i;
            if (square >= lowerBound && square <= upperBound) {
                count++;
            }
        }
        return count;
    }
}

