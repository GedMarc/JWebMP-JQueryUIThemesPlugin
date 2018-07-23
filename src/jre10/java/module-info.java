import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.jqueryui.nestablethemes.JQUIThemesPageConfigurator;

module com.jwebmp.plugins.jqueryui.nestablethemes {

	exports com.jwebmp.plugins.jqueryui.nestablethemes;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;

	provides IPageConfigurator with JQUIThemesPageConfigurator;

}
