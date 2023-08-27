package pl.javastart.task.components;

import pl.javastart.task.Overclockable;
import pl.javastart.task.exceptions.TempIncorrectException;
import java.util.Objects;

public class Memory extends Component implements Overclockable {
    private int memory;
    private int frequency;
    private int temp;
    private int safeTempLimit;

    public Memory(String name, String producer, String serial, int memory, int frequency, int temp, int safeTempLimit) {
        super(name, producer, serial);
        this.memory = memory;
        this.frequency = frequency;
        this.safeTempLimit = safeTempLimit;
        setTemp(temp);
    }

    public int getMemory() {
        return memory;
    }

    void setMemory(int memory) {
        this.memory = memory;
    }

    public long getFrequency() {
        return frequency;
    }

    void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public int getTemp() {
        return temp;
    }

    void setTemp(int temp) {
        if (tempCheck()) {
            this.temp = temp;
        } else {
            throw new TempIncorrectException();
        }
    }

    public int getSafeTempLimit() {
        return safeTempLimit;
    }

    void setSafeTempLimit(int safeTempLimit) {
        this.safeTempLimit = safeTempLimit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Memory memory1)) {
            return false;
        }
        return memory == memory1.memory && frequency == memory1.frequency && temp == memory1.temp && safeTempLimit == memory1.safeTempLimit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(memory, frequency, temp, safeTempLimit);
    }

    @Override
    public String toString() {
        return "Memory{" +
                "memory=" + memory +
                ", frequency=" + frequency +
                ", temp=" + temp +
                ", safeTempLimit=" + safeTempLimit +
                ", name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                ", serial='" + serial + '\'' +
                '}';
    }

    @Override
    public void overclock() {
        if (temp < safeTempLimit) {
            frequency += 100;
            temp += 15;
        } else {
            System.out.println("Nie można już podkręcić pamięci RAM");
        }
    }

    @Override
    public boolean tempCheck() {
        return temp < safeTempLimit;
    }
}
