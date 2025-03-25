public class PruebaPersona {
    public static void main(String[] args) {
        Persona p1 = new Persona("Paco","Hidalgo Vázquez",21,"31025424B");
        Persona p2 = new Persona("Luis","Reyes",21,"31025424B");

        if (p1.equals(p2)) {
            System.out.println("Las dos personas tienen el mismo dni");
        } else {
            System.out.println("Las dos personas son distintas");
        }
    }
}