package Entities;

import Entities.Alunos;
import java.util.Scanner;
import java.util.Locale;

public class Application {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome do aluno: ");
		String name = sc.nextLine();
		
		System.out.println("Digite a matrícula: ");
		String iD = sc.nextLine();
		
		System.out.println("Digite o curso que está matriculado: ");
		String curso = sc.nextLine();
		
		String[] materias = new String[2];
		for (int i = 0; i < materias.length; i++) {
			System.out.println("Qual o nome da matéria " + (i+1) + " da qual você faz parte" + "? ");
			materias[i] = sc.nextLine();
		}
		
		double[][] notas = new double[2][2];
		for (int i = 0; i < 2; i++) {
			System.out.println("Qual nota você tirou na matéria " + materias[i] + "? ");
			for (int j = 0; j < 2; j++) {
				System.out.print("Nota " + (j+1) + ": ");
				notas[i][j] = sc.nextDouble();
			}
		}
		
		Alunos aluno = new Alunos(name, iD, curso, materias, notas);
		
		aluno.informations();
		
		sc.close();
	}
}
