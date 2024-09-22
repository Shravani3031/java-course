public class Fruits{
    String colour = "White";
    double calories = 0;
    int weight = 0;

    public Fruits(String fruit ){
        System.out.println(fruit+ " fruit added");
    }
    




    static void colour(String color){
        System.out.println("The colour of fruit is "+ color);

    }

    static void calories(double c){
        System.out.println("The calories of the fruit is "+ c);

        
    }
    public void weight(){
        System.out.println("The colour of fruit is "+ weight);
    }
    public static void main(String[] args) {
        Fruits mango = new Fruits("mango");
        Fruits banana = new Fruits("banana");
        Fruits watermelon = new Fruits("watermelon");
        Fruits strawberry = new Fruits("strawberry");
        Fruits jackfruit = new Fruits("jackfruit");

        mango.colour = "Yellow";
        banana.colour = "Yellow";
        watermelon.colour = "Red";
        strawberry.colour = "Red";
        jackfruit.colour = "Green";

        mango.calories = 17;
        banana.calories = 19.1;
        watermelon.calories = 20.2;
        strawberry.calories = 12.4;
        jackfruit.calories = 18.6;

        mango.weight = 5;
        banana.weight = 9;
        watermelon.weight = 29;
        strawberry.weight = 3;
        jackfruit.weight = 22;








        

        
        
        

        colour(mango.colour);
        colour(banana.colour);
        colour(watermelon.colour);
        colour(strawberry.colour);
        colour(jackfruit.colour);

        calories(mango.calories);
        calories(banana.calories);
        calories(watermelon.calories);
        calories(strawberry.calories);
        calories(jackfruit.calories);

        




    }

}