package ru.netology;

public class Main {
    public static void main(String[] args) {

        SqrtService service = new SqrtService();
        System.out.println(service.calcAmountSqrInRange(100, 2000));

    }
}