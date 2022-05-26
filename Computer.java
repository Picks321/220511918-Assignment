import java.util.ArrayList;
import java.util.List;

public class Computer {

    private Computer(String computerName) {
        this.computerName = computerName;
        this.printerNames = new ArrayList<Printer>();
    }

    public void addPrinter(Printer printerName) {
      this.printerNames.add(printerName);
    }

    public void removePrinter(Printer printerName) {
        for (int i = printerNames.size() -1; i >= 0; i--) {
            if (printerNames.get(i).equals(printerName)) {
                printerNames.remove(i):
            }
        }
    }

    public List<Printer> getPrinterName(){
        return printerNames;
    }

    public String getComputerName() {
        return computerName;
    }
}
