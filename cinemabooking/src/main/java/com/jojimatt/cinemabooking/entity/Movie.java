package com.jojimatt.cinemabooking.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.sql.Date;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;


@Entity
@Table(name = "movies")
@Getter
@Setter
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID",nullable = false)
    private Long id;

    @Column(name="TITLE",length= 255,nullable = false)
    private String title;

    @Lob
    @Column(name="SUMMARY")
    private String summary;

    @Column(name="RELEASE_DATE", nullable = false)
    private Date releaseDate;

    @Column(name="DIRECTOR",length=300,nullable = false)
    private String director;

    @Column(name="DURATION",nullable = false)
    private Integer duration;

    @Column(name="MOVIE_LANGUAGE",length=100,nullable = false)
    private String movieLanguage;

    @Column(name="GENRE", length=50,nullable = false)
    private String genre;

    @ManyToMany
    @JoinTable(
            name = "movie_actors",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "actor_id")
    )
    private Set<Actor> actors = new HashSet<>();


    @OneToMany(mappedBy = "movie")
    private Set<Screening> screenings = new LinkedHashSet<>();

}
