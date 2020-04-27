import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class MovieArraylist {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Random r= new Random();
        ArrayList<String>movie= new ArrayList<>();
        String enter="";
        String movies;
        while(!(enter.equalsIgnoreCase("q"))){
            System.out.println("Please enter your favorite movie");
            movies=scanner.nextLine();
            movie.add(movies);
            System.out.println("Type q/Q if you want to quit or press Enter to coninue");
            enter=scanner.nextLine();

        }
        Collections.sort(movie);
        System.out.println("Movie you added thus far");
        for (String m:movie) {
            System.out.print(m+ " , ");

        }
        int size= r.nextInt(movie.size()-1);//starting from 0 to the size of the arraylist -1
        System.out.println("\n We suggest you to watch "+ movie.get(size));
    }
}


