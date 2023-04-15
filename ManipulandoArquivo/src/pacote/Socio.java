package pacote;


	public class Socio {
		
		private String nome;
		private String endereco;
		private String telefone;
		private String email;
		private int codigo; // C�digo so s�cio na Locadora
		
		
		public Socio() {
			
		}
		
		public int getCodigo() {
			return this.codigo;
		}
		
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getEndereco() {
			return endereco;
		}

		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}

		public String getTelefone() {
			return telefone;
		}

		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
		
}