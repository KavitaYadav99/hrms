package com.adt.hrms.model;

import jakarta.persistence.*;
import org.hibernate.annotations.Proxy;

import lombok.Data;


@Entity
@Table(catalog = "hrms_sit", schema = "payroll_schema", name = "emp_payroll_details")
@Proxy(lazy = false)
@Data
public class EmpPayrollDetails {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "emp_payroll_details_seq")
    @SequenceGenerator(name = "emp_payroll_details_seq", allocationSize = 1, schema = "payroll_schema")
    private Integer id;

    @Column(name = "salary")
    private Double salary;

    @Column(name = "bank_name")
    private String bankName;

    @Column(name = "designation")
    private String designation;

    @Column(name = "JoiningDate")
    private String joinDate;

    @Column(name = "account_number")
    private String accountNumber;

    @Column(name = "ifsc_code")
    private String ifscCode;


    @OneToOne
    @JoinColumn(name = "empId",referencedColumnName = "EMPLOYEE_ID", nullable = false, insertable = false, updatable = false)
    private Employee employee;
    private int empId;
}
