package refactor.ref4;

/*
Extraer la impresión del título y conclusión en sus propios métodos.
 */
class Report {
    String titulo;
    void printReport() {
        imprimirTitulo(titulo);
        imprimirReporte();
        imprimirConclusion();
    }
    public static void imprimirTitulo(String titulo){
        System.out.println(titulo);
    }
    public static void imprimirReporte(){
        System.out.println("Contenido");
    }
    public static void imprimirConclusion(){
        System.out.println("Conclusion");
    }
}
