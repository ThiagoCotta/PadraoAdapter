public class Cliente {

    IPrato prato;
    PratoAdapter persistencia;

    public Cliente() {
        prato = new PratoPeso();
        persistencia = new PratoAdapter(prato);
    }

    public void setPrato(float peso) {
        prato.setPrato(peso);
        persistencia.salvarPrato();
    }

    public float getPrato() {
        return persistencia.recuperarPrato();
    }

    public float getValor() {
        return persistencia.getValor();
    }

}
