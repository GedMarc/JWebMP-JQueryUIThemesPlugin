/*
 * Copyright (C) 2017 GedMarc
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
package com.jwebmp.plugins.jqueryui.themes;

import com.jwebmp.core.base.references.CSSReference;
import com.jwebmp.core.htmlbuilder.css.themes.Theme;

/**
 * The Start Theme from JQuery Theme Roller
 *
 * @author MMagon
 * @version 1.0
 * @since 2014/07/05
 */
public class SunnyTheme
		extends Theme
{


	/**
	 * A sunny theme
	 */
	public SunnyTheme()
	{
		super("Sunny", "uisunny", "bower_components/jquery-ui/themes/images/theme_30_sunny.png", "", "bower_components/jquery-ui/themes/images/theme_30_sunny.png");
		getCssReferences().add(new CSSReference("sunnyTheme", 1.121, "bower_components/jquery-ui/themes/sunny/theme.min.css",
		                                        "https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/sunny/theme.min.css").setSpecifiedClassName("jquitheme"));
		getCssReferences().add(new CSSReference("sunnyTheme2", 1.121, "bower_components/jquery-ui/themes/sunny/jquery-ui.min.css",
		                                        "https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/sunny/jquery-ui.min.css").setSpecifiedClassName("jquitheme"));
	}
}
