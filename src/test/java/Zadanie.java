import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

import java.util.concurrent.TimeUnit;

public class Zadanie extends Base {

    /*
    Zad. 1
    Utworzenie klasy (FAKTURA ZAGRANICZNA) w konwencji Page Object Model dla sekcji faktury dla firmy zagranicznej
    (formularz po kliknieciu "Chcę otrzymać fakturę")
    */

    @Test
    public void testFakturyZagranicznej() throws InterruptedException {
        Faktura.chceFakture();
        Faktura.fakturaZagranicznaClick();
        Faktura.nipFirmyPrefixClick();
        Faktura.nipFirmyPrefixWpisz();
        Faktura.nipFirmyPrefixZatwierdz();
        Faktura.nipFirmyClick();
        Faktura.nipFirmyWpisz();
        Faktura.nazwaFirmyClick();
        Faktura.nazwaFirmyWpisz();
        Faktura.wybierzKrajClick();
        Faktura.wybierzKrajWpisz();
        Faktura.wybierzKrajZatwierdz();
        Faktura.kodPocztowyClick();
        Faktura.kodPocztowyWpisz();
        Faktura.miastoClick();
        Faktura.miastoWpisz();
        Faktura.ulicaClick();
        Faktura.ulicaWpisz();
        Faktura.numerBudynkuClick();
        Faktura.numerBudynkuWpisz();
        Faktura.mailClick();
        Faktura.mailWpisz();
        TimeUnit.SECONDS.sleep(5);
    }

    /*  Zad. 2
    Utworzenie uniwersalnej metody w klasie pomocniej - AKCJE
    pozwalające na zaznaczenie dowolnego checkbox na stronie SzybkichNadań.
    */

    @Test
    public void Zadanie3() throws InterruptedException {
        Faktura.chceFakture();
        Akcje.zaznaczCheckbox();
        TimeUnit.SECONDS.sleep(10);
    }

}
