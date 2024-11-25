public class client  extends inmobiliaria{
    private int idClient;
    private String nameClient;
    private String descriptionClient;

    public client(int nit, String name, String description, int idClient, String nameClient, String descriptionClient){
        super(nit, name, description);
        this.idClient = idClient;
        this.nameClient = nameClient;
        this.descriptionClient = descriptionClient;
    }
}
