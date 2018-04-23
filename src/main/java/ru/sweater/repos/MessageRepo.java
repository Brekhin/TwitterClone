package ru.sweater.repos;

import org.springframework.data.repository.CrudRepository;
import ru.sweater.domain.Message;

import java.util.List;

/**
 * Created by Алексей on 23.04.2018.
 */
public interface MessageRepo extends CrudRepository<Message, Long> {
    List<Message> findByTag(String tag);
}
