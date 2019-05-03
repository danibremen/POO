# 1º Bimeestre - Atividade de POO

1. O que é um objeto?
É tudo que tem uma identidade, um conjunto de característica que distingue uma pessoa ou coisa.

2. Identifique 3 características e 3 comportamentos de um carro.
Característica: pneus, cor do carro, marcha
Comportamento: andar, parado, abrir a porta

3. No contexto de Orientação a Objetos, as características e comportamentos são chamados respectivamente de?
Atributos = características
métodos = comportamento

4. Qual é o objetivo da programação orientada a objetos?
Desenvolver softwares utilizando objetos de maneira cooperativa através de mensagens

5. O que é abstração? Cite um exemplo.
Identificar as informações importantes. Por exemplo, cadastramento para emprestar livro você aborda o nome, CPF, RG, telefone, endereço e número da casa, não a necessidade de pedir a tipo sanguíneo, pois não teria relevância nesse sistema

6. O que é classe?
Define os atributos e métodos que o objeto poderá possuir. É utilizado para abstrair objeto com características similares.

7. Qual é o padrão utilizado para nomear as classes? Cite um exemplo.
A primeira letra maiúscula identifica a classe / interface

		public class NomeClasse{
		// atributo ou propriedades
		// métados

8.  Qual opção apresenta corretamente o nome da classe carro elétrico?
CarroEletrico

9. Qual é o padrão utilizado para nomear os atributos? Cite um exemplo.
Se a primeira letra for minúscula e a da próxima palavra começar com a letra maiúsculas (exemplo: nomeAluno) é atributo, variável ou metade.

		public class NomeClasse{
		public atributos;
		}

	Exemplo:

		public class Cachorro{
		public String nome;
		public float peso;
		public float altura;
		public String cor;
		}
		
10. Qual opção apresenta corretamente o nome do atributo _cor de fundo_?
corDeFundo

11. Qual é o padrão utilizado para nomear os métodos? Cite um exemplo.
Se a primeira letra for minúscula e a da próxima palavra começar com a letra maiúsculas (exemplo: nomeAluno) é atributo, variável ou metade.

12. Qual opção apresenta corretamente o nome do método _está_ vazio?
estaVazio

13. No contexto de orientação a objetos, o que é um objeto? Em que momento existe um objeto? Quando ele deixa de existir?
Objeto refere-se a instância de uma classe, os atributos de instância (objeto) definem o estado desse objeto e os métodos de instância (objeto) definem os comportamentos desse objeto.  Ele existi quando é instanciado na memória e para de existir quando o programa é encerrado

14. Qual é o objetivo do operador _new_?
New é utilizado para criar uma nova instancia de uma determinada classe

15. O que é o construtor? Qual é o seu objetivo? Qual deve ser o seu nome? Cite um exemplo.
Os construtores tem o mesmo nome de suas classes. É um método chamado/invocado no momento que a nova instância do objeto for criada através do operador new. O construtor cria um objeto e esse objeto é armazenado na variável.

16. Caso o construtor da classe _Aluno_ não for declarado, qual será o seu construtor?
Toda classe sem construtor definido tem, por padrão, um construtor simples

		public aluno {
		}
17. Crie um exemplo de instanciação da classe _Aluno_. Utilize o construtor padrão.
	
		Aluno a = new Aluno ();
18. O que é encapsulamento?
Encapsulamento é a técnica que faz com que detalhes internos do funcionamento dos métodos de uma classe permaneçam ocultos para os objetos, ou seja, auxilia na proteção de dados.

19. Qual é o objetivo do modificador de acesso _public_?
Qualquer classe pode ter acesso

20. Qual é o objetivo do modificador de acesso _private_?
Apenas os métodos da própria classe podem manipular o atributo

21. Como é aplicado o encapsulamento em uma classe? Considere a classe _Aluno_ com o atributo matrícula.
O encapsulamento defini como será o acesso de um atributo.
Se o atributo for privado, é utilizado os métodos da própria classe, se for público poderá ser acessada de forma direta.

		public class Aluno{
			private String matricula;
			public String getMetricuala(){
				return this.matricula;
		}
			Public void setMatricula(string matricula){
				this.matricula = matricula;
			}
		}

22. Qual o objetivo dos métodos _getters_? Crie um exemplo.
Usamos para obter informações. Esse método sempre retorna um valor

		public class Cardapio{
			private String ingrediente;
			public String getIngrediente(){
				return this.ingrediente;
		}

23. Qual o objetivo dos métodos _setters_? Crie um exemplo.
Usamos para definir valores. Esse tipo de método geralmente não retorna valore
		
		public class Cardapio{
			private String ingrediente;
		public void setIngrediente(String ingrediente){
			return this.ingrediente = ingrediente;
			}
		}
24. O diagrama de classe UML é composto por 3 partes. O que vai em cada parte?
Nome da classe, atributo e método

25. Qual é o padrão utilizado para representar um atributo no diagrama de classe UML? Crie um exemplo.

 Definir modificador:

	+ = publico

	- = private

	# = ptrect

	~ = default

Exemplo:
				
	-cardapio: String
	
26. Qual á o padrão utilizado para representar um método no diagrama de classe UML? Crie um exemplo.

	Modificador Metodo(parâmetro: TipoParametro): TipoRetorno

Exemplo:

	-setConta(): Int
27. Como o construtor de uma classe pode ser diferenciado no diagrama de classe UML? Crie um exemplo.
Colocando << create>> na frente do método que possui o mesmo nome da class

Exemplo:

	<<create>> +Dado(cor:String, material:String)

28. Quais são os símbolos utilizados no diagrama de classe UML para representar os modificadores de acessos ao atributos e m´etodos? Crie um exemplo.

		+ = publico

		- = private

		# = ptrect

		~ = default 
29. Considere a classe _Cliente_, com os atributos _nome_, _email_ e _telefone_ com os respectivos métodos _getters_ e _setters_. Desenvolva o diagrama de classe UML.

		Cliente:
			-nome:String
			-email:String
			-telefone:Int
			+getNome():String
			+setNome(nome:String)
			+getEmail():String
			+setEmail(email:Sting)
			+getTelefone():Int
			+setTelefone(telefone:Int)

30. Considere a classe _Cliente_ apresentado no Problema 29, e desenvolva o código Java correspondente.

		public class Cliente{
			private String nome;
			private String email;
			private int telefone;
			public String getNome(){
				return this.nome;
			}
		public void setNome(String nome){
			this.nome = nome;
		}
		public String getEmail(){
			return this.email;
		}
		public void setEmail(String email){
			this.email = email;
		}
		public String getTelefone(){
			return this.telefone;
		}
		public void setTelefone(String telefone){
			this.telefone = telefone;
			}
		}

31. Desenvolva o código java das classes do apresentadas no diagrama de classes UML abaixo:

		public class Produto{
			private String nome;
			public String getNome(){
				return this.nome;
		}
		public void setNome(String nome){
			this.nome = nome;
			}
		}
		public class Password{
			private String value;
		public void Password(String value){
		}

		public boolean isEqual(Password p){
			}
		}
		public class Animal{
			private boolean alive;
		public boolean isAlive(){
		}
		private void die(){
			}
		}

32. Desenvolva o diagrama de classe dos códigos Java abaixo.

		public class Livro{
		private String nome; public String getNome(){
		return nome; } public void setNome(String nome){
		this.nome = nome;
		} }
		public class ContaCorrente{
		private double saldo;
		public double sacar(double valor){
		return 0.0; } public void depositar(double valor){
		this.saldo = saldo;
		} private void recalcularSaldo(){
		} }
		public class Par{
		public String chave; public String valor;
		}
		public class Impressora{
		public void imprimir(Documento documento)
			}
		}
	

		
| Livro | ContaCorrente | Par | Impressora | 
|--|--|--|--| 
| -nome: String |-saldo: double | +chave: String | |
|-telefone: int| |+valor: String | |
|+getNome(): String|+sacar(valor: double): double | |+imprimir(documento: Documento) |
|+setNome(nome: String)|+depositar(calor: double)|||
||-recalcularSaldo()|||



33. O que É o estado de um objeto? Cite um exemplo com a classe _Aluno_ com os atributos _nome_, _idade_, _matrícula_ e _curso_. Utilize o diagrama de estado de objeto.

		Inicia o programa

		LIVRO
		private String nome;
		private int idade;
		private String matricula
		private String curso;
		
34. Qual é o estado do objeto da classe _Dog_ quando é inicializado? Desenvolva o diagrama de objetos.

		diagram de objetos
		
		public class Dog(){
		    int = 0
		    String = null
		    boolean = false
35. Qual é o estado do objeto _dog_ no final da execução do método _main_? Desenvolva o diagrama de objetos.

		diagram de objetos
		public class Dog(){
		    Years int = 10
		    name String = "Spike"
		    alive boolean = true
36.  Qual é o estado do objeto _pug_ e _buldog_ apos a execução da linha 6? Desenvolva o diagrama de objetos.

				diagram de objetos
				public class pug(){
				    idade int = 2
				    nome String ="Spoke"
				    vivo boolean = true
				    
				public class buldog(){
				    idade int = 0
				    nome String ="Spike"
				    vivo boolean = false
37. Analise o código abaixo. Verifique se existem problemas, caso sim, indique o problema e sugere as correções.

	- No código abaixo, existem algums problemas, tais como:
	
		O atributo weight em public, o que permite o acesso direto e  tornando  getWeight e setWeight inutilizado
	No main, após instânciar o objeto, o atributo name está com forma de acesso direta, é podera ser realizado, pois seu modificador é privado.

	- As possiveis correções seriam:

	  Tornar os atributos  privados;
	   Modificar o estado dos atributos do objeto.
