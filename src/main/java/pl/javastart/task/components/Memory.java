package pl.javastart.task.components;

public class Memory extends OverclockableComponent  {
    private final int memorySize;

    private static final int TEMP_INCREASE_STEP = 15;

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

    @Override
    int getTempIncreaseStep() {
        return TEMP_INCREASE_STEP;
    }
}
