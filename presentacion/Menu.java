package presentacion;

public class Menu {
    private OpcionMenu[] opciones = new OpcionMenu[5];
    private String tituloMenu;
    private char disenoBorde;

    public Menu(String tituloMenu, char disenoBorde){
        this.tituloMenu = tituloMenu;
        this.disenoBorde = disenoBorde;
    }
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
    public void agregarOpcion(OpcionMenu opcion) {}
    public void modificarOpcion(short idOpcion) {}
    public void eliminarOpcion(short idOpcion) {}
}
