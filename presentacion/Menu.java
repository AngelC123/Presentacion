package presentacion;

public class Menu {
    private String tituloMenu;
    private char disenoBorde;

    public String getTituloMenu() {
        return tituloMenu;
    }
    public void setTituloMenu(String tituloMenu) {
        this.tituloMenu = tituloMenu;
    }
    public char getDisenoBorde() {
        return disenoBorde;
    }
    public void setDisenoBorde(char disenoBorde) {
        this.disenoBorde = disenoBorde;
    }

    OpcionMenu[] opciones = new OpcionMenu[5];

    public void agregarOpcion(OpcionMenu opcion) {}

    public void modificarOpcion(short idOpcion) {}

    public void eliminarOpcion(short idOpcion) {}
}
