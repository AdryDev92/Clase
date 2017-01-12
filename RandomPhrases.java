public class RandomPhrases {
    public static void main (String[] args){

        String verbos[]= new String[6];

        verbos[0] = "Correr";
        verbos[1] = "Beber";
        verbos[2] = "Trabajar";
        verbos[3] = "Saludar";
        verbos[4] = "Dormir";
        verbos[5] = "Preparar";

        String conceptos[]= new String[6];

        conceptos[0] = "portafolios";
        conceptos[1] = "refrescos";
        conceptos[2] = "películas";
        conceptos[3] = "juegos";
        conceptos[4] = "personas";
        conceptos[5] = "proyectos";

        String adjetivadores[]= new String[6];

        adjetivadores[0] = "sostenible";
        adjetivadores[1] = "actualizado";
        adjetivadores[2] = "de tendencia";
        adjetivadores[3] = "interesantes";
        adjetivadores[4] = "a medida";
        adjetivadores[5] = "eficiente";

        System.out.println(verbos[(int)(Math.random()*verbos.length)] + " " + conceptos[(int)(Math.random()*conceptos.length)] + " " + adjetivadores[(int)(Math.random()*adjetivadores.length)]);

    }
}
