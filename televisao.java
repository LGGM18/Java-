public class Televisao{
    String marca;
    int tamanhoTela;
    int canal;
    int volume;
    boolean ligada;
    
    void ligar(){
        ligada = true;
        System.out.println("A TV"+marca+" esta ligada agora");
    }

    void avancarCanal(){
        for (canal=1; canal<=99; canal++)
        if (ligada == true){
            canal++;
            System.out.println("A TV "+marca+" esta no canal "+canal);
        }
        else{
            System.out.println("Por favor, antes ligue a TV "+marca);
        }
    }

    void retrocederCanal(){
        for (canal=1; canal<=99; canal--)
        if (ligada == true){
            canal--;
            System.out.println("A TV "+marca+" esta no canal "+canal);
        }
        else{
            System.out.println("Por favor, antes ligue a TV "+marca);
        }
    }

    void aumentarVolume(){
        for (volume=0; volume<=10; volume++)
        if (ligada == true){
            volume++;
            System.out.println("A TV "+marca+" esta no volume "+volume);
        }
        else{
            System.out.println("Por favor, antes ligue a TV "+marca);
        }
    }

    void diminuirVolume(){
        for (volume=0; volume<=10; volume--)
        if (ligada == true){
            volume--;
            System.out.println("A TV "+marca+" esta no volume "+volume);
        }
        else{
            System.out.println("Por favor, antes ligue a TV "+marca);
        }
    }

    void mutarVolume(){
        if (ligada == true){
            volume=0;
            System.out.println("A TV "+marca+" esta no volume "+volume);
        }
        else{
            System.out.println("Por favor, antes ligue a TV "+marca);
        }
    }
}
