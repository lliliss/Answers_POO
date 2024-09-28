# ↪️| Atividade 1 (a1), proposta:
<div>
  Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter para ser responsável pelos cálculos. 
</div>

#

<div>
  A questão acima foi uma atividade realizada em Java utilizando o paradigma de Programação Orientada a Objetos (POO), onde foram criados dois pacotes principais:

- Pacote application: Contém a classe responsável por interagir com o usuário, ler a cotação do dólar e o valor em dólares que deseja comprar. Este pacote se encarrega de capturar os dados de entrada e exibir o resultado final, chamando os métodos da classe CurrencyConverter.

- Pacote util: Contém a classe CurrencyConverter, que é responsável por realizar os cálculos necessários. Ela possui métodos que:

1- Calculam o valor em reais com base na cotação atual do dólar.

2- Aplicam a taxa de IOF = 6% (seis por cento) sobre o valor em dólar.

Essa organização facilita a manutenção e reutilização. O uso de POO (Programação Orientada a Objetos) garante que a lógica de conversão esteja encapsulada na classe CurrencyConverter, deixando a classe principal focada na interação com o usuário.
</div>

# ↪️| Atividade 2 (a2), proposta:
<div>
  Escreva uma classe para representar um Aluno. Adicione atributos relacionados às características de um aluno, como nome, matrícula, curso que está matriculado, nome de 2 disciplinas que está cursando e as notas dessas 2 disciplinas (Nota 1 e Nota 2 de cada uma). Desenvolva um método para verificar se o aluno está aprovado (nota maior ou igual a 7) em uma determinada disciplina. Escreva um programa para testar essa classe, que pede as informações do aluno ao usuário e ao final informa o nome das disciplinas e mostra as notas e se o aluno foi aprovado ou não.
</div>

#

<div>
  A questão acima foi proposta de uma prova de Java com POO (Programação Orientada Objeto). No código, foi atribuído atributos para o "aluno" e métodos (usando a palavra-chave "this" (nos métodos)) para referenciar os atributos na classe de Alunos.
  O código está em um único pacote que nomeamos de "Entities", porém, com sua divisão de classes em "Alunos" e "Application". E com isso, podemos colocar diferentes responsabilidades em cada classe. Em "Alunos", será atribuído todas as características que deve conter (com base no pedido da questão). Já em "Application", é onde ocorre a interação com o usuário! Nesta classe, instanciamos um objeto da classe "Alunos" e coletamos informações como: o nome do aluno, matrícula, curso e notas por meio de entrada do usuário.
  O conceito utilizado foi o de encapsulação, permitindo que os dados e comportamentos do aluno sejam gerenciados de forma coesa e organizada.
</div>
