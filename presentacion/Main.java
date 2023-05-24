public class Main{
    public static void main(String[] args){
		Menu menu = new Menu("Menu Principal",'-');
		menu.agregarOpcion((short)1, "Registrar", Colores.verde);
		menu.agregarOpcion((short)2, "Imprimir", Colores.verde);
		menu.agregarOpcion((short)3, "Enviar", Colores.verde);
		menu.agregarOpcion((short)4, "Graficas", Colores.verde);
		menu.agregarOpcion((short)5, "Salir", Colores.rojo);
		menu.desplegar();

		System.out.println();
		menu.eliminarOpcion((short)2);
		menu.desplegar();

		System.out.println();
		menu.eliminarOpcion((short)4);
		menu.desplegar();
	}
}