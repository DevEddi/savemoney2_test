package com.example.savemoneyback_end;

import junit.framework.TestCase;

import static org.easymock.EasyMock.*;

public class TipoValorMockTest extends TestCase {

    protected void setUp() throws Exception {
        super.setUp();
    }

    public void testBomValorMock(){
        IReceita receitaMock = createMock(IReceita.class);
        expect(receitaMock.getValor_receita()).andReturn(99.0F);
        replay(receitaMock);

        TipoValor categoriaValor = new TipoValor();
        assertEquals("É um bom valor para começar!", categoriaValor.categoriaValor(receitaMock));
    }


    public void testDevagarVamosLongeMock(){
        IReceita receitaMock = createMock(IReceita.class);
        expect(receitaMock.getValor_receita()).andReturn(199F);
        replay(receitaMock);

        TipoValor categoriaValor = new TipoValor();
        assertEquals("Devagar vamos longe.", categoriaValor.categoriaValor(receitaMock));
    }

    public void testAcumulandoEAcumulandoMock(){
        IReceita receitaMock = createMock(IReceita.class);
        expect(receitaMock.getValor_receita()).andReturn(299F);
        replay(receitaMock);

        TipoValor categoriaValor = new TipoValor();
        assertEquals("Acumulando e acumulando", categoriaValor.categoriaValor(receitaMock));
    }

    public void testBoraBoraMock(){
        IReceita receitaMock = createMock(IReceita.class);
        expect(receitaMock.getValor_receita()).andReturn(399F);
        replay(receitaMock);

        TipoValor categoriaValor = new TipoValor();
        assertEquals("Bora bora!", categoriaValor.categoriaValor(receitaMock));
    }

    public void testQuaseQuinhentosMock(){
        IReceita receitaMock = createMock(IReceita.class);
        expect(receitaMock.getValor_receita()).andReturn(499F);
        replay(receitaMock);

        TipoValor categoriaValor = new TipoValor();
        assertEquals("Quase quinhentos, hein.", categoriaValor.categoriaValor(receitaMock));
    }

    public void testTaNoFocoMock(){
        IReceita receitaMock = createMock(IReceita.class);
        expect(receitaMock.getValor_receita()).andReturn(599F);
        replay(receitaMock);

        TipoValor categoriaValor = new TipoValor();
        assertEquals("Boa, tá no foco!", categoriaValor.categoriaValor(receitaMock));
    }

    public void testDeixouDeIrMock(){
        IReceita receitaMock = createMock(IReceita.class);
        expect(receitaMock.getValor_receita()).andReturn(699F);
        replay(receitaMock);

        TipoValor categoriaValor = new TipoValor();
        assertEquals("Deixou de ir no mercado?", categoriaValor.categoriaValor(receitaMock));
    }

    public void testGranaDaViagemMock(){
        IReceita receitaMock = createMock(IReceita.class);
        expect(receitaMock.getValor_receita()).andReturn(799F);
        replay(receitaMock);

        TipoValor categoriaValor = new TipoValor();
        assertEquals("Grana da viagem, OK!", categoriaValor.categoriaValor(receitaMock));
    }

    public void testVirouEconomistaMock(){
        IReceita receitaMock = createMock(IReceita.class);
        expect(receitaMock.getValor_receita()).andReturn(899F);
        replay(receitaMock);

        TipoValor categoriaValor = new TipoValor();
        assertEquals("Virou economista?", categoriaValor.categoriaValor(receitaMock));
    }

    public void testMilzãoMock(){
        IReceita receitaMock = createMock(IReceita.class);
        expect(receitaMock.getValor_receita()).andReturn(1000F);
        replay(receitaMock);

        TipoValor categoriaValor = new TipoValor();
        assertEquals("Milzão? Tá bem na fita!", categoriaValor.categoriaValor(receitaMock));
    }

    public void testBaitaGranaMock(){
        IReceita receitaMock = createMock(IReceita.class);
        expect(receitaMock.getValor_receita()).andReturn(1001F);
        replay(receitaMock);

        TipoValor categoriaValor = new TipoValor();
        assertEquals("Nossa! Que baita grana.", categoriaValor.categoriaValor(receitaMock));
    }

    public void testGuardaNoCofreMock(){
        IReceita receitaMock = createMock(IReceita.class);
        expect(receitaMock.getValor_receita()).andReturn(49F);
        replay(receitaMock);

        TipoValor categoriaValor = new TipoValor();
        assertEquals("Nem precisa cadastrar, guarda no cofre.", categoriaValor.categoriaValor(receitaMock));
    }
}