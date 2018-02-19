package za.co.mmagon.jwebswing.plugins.jqueryui.themes;

import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.Page;

class JQUIThemesPageConfiguratorTest
{

	@Test
	public void testReferences()
	{
		Page p = new Page();
		new BaseTheme().getCssReferences()
				.forEach(p::addCssReference);
		System.out.println(p.toString(0));

	}

}
