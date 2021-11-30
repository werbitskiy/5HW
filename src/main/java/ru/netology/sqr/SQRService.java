package ru.netology.sqr;

public class SQRService {

    public int SqrtDist(int minSet, int maxSet) {  //минимальный и максимальный параметр
        int counter = 0;
        for (int i = 1; i <= 99; i++) {
            int squarech = i * i;  // квадрат числа
            if (squarech >= minSet && squarech <= maxSet){
                counter++;
            }
        }
return counter;
    }

}