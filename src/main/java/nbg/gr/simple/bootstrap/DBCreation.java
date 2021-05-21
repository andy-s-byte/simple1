package nbg.gr.simple.bootstrap;


import lombok.RequiredArgsConstructor;
import nbg.gr.simple.domain.*;
import nbg.gr.simple.service.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@Profile("makedb")
@RequiredArgsConstructor
public class DBCreation implements CommandLineRunner {
    private final ContributorService contributorService;
    private final GenderService genderService;
    private final RoleTypeService roleTypeService;
    private final MovieProjectService movieProjectService;
    private final ParticipationService participationService;


    @Override
    public void run(String... args) {
        Contributor xatzixristos = Contributor.builder()
                .firstname("Kwstas").lastname("Xaztixristos").birthYear(1921).build();
        contributorService.save(xatzixristos);
        Contributor kostantaras = Contributor.builder().firstname("Lampros").lastname("Kwnstantaras").
                birthYear(1913).build();
        contributorService.save(kostantaras);

        Contributor sakelarios = Contributor.builder().firstname("Alekos").lastname("Sakelarios").
                birthYear(1913).build();
        contributorService.save(sakelarios);

        Gender comedy = genderService.save(Gender.builder().description("Komodia").build());
        Gender drama = genderService.save(Gender.builder().description("Drama").build());
        Gender adventure = genderService.save(Gender.builder().description("Peripeteia").build());

        RoleType actor = roleTypeService.save(RoleType.builder().description("Actor").build());
        RoleType director = roleTypeService.save(RoleType.builder().description("Director").build());
        RoleType prodcer = roleTypeService.save(RoleType.builder().description("Producer").build());

        MovieProject mpalanter = MovieProject.builder().title("O Lamproukos mpalanter")
                .boxOffice(BigDecimal.valueOf(10000)).gender(comedy).build();
        movieProjectService.save(mpalanter);
        MovieProject palikaria = MovieProject.builder().title("Kati kourasmena Palikaria")
                .boxOffice(BigDecimal.valueOf(10000)).gender(comedy).build();
        movieProjectService.save(palikaria);
        MovieProject trianta = MovieProject.builder().title("Ti trianta ti saranta ti peninta")
                .boxOffice(BigDecimal.valueOf(10000)).gender(comedy).build();
        movieProjectService.save(trianta);
        MovieProject hlias = MovieProject.builder().title("O Hlias toy 16ou")
                .boxOffice(BigDecimal.valueOf(10000)).gender(comedy).build();
        movieProjectService.save(hlias);
        MovieProject thumios = MovieProject.builder().title("O Thumios ta xei 400")
                .boxOffice(BigDecimal.valueOf(10000)).gender(comedy).build();
        movieProjectService.save(thumios);
        MovieProject pterarxos = MovieProject.builder().title("O Kyrios Pterarxos")
                .boxOffice(BigDecimal.valueOf(10000)).gender(comedy).build();
        movieProjectService.save(pterarxos);


        participationService.save(Participation.builder().roleType(actor).movieProject(mpalanter).contributor(kostantaras).build());
        participationService.save(Participation.builder().roleType(actor).movieProject(palikaria).contributor(kostantaras).build());
        participationService.save(Participation.builder().roleType(actor).movieProject(trianta).contributor(kostantaras).build());
        participationService.save(Participation.builder().roleType(actor).movieProject(hlias).contributor(xatzixristos).build());
        participationService.save(Participation.builder().roleType(actor).movieProject(thumios).contributor(xatzixristos).build());
        participationService.save(Participation.builder().roleType(actor).movieProject(pterarxos).contributor(xatzixristos).build());
        participationService.save(Participation.builder().roleType(actor).movieProject(pterarxos).contributor(kostantaras).build());
        participationService.save(Participation.builder().roleType(director).movieProject(pterarxos).contributor(sakelarios).build());
    }
}
