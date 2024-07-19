package com.firstSBprogram.firstSBprogram.employeCrud;

import java.util.ArrayList;

public class employee {



    private String empName  ;
    private String  empId ;
    private String empAdd;
    private int empSal ;
    //private ArrayList<String> nameList = new ArrayList<> () ;

    employee()
    {

    }
    employee ( String empName , String empId , String empAdd , int empSal )
    {
        this.empName = empName ;
        this.empId = empId ;
        this.empAdd = empAdd ;
        this.empSal = empSal ;

    }


    // creating getters for all the properties of the class

    public String getEmpName() {
        return empName;
    }
    public String getEmpId ()
    {
        return empId ;
    }
    public String getEmpAdd()
    {
        return empAdd;
    }
    public int getEmpSal()
    {
        return empSal ;
    }


    // creating setters for all the properties of the class

    public void setEmpName ( String empName )
    {
        this.empName = empName ;

    }
    public void setEmpId ( String empId )
    {
        this.empId = empId ;
    }
    public void setEmpAdd ( String empAdd  )
    {
        this.empAdd = empAdd ;
    }
    public void setEmpSal( int empSal)
    {
        this.empSal = empSal ;
    }

//    public ArrayList<String> entireNameList()
//    {
//        return nameList ;
//    }

}
