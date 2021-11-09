package com.bridgelabzJava;
import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

	public class EmployeePayrollServiceTest {

	 @Test
	    void given4Employees_WhenWrittenToFile_ShouldMatchEmployeeEntries() {
	        EmployeePayrollData[] arrayOfEmployee = {
	                new EmployeePayrollData(101, "John McDonald", 1000000.0),
	                new EmployeePayrollData(102, "Sundar Pichai", 2000000.0),
	                new EmployeePayrollData(103, "Mark Zuckerberg", 3000000.0),
	                new EmployeePayrollData(104, "Mukesh Ambani", 5000000.0),
	        };
	        EmployeePayrollService employeePayrollService;
	        employeePayrollService = new EmployeePayrollService(Arrays.asList(arrayOfEmployee));
	        employeePayrollService.writeEmployeePayrollData(EmployeePayrollService.IOService.FILE_IO);
	        employeePayrollService.printData(EmployeePayrollService.IOService.FILE_IO);
	        long entries = ((EmployeePayrollService) employeePayrollService).countEntries(EmployeePayrollService.IOService.FILE_IO);
	        Assertions.assertEquals(4, entries);
	    }
	    @Test
	    void givenFileOnReadingFromFileShouldMatchEmployeeCount() {
	        EmployeePayrollService employeePayrollService = new EmployeePayrollService();
	        employeePayrollService.readEmployeePayrollData(EmployeePayrollService.IOService.FILE_IO);
	        long entries = ((EmployeePayrollService) employeePayrollService).countEntries(EmployeePayrollService.IOService.FILE_IO);
	        Assertions.assertEquals(4, entries);
	    }
	}