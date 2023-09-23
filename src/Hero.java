sealed class Hero implements HavingSuperAbility permits Madic, Medic, Warrior {
    public int health;
    public int damage;
    public int SuperAbility;

    @Override
    public void applySuperAbility() {
    }
}