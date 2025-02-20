import java.sql.SQLOutput;

public class Medico {
        private string nome;
        private string crm;
        private string telefone;
        private string especialidade;
        private string senha;

        public Medico(){}

        public string getNome() {
            return nome;
        }

        public void setNome(string nome) {
            this.nome = nome;
        }

        public string getCrm() {
            return crm;
        }

        public void setCrm(string crm) {
            this.crm = crm;
        }

        public string getTelefone() {
            return telefone;
        }

        public void setTelefone(string telefone) {
            this.telefone = telefone;
        }

        public string getEspecialidade() {
            return especialidade;
        }

        public void setEspecialidade(string especialidade) {
            this.especialidade = especialidade;
        }

        public string getSenha() {
            return senha;
        }

        public void setSenha(string senha) {
            this.senha = senha;
        }

        public Medico(string nome, string crm, string telefone, string especialidade, string senha) {
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


