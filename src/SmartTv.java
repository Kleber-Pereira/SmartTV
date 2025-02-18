public class SmartTv {
    boolean ligada=false;
    int canal=1;
    int volume=25;


    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumenta o som!! Volume Atual: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Baixa o som!! Volume Atual: " + volume);
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;

    }

    public void diminuirCanal(){
        canal--;
        System.out.println("Canal atual: " + canal);
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Canal Atual: " + canal);
    }




}
