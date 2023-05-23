public class Main() {
    public static void main(String[] args){
		OpcionMenu opcion1 = new OpcionMenu((short)1, "Registrar", "ff0000");
		OpcionMenu opcion2 = new OpcionMenu((short)2, "Imprimir", "ff0000");			
		OpcionMenu opcion3 = new OpcionMenu((short)3, "Enviar", "ff0000");
		OpcionMenu opcion4 = new OpcionMenu((short)4, "Graficas", "ff0000");
		OpcionMenu opcion5 = new OpcionMenu((short)5, "Salir", "ff0000");

		Menu menu = new Menu("Menu Principal",'#');
		menu.agregarOpcion(opcion1);
		menu.agregarOpcion(opcion2);
		menu.agregarOpcion(opcion3);
		menu.agregarOpcion(opcion4);
        menu.agregarOpcion(opcion5);
        menu.desplegar();

        System.out.println();
        menu.eliminarOpcion(opcion4);
        menu.desplegar();

        System.out.println();
        menu.eliminarOpcion(opcion1);
        menu.desplegar();
	}
}