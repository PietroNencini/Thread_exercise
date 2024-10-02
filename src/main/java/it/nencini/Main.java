package it.nencini;

public class Main {
    public static void main(String[] args) throws Exception {
        PiggyBank pb1 = new PiggyBank(0);
        Deposit d1 = new Deposit(pb1, 10000);
        Deposit d2 = new Deposit(pb1, 10000);
        d1.start();
        d2.start();
        d1.join();
        d2.join();
        System.out.println("Devo iniziare il primo join:" + pb1.getValue());
        System.out.println("Finito il primo join:" + pb1.getValue());
        System.out.println(pb1.getValue());
    }
}