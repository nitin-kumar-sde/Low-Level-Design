package practise.movie_booking_system.model;

import java.util.ArrayList;
import java.util.List;

public class Theatre {
    private final Integer theatreId;
    private final String name;
    private final List<Screen> screens;

    public Theatre(Integer theatreId, String name) {
        this.theatreId = theatreId;
        this.name = name;
        this.screens = new ArrayList<>();
    }

    public Integer getTheatreId() {
        return theatreId;
    }

    public String getName() {
        return name;
    }


    public List<Screen> getScreens() {
        return screens;
    }

    public void addScreen(Screen screen) {

        screens.add(screen);
    }
}
