package pw.springdev.sfgpetclinic.model;

/**
 * Created by FedorD on 2020-03-26
 */
public class Speciality extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
