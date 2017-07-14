package lesson14_homework.Task01;

import java.util.Calendar;

public class Computer {
    private boolean isNotebook;
    private String operationSystem;
    private int year;
    private double price;
    private double hardDiskMemory;
    private double freeMemory;

    Computer() {
	this.isNotebook = false;
	this.operationSystem = "Win XP";
    }

    Computer(int year, double price, double hardDiskMemory, double freeMemory) {
	this();
	setYear(year);
	setPrice(price);
	setHardDiskMemory(hardDiskMemory);
	setFreeMemory(freeMemory);
    }

    Computer(int year, double price, boolean isNotebook, double hardDiskMemory, double freeMemory,
	    String operationSystem) {
	this(year, price, hardDiskMemory, freeMemory);
	setIsNotebook(isNotebook);
	setOperationSystem(operationSystem);
    }

    int comparePrice(Computer c) {
	if (this.getPrice() > c.getPrice()) {
	    return -1;
	} else if (this.getPrice() < c.getPrice()) {
	    return 1;
	} else {
	    return 0;
	}
    }

    private void setIsNotebook(boolean isNotebook) {
	this.isNotebook = isNotebook;
    }

    private void setOperationSystem(String operationSystem) {
	if (operationSystem != null && !operationSystem.isEmpty()) {
	    this.operationSystem = operationSystem;
	} else {
	    System.out.println("Not valid OS");
	}
    }

    private void setYear(int year) {
	if (year > 1900 && year <= Calendar.getInstance().get(Calendar.YEAR)) {
	    this.year = year;
	} else {
	    System.out.println("Wrong year");
	}
    }

    private double getPrice() {
	return price;
    }

    private void setPrice(double price) {
	if (price > 0) {
	    this.price = price;
	} else {
	    System.out.println("Price shoud be more than 0");
	}
    }

    private void setHardDiskMemory(double hardDiskMemory) {
	if (hardDiskMemory > 0) {
	    this.hardDiskMemory = hardDiskMemory;
	} else {
	    System.out.println("Hard disk memory should be more than 0");
	}
    }

    private void setFreeMemory(double freeMemory) {
	if (freeMemory < this.hardDiskMemory) {
	    this.freeMemory = freeMemory;
	} else {
	    System.out.println("There isn't so much memory at all");
	}
    }
}
