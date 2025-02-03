import java.util.ArrayList;

public class ComparatorSorting {
    public static void main(String[] args) {
        ArrayList<Movie1> l =new ArrayList<>();
        l.add(new Movie1 ("llb 3.0",8.9,1977));
        l.add(new Movie1 ("Stree 2.0",9.9,1977));
        l.add(new Movie1 ("chandu 8.0",8.3,1977));
    }
}
class Movie1 implements Comparable<Movie1>{
    private String movieName;
    private double rating;
    private int year;
    public Movie1(String n,double r, int y){
        this.movieName=n;
        this.rating=r;
        this.year=y;
    }
    @Override
    public int compareTo(Movie1 o) {
        return this.year-o.year;
    }
    public int getName(){
        return year;
    }
    public double getRating(){
        return rating;
    }
    public int getYear(){
        return year;
    }
}

