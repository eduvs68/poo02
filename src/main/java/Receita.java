    public class Receita {
        private String consulta;
        private String data;
        private String descritivo;

        public Receita(){}

        public String getConsulta() {
            return consulta;
        }

        public void setConsulta(String consulta) {
            this.consulta = consulta;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public String getDescritivo() {
            return descritivo;
        }

        public void setDescritivo(String descritivo) {
            this.descritivo = descritivo;
        }

        public Receita(String consulta, String data, String descritivo) {
            this.consulta = consulta;
            this.data = data;
            this.descritivo = descritivo;
        }

        public void prescrever(){}
        public void consultar(){}
        public void mostrar(){
            System.out.println("Consulta:" +this.consulta);
            System.out.println("Data:" +this.data);
            System.out.println("Descritivo:" +this.descritivo);
        }
    }
