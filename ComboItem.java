/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billeterie;

/**
 *
 * @author Admin
 */
public class ComboItem {
    private int id;
    private String titre;
    private String date;
    private Double prix;
    public ComboItem(int id,String t){
//String d,Double p){
        this.id=id;
        this.titre=t;
       /* this.date=d;
        this.prix=p;
*/
    }
    public int getId(){
        return id;
    }
     public String getTitre(){
        return titre;
    }
      public String getDate(){
        return date;
    }
       public Double getPrix(){
        return prix;
    }
    

    
}
