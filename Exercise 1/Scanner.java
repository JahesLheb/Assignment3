public class Scanner {
    CashRegister cashRegister = new CashRegister();
    public void scannedUPCCode(int UPCCode) {
        this.cashRegister.setCurrentProductUPC(UPCCode);
    }
}
