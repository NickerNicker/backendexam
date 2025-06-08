package be.ucll.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

@Entity
@Table(name="event")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Event name is required.")
    private String name;
    @NotNull(message = "errrrr")
    private LocalDate startDate;
    @NotNull(message = "errrrr")
    private LocalDate endDate;

    protected Event(){};
    public Event (String name, LocalDate startDate, LocalDate endDate){
        setName(name);
        setStartDate(startDate);
        setEndDate(endDate);
    }



    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setName(String name) {
        this.name = name;
    }


    public LocalDate getEndDate() {
        return endDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public String getName() {
        return name;
    }

    public Long getId(){
        return id;
    }
}
