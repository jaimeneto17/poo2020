import javax.swing.JOptionPane;

public class main {
    public static void main(String[] args) {
        tamagotchi pet = new tamagotchi();
        for(int i = 0; i < 1;){
            String acao = JOptionPane.showInputDialog("Digite:Jogar|Banho|Comer|Dormir|Sair|Status").toLowerCase();
            if(acao.equals("sair"))i=2;
            else if(acao.equals("jogar"))pet.jogar(0);
            else if(acao.equals("comer"))pet.comer(0);
            else if(acao.equals("dormir"))pet.dormir(0);
            else if(acao.equals("banho"))pet.banho(0);
            else if(acao.equals("status"))pet.status();
        }
    }
}
