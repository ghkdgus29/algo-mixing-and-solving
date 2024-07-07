package site.algomixingandsolving.additionalproblem;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import site.algomixingandsolving.category.Category;
import site.algomixingandsolving.member.Member;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class AdditionalProblem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String platform;
	private Integer number;
	private String title;
	private String url;
	private int completeCount;
	private Boolean banned;

	@ManyToOne
	private Member member;

	@ManyToOne
	private Category category;

}
