
import java.lang.String;

public class Motorcycle {
	private String vehicleIdentificationNumber;
	private int engineSize;
	private double invoicePrice;

	public String getVehicleIdentificationNumber() {
		return vehicleIdentificationNumber;
	}

	public void setVehicleIdentificationNumber(String vin) {
		vehicleIdentificationNumber = vin;
	}

	public int getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(int engineSize) {
		// Round the engine size to the nearest 10's of cc
		this.engineSize = (int) (Math.round(engineSize / 10.0) * 10);
	}

	public double getInvoicePrice() {
		return invoicePrice;
	}

	public void setInvoicePrice(double invoicePrice) {
		this.invoicePrice = invoicePrice;
	}

	// the invoice price to 2 decimal places
	public String toString() {
		return String.format("%s, %d cc, $%.2f", vehicleIdentificationNumber, engineSize, invoicePrice);
	}
}
