package pl.javastart.task.components;

import pl.javastart.task.exceptions.*;

public class Processor extends OverclockableComponent {

    private final int tempIncreaseStep = 10;

    public Processor(String name, String producer, String serial, int frequency, int temp, int safeTempLimit) {
        super(name, producer, serial, frequency, temp, safeTempLimit);
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

}
