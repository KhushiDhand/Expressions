public class VariablesAndNames {
    public static void main(String[] args) {
        int cars, drivers, passengers, cars_not_driven, cars_driven;
        double space_in_a_car, carpool_capacity, average_passengers_per_car;

        cars = 100;
        space_in_a_car = 4.0;
        drivers = 30;
        passengers = 90;
        cars_not_driven = cars - drivers;
        cars_driven = drivers;
        carpool_capacity = cars_driven * space_in_a_car;
        average_passengers_per_car = passengers/cars_driven;
        System.out.println("There are " + cars + " cars available.");
        System.out.println("There are only " + drivers + " drivers available.");
        System.out.println("There wil be " + cars_not_driven + " empty cars today.");
        System.out.println("We can transport " + carpool_capacity + " people today.");
        System.out.println("We have " + passengers + " to carpool today.");
        System.out.println("We need to put about " + average_passengers_per_car + " in each car.");

     //Problem 2
        int x;
        double y;
        String compscience;

        x = 113;
        y = 2.71828;
        compscience = "Computer Science";

        System.out.println("This is room # " + x);
        System.out.println("e is close to " + y);
        System.out.println("I am learning about " + compscience);

        //Problem 3
        System.out.println("+--------------------------------------------------+");

        String Programming11;
        String Physics11;
        String Chemistry11;
        String Law12;
        String ECommerce12;
        String French11;
        String PreCalculus11;
        String Composition11;

        String MrZaremba;
        String MrJung;
        String MsLiu;
        String MsLee;
        String MsLau;
        String MmeBegg;
        String MsUngurean;
        String MrRoss;

        Programming11= "Programming 11";
        Physics11= "Physics 11";
        Chemistry11= " Chemistry 11";
        Law12 = "Law 12";
        ECommerce12 = "E Commerce 12";
        French11= "French 11";
        PreCalculus11 = "Pre Calculus 11";
        Composition11 = "Compositon 11";

        MrZaremba = "Mr Zaremba";
        MrJung= "Mr Jung";
        MsLiu= "Ms Liu";
        MsLee = "Ms Lee";
        MsLau = "Ms Lau";
        MmeBegg= "Mme Begg";
        MsUngurean = "Ms Ungurean";
        MrRoss = "Mr Ross";



        System.out.println("| " + 1 + " | " + Programming11 + " | " +  MrZaremba + "  |");
        System.out.println("| " + 2 + " | " + Physics11 +  "     | " +  MrJung + "     |");
        System.out.println("| " + 3 + " | " + Chemistry11 +  "  | " +  MsLiu + "      |");
        System.out.println("| " + 4 + " | " + Law12 +  "         | " +  MsLee + "      |");
        System.out.println("| " + 5 + " | " + ECommerce12 +  "  | " +  MsLau + "      |");
        System.out.println("| " + 6 + " | " + French11 +  "      | " +  MmeBegg + "    |");
        System.out.println("| " + 7 + " | " + PreCalculus11 +  "| " + MsUngurean + " |");
        System.out.println("| " + 8 + " | " + Composition11 +  "  | " + MrRoss + "     |");
        System.out.println("+--------------------------------------------------+");
    }
}
