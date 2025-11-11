package tn.esprit.gestiondesemps.main;
import tn.esprit.gestiondesemps.entities.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(125,"rym","ben hmida","IT",5);
        Employe e2 = new Employe(2,"layla","fouleniya","HR",2);
        Employe e3 = new Employe(3,"Aziz","fouleni","IT",1);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);

        System.out.println("---------------Affichage des emps------------------");
        societe.displayEmploye();

        System.out.println("---------------recherche des emps------------------");
        societe.rechercherEmploye("rym");
        societe.rechercherEmploye(e2);

        System.out.println("---------------tri des emps------------------");
        societe.trierEmployeParId();
        System.out.println("---------------tri des emps par nom dep---------------");
        societe.trierEmployeParNomDépartementEtGrade();

        System.out.println("---------------suppression emp---------------");
        societe.supprimerEmploye(e2);
        societe.displayEmploye();

    }
}