package nbg.gr.simple.service;

import lombok.RequiredArgsConstructor;
import nbg.gr.simple.domain.MovieProject;
import nbg.gr.simple.repository.MovieProjectRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MovieProjectServiceImpl extends AbstractServiceImpl<MovieProject>
		implements MovieProjectService {
	private final MovieProjectRepository movieProjectRepository;

	@Override
	public JpaRepository<MovieProject, Long> getRepository() {
		return movieProjectRepository;
	}
}
