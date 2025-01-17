package es.upm.grise.prof2022.ex2;

import java.io.FileInputStream;
import java.util.Properties;

public class LanguageManipulation {

    private PropertiesAccess propAccess = new PropertiesAccess();

	// The strings are stored in property files under /resources
	// Each file corresponds to a Language
	// This method return the string associated with a key, e.g.,
	// translate("greeting", English) == "How are you?"
	// translate("greeting", Spanish) == "¿Cómo se encuentra?"
	//
	// See the smokeTest
    
    
    public String getText(String key, Language language) throws Exception {
        return propAccess.getText(key, language);
    }
	
}
