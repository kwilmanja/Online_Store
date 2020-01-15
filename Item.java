public class Item{
    private String name;
    private String id;
    private int price;
    private int sale;

    public Item(String name ,String id,int price){
        this . name = name;
        this . id = id;
        this . price = price;
        this . sale = 0;
    }

    public Item(String name ,String id,int price, int sale){
        this . name = name;
        this . id = id;
        this . price = price - (int)(price*sale/100);
        this . sale = sale;
    }

    public int sale(){
        return sale;
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