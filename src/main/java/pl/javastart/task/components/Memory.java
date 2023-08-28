package pl.javastart.task.components;

import pl.javastart.task.exceptions.*;

public class Memory extends OverclockableComponent  {
    private final int memorySize;

    private final int tempIncreaseStep = 15;

    public Memory(String name, String producer, String serial, int frequency, int temp, int safeTempLimit, int memorySize) {
        super(name, producer, serial, frequency, temp, safeTempLimit);
        this.memorySize = memorySize;

    }

    @Override
    public String toString() {
        return "Memory{" +
                "memory=" + memorySize +
                ", frequency=" + frequency +
                ", temp=" + temp +
                ", safeTempLimit=" + safeTempLimit +
                ", name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                ", serial='" + serial + '\'' +
                '}';
    }

}
