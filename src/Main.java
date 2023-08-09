public class Main {
    public static void main(String[] args) {
        // task1
        System.out.println("Task1");
        var dog1 = 8.0;
        var cat1 = 3.6;
        var paper1 = 763789;
        System.out.println(dog1);
        System.out.println(cat1);
        System.out.println(paper1);

        // task2
        System.out.println("Task2");
        var dog2 = dog1 - 4;
        var cat2 = cat1 - 4;
        var paper2 = paper1 - 4;
        System.out.println(dog2);
        System.out.println(cat2);
        System.out.println(paper2);

        // task3
        System.out.println("Task3");
        var dog3 = dog2 - 3.5;
        var cat3 = cat2 - 1.6;
        var paper3 = paper2 - 7639;
        System.out.println(dog3);
        System.out.println(cat3);
        System.out.println(paper3);

        // task4
        System.out.println("Task4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        // task5
        System.out.println("Task5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        // task6
        System.out.println("Task6");
        var weight1 = 78.2;
        var weight2 = 82.7;
        var sum = weight1 + weight2;
        var diff = weight1 - weight2;
        System.out.println("Sum of weidhts: " + sum);
        System.out.println("Diff of weights: " + diff);

        // task7
        System.out.println("Task7");
        var diff1 = weight2 - weight1;
        var diff2 = weight2 % weight1;
        System.out.println("Diff1: " + diff1);
        System.out.println("Diff2: " + diff2);

        // task8
        System.out.println("Task8");
        var hours = 640;
        var hoursPerEmployee = 8;
        var numberOfEmplotees = hours / hoursPerEmployee;
        System.out.println("Всего работников в компании -" + numberOfEmplotees + " человек");

        numberOfEmplotees = numberOfEmplotees + 94;
        hours = numberOfEmplotees * hoursPerEmployee;
        System.out.println("Если в компании работает " + numberOfEmplotees + " человек, то всего " + hours + " часов работы может быть поделено между сотрудниками");





    }
}