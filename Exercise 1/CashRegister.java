public class CashRegister {
    private int UPCCode;
    private Product currentProduct;
    private Display display = new Display();
    private TicketPrinter ticketPrinter = new TicketPrinter();
    private ProductDB productDB = new ProductDB();
    public void setCurrentProductUPC(int UPCCode) {
        this.UPCCode = UPCCode;
        this.currentProduct = this.getCurrentProductInfo();
        if (this.currentProduct != null){
            this.display.displayText(this.currentProduct.toString());
            this.ticketPrinter.displayText(this.currentProduct.toString());
        }
    }
    public Product getCurrentProductInfo() {
        currentProduct = this.productDB.GetProductInfo(this.UPCCode);
        return currentProduct;
    }
}
