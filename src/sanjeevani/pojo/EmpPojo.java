/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sanjeevani.pojo;

/**
 *
 * @author USER
 */
public class EmpPojo {

    public EmpPojo(String empId, String empName, String empDept, double empSal) {
        this.empId = empId;
        this.empName = empName;
        this.empDept = empDept;
        this.empSal = empSal;
    }
    
    public EmpPojo() {
        
    }
    
    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpDept(String empDept) {
        this.empDept = empDept;
    }

    public void setEmpSal(double empSal) {
        this.empSal = empSal;
    }

    public String getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpDept() {
        return empDept;
    }

    public double getEmpSal() {
        return empSal;
    }
    private String empId;
    private String empName;
    private String empDept;
    private double empSal;
}
