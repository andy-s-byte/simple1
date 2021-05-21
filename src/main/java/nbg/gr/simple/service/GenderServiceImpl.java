package nbg.gr.simple.service;

import lombok.RequiredArgsConstructor;
import nbg.gr.simple.domain.Gender;
import nbg.gr.simple.repository.GenderRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GenderServiceImpl extends AbstractServiceImpl<Gender>
		implements GenderService {
	private final GenderRepository genderRepository;

	@Override
	public JpaRepository<Gender, Long> getRepository() {
		return genderRepository;
	}
}
