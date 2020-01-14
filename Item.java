public class Item{
    private String name;
    private String id;
    private int price;

    public Item(String name ,String id,int price){
        this . name = name;
        this . id = id;
        this . price = price;
    }

    public Item(String name ,String id,int price, int sale){
        this . name = name;
        this . id = id;
        this . price = price - (int)(price*sale/100);
    }

    public int getPrice(){
        return this.price;
    }
    public String getID(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }

}