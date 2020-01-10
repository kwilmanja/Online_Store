public class Item{
    private String name;
    private String id;
    private int price;

    public item(name , id, price){
        this . name = name;
        this . id = id;
        this . price = price;
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