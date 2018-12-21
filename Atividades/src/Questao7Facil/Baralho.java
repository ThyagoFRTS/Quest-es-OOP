package Questao7Facil;

public class Baralho {

    Carta nome;
    Carta[] carta;

    public Baralho() {
        this.nome = new Carta();
        this.carta = new Carta[52];

        this.inici();
    }

    public void inici() {
        for (int i = 0; i < 12; i++) {
            this.carta[i] = new Carta();
            this.carta[i].naipe = "Ouro";
            this.carta[i].numero = Integer.toString((i + 1));
        }
        for (int i = 12; i < 24; i++) {
            this.carta[i] = new Carta();
            this.carta[i].naipe = "Paus";
            this.carta[i].numero = Integer.toString((i - 12));
        }
        for (int i = 24; i < 36; i++) {
            this.carta[i] = new Carta();

            this.carta[i].naipe = "Copas";
            this.carta[i].numero = Integer.toString((i - 24));
        }
        for (int i = 36; i < 48; i++) {
            this.carta[i] = new Carta();

            this.carta[i].naipe = "Espadas";
            this.carta[i].numero = Integer.toString((i - 36));
        }

        this.carta[51].numero = "coringa";
        this.carta[50].numero = "coringa";
        this.carta[49].numero = "coringa";
        this.carta[48].numero = "coringa";
        this.carta[51].naipe = "coringa";
        this.carta[50].naipe = "coringa";
        this.carta[49].naipe = "coringa";
        this.carta[48].naipe = "coringa";
    }

    public void imprimir() {
        for (int i = 0; i < carta.length; i++) {
            System.out.println(carta[i].naipe + " " + carta[i].numero);

        }

    }

}
