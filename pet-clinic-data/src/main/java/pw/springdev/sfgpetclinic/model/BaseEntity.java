package pw.springdev.sfgpetclinic.model;

import java.io.Serializable;

/**
 * Created by FedorD on 2020-03-14
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
