package com.marchello.labs.AutoBase;

import java.util.Arrays;
import java.util.HashSet;

/*8)Система Автобаза.
Диспетчер распределяет заявки на Рейсы
между Водителями и назначает для этого Автомобиль.
Водитель может сделать заявку на ремонт.
Диспетчер может отстранить Водителя от работы.*/

public class Main {
    public static void main(String[] args) {
        Dispatcher dispatcher = new Dispatcher(
                new HashSet<>(Arrays.asList(new Driver("Иван"), new Driver("Петр"))),
                new HashSet<>(Arrays.asList(new Car("Вольво"), new Car("Ауди"),new Car("Fe"))));
        Assignment assignment1 = dispatcher.addAssignment(new Passage("Москва","Санкт-Петербург"));
        Assignment assignment2 = dispatcher.addAssignment(new Passage("Киев","Донецк"));
        System.out.println("Текущий список маршрутов: \n" + dispatcher.getAssignments());
        dispatcher.removeAssignment(assignment1);
        dispatcher.removeAssignment(assignment2);
        System.out.println("Текущий список маршрутов: \n" + dispatcher.getAssignments());
        dispatcher.DriverUnavailable(new Driver("Петр"));
        dispatcher.CarUnavailable(new Car("Ауди"));
        dispatcher.addAssignment(new Passage("Минск","Уфа"));
        System.out.println("Текущий список маршрутов: \n" + dispatcher.getAssignments());
        try {
            dispatcher.addAssignment(new Passage("Ниоткуда","Никуда"));
        } catch (Exception e) {
            System.out.println("Не удалось добавить маршрут: " + e.getMessage());
        }
    }
}