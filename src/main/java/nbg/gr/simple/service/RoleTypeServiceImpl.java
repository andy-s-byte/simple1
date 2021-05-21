package nbg.gr.simple.service;

import lombok.RequiredArgsConstructor;
import nbg.gr.simple.domain.RoleType;
import nbg.gr.simple.repository.RoleTypeRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoleTypeServiceImpl extends AbstractServiceImpl<RoleType>
		implements RoleTypeService {
	private final RoleTypeRepository genderRepository;

	@Override
	public JpaRepository<RoleType, Long> getRepository() {
		return genderRepository;
	}
}
