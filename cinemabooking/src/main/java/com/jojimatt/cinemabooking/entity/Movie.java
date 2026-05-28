package com.jojimatt.cinemabooking.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import java.sql.Date;


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




}
