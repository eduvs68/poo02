import java.sql.SQLOutput;

public class Medico {
        private String nome;
        private String crm;
        private String telefone;
        private String especialidade;
        private String senha;

        public Medico(){}

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getCrm() {
            return crm;
        }

        public void setCrm(String crm) {
            this.crm = crm;
        }

        public String getTelefone() {
            return telefone;
        }

        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }

        public String getEspecialidade() {
            return especialidade;
        }

        public void setEspecialidade(String especialidade) {
            this.especialidade = especialidade;
        }

        public String getSenha() {
            return senha;
        }

        public void setSenha(String senha) {
            this.senha = "********";
        }

        public Medico(String nome, String crm, String telefone, String especialidade, String senha) {
            this.nome = nome;
            this.crm = crm;
            this.telefone = telefone;
            this.especialidade = especialidade;
            this.senha = senha;
        }

        public void acessar(){}
        public void mostrar(){
            System.out.println("Mostrando dados para o medico: " + this.nome);
            System.out.println("Crm:"+ this.crm);
            System.out.println("Telefone:"+ this.telefone);
            System.out.println("Especialidade:"+ this.especialidade);
        }


}


