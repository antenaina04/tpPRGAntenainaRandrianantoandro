/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package mg.itu.tpprgantenainarandrianantoandro.jsf;

import jakarta.inject.Named;
import jakarta.enterprise.context.RequestScoped;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Antenaina
 */
@Named(value = "bean_2")
@RequestScoped
public class Bean_2 {

    /**
     * Creates a new instance of Bean
     */
//    Update Model Value 
    private int nombre;  //utilisant la méthode setNombre (à cause de l'expression EL #{bean.nombre}.

    public int getNombre() {
        return nombre;
    }

//    Process Validations : conversion du nombre en int
    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getNombresSuivants() {
        int nb = 5;
        List<Integer> l = new ArrayList<>(nb);
        for (int i = nombre; i < nombre + nb; i++) {
            l.add(i);
        }
        return l;
    }

    public String afficher() {
        return "affichage__4?nb=" + nombre + "&amp;faces-redirect=true";
    }

//    @PostConstruct
//    public void init() {
//        FacesContext facesContext = FacesContext.getCurrentInstance();
//        Map<String, String> requestParams = facesContext.getExternalContext().getRequestParameterMap();
//        String nombreString = requestParams.get("nb");
//        if (nombreString != null) {
//            nombre = Integer.parseInt(nombreString);
//        } else {
//            nombre = 0;
//        }
//    }
//    public Bean() {
//    }
}
