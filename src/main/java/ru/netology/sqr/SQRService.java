package ru.netology.sqr;

public class SQRService {
    public int calculateSQR(int rangeLow, int rangeHigh) {
        int countNum = 0;
        for (int i = 10; i <= 20; i++){
            if (i * i >= rangeLow & i * i <= rangeHigh){
                countNum++;

            }
        }
        return countNum;
    }

}
