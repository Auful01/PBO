/**
 * ElectricityBill
 */
public class ElectricityBill implements IPayable{

    private int kwh;
    private String category;

    ElectricityBill(int kwh, String category){
        this.kwh = kwh;
        this.category = category;
    }

    /**
     * @param kwh the kwh to set
     */
    public void setKwh(int kwh) {
        this.kwh = kwh;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return the kwh
     */
    public int getKwh() {
        return kwh;
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }
    
    public int getBasePrice() {
        int bPrice = 0;
        switch (category) {
            case "R-1":
                bPrice = 100;
                break;
            case "R-2":
                bPrice = 200;
                break;
        }
        return bPrice;
    }

    @Override
    public int getPaymentAmount() {
        return kwh*getBasePrice();      
    }

    public String getBillInfo(){
        return "kWH = " + kwh+"\n"+
                "Category = " + category +"("+getBasePrice()+" per kWH)\n";
    }
}