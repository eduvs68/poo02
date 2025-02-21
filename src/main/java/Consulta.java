    public class Consulta {
        private String data;
        private String hora;
        private String medico;
        private String paciente;
        private String motivo;
        private String historico;

        public Consulta(){}

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public String getHora() {
            return hora;
        }

        public void setHora(String hora) {
            this.hora = hora;
        }

        public String getMedico() {
            return medico;
        }

        public void setMedico(String medico) {
            this.medico = medico;
        }

        public String getPaciente() {
            return paciente;
        }

        public void setPaciente(String paciente) {
            this.paciente = paciente;
        }

        public String getMotivo() {
            return motivo;
        }

        public void setMotivo(String motivo) {
            this.motivo = motivo;
        }

        public String getHistorico() {
            return historico;
        }

        public void setHistorico(String historico) {
            this.historico = historico;
        }

        public Consulta(String data, String hora, String medico, String paciente, String motivo, String historico) {
            this.data = data;
            this.hora = hora;
            this.medico = medico;
            this.paciente = paciente;
            this.motivo = motivo;
            this.historico = historico;
        }

        public void marcar(){}
        public void cancelar(){}
        public void consultar(){}
        public void realizar(){}
        public void atualizar(){}
        public void mostrar(){
            System.out.println("Data:" +this.data);
            System.out.println("Hora:" +this.hora);
            System.out.println("Médico:" +this.medico);
            System.out.println("Paciente:" +this.paciente);
            System.out.println("Motivo:" +this.motivo);
            System.out.println("Histórico:" +this.historico);
        }
    }
