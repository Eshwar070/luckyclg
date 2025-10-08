package com.flmfoods.models;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Student {

	@Entity
	@Table(name = "students")
	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	@Builder
	public class Restaurant {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long studentId;
		
		private String studentName;
		
		private String phoneNum;
		
		private double marks;
		
	}

		
	}
