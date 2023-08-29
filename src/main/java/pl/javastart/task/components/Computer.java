package pl.javastart.task.components;

public class Computer {
    private Processor processor;
    private Memory memory;
    private HardDrive hardDrive;

    public Computer(Processor processor, Memory memory, HardDrive hardDrive) {
        this.processor = processor;
        this.memory = memory;
        this.hardDrive = hardDrive;
    }

    public Processor getProcessor() {
        return processor;
    }

    void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Memory getMemory() {
        return memory;
    }

    void setMemory(Memory memory) {
        this.memory = memory;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    void setHarddrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor=" + processor +
                ", memory=" + memory +
                ", hardDrive=" + hardDrive +
                '}';
    }
}
