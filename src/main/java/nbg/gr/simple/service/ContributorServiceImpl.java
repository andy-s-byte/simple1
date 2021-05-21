package nbg.gr.simple.service;

import lombok.RequiredArgsConstructor;
import nbg.gr.simple.domain.Contributor;
import nbg.gr.simple.repository.ContributorRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ContributorServiceImpl extends AbstractServiceImpl<Contributor> implements ContributorService {
	private final ContributorRepository contributorRepository;

	@Override
	public JpaRepository<Contributor, Long> getRepository() {
		return contributorRepository;
	}
}
