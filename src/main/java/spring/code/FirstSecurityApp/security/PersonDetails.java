package spring.code.FirstSecurityApp.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import spring.code.FirstSecurityApp.models.Person;

import java.util.Collection;

public class PersonDetails implements UserDetails {
    private final Person person;

    public PersonDetails(Person person) {
        this.person = person;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null; // roles. returns a collection of authorities
    }

    @Override
    public String getPassword() {
        return this.person.getPassword(); // returns password of model
    }

    @Override
    public String getUsername() {
        return this.person.getUsername(); // returns username of model
    }

    @Override
    public boolean isAccountNonExpired() {
        return true; // I guess for cookies
    }

    @Override
    public boolean isAccountNonLocked() {
        return true; // is not blocked
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true; // is password okay
    }

    @Override
    public boolean isEnabled() {
        return true; // is an account works
    }

    // to get data about authenticated user (person)
    public Person getPerson() {
        return this.person;
    }
}
