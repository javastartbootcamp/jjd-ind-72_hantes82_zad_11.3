package pl.javastart.task.components;

import pl.javastart.task.exceptions.*;

abstract class OverclockableComponent extends Component implements Overclockable {
    protected int frequency;
    protected int temp;
    protected int safeTempLimit;

    public OverclockableComponent(String name, String producer, String serial, int frequency, int temp, int safeTempLimit) {
        super(name, producer, serial);
        this.frequency = frequency;
        this.safeTempLimit = safeTempLimit;
        setTemp(temp);
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

    abstract int getTempIncreaseStep();

    public void overclock() {
        if (temp <= safeTempLimit - getTempIncreaseStep()) {
            frequency += FREQUENCY_INCREASE_STEP;
            temp += getTempIncreaseStep();
        } else {
            throw new CriticalTempException("Pamięć RAM");
        }
    }

    private boolean tempCheck(int temp) {
        return temp < safeTempLimit;
    }
}
