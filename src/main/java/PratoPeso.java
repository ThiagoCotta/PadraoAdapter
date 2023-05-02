public class PratoPeso implements IPrato {

    private float peso;

    @Override
    public float getPrato() {
        return this.peso;
    }

    @Override
    public void setPrato(float peso) {
        this.peso = peso;
    }
}
