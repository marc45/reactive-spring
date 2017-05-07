package daggerok.chat.webflux;

import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoClients;
import daggerok.chat.domain.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@Slf4j
@Configuration
@EnableReactiveMongoRepositories(basePackageClasses = UserRepository.class)
public class ReactiveMongoConfig extends AbstractReactiveMongoConfiguration {

  @Override
  public MongoClient mongoClient() {
    return MongoClients.create();
  }

  @Override
  protected String getDatabaseName() {
    return "reactive";
  }
}
