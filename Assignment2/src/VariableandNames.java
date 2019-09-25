import com.sun.org.apache.xpath.internal.operations.String;

import java.sql.Array;

public class VariableandNames
{
    public static void main(String[] args)
    {
        int cars, drivers, passengers, cars_not_driven, cars_driven;
        double space_in_a_car, carpool_capacity, average_passengers_per_car;


        cars = 100;
        space_in_a_car = 4.0;
        drivers = 30;
        passengers = 90;
        cars_not_driven = cars - drivers;
        cars_driven = drivers;
        carpool_capacity = cars_driven * space_in_a_car;
        average_passengers_per_car = passengers / cars_driven;

        System.out.println( "There are " + cars + " cars available." );
        System.out.println( "There are only " + drivers + " drivers available." );
        System.out.println( "There will be " + cars_not_driven + " empty cars today." );
        System.out.println( "We can transport " + carpool_capacity + " people today." );
        System.out.println( "We have " + passengers + " to carpool today." );
        System.out.println( "We need to put about " + average_passengers_per_car + " in each car." );

        // Problem 2
        int x;
        double y;


        x = 113;
        y = 2.71828;
        System.out.println("This integer holds a value of: " + x);
        System.out.println("The double function can hold decimals " + y);

        //Problem 3
        System.out.println("+--------------------------------------+");
        int z = 1;
        System.out.println(z);
        System.out.println("| " + z + 1 + "Science " + " | " + "Mr.Jung" + " |");
        System.out.println("| " + z + 2 + "E-Commerce " + " | " + "Ms.Lau" + " |");
        System.out.println("| " + z + 3 + "Compostition " + " | " + "Mr.Ross" + " |");
        System.out.println("| " + z + 4 + "Law " + " | " + "Ms.Lee" + " |");
        System.out.println("| " + z + 5 + "French " + " | " + "Mme Begg" + " |");
        System.out.println("| " + z + 6 + "C " + " | " + "Mr.Ross" + " |");
        System.out.println("| " + z + 7);


    }
}

