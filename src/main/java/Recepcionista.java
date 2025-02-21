    public class Recepcionista {
        private String nome;
        private String cpf;
        private String telefone;
        private String senha;

        public Recepcionista(){}

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getCpf() {
            return cpf;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public String getTelefone() {
            return telefone;
        }

        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }

        public String getSenha() {
            return "******";
        }

        public void setSenha(String senha) {
            this.senha = senha;
        }

        public Recepcionista(String nome, String cpf, String telefone, String senha) {
            this.nome = nome;
            this.cpf = cpf;
            this.telefone = telefone;
            this.senha = senha;
        }

        public void acessar(){}
        public void mostrar(){
            System.out.println("Mostrando dados do(a) recepcionista: " + this.nome);
            System.out.println("Cpf:"+ this.cpf);
            System.out.println("Telefone:"+ this.telefone);
            System.out.println("Senha:"+ this.senha);
        }
    }
