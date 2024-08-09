package study.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.project.domain.Article;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
