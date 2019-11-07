package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer customerId;
	@Column(name = "firstName")
	@NotNull(message = "First Name cannot be null")
	@Size(min = 3, message = "First Name should be more than 3 characters")
	private String firstName;
	@Column(name = "lastName")
	@NotNull(message = "Last Name cannot be null")
	@Size(min = 3, message = "Last Name should be more than 3 characters")
	private String lastName;
	@Column(name = "phoneNumber")
	@NotNull(message = "Phone number cannot be null")
	@Pattern(regexp = "\\d{10}", message="Enter a 10 digit valid phone number")
	private String phone;
}
