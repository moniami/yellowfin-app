package com.yellowfin.project.user;
import jakarta.persistence.*;
import java.util.Objects;
@Entity
@Table(name = "users")
class User {

    private @Id @GeneratedValue Long id;
    private String name;
    private String email;
    private String password;

    User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public User() {

    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof User))
            return false;
        User User = (User) o;
        return Objects.equals(this.id, User.id) && Objects.equals(this.name, User.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.email);
    }

    @Override
    public String toString() {
        return "User{" + "id=" + this.id + ", name='" + this.name + '\'' +'}';
    }
}
