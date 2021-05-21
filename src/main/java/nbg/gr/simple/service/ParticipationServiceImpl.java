package nbg.gr.simple.service;

import lombok.RequiredArgsConstructor;
import nbg.gr.simple.domain.Participation;
import nbg.gr.simple.repository.ParticipationRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ParticipationServiceImpl extends AbstractServiceImpl<Participation>
		implements ParticipationService {
	private final ParticipationRepository participationRepository;

	@Override
	public JpaRepository<Participation, Long> getRepository() {
		return participationRepository;
	}
/*
	@Override
	public List<AllMoviesDescrDto> findAllWithGender() {
		return participationRepository.findAllWithGender();
	}
*/
}
