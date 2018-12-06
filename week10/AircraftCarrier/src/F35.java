//F35
//
//    Max ammo: 12
//    Base damage: 50
//
//    All the aircrafts should be created with empty ammo store


public class F35 extends Aircraft{

  public F35(){
    super();
    this.setAmmo(0);
    this.setMaxAmmo(12);
    this.setBaseDamage(50);
    this.setAllDamage(0);
    this.setType("F35");
  }

  @Override
  public boolean isPriority(){
    return true;
  }
}
