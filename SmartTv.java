public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 5;

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void aumentaCanal(){
        canal++;
    }
    public void diminuiCanal(){
        canal--;
    }

    public void aumentaVolume(){volume++;
        System.out.println("Aumentado o volume para: " + volume);}
    public void diminuiVolume(){volume--;
        System.out.println("Diminuindo o volume para: " + volume);}


}
