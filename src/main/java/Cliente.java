public class Cliente {

    IPrato prato;
    PratoAdapter comanda;

    public Cliente() {
        prato = new PratoPeso();
        comanda = new PratoAdapter(prato);
    }

    public void setPrato(float peso) {
        prato.setPrato(peso);
        comanda.salvarPrato();
    }

    public float getPrato() {
        return comanda.recuperarPrato();
    }

    public float getValor() {
        return comanda.getValor();
    }

}
