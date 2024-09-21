package bt.app.casino.model.poker;

public class Card {
    // S - spades , C - clubs, H - hearts,  D - Diamonds
    private String symbols;
    // 1 - 9 (1 is Ace)
    private int cardNumber;

    private int status;

    Card(){}
    
    // constructor
    Card(String inSymbols, int inNumber){
        this.symbols = inSymbols;
        this.cardNumber = inNumber;
    }

    Card(String inSymbols, int inNumber, String status){
        this.symbols = inSymbols;
        this.cardNumber = inNumber;
    }

    public String getSymbols() {
        return symbols;
    }

    public void setSymbols(String symbols) {
        this.symbols = symbols;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    
}
