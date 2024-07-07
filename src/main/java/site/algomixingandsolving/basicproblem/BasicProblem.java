package site.algomixingandsolving.basicproblem;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import site.algomixingandsolving.category.Category;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class BasicProblem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String platform;
	private Integer number;
	private String title;
	private String url;

	@ManyToOne
	private Category category;

}
