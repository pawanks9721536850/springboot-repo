package com.firstSBprogram.firstSBprogram.employeCrud;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employeedata")
public class employeeController  {

    employee emp ;

    @GetMapping("{empId}")
    public employee getEmployeeDetails ( String empId )
    {
       // return new employee( "Pawan" , "C1", "Noida" , 500 );
        return emp ;
    }

    @PostMapping
    public String createEmployee (@RequestBody employee emp )
    {
        this.emp  = emp ;

        return "employee created Successfully" ;
    }

    @PutMapping
    public String updateEmployee (@RequestBody employee emp )
    {
        this.emp  = emp ;
        return "employee updated Successfully" ;
    }

    @DeleteMapping("{empId}")
    public String deleteEmployee (String empId )
    {
        this.emp  = null ;
        return "employee deleted Successfully" ;
    }

}
