public class Ejercicio11 {
    public static void main(String[] args) {
        int tiempo=365*24*3600;
        int nace=tiempo/7;
        int muere=tiempo/13;
        int inmigrante=tiempo/45;

        int popularidad=nace+muere+inmigrante;
        int pactual=312032486;
        int ptotal=popularidad+pactual;
        int ptotal2=2*popularidad+pactual;
        int ptotal3=3*popularidad+pactual;
        int ptotal4=4*popularidad+pactual;
        int ptotal5=5*popularidad+pactual;

        System.out.println("La poblacion luego de 1 años es: "+ptotal);
        System.out.println("La poblacion luego de 2 años es: "+ptotal2);
        System.out.println("La poblacion luego de 3 años es: "+ptotal3);
        System.out.println("La poblacion luego de 4 años es: "+ptotal4);
        System.out.println("La poblacion luego de 5 años es: "+ptotal5);


    }
}
