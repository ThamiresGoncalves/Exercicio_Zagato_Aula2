public class Animal {
    private String nome = "Canguru";
    private Float comprimento = 14f;
    private Integer patas = 4;
    private String cor = "Marrom";
    private String ambiente = "Austrália";
    private Float velocidadeMedia = 40f;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getComprimento() {
        return comprimento;
    }

    public void setComprimento(Float comprimento) {
        this.comprimento = comprimento;
    }

    public Integer getPatas() {
        return patas;
    }

    public void setPatas(Integer patas) {
        this.patas = patas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public Float getVelocidadeMedia() {
        return velocidadeMedia;
    }

    public void setVelocidadeMedia(Float velocidadeMedia) {
        this.velocidadeMedia = velocidadeMedia;
    }


    public void dados() {
        System.out.println("Nome Animal: " + nome);
        System.out.println("Comprimento Animal: " + comprimento);
        System.out.println("Quantidade de patas Animal: " + patas);
        System.out.println("Cor Animal: " + cor);
        System.out.println("Ambiente Animal: " + ambiente);
        System.out.println("Velocidade média Animal: " + velocidadeMedia);
    }
}