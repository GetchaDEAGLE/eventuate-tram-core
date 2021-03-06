package io.eventuate.tram.events.publisher;

import io.eventuate.tram.messaging.producer.MessageProducer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TramEventsPublisherConfiguration {

  @Bean
  public DomainEventPublisher domainEventPublisher(MessageProducer messageProducer) {
    return new DomainEventPublisherImpl(messageProducer);
  }
}
