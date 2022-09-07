/*Написать программу вычисления n-ого треугольного числа.url Вариант 1*/ 
class Triangle {

    public int triangleF(int n) {

        if (n == 1)
            return 1;

        else
            return (n + triangleF(n - 1));
    }
}