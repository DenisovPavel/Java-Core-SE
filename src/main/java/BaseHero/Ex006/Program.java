package BaseHero.Ex006;

import BaseHero.Ex006.Applications.Notepad;
import BaseHero.Ex006.Format.Md;
import BaseHero.Ex006.Format.*;


public class Program {
    public static void main(String[] args) {
        
        Notepad notes = new Notepad();
        notes.newFile();
        notes.currentDocument().addAllText("text1");
        notes.currentDocument().addAllText("text2");
        notes.currentDocument().addAllText("text3");
        notes.SaveAs("file1", new  BaseHero.Ex006.Format.Txt());
        notes.SaveAs("file2", new  BaseHero.Ex006.Format. Md());
        notes.SaveAs("file3", new  BaseHero.Ex006.Format.Doc());



    }
}
