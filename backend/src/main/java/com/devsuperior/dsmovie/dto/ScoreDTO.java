package com.devsuperior.dsmovie.dto;

public class ScoreDTO {

    private Long movieId;
    private String email;
    private Double score;

    public ScoreDTO() {
    }

    public Long getMovieId() {
        return this.movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getScore() {
        return this.score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

}
