package be.ucll.controller;

import be.ucll.service.EventService;
import be.ucll.model.Event;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/events")
public class EventRestController {

    private EventService eventService;

    public EventRestController(EventService eventService){
        this.eventService=eventService;
    }
    @PostMapping
    public Event saveEvent(@Valid @RequestBody Event event){
        return eventService.createEvent(event);
    }

    @GetMapping
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }
}
