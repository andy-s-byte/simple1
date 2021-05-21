package nbg.gr.simple.repository;


import nbg.gr.simple.domain.MovieProject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieProjectRepository extends JpaRepository<MovieProject, Long> {
}
