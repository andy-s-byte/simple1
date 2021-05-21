package nbg.gr.simple.controller;


import lombok.RequiredArgsConstructor;
import nbg.gr.simple.domain.Participation;
import nbg.gr.simple.service.BaseService;
import nbg.gr.simple.service.ParticipationService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/participation")
public class ParticipationController extends AbstractController<Participation> {
	private final ParticipationService participationService;

	@Override
	public BaseService<Participation, Long> getBaseService() {
		return participationService;
	}
}
