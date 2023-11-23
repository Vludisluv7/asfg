package lesson6.task4;
interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

interface Sleepable {
    void sleep();
}

//мы выносим основные методы в интерфейс и нужному классу даем только те которые ему нужны


class Engineer implements Workable, Sleepable {
    @Override
    public void work() {
        // Работа инженера
    }

    @Override
    public void sleep() {
        // Сон после работы
    }
}

class Waiter implements Workable, Eatable, Sleepable {
    @Override
    public void work() {
        // Обслуживание клиентов
    }

    @Override
    public void eat() {
        // Перерыв на обед
    }

    @Override
    public void sleep() {
        // Сон после работы
    }
}