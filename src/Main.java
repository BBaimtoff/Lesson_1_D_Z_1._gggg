public class Main {
    public static void main(String[] args) {
        System.out.println("Привет мир!");

        System.out.println("--------------");

        int ageOfMyFather = 37;

        System.out.println("Возраст моего отца: " + ageOfMyFather);
        System.out.println("Year of birth of my father: " + (2022 - ageOfMyFather));

        ageOfMyFather = 38;
        System.out.println("Новое перезаписанной значение перемнной: " + ageOfMyFather);

        boolean isMyFatherOlder;
        int myAge = 15;
        isMyFatherOlder = ageOfMyFather > myAge;

        System.out.println("Мой отец старше меня ? " + isMyFatherOlder);

        double digit = 15.5;
        System.out.println(digit + myAge);

        String myCity = "Bishkek";

        System.out.println("My favorite city is " + myCity);

        final boolean isJavaCool = true;
    }
}
