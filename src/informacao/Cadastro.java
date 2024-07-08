package informacao;

import java.util.Scanner;
import java.util.ArrayList;


public class Cadastro {
    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Cadastrar aluno.");
            System.out.println("2. Mostrar todos os alunos cadastrados.");
            System.out.println("3. Sair.");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();

            switch (opcao) {
            case 1:
                sc.nextLine(); 
                System.out.print("Digite o nome do aluno: ");
                String nome = sc.nextLine();
                System.out.print("Digite a idade do aluno: ");
                int idade = sc.nextInt();
                System.out.print("Digite a nota do aluno: ");
                double nota = sc.nextDouble();

                Aluno aluno = new Aluno(nome, idade, nota);
                alunos.add(aluno);
                System.out.println("\nAluno cadastrado com sucesso!");
                break;

            case 2:
                System.out.println("\nAlunos cadastrados:");
                if (alunos.isEmpty()) {
                    System.out.println("Nenhum aluno cadastrado.");
                } else {
                    for (Aluno alunoCadastrado : alunos) {
                        System.out.println(alunoCadastrado);
                    }
                }
                break;

            case 3:
                System.out.println("Saindo...");
                sc.close();
                return;

            default:
                System.out.println("Opção inválida. Tente novamente.");
                break;
        }
    }
}
}