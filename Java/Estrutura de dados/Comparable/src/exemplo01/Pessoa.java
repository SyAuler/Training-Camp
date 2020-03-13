package exemplo01;
 	/* uma interface define um conjunto de métodos obrigatórios*/
	/* interface funcional - possui um atributo*/
public class Pessoa implements Comparable<Pessoa> {
	
		private String nome;
		private char sexo;
		private int idade;
		private double peso;
		private float altura;
		
		//construtor
		public Pessoa(String nome, char sexo, int idade, double peso, float altura) {
			this.nome = nome;
			this.sexo = sexo;
			this.idade = idade;
			this.peso = peso;
			this.altura = altura;
		}
		//get/set
		public String getNome() {
			return nome;
		}

		public char getSexo() {
			return sexo;
		}

		public int getIdade() {
			return idade;
		}

		public double getPeso() {
			return peso;
		}

		public float getAltura() {
			return altura;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public void setSexo(char sexo) {
			this.sexo = sexo;
		}
		
		public void setIdade(int idade) {
			this.idade = idade;
		}
		public void setPeso(double peso) {
			this.peso = peso;
		}
		
		public void setAltura(float altura) {
			this.altura = altura;
		}

		@Override
		public int compareTo(Pessoa other) {
			return this.nome.compareToIgnoreCase(other.nome);
		}
		
		@Override
		public String toString() {
			return nome + ", " + sexo + ", " + idade + ", " + peso + ", " + altura;
		}
	}


