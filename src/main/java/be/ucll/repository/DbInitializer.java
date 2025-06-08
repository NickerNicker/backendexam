package be.ucll.repository;

import be.ucll.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import be.ucll.model.User;
import jakarta.annotation.PostConstruct;

import java.time.LocalDate;

@Component
public class DbInitializer {

    private UserRepository userRepository;
    private EventRepository eventRepository;

    @Autowired
    public DbInitializer(UserRepository userRepository, EventRepository eventRepository) {
        this.userRepository = userRepository;
        this.eventRepository=eventRepository;
    }

    @PostConstruct
    public void initialize() {

        User user1 = new User("John Doe", 25, "john.doe@ucll.be");
        User user2 = new User("Jane Toe", 30, "jane.toe@ucll.be");

        userRepository.addUser(user1);
        userRepository.addUser(user2);

        Event event1 =  new Event("uclllllll",
                LocalDate.of(2024,6,13),
                LocalDate.of(2024,6,15));

        eventRepository.save(event1);

    }
}
