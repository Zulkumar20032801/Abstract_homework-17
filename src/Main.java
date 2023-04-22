public class Main {
    public static void main(String[] args) {

        Cow cow=new Cow(2,150,"female","trokos");
        Horse horse=new Horse(1,200,"male","jon","black");
        Sheep sheep=new Sheep(1,40,"female","varejka");


        Cow[] cows1 = {cow};
        Sheep[]sheep1={sheep};
        Horse[]horses1={horse};


        Cow[]cows={cow,cow,cow,cow,cow};
        Horse[]horses={horse,horse} ;
        Sheep[]sheep2={sheep,sheep, sheep};

            Farm farm = new Farm("Osh",cows1,horses1,sheep1,"Mark");
            Farm farms=new Farm("Bishkek",cows,horses,sheep2,"Klark");

        System.out.println(farm);
        System.out.println(farms);

    }
}