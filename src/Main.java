public class Main {
    public static void main(String[] args) {
        // Домашнее задание - 1
        // Задание 1
        int age = 19;
        if (age >= 18) {
            System.out.println("Поздравляю тебе больше 18 лет.");
        }
        if (age < 18) {
            System.out.println("Тебе нет 18 лет, подожди немного.");
        }
        // Задание 2
        age = 24;
        if (age >= 7) {
            System.out.println("Ребенку больше 7 лет и он может ходить в школу.");
        }
        if (age >= 18) {
            System.out.println("Человек закончил школу и может поступать в институт.");
        }
        if (age >= 24) {
            System.out.println("Человеку больше 24 лет и он может устроиться на роботу.");
        }
        // Задание 3
        int wagonCapacity = 102;
        int seat = 60;
        int standingPlace = 42;
        if (wagonCapacity < 102) {
            System.out.println("В вагоне есть еще места.");
        }
        if (wagonCapacity >= 102) {
            System.out.println( "В вагоне мест нет.");
        }
        if (wagonCapacity < seat) {
            System.out.println("В вагоне есть сидячие места");
        }
        if (wagonCapacity > seat) {
            System.out.println("В вагоне нет сидячих мест");
        }
        if (wagonCapacity < 102 ) {
            System.out.println("В вагоне есть стоячие места");
        }
        if (wagonCapacity >= 102) {
            System.out.println("В вагонет нет стоячих мест");
        }
        // Домашнее задание - 2
        // Задание 1
        age = 17;
        if (age >= 18) {
            System.out.println("Поздравляю тебе больше 18 лет.");
        } else {
            System.out.println("Тебе нет 18 лет, подожди немного.");
        }
        // Задание 2
        age = 26;
        if (age >= 7) {
            System.out.println("Ребенку больше 7 лет и он может ходить в школу.");
        } else {
            System.out.println("Тебе еще нет 7 лет, поэтому ты не можешь пойти в школу.");
        }
        if (age >= 18) {
            System.out.println("Человек закончил школу и может поступать в институт.");
        } else {
            System.out.println("Ты еще не закончил школу и поэтому ты не можешь поступить в институт.");
        }
        if (age >= 24) {
            System.out.println("Человеку больше 24 лет и он может устроиться на роботу.");
        } else {
            System.out.println("Тебе нужно закончить институт.");
        }
        //Задание 3
        if (wagonCapacity < 102) {
            System.out.println("В вагоне есть еще места.");
        } else {
            System.out.println("В вагоне нет места");
        }
        if (wagonCapacity < seat) {
            System.out.println("В вагоне есть сидячие места");
        } else {
            System.out.println("В вагоне нет сидячих мест");
        }
        if (wagonCapacity < 102) {
            System.out.println("В вагоне есть стоячие места");
        } else {
            System.out.println("В вагонет нет стоячих мест");
        }
        //Домашнее задание - 3
        // Задание 1
        int ageKindergarnet = 2;
        int ageSchool = 7;
        int ageUniversity = 24;
        int ageJob = 25;
        if (ageKindergarnet >= 2 && ageKindergarnet <=6) {
            System.out.println("Если возраст человека равен " + ageKindergarnet + " ,то ему нужно ходить в детский сад.");
        } else {
            System.out.println("Ты еще не дорос до детского сада или уже перерос его.");
        }
        if (ageSchool >= 7 && ageSchool <= 18) {
            System.out.println("Если возраст человека равен " + ageSchool + " ,то ему нужно ходить в школу.");
        } else {
            System.out.println("Ты еще не дорос до школы, или ты ее перерос.");
        }
        if (ageUniversity >= 18 && ageUniversity <= 24) {
            System.out.println("Если возраст человека равен " + ageUniversity + " ,то ему нужно ходить в институт.");
        } else {
            System.out.println("Ты еще не дорос до университета, или ты его перерос.");
        }
        if (ageJob >= 24) {
            System.out.println("Если возраст человека равен " + ageJob + " ,то ему нужно ходить на работу.");
        } else {
            System.out.println("Сначала закончи университет.");
        }
        // Задание 2
        int ageChildren = 5;
        if (ageChildren < 5) {
            System.out.println("Ребенку нельзя кататься на аттракционе");
        } else {
            System.out.println("Ребенок может кататься на аттракционе.");
        }
        if (ageChildren >= 5 && ageChildren < 14) {
            System.out.println("Но только в сопровождении взрослого.");
        }
        if (ageChildren > 14) {
            System.out.println("Без сопровождения взрослого.");
        }
        // Задание 3
        int one = 1;
        int two = 2;
        int free = 3;
        if (free >= 3) {
            System.out.println("Самое большое число:"+ free);
        } else {
            System.out.println("Это число не самое большое");
            // не совсем понял как решать эту задачу
        }
    }
}