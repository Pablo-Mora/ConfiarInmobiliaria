import java.util.Scanner;
public class inmobiliaria {
    Scanner sc = new Scanner(System.in);
    private int nit;
    private String name;
    private String description;

    public inmobiliaria(int nit, String name, String description){
        this.nit = nit;
        this.name = name;
        this.description = description;
    }

    public void updateDescription(){
        System.out.println("Actualice la descripcion de la inmobiliaria:");
        this.description = sc.next();
    }

    public void generalData(){
        System.out.println("Nit: " + this.nit + "\nNombre: " + this.name + "\nDescripcion: " +
                this.description);
    }
}
