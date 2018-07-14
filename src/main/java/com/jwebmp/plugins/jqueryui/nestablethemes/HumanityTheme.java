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

import com.jwebmp.base.references.CSSReference;
import com.jwebmp.htmlbuilder.css.themes.Theme;

/**
 * Implements the UI Darkness Theme
 *
 * @author MMagon
 * @version 1.0
 * @since 2014/07/05
 */
public class HumanityTheme
		extends Theme
{

	private static final long serialVersionUID = 1L;

	/**
	 * The humanity theme
	 */
	public HumanityTheme()
	{
		super("Humanity", "uihumanity", "bower_components/jquery-ui/themes/images/theme_30_humanity.png", "", "bower_components/jquery-ui/themes/images/theme_90_humanity.png");
		getCssReferences().add(new CSSReference("humanityTheme", 1.121, "bower_components/jquery-ui/themes/humanity/theme.min.css",
		                                        "https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/humanity/theme.min.css").setSpecifiedClassName("jquitheme"));
		getCssReferences().add(new CSSReference("humanityTheme2", 1.121, "bower_components/jquery-ui/themes/humanity/jquery-ui.min.css",
		                                        "https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/humanity/jquery-ui.min.css").setSpecifiedClassName("jquitheme"));
	}

}
