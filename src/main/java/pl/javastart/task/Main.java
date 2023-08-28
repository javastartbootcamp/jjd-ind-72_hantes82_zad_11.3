package pl.javastart.task;

import pl.javastart.task.components.*;
import pl.javastart.task.exceptions.*;

public class Main {

    public static void main(String[] args) {
        try {
            Processor processor1 = new Processor("Pentium", "Intel", "INDSW734",
                    2000, 80, 100);
            Memory memory1 = new Memory("DRAM", "Kingston", "ITKD83762", 256, 1500,
                    20, 30);
            HardDrive hardDrive1 = new HardDrive("Bolt", "WD", "FGDSDFD9384", 25.94);
            Computer computer1 = new Computer(processor1, memory1, hardDrive1);
            computer1.getProcessor().overclock();
//            computer1.getProcessor().overclock();
//            computer1.getProcessor().overclock();
//            computer1.getMemory().overclock();
//            computer1.getMemory().overclock();
        } catch (StringsIncorrectException e) {
            System.err.println(e.getMessage());
        } catch (TempIncorrectException e) {
            System.err.println(e.getMessage());
        } catch (CriticalTempException e) {
            System.err.println(e.getMessage());
        }
    }
}
