package com.jwebmp.plugins.jqui.themes.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions;
import jakarta.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.Set;

public class JQUIThemesInclusionModule implements IGuiceScanModuleInclusions<JQUIThemesInclusionModule>
{
	@Override
	public @NotNull Set<String> includeModules()
	{
		Set<String> set = new HashSet<>();
		set.add("com.jwebmp.plugins.jqueryui.themes");
		return set;
	}
}
