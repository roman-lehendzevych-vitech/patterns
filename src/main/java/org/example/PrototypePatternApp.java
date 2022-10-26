package org.example;

import org.example.patterns.prototype.Employees;

import java.util.List;

public class PrototypePatternApp {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employees employees = new Employees();
        employees.loadData();

        Employees employeesNew = (Employees) employees.clone();
        Employees employeesNew1 = (Employees) employees.clone();
        List<String> list = employeesNew.getEmpList();
        list.add("Mykola");
        List<String> list1 = employeesNew1.getEmpList();
        list1.remove("Black");

        System.out.println("employees List: " + employees.getEmpList());
        System.out.println("employeesNew List: " + list);
        System.out.println("employeesNew1 List: " + list1);
    }
}
