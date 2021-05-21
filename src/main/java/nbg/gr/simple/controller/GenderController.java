package nbg.gr.simple.controller;


import lombok.RequiredArgsConstructor;
import nbg.gr.simple.domain.Gender;
import nbg.gr.simple.service.BaseService;
import nbg.gr.simple.service.GenderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/gender")
public class GenderController extends AbstractController<Gender> {
	private final GenderService genderService;

	@Override
	public BaseService<Gender, Long> getBaseService() {
		return genderService;
	}
}
