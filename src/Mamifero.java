public class Mamifero extends Animal {

    public String alimento = "Ração";

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public void dadosMamifero() {
        System.out.println("Nome Mamifero: " + getNome());
        System.out.println("Comprimento Mamifero: " + getComprimento());
        System.out.println("Quantidade de patas Mamifero: " + getPatas());
        System.out.println("Cor Mamifero: " + getCor());
        System.out.println("Ambiente Mamifero: " + getAmbiente());
        System.out.println("Velocidade média Mamifero: " + getVelocidadeMedia());
        System.out.println("Caracteristica Mamifero: " + getAlimento());
    }
}
