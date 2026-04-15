import java.util.List;
import java.util.ArrayList;

class Allergies {
    int score;

    Allergies(int score) {
        this.score = score;
    }

    boolean isAllergicTo(Allergen allergen) {
        return (score & allergen.getScore()) != 0;
    }


    List<Allergen> getList() {
        List<Allergen> allergies = new ArrayList<>();

for (Allergen a : Allergen.values()) {
    if (isAllergicTo(a)) allergies.add(a);
    
}
        return allergies;
    }
}
