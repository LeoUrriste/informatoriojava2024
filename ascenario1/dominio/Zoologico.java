package ascenario1.dominio;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private List<Animal> animales = new ArrayList<>();

    public Zoologico(List<Animal> animales){
        this.animales = animales;
    }
    public void hacerSonidoAnimal(){
        for (Animal animal : animales){
            hacerSonidoAnimal();
        }


    }

    public List<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(List<Animal> animales) {
        this.animales = animales;
    }
}
