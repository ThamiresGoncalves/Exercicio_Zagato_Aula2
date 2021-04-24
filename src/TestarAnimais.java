public class TestarAnimais extends Animal {

    public static void main(String[] args) {

        Animal animal = new Animal();
        Peixe peixe = new Peixe();
        Mamifero mamifero = new Mamifero();
        Mamifero camelo = new Mamifero();
        Peixe tubarao = new Peixe();
        Mamifero ursoCanada = new Mamifero();

        peixe.setNome("Nemo");
        peixe.setComprimento(12f);
        peixe.setPatas(0);
        peixe.setCor("Laranja");
        peixe.setAmbiente("Água");
        peixe.setVelocidadeMedia(5.0f);

        mamifero.setNome("Cachorro");
        mamifero.setAmbiente("Doméstico");

        camelo.setNome("Camelo");
        camelo.setComprimento(150f);
        camelo.setPatas(4);
        camelo.setCor("Amarelo");
        camelo.setAmbiente("Terra");
        camelo.setVelocidadeMedia(2.0f);


        tubarao.setNome("Tubarão");
        tubarao.setComprimento(300f);
        tubarao.setPatas(0);
        tubarao.setCor("Cinzento");
        tubarao.setAmbiente("Mar");
        tubarao.setVelocidadeMedia(1.5f);
        tubarao.setCaracteristica("Barbatanas e cauda");


        ursoCanada.setNome("Urso-do-canadá");
        ursoCanada.setComprimento(180f);
        ursoCanada.setPatas(4);
        ursoCanada.setCor("Vermelho");
        ursoCanada.setAmbiente("Terra");
        ursoCanada.setVelocidadeMedia(0.5f);
        ursoCanada.setAlimento("Mel");


        animal.dados();
        peixe.dadosPeixe();
        mamifero.dadosMamifero();
        camelo.dadosMamifero();
        tubarao.dadosPeixe();
        ursoCanada.dadosMamifero();

    }
}
