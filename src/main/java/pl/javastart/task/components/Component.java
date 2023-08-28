package pl.javastart.task.components;

import pl.javastart.task.exceptions.*;

abstract class Component {
    protected String name;
    protected String producer;
    protected String serial;
    protected static final int FREQUENCY_INCREASE_STEP = 100;

    public Component(String name, String producer, String serial) {
        setName(name);
        setProducer(producer);
        setSerial(serial);
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        int length = 4;
        if (!checkStringLength(name, length)) {
            this.name = name;
        } else {
            throw new StringsIncorrectException("nazwa podzespołu");
        }
    }

    public String getProducer() {
        return producer;
    }

    void setProducer(String producer) {
        int length = 4;
        if (!checkStringLength(producer, length)) {
            this.producer = producer;
        } else {
            throw new StringsIncorrectException("producent");
        }
    }

    public String getSerial() {
        return serial;
    }

    void setSerial(String serial) {
        int length = 4;
        if (!checkStringLength(serial, length)) {
            this.serial = serial;
        } else {
            throw new StringsIncorrectException("numer seryjny");
        }
    }

    boolean checkStringLength(String value, int number) {
        return value == null || value.length() < number;
    }
}
