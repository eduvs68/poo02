    public class Principal {

        public static void main(String[] args) {
            Paciente maria = new Paciente();
            maria.setNome("maria da silva");
            maria.setIdade(24);
            maria.setCpf("77788899913");
            maria.setGenero("Feminino");
            maria.setTelefone("1224-5678");
            maria.mostrar();

            Paciente jose = new Paciente("jose da silva","54654564","4002-8922","Masculino",24);
            jose.mostrar();

            Medico roberto = new Medico("roberto", "1234123123", "7777-8888", "Fisioterapia", "4654654");
            roberto.mostrar();

            Recepcionista jenifer = new Recepcionista("jenifer", "888222883", "9090-6866","219870320198");
            jenifer.mostrar();

            Agenda agenda1 = new Agenda("26/05/2024", "08:07", "roberto", "jose");
            agenda1.mostrar();

            Consulta consulta1 = new Consulta("26/05/2024", "08:07", "roberto", "jose", "torção", "atleta");
            consulta1.mostrar();

            Receita receita1 = new Receita("ginecologista", "26/05/2024", "cheiro forte");
            receita1.mostrar();

            Exame exame1 = new Exame("ginecologista", "26/05/2024", "cheiro forte");
            exame1.mostrar();

        }
    }
