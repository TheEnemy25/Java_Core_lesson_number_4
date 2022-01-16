package com.company;

public class Main {

    public static void main(String[] args) {
//              Завдання 1

//        Robot [] nameRobots = {new Robot(),new CoffeRobot(),new RobotCoocker(),new RobotDancer()};
//
//        for (int i = 0 ; i < 4 ; i++ ){
//            nameRobots[i].work();
//        }
//        Robot robot = new Robot();
//        robot.work();
//        CoffeRobot coffeRobot = new CoffeRobot();
//        coffeRobot.work();
//        RobotCoocker robotCoocker = new RobotCoocker();
//        robotCoocker.work();
//        RobotDancer robotDancer = new RobotDancer();
//        robotDancer.work();

//        Завдання 2
        Animal animal = new Animal("Леопард",20d,7);
        System.out.println(animal.getName() +" "+ animal.getSpeed()  +" "+ animal.getAge());
        animal.setName("Бик"); animal.setSpeed(2d); animal.setAge(14);
        System.out.println(animal.getName() +" "+ animal.getSpeed()  +" "+ animal.getAge());
    }
}
