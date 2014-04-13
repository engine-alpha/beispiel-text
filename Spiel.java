import ea.*;

/**
 * Diese Klasse demonstriert simpel, wie man einen Text in der Engine-Alpha 
 * erstellt, benutzt und veraendert.<br /><br />
 * 
 * Notiz:<br />
 * Dieses Projekt sollte man auch in der Entwicklungsumgebung BlueJ austesten. Hierfuer ist es ausgelegt.
 * Ausserdem gilt zu beachten, dass die hier zugehoerige Font-Datei im Projektordner ist.
 * @version 2.0
 * @author  Michael Andonie
 */
public class Spiel
extends Game {
    //
    /**
     * Dieser Text wird dargestellt.
     */
    private Text text;
    
    /**
     * Konstruktor-Methode.<br />
     * Hierin wird der Text erstellt und anschliessend das Ausgabeprotokoll 
     * von der Klasse <code>Text</code> verlangt. Hierdurch kann der Nutzer sehen, welche 
     * TTF-Dateien extern geladen wurden! Diese zeile kann einem natuerlich irgendwann auf 
     * die Nerven gehen. Dann darf man sie natuerlich entfernen oder auskommentieren.
     */
    public Spiel() {
        super(500, 400, "Text-Beispiel");
        
        //Erstelle einen Text (einfacher Konstruktor - siehe DOKUMENTATION!):
        //Inhalt: "Hier kann ihre Werbung stehen!"
        //X-Koordinate der oberen linken Ecke: 20
        //Y-Koordinate der oberen linken Ecke: 40
        text = new Text("Hier kann ihre Werbung stehen!", 20, 40);
        
        //Den erstellten Text sichtbar machen!
        sichtbarMachen(text);
        
        //Protokoll aller geladenen Schriftarten anfordern:
        Text.geladeneSchriftartenAusgeben();
    }
    
    /**
     * Setzt den neuen Schriftnamen des Fonts fuer den Text.<br />
     * Damit aendert sich dieser auch.
     * @param   name    Der Name des neuen Fonts, z.B. "Times New Roman"
     */
    public void textschriftnameSetzen(String name) {
        text.fontSetzen(name);
    }
    
    /**
     * Setzt die Schriftart des Textes neu. Hierunter wird fett/kursiv verstanden.
     * @param   art Diese Zahl gibt die neue Schriftart an:<br />
     * 0: Normal<br />
     * 1: Fett<br />
     * 2: Kursiv<br />
     * 3: Fett & Kursiv
     */
    public void textschriftartSetzen(int art) {
        text.schriftartSetzen(art);
    }
    
    /**
     * Setzt die Groesse des Textes neu.
     * @param   groesse Die neue Groesse fuer den Text
     */
    public void textgroesseSetzen(int groesse) {
        text.groesseSetzen(groesse);
    }
    
    /**
     * Setzt die Farbe des Textes neu.
     * @param   farbe   Die neue Farbe des Textes als String-Wert, zum Beispiel "Rot"
     */
    public void textfarbeSetzen(String farbe) {
        text.farbeSetzen(farbe);
    }
    
    /**
     * Setzt den Inhalt des Textes neu.<br />
     * Dies bedeutet, das der Text nun einen anderen String darstellt.
     * @param   inhalt  Dieser String wird fortan sichtbar sein.
     */
    public void textinhaltSetzen(String inhalt) {
        text.inhaltSetzen(inhalt);
    }
    
    /**
     * Macht ein beliebiges Raum-Objekt sichtbar.<br />
     * Dank der Vererbungshierarchie koennen ueber 
     * diese Methode Texte wie Bilder und andere 
     * grafische Elemente mit einer Methode behandelt werden.<br />
     * Diese Methode muss noch nicht verstanden werden. Sie wird 
     * im Kapitel 'Knoten' behandelt und erklaert.
     * @param   m   Das sichtbar zu machende Raum-Objekt
     */
    public void sichtbarMachen(Raum m) {
        wurzel.add(m);
    }
    
    /**
     * Die Taste-Reagieren-Methode. Wird bei jedem Tastendruck ausgefuehrt.<br />
     * In ihr wird - wie bei dem Bilder-Beispiel auch - der Text durch die Pfeiltasten verschoben.
     * @param   tastencode  Der Zahlencode gibt an, welche Taste exakt heruntergedrueckt wurde.
     */
    @Override
    public void tasteReagieren(int tastencode) {
        switch(tastencode) {
            case 26: //Pfeil rauf
                //Verschiebe den Text um Delta-X = 0 und Delta-Y = -10
                text.verschieben(0, -10);
                break;
            case 27: //Pfeil rechts
                //Verschiebe den Text um Delta-X = 0 und Delta-Y = 0
                text.verschieben(10, 0);
                break;
            case 28: //Pfeil runter
                //Verschiebe den Text um Delta-X = 0 und Delta-Y = 10
                text.verschieben(0, 10);
                break;
            case 29: //Pfeil links
                //Verschiebe den Text um Delta-X = -10 und Delta-Y = 0
                text.verschieben(-10, 0);
                break;
        }
    }
}