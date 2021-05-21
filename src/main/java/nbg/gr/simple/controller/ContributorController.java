package nbg.gr.simple.controller;


import lombok.RequiredArgsConstructor;
import nbg.gr.simple.domain.Contributor;
import nbg.gr.simple.service.BaseService;
import nbg.gr.simple.service.ContributorService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/contributor")
public class ContributorController extends AbstractController<Contributor> {
	private final ContributorService contributorService;

	@Override
	public BaseService<Contributor, Long> getBaseService() {
		return contributorService;
	}
}
