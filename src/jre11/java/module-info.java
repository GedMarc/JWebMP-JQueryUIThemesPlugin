module com.jwebmp.plugins.jqueryui.themes {

	exports com.jwebmp.plugins.jqui.themes;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.jwebmp.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.jqui.themes.JQUIThemesPageConfigurator;

	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.jqui.themes.implementations.JQueryUIThemesExclusionsModule;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.jqui.themes.implementations.JQueryUIThemesExclusionsModule;

	opens com.jwebmp.plugins.jqui.themes to com.fasterxml.jackson.databind, com.jwebmp.core;
}
