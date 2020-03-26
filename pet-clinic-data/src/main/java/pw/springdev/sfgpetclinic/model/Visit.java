package pw.springdev.sfgpetclinic.model;

import java.time.LocalDate;

/**
 * Created by FedorD on 2020-03-26
 */
public class Visit extends BaseEntity{

    private LocalDate date;
    private String description;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
