package capitulo10.ejercicio.pkg1;

public class RaceHorse extends Horse{
    public Integer numerOfRaces;

    public void setNumerOfRaces(Integer numerOfRaces) {
        this.numerOfRaces = numerOfRaces;
    }

    public Integer getNumerOfRaces() {
        return numerOfRaces;
    }

    @Override
    public String toString() {
        return "RaceHorse{" + "numerOfRaces=" + numerOfRaces + '}';
    }
    
}
