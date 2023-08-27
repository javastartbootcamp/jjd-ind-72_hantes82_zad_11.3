package pl.javastart.task.components;

import pl.javastart.task.exceptions.StringsIncorrectException;

abstract class Component {
    protected String name;
    protected String producer;
    protected String serial;

    public Component(String name, String producer, String serial) {
        setName(name);
        setProducer(producer);
        setSerial(serial);
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        if (!stringValidationCheck(name)) {
            this.name = name;
        } else {
            throw new StringsIncorrectException("nazwa podzespołu");
        }
    }

    public String getProducer() {
        return producer;
    }

    void setProducer(String producer) {
        if (!stringValidationCheck(producer)) {
            this.producer = producer;
        } else {
            throw new StringsIncorrectException("producent");
        }
    }

    public String getSerial() {
        return serial;
    }

    void setSerial(String serial) {
        if (!stringValidationCheck(serial)) {
            this.serial = serial;
        } else {
            throw new StringsIncorrectException("numer seryjny");
        }
    }

    boolean stringValidationCheck(String value) {
        return value == null || value.length() < 2;
    }
}
