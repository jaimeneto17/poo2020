import javax.swing.JOptionPane;

public class carro {
    int tanque;
    private int maxTanque;
    int ocupacao;
    int km;

    public carro(){
        this.maxTanque=100;
        this.tanque=0;
        this.ocupacao=0;
    }

    public void entrar(){
        if(this.ocupacao<2){
            this.ocupacao+=1;
            System.out.println("Alguém entrou no carro");
        }
        else System.out.println("O carro está lotado");
    }

    public void sair(){
        if(this.ocupacao>0){
            this.ocupacao-=1;
            System.out.println("Alguém saiu do carro");
        }
        else System.out.println("O carro já está vazio");
    }

    public void abastecer(int qtd){
        if((qtd+this.tanque)>this.maxTanque){
            int qtdTemp=qtd;
            while(true){
                if(this.tanque<this.maxTanque && qtd>0){
                    this.tanque+=1;
                    qtd-=1;
                }else break;
            }
            qtdTemp-=qtd;
            System.out.println("Você abasteceu "+qtdTemp+" Litros de gasolina e foram descartadas "+qtd+" Litros de Gasolina");
        }
        else{
            this.tanque+=qtd;
            System.out.println("Você abasteceu "+qtd+" Litros de gasolina");
        }
    }

    public void dirigir(int qtd){
       
      /* // this.km = Integer.parseInt(JOptionPane.showInputDialog("Insira quantos km você quer andar"));   CÓDIGO ANTIGO

        String validacao = JOptionPane.showInputDialog("Insira quantos km você quer andar"); //Recebe o Valor
        int erro = 0;  //Conta quantos erros aconteceram durante a validação
        for(int i = 0; i<validacao.length(); i++){ //Para executar o laço de acordo com a quantidade de caracteres que tem na variavel Validação
            char t = validacao.charAt(i);//Armazena na variavel T do tipo caractere a posição (i) do que tem dentro da variavel String
                                         //ex: Vitamina o (v) ta na posição 0 o (i) na posição.  O comando String.charAt(x) pega esses caracteres individualmente
            if(t<48 || t>57){ //De acordo com a tabela ASCII tudo que for menos que 48 : 47,46..  OU  maior que 57: 58,59.. não é um número 
                              // esse if ele quer pegar todos os valores que não são numericos
                erro+=1; //para cada valor não numerico é adicionado +1 na variavel erro
            }
        }
        if(erro==0){    //se não teve erro então
            this.km = Integer.parseInt(validacao); //ele pega o valor da String e transforma para um valor inteiro e armazena na variavel e VRAU
        }else{
            System.out.println("Valor invalido"); // caso tiver erro exibe essa mensagem
        }*/
      
       // this.km = qtd;
        if(this.ocupacao>0 && this.tanque>0){
            int kmRodado = 0;
            while(true){
                if(this.tanque>0 && qtd>0){ 
                    this.tanque-=1;
                    qtd-=1;
                    kmRodado+=1;
                }
                else{
                    System.out.println("Você andou "+kmRodado+" KM");
                break;
                }
            }
            
        }else if(this.ocupacao<1){
            System.out.println("Sem gente no carro");
        }
        else if(this.tanque<1){
            System.out.println("Sem gasolina no carro");
        }
    }

}
