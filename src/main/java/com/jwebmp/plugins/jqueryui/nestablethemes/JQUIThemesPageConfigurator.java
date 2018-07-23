/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jwebmp.plugins.jqueryui.nestablethemes;

import com.jwebmp.core.Page;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.services.IPageConfigurator;

import javax.validation.constraints.NotNull;

/**
 * @author GedMarc
 * @since 28 Feb 2017
 */
@PluginInformation(pluginName = "JQuery UI Themes",
		pluginUniqueName = "jquery-ui-themes",
		pluginDescription = "A set of prebuilt themes from the theme roller set for jquery ui",
		pluginVersion = "1.12.1",
		pluginDependancyUniqueIDs = "jquery-ui",
		pluginCategories = "jquery, ui, jquery-ui",
		pluginSubtitle = "JQuery UI " + "" + "" + "Default Themes",
		pluginGitUrl = "https://github" + "" + "" + "" + "" + "" + "" + ".com/GedMarc/JWebSwing-JQueryUIThemesPlugin",
		pluginSourceUrl = "http://jqueryui.com/",
		pluginWikiUrl = "https://github" + "" + "" + "" + "" + "" + "" + ".com/GedMarc/JWebSwing-JQueryUIThemesPlugin/wiki",
		pluginOriginalHomepage = "http://jqueryui.com/themeroller/",
		pluginDownloadUrl = "https://sourceforge" + "" + "" + "" + ".net/projects/jwebswing/files/plugins/JQueryUIThemesPlugin.jar/download",
		pluginIconUrl = "bower_components/jquery-ui/themes/themeroller_icon.jpg",
		pluginIconImageUrl = "bower_components/jquery-ui/themes/themeroller_example.jpg",
		pluginLastUpdatedDate = "2017/03/04")
public class JQUIThemesPageConfigurator
		implements IPageConfigurator
{

	private static final long serialVersionUID = 1L;

	private static com.jwebmp.plugins.jqueryui.nestablethemes.JQUIThemes theme = com.jwebmp.plugins.jqueryui.nestablethemes.JQUIThemes.Base;

	public JQUIThemesPageConfigurator()
	{
		//Nothing Needed
	}

	/**
	 * Sets the default theme to load the page with
	 *
	 * @return
	 */
	@NotNull
	public static com.jwebmp.plugins.jqueryui.nestablethemes.JQUIThemes getTheme()
	{
		return theme;
	}

	/**
	 * Sets the default theme to load the page with
	 *
	 * @param theme
	 */
	public static void setTheme(@NotNull com.jwebmp.plugins.jqueryui.nestablethemes.JQUIThemes theme)
	{
		JQUIThemesPageConfigurator.theme = theme;
	}

	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured())
		{
			theme.getTheme()
			     .getCssReferences()
			     .forEach(a -> page.getBody()
			                       .addCssReference(a));
		}
		return page;
	}
}
