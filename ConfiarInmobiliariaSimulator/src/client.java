import java.util.Scanner;

public class client {

    public String nameClient;
    public String idClient;
    public String descriptionClient;

    public client(int i, String inmobiliariaCentral, String compraYVentaDePropiedades, int i1, String juanPérez, String clienteFrecuente) {
    }

    public void buscarPropiedad() {
    }

    public class Client  extends inmobiliaria{
        Scanner sc = new Scanner(System.in);
        private int idClient;
        private String nameClient;
        private String descriptionClient;
        private int buscarPropiedad;

        public Client(int nit, String name, String description, int idClient, String nameClient, String descriptionClient){
            super(nit, name, description);
            this.idClient = idClient;
            this.nameClient = nameClient;
            this.descriptionClient = descriptionClient;
        }

        public Client(int nit, String name, String description) {
            super(nit, name, description);
        }

        public void buscarPropiedad(){
            System.out.println("Digita el numero acorde a tu necesidad: (1 = compra, 2= venta, 3= alquiler, 4= renta");
            this.buscarPropiedad = sc.nextInt();
            switch (buscarPropiedad){
                case 1:
                    System.out.println("Por favor digita el codigo de la propiedad que desas comprar:");
                    // traer el codigo de la propiedad de la clase propieties
                    break;
                case 2:
                    System.out.println("Por favor indicanos tu contacto para agendar una cita de valoramiento:");
                    break;
                case 3:
                    System.out.println("Por favor digita el codigo de la propiedad que deas alquilar:");
                    // Traer el codigo de la propedad de la clase propieties
                    break;
                case 4:
                    System.out.println("Porfavor dejanos tu contacto para agendar una cita de valoramiento:");
                    break;
            }
        }
    }
}
