package nbg.gr.simple.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "MOVIEPROJECTS")
@SequenceGenerator(name = "idGenerator", sequenceName = "PROJECTS_SEQ", initialValue = 1, allocationSize = 1)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class MovieProject extends BaseEntity {
	@NotNull
	@Column(length = 50, nullable = false, unique = true)
	private String title;


	@Column(precision = 10, scale = 2, nullable = false)
	private BigDecimal boxOffice;


	@ManyToOne(fetch = FetchType.EAGER)
	private Gender gender;
}
