package Modificador;

import java.util.Scanner;
public class ObjetoPessoaAutomovel {
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        String cor;
        String nome;
        int velocidade;

        System.out.print("Insira a cor do automóvel: ");
        cor = ler.nextLine();
        System.out.print("Insira o nome do automóvel: ");
        nome = ler.nextLine();
        System.out.print("Insira a velocidade do automóvel: ");
        velocidade = ler.nextInt();

        pessoa.compracarro(cor, nome, velocidade);

        Automovel carro = pessoa.getAutomovel();

        System.out.println("O automóvel comprado foi "+carro.getNome()+ " da cor "+carro.getCor() + " que atinge a velocidade de "+ carro.getVelocidade() +"Km/h");
    }
}
