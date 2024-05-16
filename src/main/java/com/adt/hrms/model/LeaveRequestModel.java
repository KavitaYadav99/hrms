package com.adt.hrms.model;

import java.util.List;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(catalog = "EmployeeDB", schema = "employee_schema", name = "LeaveRequest")
public class LeaveRequestModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "leaveid", columnDefinition = "serial")
	private Integer leaveid;

	@Column(name = "empid")
	private Integer empid;

	@Column(name = "status")
	private String status;

	@ElementCollection
	@CollectionTable(catalog = "EmployeeDB", schema = "employee_schema", name = "LEAVE_DATES", joinColumns = @JoinColumn(name = "LEAVE_ID"))
	@Column(name = "leavedate")
	private List<String> leavedate;

}
