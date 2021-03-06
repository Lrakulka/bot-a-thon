package ca.canadiantire.nine.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @author Victor Letunovsky (@vletunovsky)
 */
@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String email;

    @ManyToOne(targetEntity = Store.class)
    private Store store;

    public User() {
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(final Store store) {
        this.store = store;
    }
}
