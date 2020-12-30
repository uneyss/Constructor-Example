public class Araba {
    
    private String model;
    private String Marka;
    private double Fiyat;
    
    public Araba(String model, String Marka, double Fiyat){
        this.model = model;
        this.Marka = Marka;
        this.Fiyat = Fiyat;
    }
public  void arabaalma(double miktar){
    if(miktar > 80.000 ){
        System.out.println("Üzgünüz bu arabayı alamaya yeterli paramız yok");
    }
    else{
        System.out.println("Araba alınmıştır hayırlı olsun");
    }  
}

public void arabamodel(int sene){
    if(sene < 2000){
        System.out.println("Arabanız çok eski alamayız");
    }
    else{
        System.out.println("Araba alınmıştır hayırlı olsun");
    }
}

public void arabaismi(String isim){
    if(isim.equals("Lada")){
        System.out.println("Arabayı alamayız");
    }
    else{
    System.out.println("Arabayı alabiliriz");
}
}
    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the Marka
     */
    public String getMarka() {
        return Marka;
    }

    /**
     * @param Marka the Marka to set
     */
    public void setMarka(String Marka) {
        this.Marka = Marka;
    }

    /**
     * @return the Fiyat
     */
    public double getFiyat() {
        return Fiyat;
    }

    /**
     * @param Fiyat the Fiyat to set
     */
    public void setFiyat(double Fiyat) {
        this.Fiyat = Fiyat;
    }
    
    
    
}
