package it.nencini;

public class PiggyBank {

    private int value;

    public PiggyBank(int v) {
        this.value = v;
    }

    public int getValue() {
        return value;
    }
    
    synchronized public void addMoney() {       // ! Sezione critica: più thread potrebbero dover accedere a questa sezione in contemporanea
        this.value++;                           // Se alternativamente viene letto lo stesso valore attuale del valore salvadanaio --> il valore non viene aggiunto ma sovrascritto
    }                                           // Con la parola magica syncronized solo 1 thread alla volta può accedere a questo metodo ---> ciò rallenta l'esecuzione perché diventa un collo di bottiglia ma è l'unico modo per risolvere il problema
                                                // Con semafori o altra roba si può dire quanti thread alla volta possono accedere 

    @Override
    public String toString() {
        return "Salvadanaio -  Saldo attuale: " + this.value + "$";
    }

}
