package com.dev.employee.dto;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {

    private Long id;
    private String name;
    private String department;

}
