package ru.netology;

public class SqrtService {
    public int calcAmountSqrInRange(int low, int high) {
        int count = 0;
        int i = 10;
        while (i < 99) {
            int Sqr = i * i;
            if (Sqr >= low) {
                if (Sqr <= high) {
                    count = count + 1;
                }
            }
            i++;
        }
        return count;
    }

}


