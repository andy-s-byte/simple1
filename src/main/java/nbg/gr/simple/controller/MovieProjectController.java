package nbg.gr.simple.controller;


import lombok.RequiredArgsConstructor;
import nbg.gr.simple.domain.MovieProject;
import nbg.gr.simple.service.BaseService;
import nbg.gr.simple.service.MovieProjectService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/movie")
public class MovieProjectController extends AbstractController<MovieProject> {
	private final MovieProjectService movieProjectService;

	@Override
	public BaseService<MovieProject, Long> getBaseService() {
		return movieProjectService;
	}
}
