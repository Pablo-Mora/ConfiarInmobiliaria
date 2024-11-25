public class propieties extends inmobiliaria{
    private int codeP;
    private String direcctionP;
    private String descriptionP;

    public propieties(int nit, String name, String description, int codeP, String direcctionP,
                      String descriptionP){
        super(nit, name, description);
        this.codeP = codeP;
        this.direcctionP = direcctionP;
        this.descriptionP = descriptionP;
    }
}
