/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.Objects;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author kamal
 */
public class ArticleChp2 {

    private int id;
    private final StringProperty titre;
    private String contenu;
    private BooleanProperty c;

    public boolean isC() {
        return c.get();
    }

    public BooleanProperty cProperty() {
        return c;
    }

    public void setC(boolean c) {
        this.c.set(c);
    }

    public StringProperty titreProperty() {
        return titre;
    }

    public ArticleChp2(int id, String titre) {
        this.id = id;
        this.titre = new SimpleStringProperty(titre);
        c = new SimpleBooleanProperty(false);
    }

    public ArticleChp2(int id, String titre, String contenu) {
        this.id = id;
        this.titre = new SimpleStringProperty(titre);
        this.contenu = contenu;
        c = new SimpleBooleanProperty(false);
    }

    public ArticleChp2() {
        this.titre = new SimpleStringProperty("");
        c = new SimpleBooleanProperty(false);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ArticleChp2 other = (ArticleChp2) obj;
        if (!Objects.equals(this.titre, other.titre)) {
            return false;
        }
        return true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre.get();
    }

    public void setTitre(String titre) {
        this.titre.set(titre);
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    @Override
    public String toString() {
        return "ArticleChp2{" + "id=" + id + ", titre=" + titre + ", contenu=" + contenu + '}';
    }

}
