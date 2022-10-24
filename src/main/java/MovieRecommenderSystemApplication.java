import java.util.Arrays;

public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {

        RecommenderImplementation recommender = new RecommenderImplementation();
        String[] results = recommender.recommendMovies("Finding Dory");
        System.out.println(Arrays.toString(results));
        SpringApplication.run(MovieRecommenderSystemApplication.class, args);
    }

}