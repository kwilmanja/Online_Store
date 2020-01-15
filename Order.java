public class Order{

    private int numberOfItems;
    private Item[] itemList = new Item[10];
    private int totalCost;

    public Order(){
        this.numberOfItems = 0;
    }

    public void addItem(Item item){
        boolean sameID = false;
        for( int x =0; x<this.numberOfItems; x++){
            if( itemList[x].getID() == item.getID() ){
                sameID = true;
            }
        }
        if(this.numberOfItems < 10 && !sameID){
            this.itemList[numberOfItems] = item;
            this.numberOfItems += 1;
        }
    }

    public double calculateCost(){
        this.totalCost = 0;
        int subTotal = 0;
        for (int i = 0; i < this.numberOfItems; i++){
            subTotal += this.itemList[i].getPrice();
        }
        this.totalCost = subTotal + (int)(subTotal * 0.08);

        return this.totalCost/100;
    }

    public String summary(){
        String summary ="Order Summary:\n";
        for( int x =0; x<this.numberOfItems; x++){
            summary += this.itemList[x].getName() + "\t" + this.itemList[x].getID() + "\t" + (double)(this.itemList[x].getPrice())/100 + " ";
            if (this.itemList[x].sale() != 0){
                summary += "(Sale Item! " + this.itemList[x].sale() + "% off!)";
            }
            summary += "\n";
    
        }
        summary += "\nTotal Cost:\t" + this.calculateCost() + "\n";
        return summary;    
    }

}