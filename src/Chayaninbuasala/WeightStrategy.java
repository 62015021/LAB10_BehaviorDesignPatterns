package Chayaninbuasala;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WeightStrategy implements SortStrategy {
    @Override
    public void customSort(List<Person> people) {
        Comparator<Person> ListWeight = Comparator.comparing(Person::getWeight);
        Collections.sort(people, ListWeight);
    }
    // YOU MAY ADD UP TO 5 LINES OF CODE BELOW THIS COMMENT !! A LINE OF CODE MAY CONTAIN UP TO ONE SEMI-COLON !!

}
