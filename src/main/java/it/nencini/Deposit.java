package it.nencini;

public class Deposit extends Thread{

    private PiggyBank pb;
    private int amount;

    public Deposit(PiggyBank pb, int amount) {
        this.pb = pb;
        this.amount = amount;
    }

    @Override
    synchronized public void run() {

        for (int i = 0; i < amount; i++) {      
            this.pb.addMoney();                 
        }

    }

}
