import com.jwebmp.plugins.jqui.themes.implementations.JQUIThemesInclusionModule;

module com.jwebmp.plugins.jqueryui.themes {

	exports com.jwebmp.plugins.jqui.themes;

	requires com.jwebmp.core;
	

	requires jakarta.validation;
	requires java.logging;
	requires com.guicedee.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.jqui.themes.JQUIThemesPageConfigurator;

	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.jqui.themes.implementations.JQueryUIThemesExclusionsModule;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions with JQUIThemesInclusionModule;
	
	opens com.jwebmp.plugins.jqui.themes to com.fasterxml.jackson.databind, com.jwebmp.core;
}
