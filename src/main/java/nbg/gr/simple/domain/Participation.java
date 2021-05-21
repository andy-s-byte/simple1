package nbg.gr.simple.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "PARTICIPATIONS")
@SequenceGenerator(name = "idGenerator", sequenceName = "PARTICIPATIONS_SEQ", initialValue = 1, allocationSize = 1)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Participation extends BaseEntity {
	@NotNull
//	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@ManyToOne(optional = false)
	private Contributor contributor;

	@NotNull
//	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@ManyToOne(optional = false)
	private MovieProject movieProject;

	@NotNull
//	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@ManyToOne(optional = false)
	private RoleType roleType;
}
