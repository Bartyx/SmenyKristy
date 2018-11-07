/*
 * Enum třída, která obsahuje dny v týdnu pro přiřazení datumů, jejich ID
 * pro porovnání, počet hodin, po které se v tomto dni pracuje
 * a ověření, zda je víkend, nebo ne.
 * 
 */
package smeny;

/**
 *
 * @author Ondra
 */
public enum dnyTyden {
    //Seznam dní, jejich ID, počet pracovních hodin a zda je víkend
    PONDELI(1, 11, false),
    UTERY(2, 11, false),
    STREDA(3, 11, false),
    CTVRTEK(4, 11, false),
    PATEK(5, 11, false),
    SOBOTA(6, 11, true),
    NEDELE(7, 10, true);
    
    private final int idDne;
    private final int pocetHodin;
    private final boolean jeVikend;
    
    //Konstruktor pro dny
    dnyTyden(int idDneVTydnu, int pocetHodinVeDni, boolean zdaJeVikend){
        idDne = idDneVTydnu;
        pocetHodin = pocetHodinVeDni;
        jeVikend = zdaJeVikend;
    }
    
    public int getId(){
        return idDne;
    }
    public int getHodiny(){
        return pocetHodin;
    }
    public boolean getVikend(){
        return jeVikend;
    }
}
//Jen testovací změna pro push