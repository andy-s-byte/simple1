package nbg.gr.simple.repository;


import nbg.gr.simple.domain.Participation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParticipationRepository extends JpaRepository<Participation, Long> {
/*
    @Query(name = "Participation.findAllWithGender", nativeQuery = true)
    List<AllMoviesDescrDto> findAllWithGender();
*/
}
