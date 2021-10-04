package Labs.Lab3;

public class Test {
    public static void main(String[] args) {
        new Test2().run();
        new Test3().run();
        new Test4().run();
        new Test1().run();
    }
    public static class Test1{
        public void run(){
            Bowl b = new Bowl(Dish.Material.Ceramic, "blue", 40, false, 250);
            b.setMillilitersOfSoup(269);
            b.eatSoup();
        }
    }
    public static class Test2{
       public void run(){
           Fork f = new Fork(Dish.Material.Aluminium, "silver", 10, false,4);
           System.out.println("Can eat soup - " + f.EatSoup());
           System.out.println("Can eat vegetables - " + f.EatVegetables());
           System.out.println(f.getTeethCount());
       }
    }
    public static class Test3{
        public void run(){
            Spoon s = new Spoon(Dish.Material.Aluminium, "silver", 10, false);
            System.out.println("Can eat soup - " + s.EatSoup());
            System.out.println("Can eat vegetables - " + s.EatVegetables());
        }
    }
    public static class Test4{
        public void run(){
            Plate p = new Plate(Dish.Material.Aluminium, "silver", 10, false, 10);
            p.setPieces(10);
            p.eatFood();
        }
    }
}