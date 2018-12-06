//F16
//
//    Max ammo: 8
//    Base damage: 30
//

public class F16 extends Aircraft {

  public F16() {
    super();
    this.setAmmo(0);
    this.setMaxAmmo(8);
    this.setBaseDamage(30);
    this.setAllDamage(0);
    this.setType("F16");
  }

  public boolean isPriority(){
    return false;
  }

}


