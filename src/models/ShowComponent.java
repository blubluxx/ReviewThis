package models;

import enums.Genre;
import models.contracts.ICastMember;
import models.contracts.IReview;
import models.contracts.IShowComponent;

import java.util.HashSet;
import java.util.Set;

public abstract class ShowComponent implements IShowComponent {
    protected String title;
    protected Genre genre;
    protected double rating;
    protected final Set<IReview> reviews;
    protected final Set<ICastMember> cast;

    public ShowComponent(String title, Genre genre, double rating) {
        setTitle(title);
        this.genre = genre;
        this.rating = rating;
        this.reviews = new HashSet<>();
        this.cast = new HashSet<>();
    }

    protected void setTitle(String title) {
        validateStringLength(2, 30, title, "Title");
        this.title = title;
    }

    protected void validateStringLength(int min, int max, String value, String param) {
        if (value.length() < min || value.length() > max) {
            throw new IllegalArgumentException(
                    String.format(
                            "%s needs to be between %d and %d characters long.",
                            param, min, max
                    )
            );
        }
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public String getGenre() {
        return this.genre.toString();
    }

    @Override
    public double getRating() {
        return this.rating;
    }

    @Override
    public Set<IReview> getReviews() {
        return this.reviews;
    }

    @Override
    public Set<ICastMember> getCast() {
        return this.cast;
    }

    @Override
    public void addReview(IReview review) {
        this.reviews.add(review);
    }

    @Override
    public void removeReview(IReview review) {
        if (!this.getReviews().contains(review)) {
            throw new IllegalArgumentException("Review not found.");
        }
        this.reviews.remove(review);
    }

}
