    public class Principal {

        public static void main(String[] args) {
            Paciente maria = new Paciente();
            maria.setNome("maria da silva");
            maria.setIdade(24);
            maria.setCpf("77788899913");
            maria.setGenero("Feminino");
            maria.setTelefone("1224-5678");
            maria.mostrar();

            Paciente jose = new Paciente("jose da silva","54654564","4002-8922","Masculino",24,);
            jose.mostrar();
        }


    }
