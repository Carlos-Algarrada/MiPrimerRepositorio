public class arrayforeach {
    public static void main(String[] args) {
        String[] paises ={"España", "Mexico", "Colombia", "Peru", "Chile", "Argentina", "Ecuador", "Venezuela"};
        for (int t = 0; t < paises.length; t++) {
            System.out.println("Pais " +(t + 1) + ": " + paises[t]);
        }
        System.out.println(":::::::::::::::::::::::");
        for (String item:paises){
            System.out.println("País: " +item);
        }
    }
}
