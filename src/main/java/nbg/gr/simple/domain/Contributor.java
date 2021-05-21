package nbg.gr.simple.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "CONTRIBUTORS")
@SequenceGenerator(name = "idGenerator", sequenceName = "CONTRIBUTOR_SEQ", initialValue = 1, allocationSize = 1)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Contributor extends BaseEntity {
	@NotNull
	@Column(length = 20, nullable = false)
	private String firstname;

	@NotNull
	@Column(length = 30, nullable = false)
	private String lastname;

	private Integer birthYear;
}
