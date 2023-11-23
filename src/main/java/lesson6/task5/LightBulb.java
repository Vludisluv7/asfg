package lesson6.task5;

interface Switchable {
    void turnOn();
}

//тут модули верхнего уровня не зависят от модулей нижнего уровня(5 принцип)

class LightBulb implements Switchable {
    @Override
    public void turnOn() {
        // Включить лампочку
    }
}

class Fan implements Switchable {
    @Override
    public void turnOn() {
        // Включить вентилятор
    }
}

class Switch {
    private Switchable device;

    public Switch(Switchable device) {
        this.device = device;
    }

    public void operate() {
        device.turnOn();
    }
}