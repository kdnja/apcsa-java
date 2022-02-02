public class Movie {
    private String title;
    private double duration;
    private int rating;

    public Movie(String title, double duration) {
        this.title = title;
        this.duration = duration;
        this.rating = 0;
    }

    /*** Accessor methods ***/
    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    public int getRating() {
        return rating;
    }

    public String toString() {
        String info = "\"" + title + "\", length is " + duration + " hours";
        if (rating != 0) {
            info += ", rating is " + rating;
        }
        return info;
    }

    /*** Mutator methods ***/
    public void setTitle(String t) {
        title = t;
    }

    public void setDuration(double d) {
        duration = d;
    }

    public void adjustRating(int r) {
        // if rating + r is between 0 and 10 then change the rating
        if (!(rating + r > 10 || rating + r < 0)) {
            rating += r;
        }
    }

    public boolean equals(Movie m) {
        return (m.title.equals(this.title) && m.duration == this.duration);
    }
}
