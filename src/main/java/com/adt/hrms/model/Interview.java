package com.adt.hrms.model;

import java.time.LocalDate;

import com.adt.hrms.ui.InterviewIdRound;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@IdClass(InterviewIdRound.class)
@Table(catalog = "EmployeeDB", schema = "employee_schema", name = "interview")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Interview {

	// PK
	@Id
	@Column(name = "interview_id")
	private Integer interviewId;

	// PK
	@Id
	@Column(name = "Rounds")
	private Integer rounds;

	// FK
	@OneToOne
	@JoinColumn(name = "candidate_id")
	private InterviewCandidateDetails candidate_id;

	// FK
	@OneToOne
	@JoinColumn(name = "tech_id")
	private AVTechnology tech_id;

	// FK
	@OneToOne
	@JoinColumn(name = "position_id")
	private PositionModel position_id;

	@Column(name = "Marks")
	private Integer marks;

	@Column(name = "Communication")
	private Integer communication;

	@Column(name = "Enthusiasm")
	private Integer enthusiasm;

	@Column(name = "Notes")
	private String notes;

	@Column(name = "Offer_released")
	private Boolean offerReleased;

	@Column(name = "WorkExInYears")
	private Double workExInYears;

	@Column(name = "InterviewerName")
	private String interviewerName;

	@Column(name = "CandidateName")
	private String candidateName;

	@Column(name = "Source")
	private String source;

	@Column(name = "OfferAccepted")
	private Boolean offerAccepted;

	@Column(name = "Type")
	private String type;

	@Column(name = "interview_date")
	private LocalDate date;
	
	@Column(name = "client_name")
	private String clientName;

	//HRMS-102 - start
	@Column(name = "status")
	private String status;

//	@Column(name = "screening_round")
//	private Boolean screeningRound;
//
//	@Column(name = "selected")
//	private Boolean selected;
	//HRMS-102 - end
}
