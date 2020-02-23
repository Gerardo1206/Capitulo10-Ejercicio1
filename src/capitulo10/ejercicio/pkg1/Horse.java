package capitulo10.ejercicio.pkg1;

public class Horse {
    private String name;
    private color color;
    private Integer birthYear;

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }

    public void setColor(color color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    public color getColor() {
        return color;
    }
    

    @Override
    public String toString() {
        return "Horse{" + "name=" + name + ", color=" + color + ", birthYear=" + birthYear + '}';
    }
    
}
