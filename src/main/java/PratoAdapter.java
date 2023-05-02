public class PratoAdapter extends PratoValor {

    private IPrato pratoPeso;

    public PratoAdapter(IPrato pratoPeso) {
        this.pratoPeso = pratoPeso;
    }

    public float recuperarPrato() {
        pratoPeso.setPrato(this.getValor() / 0.016f);
        return pratoPeso.getPrato();
    }

    public void salvarPrato() {
        this.setValor(pratoPeso.getPrato()*0.016f);
    }
}
