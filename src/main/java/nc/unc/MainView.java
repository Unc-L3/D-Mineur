package nc.unc;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

@Route(layout = ApplicationLayout.class)
@PWA(name = "Project Base for Vaadin Flow with Spring", shortName = "Project Base")
public class MainView extends VerticalLayout {

    public MainView(@Autowired MessageBean bean) {

        // constructuire une liste de case
       // -> List
        // afficher une grille de Case
        // soit utiliser la grid vaadin ?
        // soit via des horizontal layout
        /*
        for (1 -> nbLigne) {
	getLigneDuTableau(ytableau, i);
	afficherLesPointSurLigne(List<Point>);
	new HarizontalLayout();
}
         */
        Button button = new Button("Click me 2", e -> Notification.show(bean.getMessage()));
        add(button);
    }

}
