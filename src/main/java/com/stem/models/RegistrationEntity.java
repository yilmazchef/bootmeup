package com.stem.models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "bootcamp_registrations")
@Entity
@Getter
@Setter
@RequiredArgsConstructor
@ToString(onlyExplicitlyIncluded = true)
public class RegistrationEntity {

    @EmbeddedId
    private RegistrationIdEntity id;

    public RegistrationEntity withId(RegistrationIdEntity id) {
        this.id = id;
        return this;
    }
}