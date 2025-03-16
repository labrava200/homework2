public class Main {
    public static void main(String[] args) {
//Задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
//Задача 2
        var Dog = dog * 4;
        var Cat = cat * 4;
        var Paper = paper * 4;
        System.out.println(Dog);
        System.out.println(Cat);
        System.out.println(Paper);
//Задача 3
        var DOG = Dog - 3.5;
        var CAT = Cat - 1.6;
        var PAPER = Paper - 7639;
        System.out.println(DOG);
        System.out.println(CAT);
        System.out.println(PAPER);
//Задача 4
    var friend = 19;
    System.out.println(friend);
    var Friend = friend + 2;
    System.out.println(Friend);
    var FRIEND = Friend / 7;
    System.out.println(FRIEND);
//Задача 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog +4;
        System.out.println(frog);
//Задача 6
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        System.out.println(firstBoxerWeight + " кг");
        System.out.println(secondBoxerWeight + " кг");
        var boxersWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общая масса двух бойцов составляет " + boxersWeight + " кг");
        var differenceBoxersWeight = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница между массами двух бойцов составляет " + differenceBoxersWeight + " кг");
//Задача 7
        var DiffBoxersWeight = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Остаток от деления между двумя весами составляет " + DiffBoxersWeight + " кг");
//Задача 8
        var workTime = 640;
        var workTimeEmployee = 8;
        var employee = workTime / workTimeEmployee;
        System.out.println("Всего работников в компании — " + employee + " человек");
    }
}