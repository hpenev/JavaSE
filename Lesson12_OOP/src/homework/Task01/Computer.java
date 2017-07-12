package homework.Task01;

import java.util.Calendar;

public class Computer {
    private int year;
    private double price;
    private boolean isNotebook;
    private double hardDiskMemoty;
    private double freeMemory;
    private String operationSystem;

    public Computer(int year, double price, double hardDiskMemory, double freeMemory, String operationSystem,
	    boolean isNotebook) {
	setYear(year);
	setPrice(price);
	setHardDiskMemoty(hardDiskMemory);
	setFreeMemory(freeMemory);
	setOperationSystem(operationSystem);
	this.isNotebook = isNotebook;
    }

    private void setYear(int year) {
	int currentYear = Calendar.getInstance().get(Calendar.YEAR);
	if (year < 1900 || year > currentYear) {
	    System.out.println("Year is not correct!");
	} else {
	    this.year = year;
	}
    }

    private void setPrice(double price) {
	if (price < 0) {
	    System.out.println("Price cannot be negative");
	} else {
	    this.price = price;
	}
    }

    private void setHardDiskMemoty(double hardDiskMemoty) {
	if (hardDiskMemoty < 0) {
	    System.out.println("Hard Disk Memory cannot be negative number");
	} else {
	    this.hardDiskMemoty = hardDiskMemoty;
	}
    }

    private void setFreeMemory(double freeMemory) {
	if (freeMemory > this.hardDiskMemoty) {
	    System.out.println("Free memory cannot be greater than hard disk memory");
	} else {
	    this.freeMemory = freeMemory;
	}
    }

    private void setOperationSystem(String operationSystem) {
	if (operationSystem.toLowerCase().contains("windows") ||
		operationSystem.toLowerCase().contains("linux") ||
		operationSystem.toLowerCase().contains("mac")) {
	    this.operationSystem = operationSystem;
	} else {
	    System.out.printf("Cannot set %s as OS%n", operationSystem);
	}
    }

    void changeOperationSystem(String newOperationSystem) {
	setOperationSystem(newOperationSystem);
    }

    void useMemory(double memory) {
	if (this.freeMemory < memory) {
	    System.out.println("Not enough free memory!");
	} else {
	    this.freeMemory -= memory;
	}
    }

    @Override
    public String toString() {
	StringBuilder sb = new StringBuilder();

	sb.append("Computer:\n");
	sb.append("year = " + year + "\n");
	sb.append("price = " + price + "\n");
	sb.append("isNotebook = " + isNotebook + "\n");
	sb.append("HardDiskMemory = " + hardDiskMemoty + "\n");
	sb.append("FreeMemory = " + freeMemory + "\n");
	sb.append("OperationSystem = " + operationSystem + "\n");

	return sb.toString();
    }

}
