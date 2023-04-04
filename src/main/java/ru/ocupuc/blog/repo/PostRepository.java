package ru.ocupuc.blog.repo;

import org.springframework.data.repository.CrudRepository;
import ru.ocupuc.blog.models.Post;

public interface PostRepository extends CrudRepository<Post,Long> {
}
