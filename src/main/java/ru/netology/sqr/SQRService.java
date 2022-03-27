package ru.netology.sqr;

public class SQRService {
    public int counter(int min, int max) {

        int count = 0; //количество двузначных чисел, квадрат которых находится в заданных пределах

        //сам метод: если квадрат числа в заданных границах, то добавляем в счетчик единицу, если нет - прекращаем
        for (int i = 10; i <= 99; i = i + 1) {
            if (i * i >= min && i * i <= max) {
                count = count + 1;
            }
        }
        return count;
    }

}
