package pt.ipp.isep.dei.esoft.project.ui.console.menu;

import pt.ipp.isep.dei.esoft.project.ui.console.ListPropertiesUI;
import pt.ipp.isep.dei.esoft.project.ui.console.ShowTextUI;
import pt.ipp.isep.dei.esoft.project.ui.console.utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class EmployeeUI implements Runnable{
    public EmployeeUI() {}

    public void run(){
        List<MenuItem> options = new ArrayList<>();
        options.add(new MenuItem("List Properties", new ListPropertiesUI()));
        options.add(new MenuItem("Option 1 ", new ShowTextUI("You have chosen Option A.")));
        options.add(new MenuItem("Option 2 ", new ShowTextUI("You have chosen Option B.")));
        options.add(new MenuItem("Option 3 ", new ShowTextUI("You have chosen Option C.")));

        int option = 0;
        do {
            option = Utils.showAndSelectIndex(options, "\n\nEmployee Menu:");

            if ((option >= 0) && (option < options.size())) {
                options.get(option).run();
            }
        } while (option != -1);
    }
}
