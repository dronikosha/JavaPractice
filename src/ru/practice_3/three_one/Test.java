package ru.practice_3.three_one;


public class Test {
    public static void main(String[] args) {
        Shape s1 = new Circle("Red", 5, false);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        System.out.println(((Circle) s1).getRadius());

        /**
         * В Shape нет метода getRadius, но есть в Circle, поэтому происходит ошибка компиляции
         * Чтобы избежать данной ошибки следует привести тип(кастануть) s1 -> ((Circle)s1)
         */
    }
}
