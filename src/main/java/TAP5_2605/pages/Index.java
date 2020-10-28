package TAP5_2605.pages;

import javax.inject.Inject;

import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.services.SymbolSource;

public class Index {

	static final String PROBE = "tapestry.compiled-asset-cache-dir";

	@Property
	boolean webResourcesLoaded;
	
	@Inject
	SymbolSource symbolSource;
	
	void setupRender() {
		try {
			symbolSource.valueForSymbol(PROBE);
			webResourcesLoaded = true;
		} catch (RuntimeException e) {
			webResourcesLoaded = false;
		}
	}
	
}
