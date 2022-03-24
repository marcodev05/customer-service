package com.tsk.customerservice.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;


public class CustomerRequestDTO {
		
		private String fName;
		
		@Length(min = 7, message = "minimum 7 caractères")
		private String lName;
		
		@NotBlank
		@Email(message = "verifier votre mail")
		private String email;
		
		private String address;

		public CustomerRequestDTO(String fName, String lName, String email, String address) {
			super();
			this.fName = fName;
			this.lName = lName;
			this.email = email;
			this.address = address;
		}
		
		

		public CustomerRequestDTO() {
			super();
		}



		public String getfName() {
			return fName;
		}

		public void setfName(String fName) {
			this.fName = fName;
		}

		public String getlName() {
			return lName;
		}

		public void setlName(String lName) {
			this.lName = lName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}
		
		

}
