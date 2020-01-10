public class Orders{

    private int numberOfItems;
    private Item[] itemList = 10;
    private int totalCost;

    public Order(){
        this.numberOfItems = 0;
    }

    public void addItem(Item item){
        this.itemList[numberOfItems] = item;
        this.numberOfItems += 1;
    }

    public int calculateCost(){
        this.totalCost = 0;
        int subTotal = 0;
        for (int i = 0; i < this.numberOfItems; i++){
            this.subTotal += this.itemList[i].getPrice();
        }
        this.totalCost = subTotal + (int)(subTotal * 0.08);
        return this.totalCost;
    }

}