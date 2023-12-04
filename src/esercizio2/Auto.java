package esercizio2;

public class Auto {
    double kmPercorsi;
    double litriConsumati;

    //COSTRUTTORE

    public Auto(double kmPercorsi, double litriConsumati) {
        this.kmPercorsi = kmPercorsi;
        this.litriConsumati = litriConsumati;
    }

    //GETTER SETTER

    public double getKmPercorsi() {
        return kmPercorsi;
    }
    public double getLitriConsumati() {
        return litriConsumati;
    }

    public void setKmPercorsi(double kmPercorsi) {
        this.kmPercorsi = kmPercorsi;
    }

    public void setLitriConsumati(double litriConsumati) {
        this.litriConsumati = litriConsumati;
    }

    //METODI

    public void calcolaKmLitro() {
        double kmPerLiters =  (this.kmPercorsi / this.litriConsumati);
        System.out.println("L'autovettura ha percorso : " + this.kmPercorsi / this.litriConsumati + " km per litro");
    }

}
