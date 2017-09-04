package employees;

import departments.Department;

public class JuniorEmployee extends Employee {
    private static final double JUNIOR_SALLARY = 1000;
    private static final int STEPEN_JUNIOR = 7;

    public JuniorEmployee(String name, Department department) {
	super(name, department);
	this.rank = 1;
	this.sallary = JUNIOR_SALLARY;
	this.stepenNaEmployee = STEPEN_JUNIOR;
    }

    @Override
    public boolean isJunior() {
	return true;
    }

}
