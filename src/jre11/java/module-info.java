import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.jqueryui.themes.JQUIThemesPageConfigurator;

module com.jwebmp.plugins.jqueryui.themes {

	exports com.jwebmp.plugins.jqueryui.themes;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.jwebmp.guicedinjection;

	provides IPageConfigurator with JQUIThemesPageConfigurator;

	provides IGuiceScanModuleExclusions with com.jwebmp.plugins.jqueryui.themes.implementations.JQueryUIThemesExclusionsModule;
	provides IGuiceScanJarExclusions with com.jwebmp.plugins.jqueryui.themes.implementations.JQueryUIThemesExclusionsModule;

	opens com.jwebmp.plugins.jqueryui.themes to com.fasterxml.jackson.databind, com.jwebmp.core;
}
