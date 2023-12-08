package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {

    private ArrayList<MenuItem> MenuItems = new ArrayList<>();
    private LocalDate updated;

    public ArrayList<MenuItem> getMenuItems() {
        return MenuItems;
    }
}
