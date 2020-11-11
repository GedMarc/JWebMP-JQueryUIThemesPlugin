package com.jwebmp.plugins.jqui.themes.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import jakarta.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class JQueryUIThemesExclusionsModule
		implements IGuiceScanModuleExclusions<JQueryUIThemesExclusionsModule>
{
	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.jqueryui.themes");
		return strings;
	}
}
