public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40,1,500);
        basket.add("Water", 50,1,500);
        basket.add("Eggs", 20,1,200);
        basket.print("Milk");
        System.out.println(Basket.getItemCountForAllBaskets());
        System.out.println(Basket.getCostForAllBaskets());
    }


}
