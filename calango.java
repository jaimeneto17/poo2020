public class calango {
    int bucho; //atributos
    int maxBucho;
    int nPatas;
    int vida;
    boolean alive;

    //mesmo nome da classe = sombreamento de variavel
    calango(int maxBucho){ //parametros
        this.bucho = maxBucho;
        this.maxBucho = maxBucho;
        this.nPatas = 4;
        this.vida = 4;
        this.alive = true;
    }

    void comer(int qtd){
        if(this.vida > 0){
            bucho += qtd;
            if(bucho > maxBucho){
                bucho = maxBucho;
                System.out.println("Comi até ficar saciado");
            }else{
                System.out.println("Tô cheio");
            }
        }else System.out.println("O Calango está morto");
        
    }

    void andar(){
        if(this.vida > 0){
            if(nPatas < 2){
                System.out.println("Estou impossibilitado de tal tarefa");
                return;
            }
            if(bucho > 0){
                bucho -= 1;
                System.out.println("Que passeio agradavel");
                return;
            }
            System.out.println("Estou muito cansado");
        }else System.out.println("O Calango está morto");
    }

    void acidentar(){
        if(this.vida > 0){
            if(nPatas > 0){
                nPatas -= 1;
                System.out.println("Ouch! Perdi uma pata");
            }else{
                this.vida -= 1;
                if(this.vida >= 1)
                System.out.println("Já virei cobra!!");
                else{
                this.alive = false;  System.out.println("RIP");
                }
            }
        }else System.out.println("O Calango está morto");
    }

    void regenerar(){
        if(this.vida > 0){
            if(nPatas == 4){
                System.out.println("Estou perfeito");
            }else if (bucho > 0){
                nPatas += 1;
                bucho -= 1;
                System.out.println("Opa! Recuperei uma pata!");
            }else{
                System.out.println("Nao tenho energia suficiente para me recuperar");
            }
        }else System.out.println("O Calango está morto");
    }

    void pegarSol(){
        if(this.vida == 4){
            System.out.println("Tá Calor");
        }else if(this.vida < 4 && this.vida > 0){
            this.vida += 1;
            System.out.println("Nada melhor que um banho de Sol");
        }else System.out.println("O Calango está morto");
    }

    void ritualSatanico(){
        if(this.vida <= 0){
            this.vida = 0;
            this.vida += 1;
            this.alive = true;
            this.nPatas = 4;
            System.out.println("De volta a Vida");
        }else System.out.println("Sai fora sou um calango de DEUS");
    }



    public String toString() {
        return "Bucho: " + bucho + "/" + maxBucho + " Patas: " + nPatas  + " Alive:" + alive + " Vida:" + vida;
    }

    public static void main(String[] args) {
        //referencia      = criando objeto
        calango deadlango = new calango(20);

        System.out.println(deadlango);
        
        deadlango.acidentar();
        deadlango.acidentar();
        deadlango.acidentar();
        deadlango.acidentar();
        deadlango.acidentar();
        deadlango.acidentar();
        deadlango.acidentar();
        deadlango.acidentar();
        System.out.println(deadlango);
        deadlango.ritualSatanico();
        deadlango.andar();
        deadlango.andar();
        deadlango.comer(3);
        deadlango.ritualSatanico();
        deadlango.pegarSol();
        System.out.println(deadlango);

        

    }
}


    

