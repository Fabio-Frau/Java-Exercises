public class Movie {

    private String title;
    private Double rating;
    private boolean starred;

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", rating=" + rating +
                ", starred=" + starred +
                '}';
    }

    public Movie(String title, Double rating, boolean starred) {
        this.title = title;
        this.rating = rating;
        this.starred = starred;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public boolean isStarred() {
        return starred;
    }

    public void setStarred(boolean starred) {
        this.starred = starred;
    }
}
