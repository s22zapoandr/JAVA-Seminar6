package lv.venta.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name = "Course Table")
@Entity
public class Course {
	//variables
	@Setter(value = AccessLevel.NONE)
	@Column(name = "Idc")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idc;
	
	@NotNull
	@Pattern(regexp = "[A-Z{1}[1-z]+")
	@Size(min = 2, max = 10)
	@Column(name = "Title")
	private String Title;
	
	@Min(1)    
	@Max(20)
	@Column(name = "Credit Points")
	private int creditpoints;
	
	@OneToOne
	@JoinColumn(name = "Idp") // need to specify title of variable
	private Professor professor;
	


}