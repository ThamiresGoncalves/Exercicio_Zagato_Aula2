public class Peixe extends Animal {

    private String caracteristica = "Tem escamas";


    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public void dadosPeixe() {
        System.out.println("Nome Peixe: " + getNome());
        System.out.println("Comprimento Peixe: " + getComprimento());
        System.out.println("Quantidade de patas Peixe: " + getPatas());
        System.out.println("Cor Peixe: " + getCor());
        System.out.println("Ambiente Peixe: " + getAmbiente());
        System.out.println("Velocidade média Peixe: " + getVelocidadeMedia());
        System.out.println("Caracteristica do Peixe: " + getCaracteristica());
    }
}
