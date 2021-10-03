
public class FractionSimple {

    float a;
    float b;

        public float geta () {
            return a ; }

        public void seta (  float a) {
            this.a=a;}

        public float getb () {
            return b ; }

         public void setb ( float a) {
            if( b!=0){
           this.b=b;}
            else { System.out.println("le denominateur ne peut pas etre 0 ");}
        }

    public String affichage() {

        System.out.println("votre fraction est \n "+a+"/"+b);
        return null ;         }







}
