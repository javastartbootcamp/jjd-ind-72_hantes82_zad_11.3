package pl.javastart.task.components;

public class HardDrive extends Component {
    private double capacity;

    public HardDrive(String name, String producer, String serial, double capacity) {
        super(name, producer, serial);
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HardDrive hardDrive)) {
            return false;
        }
        return capacity == hardDrive.capacity;
    }

    @Override
    public String toString() {
        return "HardDrive{" +
                "capacity=" + capacity +
                ", name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                ", serial='" + serial + '\'' +
                '}';
    }
}
