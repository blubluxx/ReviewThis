package models.contracts;


import java.util.Set;

public interface IShowComponent {
    Set<IReview> getReviews();

    Set<ICastMember> getCast();

    String getTitle();

    String getGenre();

    double getRating();

    void addReview(IReview review);

    void removeReview(IReview review);

}
