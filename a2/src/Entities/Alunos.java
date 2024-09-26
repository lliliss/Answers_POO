package Entities;

class Alunos {
	private String name;
	private String iD;
	private String curso;
	private String[] materias;
	private double[][] notas;
	
	public Alunos(String name, String iD, String curso, String[] materias, double[][] notas) {
		this.name = name;
		this.iD = iD;
		this.curso = curso;
		this.materias = materias;
		this.notas = notas;
	}
	
	public double mediaNaMateria(int materia) {
		double soma = 0;
		for (int i = 0; i < notas[materia].length; i++) {
			soma += notas[materia][i];
		}
		return soma / notas[materia].length;
	}
	
	public String aprovacao(int materia) {
		double media = mediaNaMateria(materia);
		return media >= 7.0 ? "aprovado!" : "reprovado!";
	}
	
	public void informations() {
		System.out.println("Nome do aluno: " + name);
		System.out.println("Matrícula de nº: " + iD);
		System.out.println("Curso que está matriculado: " + curso);
		for (int i = 0; i < materias.length; i++) {
			System.out.println("Matéria de " + materias[i]);
			System.out.println("Nota 1: " + notas[i][0]);
			System.out.println("Nota 2: " + notas[i][1]);
			System.out.printf("Média = %.2f\n", mediaNaMateria(i));
			System.out.println("O aluno está " + aprovacao(i));
			System.out.println();
		}
	}
}
