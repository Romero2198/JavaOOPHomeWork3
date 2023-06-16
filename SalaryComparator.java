package Part3.Homework;

import java.util.Comparator;

public class SalaryComparator<E> extends Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return Double.compare(o2.calculateSalary(), o1.calculateSalary());
    }
}
