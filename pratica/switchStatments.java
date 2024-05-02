package pratica;

public class switchStatments {
    public static void main(String[] args) {
        String day = "SegundA".toLowerCase();

        switch (day) {
            case "segunda": System.out.println("é segunda feira.");
                break;
            case "terça": System.out.println("é terça feira.");
                break;
            case "quarta": System.out.println("é quarta feira");
                break;
            case "quinta": System.out.println("é quinta feira");
                break;
            case "sexta": System.out.println("é sexta feira");
                break;
            case "sábado": System.out.println("é sábado");
                break;
            case "domingo": System.out.println("é domingo");
            default: System.out.println("não é um dia.");
                break;
        }
    }
}
