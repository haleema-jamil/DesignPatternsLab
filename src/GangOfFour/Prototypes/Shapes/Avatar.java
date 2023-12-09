package GangOfFour.Prototypes.Shapes;

public abstract class Avatar implements Cloneable {

   private String id;
   protected String type;

   abstract void display();

   public String getType() {
      return type;
   }

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   @Override
   public Object clone() {
      Object clone = null;

      try {
         clone = super.clone();

      } catch (CloneNotSupportedException e) {
         e.printStackTrace();
      }

      return clone;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) return true;
      if (obj == null || getClass() != obj.getClass()) return false;
      Avatar avatar = (Avatar) obj;
      return getType().equals(avatar.getType()) && getId().equals(avatar.getId());
   }
}
