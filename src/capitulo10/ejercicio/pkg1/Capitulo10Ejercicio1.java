package capitulo10.ejercicio.pkg1;

public class Capitulo10Ejercicio1 {

    public static void main(String[] args) {
        color a=color.COLOR1;
        color f=color.COLOR4;
        Integer b=1925;
        Integer c=10;
        String d="ALDO";
        String e="Aldo2";
        Horse caballo = new Horse();
        RaceHorse caballodecarreras = new RaceHorse();
        caballo.setColor(a);
        caballo.setBirthYear(b);
        caballo.setName(d);
        caballodecarreras.setNumerOfRaces(c);
        caballodecarreras.setName(e);
        caballodecarreras.setColor(f);
        caballodecarreras.setBirthYear(1900);
        System.out.println(caballo.toString());
        System.out.println(caballodecarreras.toString());
        System.out.println(caballodecarreras.getColor());
        System.out.println(caballodecarreras.getName());
        System.out.println(caballodecarreras.getBirthYear());
    }
    
}
