import java.util.*;

class FoodRatings {
    Map<String, String> foodCuisine;
    Map<String, TreeSet<Pair>> cuisineRatings;
    Map<String, Integer> foodRating;

    class Pair implements Comparable<Pair> {
        int rating;
        String food;

        Pair(int rating, String food) {
            this.rating = rating;
            this.food = food;
        }

        @Override
        public int compareTo(Pair other) {
            if (this.rating != other.rating) {
                return other.rating - this.rating;
            }
            return this.food.compareTo(other.food);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Pair)) return false;
            Pair other = (Pair) o;
            return this.rating == other.rating && this.food.equals(other.food);
        }

        @Override
        public int hashCode() {
            return Objects.hash(rating, food);
        }
    }

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        foodCuisine = new HashMap<>();
        cuisineRatings = new HashMap<>();
        foodRating = new HashMap<>();

        for (int i = 0; i < foods.length; i++) {
            foodCuisine.put(foods[i], cuisines[i]);
            foodRating.put(foods[i], ratings[i]);
            cuisineRatings.putIfAbsent(cuisines[i], new TreeSet<>());
            cuisineRatings.get(cuisines[i]).add(new Pair(ratings[i], foods[i]));
        }
    }

    public void changeRating(String food, int newRating) {
        String cuisine = foodCuisine.get(food);
        int oldRating = foodRating.get(food);
        cuisineRatings.get(cuisine).remove(new Pair(oldRating, food));
        foodRating.put(food, newRating);
        cuisineRatings.get(cuisine).add(new Pair(newRating, food));
    }

    public String highestRated(String cuisine) {
        return cuisineRatings.get(cuisine).first().food;
    }
}

class Main2 {
    public static void main(String[] args) {
        String[] commands = {
                "FoodRatings", "highestRated", "highestRated", "changeRating", "highestRated", "changeRating", "highestRated"
        };

        Object[][] arguments = {
                { new String[]{"kimchi", "miso", "sushi", "moussaka", "ramen", "bulgogi"},
                        new String[]{"korean", "japanese", "japanese", "greek", "japanese", "korean"},
                        new int[]{9, 12, 8, 15, 14, 7} },
                { "korean" },
                { "japanese" },
                { "sushi", 16 },
                { "japanese" },
                { "ramen", 16 },
                { "japanese" }
        };

        List<Object> output = new ArrayList<>();
        FoodRatings fr = null;

        for (int i = 0; i < commands.length; i++) {
            switch (commands[i]) {
                case "FoodRatings":
                    String[] foods = (String[]) arguments[i][0];
                    String[] cuisines = (String[]) arguments[i][1];
                    int[] ratings = (int[]) arguments[i][2];
                    fr = new FoodRatings(foods, cuisines, ratings);
                    output.add(null);
                    break;
                case "changeRating":
                    fr.changeRating((String) arguments[i][0], (int) arguments[i][1]);
                    output.add(null);
                    break;
                case "highestRated":
                    output.add(fr.highestRated((String) arguments[i][0]));
                    break;
            }
        }

        System.out.println(output);
    }
}
