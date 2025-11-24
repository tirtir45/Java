package gestionemp.entities;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AffectationHashMap {

    private Map<Employe,Departement> affectationMap;

    public AffectationHashMap() {
        affectationMap = new HashMap<>();
    }

    public void ajouterEmployeDepartement(Employe emp, Departement d) {
        affectationMap.put(emp, d);
    }

    public void afficherEmployesEtDepartements(){

        if(affectationMap.isEmpty()){
            System.out.println("empty Map");
        }else{
            for(Map.Entry<Employe,Departement> entry: affectationMap.entrySet()){
                System.out.println("Employé(e)s : " + entry.getKey() + " Départements " + entry.getValue());
            }
        }

        Set<Employe> employes=this.affectationMap.keySet();
        for(Employe emp: employes){
            System.out.println(emp + " : " + affectationMap.get(emp));
        }
    }

    public void supprimerEmploye(Employe emp) {
        affectationMap.remove(emp);
    }

    public void supprimerEmployesEtDepartements(Employe emp, Departement dep) {
        if(this.affectationMap.containsKey(emp) &&  this.affectationMap.get(emp).equals(emp)){
            this.affectationMap.remove(emp);
        }
    }
    public void afficherEmployes(){
        if(affectationMap.isEmpty()){
            System.out.println("empty Map");
        }else{
            for(Employe e: affectationMap.keySet()){
                System.out.println(e);
            }
        }
    }

    public void afficherDepartements(){
        if(affectationMap.isEmpty()){
            System.out.println("empty Map");
        } else{
            for(Departement d: affectationMap.values()){
                System.out.println(d);
            }
        }
    }

    public boolean rechercherDepartement(Departement dep){

        return affectationMap.containsValue(dep);
    }

    public TreeMap<Employe,Departement> trierMap(){
        TreeMap<Employe,Departement> map = new TreeMap<>(this.affectationMap);
        return map;
    }
}
