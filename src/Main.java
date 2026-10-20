//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Proyecto proyecto1 = new Proyecto();
    proyecto1.setNombre("Aumento de Ventas");
    proyecto1.setProgreso(25);
    proyecto1.setResponsable("Pedro");

    System.out.println("Proyecto: " + proyecto1.getNombre());
    System.out.println("Progreso: " + proyecto1.getProgreso() + "%");
    System.out.println("Responsable: " + proyecto1.getResponsable());
    System.out.println("Terminado: " + proyecto1.getTerminado());

    proyecto1.avanzar(25);
    System.out.println("Progreso: " + proyecto1.getProgreso() + "%");

    proyecto1.avanzar(50);
    System.out.println("Progreso: " + proyecto1.getProgreso() + "%");
    System.out.println("Terminado: " + proyecto1.getTerminado());
}
