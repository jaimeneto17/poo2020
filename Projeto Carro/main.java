



import javax.swing.JOptionPane;

public class main{
    public static void main(String[] args) {
        carro c = new carro();
        
        while(true){
            String acao = JOptionPane.showInputDialog("Comandos: (Embarcar); (Desembarcar); (Abastecer 20); (Exibir); (Dirigir 30); (Sair)");
            
            
                if( (acao.charAt(0)==69 || acao.charAt(0)==101) && (acao.charAt(1)==77 || acao.charAt(1)==109)
                && (acao.charAt(2)==66 || acao.charAt(2)==98) && (acao.charAt(3)==65 || acao.charAt(3)==97)
                && (acao.charAt(4)==82 || acao.charAt(4)==114) && (acao.charAt(5)==67 || acao.charAt(5)==99)
                && (acao.charAt(6)==65 || acao.charAt(6)==97) && (acao.charAt(7)==82 || acao.charAt(7)==114) )c.entrar();
                
                else if(  (acao.charAt(3)==69 || acao.charAt(3)==101) && (acao.charAt(4)==77 || acao.charAt(4)==109)
                && (acao.charAt(5)==66 || acao.charAt(5)==98) && (acao.charAt(6)==65 || acao.charAt(6)==97)
                && (acao.charAt(7)==82 || acao.charAt(7)==114) && (acao.charAt(8)==67 || acao.charAt(8)==99)
                && (acao.charAt(9)==65 || acao.charAt(9)==97) && (acao.charAt(10)==82 || acao.charAt(10)==114)
                && (acao.charAt(0)==68 || acao.charAt(0)==100) && (acao.charAt(1)==69 || acao.charAt(1)==101) )c.sair();
                
                else if(  (acao.charAt(0)==65 || acao.charAt(0)==97) && (acao.charAt(1)==66 || acao.charAt(1)==98)
                && (acao.charAt(2)==65 || acao.charAt(2)==97) && (acao.charAt(3)==83 || acao.charAt(3)==115)
                && (acao.charAt(4)==84 || acao.charAt(4)==116) && (acao.charAt(5)==69 || acao.charAt(5)==101)
                && (acao.charAt(6)==67 || acao.charAt(6)==99) && (acao.charAt(7)==69 || acao.charAt(7)==101)
                && (acao.charAt(8)==82 || acao.charAt(8)==114) ){
                    String[] ui = acao.split(" ");
                    c.abastecer(Integer.parseInt(ui[1]));      
                }
               
                else if(  (acao.charAt(0)==68 || acao.charAt(0)==100) && (acao.charAt(1)==73 || acao.charAt(1)==105)
                && (acao.charAt(2)==82 || acao.charAt(2)==114) && (acao.charAt(3)==73 || acao.charAt(3)==105)
                && (acao.charAt(4)==71 || acao.charAt(4)==103) && (acao.charAt(5)==73 || acao.charAt(5)==105)
                && (acao.charAt(6)==82 || acao.charAt(6)==114) ){
                    String[] ui = acao.split(" ");
                    c.dirigir(Integer.parseInt(ui[1]));      
                } 

                else if( (acao.charAt(0)==69 || acao.charAt(0)==101) && (acao.charAt(1)==88 || acao.charAt(1)==120)
                && (acao.charAt(2)==73 || acao.charAt(2)==105) && (acao.charAt(3)==66 || acao.charAt(3)==98)
                && (acao.charAt(4)==73 || acao.charAt(4)==105) && (acao.charAt(5)==82 || acao.charAt(5)==114)) System.out.println("Tanque: "+c.tanque+"  Pessoas no carro: "+c.ocupacao);

                else if( (acao.charAt(0)==83 || acao.charAt(0)==115) && (acao.charAt(1)==65 || acao.charAt(1)==97)
                && (acao.charAt(2)==73 || acao.charAt(2)==105) && (acao.charAt(3)==82 || acao.charAt(3)==114)) break;
        

    }

}
}