package TrabalhoJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {		
		ArrayList<Tarefas> tarefas = new ArrayList<>();	
		Scanner sc = new Scanner(System.in);
		String escolha ;
		do {
			System.out.println("========= TAREFAS =========");
			System.out.println("1 - Adicionar tarefa");
			System.out.println("2 - Listar tarefas");
			System.out.println("3 - Sair");

			escolha = sc.nextLine();
			switch(escolha) {
			case "1": 
				
				System.out.println("========= ADICIONANDO TAREFAS =========");
				System.out.println("Digite o título da tarefa: ");				
				String titulo = sc.nextLine();				
				
				System.out.println("Digite a descrição da tarefa: ");
				String descricao = sc.nextLine();
				
				Tarefas tarefa = new Tarefas();
				
				tarefa.setTitulo(titulo);
				tarefa.setDescricao(descricao);
				tarefas.add(tarefa);		
				break;
	
			case "2":
				System.out.println("========= LISTA DE TAREFAS =========");
				for(Tarefas e: tarefas) {
					System.out.println(e.getTitulo()+"\n"+e.getDescricao()+"\n");
				}
				break;
				
			case "3":
				break;
			default:
				System.out.println("Opção inválida!");
				
			}
						
		}while(escolha != "3");
		
		
	}
}
