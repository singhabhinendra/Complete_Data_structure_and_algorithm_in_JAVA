import java.util.ArrayList;
import java.util.Collections;
public class ComparableSorting {
    public static void main(String[] args) {
        ArrayList<Movie> l=new ArrayList<>();
        l.add(new Movie ("Star Wars",8.7,18890));
        l.add(new Movie ("Sky force",9.0,18890));
        l.add(new Movie ("Bade miya chhote miya",8.7,18890));

// sort movies using Comparable's compareTo method by year
        Collections.sort(l);
//        Display the sorted list of movies
        System.out.println("Movies after sorting by year:");
        for(Movie m:l){
            System.out.println(m.getName() + " "+ m.getRating()+" "+m.getYear());
        }
    }

}
class Movie  implements Comparable<Movie>{
    private String n;
    private double r;
    private int y;
    public Movie(String n,double r, int y){
        this.n=n;
        this.r=r;
        this.y=y;
    }
    @Override
    public int compareTo(Movie m) {
        return this.y-m.y;
    }
    public String getName(){
        return n;
    }
    public double getRating(){
        return r;
    }
    public int getYear(){
        return y;
    }
}