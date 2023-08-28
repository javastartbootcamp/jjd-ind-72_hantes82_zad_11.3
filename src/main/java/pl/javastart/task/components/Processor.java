package pl.javastart.task.components;

import pl.javastart.task.Overclockable;
import pl.javastart.task.exceptions.CriticalTempException;
import pl.javastart.task.exceptions.TempIncorrectException;

import java.util.Objects;

public class Processor extends Component implements Overclockable {
    private int frequency;
    private int temp;
    private final int safeTempLimit;

    private final int tempIncreaseStep = 10;

    public Processor(String name, String producer, String serial, int frequency, int temp, int safeTempLimit) {
        super(name, producer, serial);
        this.frequency = frequency;
        this.safeTempLimit = safeTempLimit;
        setTemp(temp);
    }

    public int getFrequency() {
        return frequency;
    }

    void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public int getTemp() {
        return temp;
    }

    void setTemp(int temp) {
        if (tempCheck(temp)) {
            this.temp = temp;
        } else {
            throw new TempIncorrectException();
        }
    }

    public int getSafeTempLimit() {
        return safeTempLimit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Processor processor)) {
            return false;
        }
        return frequency == processor.frequency && temp == processor.temp && safeTempLimit == processor.safeTempLimit;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "name=" + name +
                ", temp=" + temp +
                ", safeTempLimit=" + safeTempLimit +
                ", frequency='" + frequency + '\'' +
                ", producer='" + producer + '\'' +
                ", serial='" + serial + '\'' +
                '}';
    }

    @Override
    public void overclock() {
        if (temp <= safeTempLimit - 2 * tempIncreaseStep) {
            frequency += frequencyIncreaseStep;
            temp += tempIncreaseStep;
        } else {
            throw new CriticalTempException("Procesor");
        }
    }

    @Override
    public boolean tempCheck(int temp) {
        return temp < safeTempLimit;
    }
}
