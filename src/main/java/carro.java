


public class carro {
     private int limite=4;
     int numPessoas=0;

     String marca;
     String modelo;
     String ano;

    public carro(String marca, String modelo, String ano){
        this.marca=marca;
        this.modelo=modelo;
        this.ano=ano;
    }

     public  int getNumPessoas(){

         return numPessoas ;
     }
    public void addPessoa(){//adiciona pessoa ao carro
        if(numPessoas>=limite){
            System.out.println("O carro ja esta cheio");
        }else{
            System.out.println("Pessoa adicionada");
            numPessoas++;
        }
    }
    public void rmvPessoa(){//Remove pessoa do carro
         if(numPessoas<1){
             System.out.println("O carro ja esta vazio");
         }else{
             System.out.println("Pessoa retirada");
             numPessoas--;
         }

    }

}
