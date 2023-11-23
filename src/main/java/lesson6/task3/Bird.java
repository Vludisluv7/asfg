package lesson6.task3;

interface Bird {
    void move();
}

//реализуем 3 принцип, можно обратиться к любому классу и ошибок не последует

class Sparrow implements Bird {
    @Override
    public void move() {
        // Полет воробья
    }
}

class Ostrich implements Bird {
    @Override
    public void move() {
        // Движение страуса, не включает полет
    }
}