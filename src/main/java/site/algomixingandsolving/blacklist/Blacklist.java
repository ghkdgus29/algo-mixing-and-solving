package site.algomixingandsolving.blacklist;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import site.algomixingandsolving.basicproblem.BasicProblem;
import site.algomixingandsolving.member.Member;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Blacklist {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer blacklist;

	@ManyToOne
	private Member member;

	@ManyToOne
	private BasicProblem basicProblem;

}
