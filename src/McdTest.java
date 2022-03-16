import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class McdTest {

    @org.junit.jupiter.api.Test
    void calculoMcd_correcto() {
        Mcd mcd = new Mcd();
        mcd.setNum1(72);
        mcd.setNum2(16);
        assertEquals(8,mcd.calculoMcd());
    }
    @Test
    public  void calculoMcd_fallido() {
        Mcd mcd = new Mcd();
        mcd.setNum1(72);
        mcd.setNum2(16);
        assertEquals(4,mcd.calculoMcd());

    }

}