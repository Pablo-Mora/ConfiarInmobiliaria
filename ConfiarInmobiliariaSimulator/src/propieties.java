public class propieties {
    public class Propieties extends inmobiliaria{
        private int codeP;
        private String direcctionP;
        private String descriptionP;

        public Propieties(int nit, String name, String description, int codeP, String direcctionP,
                          String descriptionP){
            super(nit, name, description);
            this.codeP = codeP;
            this.direcctionP = direcctionP;
            this.descriptionP = descriptionP;
        }

        public void agergarPropiedad(){

        }
    }
}
