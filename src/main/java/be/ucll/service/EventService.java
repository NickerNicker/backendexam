package be.ucll.service;

import be.ucll.model.Event;
import be.ucll.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {
    private EventRepository eventRepository;
    @Autowired
    public EventService(EventRepository eventRepository){
        this.eventRepository = eventRepository;
    }
    public Event createEvent(Event event){
         eventRepository.save(event);
         return event;
    }

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }
}
