package persianapp.repository;

import java.util.List;
import java.util.Optional;

import persianapp.model.Chapter;
public class ChapterRepository {
	void save(Chapter chapter);

    Optional<Chapter> findById(String id);

    List<Chapter> findAll();

    void deleteById(String id);
}
