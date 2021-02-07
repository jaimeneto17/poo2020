
import javax.swing.JOptionPane;

public class tamagotchi {
    //essenciais
    private int energia;
    private int saciedade;
    private int limpeza;
    //em jogo
    private int diamantes;
    private int idade;
    private boolean vivo;

    public tamagotchi(){
        this.energia = 10;
        this.saciedade = 10;
        this.limpeza = 10;
        this.idade=0;
        this.diamantes=0;
        this.vivo = true;   
    }
    public final int $energia = 10;
    public final int $saciedade = 10;
    public final int $limpeza = 10;

    public void teste_morte(int x){
        if(this.energia==0 || this.saciedade==0 || this.limpeza==0){
            this.energia = 0;
            this.saciedade = 0;
            this.limpeza = 0;
            this.idade=0;
            this.diamantes=0;
            this.vivo = false;
            if(x==1)JOptionPane.showMessageDialog(null,"Seu pet morreu");
        }
        
    }

    public void comer(int x){
        teste_morte(0);
        if(this.vivo == false){JOptionPane.showMessageDialog(null, "Seu pet ja está morto");x=1;}
        else{
            if(this.energia < 10)
                this.energia++;
            if(this.saciedade < 10)
                this.saciedade++;
            this.limpeza--;
            this.idade++;
            JOptionPane.showMessageDialog(null, "Seu pet comeu uma ração deliciosa");
        }
        if(x==0)teste_morte(1);
    }

    public void jogar(int x){
        teste_morte(0);
        if(this.vivo == false){JOptionPane.showMessageDialog(null, "Seu pet ja está morto");x=1;}
        else{
            this.limpeza--;
            this.energia--;
            this.saciedade--;
            this.diamantes++;
            this.idade++;
            JOptionPane.showMessageDialog(null, "Seu pet brincou com uma bola e fez 10 embaixadinhas");
        }
        if(x==0)teste_morte(1);
    }

    public void dormir(int x){
        teste_morte(0);
        if(this.vivo == false){JOptionPane.showMessageDialog(null, "Seu pet ja está morto");x=1;}
        else{
            if(this.energia < 10)
                this.energia++;
            this.saciedade--;
            this.idade++;
            JOptionPane.showMessageDialog(null, "Seu pet dormiu e sonhou com os numeros da mega da virada");
        }
        if(x==0)teste_morte(1);
    }

    public void banho(int x){
        teste_morte(0);
        if(this.vivo == false){JOptionPane.showMessageDialog(null, "Seu pet ja está morto");x=1;}
        else{
            if(this.limpeza < 10)
                this.limpeza++;
            this.energia--;
            this.idade++;
            JOptionPane.showMessageDialog(null, "Seu pet tomou um banho relaxante");
        }
        if(x==0)teste_morte(1);
    }

    public void status(){
        JOptionPane.showMessageDialog(null, "Energia:"+this.energia+"/"+$energia+" Saciedade:"+this.saciedade+"/"+$saciedade+" Limpeza:"+this.limpeza+"/"+$limpeza+" Idade:"+this.idade+" Diamantes:"+this.diamantes+" Vivo:"+this.vivo);
    }

}