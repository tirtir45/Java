import gestionemp.entities.*;   // Employe, Departement, etc.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(125, "rym", "ben hmida", "IT", 5);
        Employe e2 = new Employe(2, "layla", "fouleniya", "HR", 2);
        Employe e3 = new Employe(3, "Aziz", "fouleni", "IT", 1);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);

        System.out.println("--------------- Affichage des employés ------------------");
        societe.displayEmploye();

        System.out.println("--------------- Recherche employés ------------------");
        societe.rechercherEmploye("rym");
        societe.rechercherEmploye(e2);

        System.out.println("--------------- Tri par ID ------------------");
        societe.trierEmployeParId();

        System.out.println("--------------- Tri par nom, département, grade ------------------");
        societe.trierEmployeParNomDépartementEtGrade();

        System.out.println("--------------- Suppression employé ------------------");
        societe.supprimerEmploye(e2);
        societe.displayEmploye();


        DepartementHashSet departements = new DepartementHashSet();

        Departement dep1 = new Departement(1, "Web", 15);
        Departement dep2 = new Departement(2, "HR", 20);
        Departement dep3 = new Departement(3, "IT", 30);

        departements.ajouterDepartement(dep1);
        departements.ajouterDepartement(dep2);
        departements.ajouterDepartement(dep3);

        System.out.println("-------------- Affichage des départements --------------");
        departements.displayDepartement();

        System.out.println("--------------- Recherche des départements --------------");
        departements.rechercherDepartement("Web");
        departements.rechercherDepartement(dep3);

        System.out.println("--------------- Tri des départements --------------");
        System.out.println(departements.trierDepartementById());

        System.out.println("--------------- Suppression département -----------------");
        departements.supprimerDepartement(dep1);
        departements.displayDepartement();


        AffectationHashMap map = new AffectationHashMap();

        map.ajouterEmployeDepartement(e1, dep3);
        map.ajouterEmployeDepartement(e2, dep2);
        map.ajouterEmployeDepartement(e3, dep3);

        System.out.println("---Employés affectés aux départements---");
        map.afficherEmployesEtDepartements();

        System.out.println("------Supprimier Employee----------");
        map.supprimerEmploye(e3);

        System.out.println("---Recherche département---");
        boolean exists = map.rechercherDepartement(dep3);
        System.out.println("Existance:" + exists);

        System.out.println("---Map triée par ID d'employé---");

        TreeMap<Employe, Departement> mapTriee = map.trierMap();
        for (Map.Entry<Employe, Departement> entry : mapTriee.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        //prosit 12

        List<Etudiant> students = new ArrayList<>();
        students.add(new Etudiant(4785,"Rym1",20));
        students.add(new Etudiant(9856,"Yahya",22));
        students.add(new Etudiant(4613, "Ahmed",23));

        Management mng = new StudentManagement();

        System.out.println("------------displayStudents------------");
        mng.displayStudents(students, System.out::println);

        System.out.println("------------displayStudentByFilter------------");
        mng.displayStudentByFilter(
                students,
                s -> s.getId() > 10,
                System.out::println
        );

        String names = mng.returnStudentsName(students, Etudiant::getNom);
        System.out.println("Names: " + names);

        Etudiant e = mng.createStudent(() -> new Etudiant(9968, "foulena",25));
        System.out.println("Created: " + e);

        List<Etudiant> sorted = mng.sortStudentsById(
                students,
                Comparator.comparingInt(Etudiant::getId)
        );
        System.out.println("Sorted: " + sorted);

        Stream<Etudiant> stream = mng.convertToSteam(students);
        stream.forEach(s -> System.out.println("From stream: " + s));
    }
}