/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cc.abstra.trantor.pdfconverter;

import cc.abstra.trantor.pdfconverter.exceptions.NotSupportedDocumentException;
import cc.abstra.trantor.pdfconverter.office.OfficeDocConverter;
import cc.abstra.trantor.pdfconverter.office.OfficeDocConverterFactory;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 *
 * @author obs
 */
public class OfficeOdtTest {
    String packagePath;
    @Before
    public void setUp(){
        this.packagePath = "class cc.abstra.trantor.pdfconverter.office.";
    }
    
    @Test
    public void testOdtFactoryBuilder() throws NotSupportedDocumentException{
        OfficeDocConverter converter = OfficeDocConverterFactory.getConverter("rockandroll.odt");
        Assert.assertEquals(this.packagePath+"OdtConverter", converter.getClass().toString());
    }
}