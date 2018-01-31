package com.github.cukespace.arquillian.asciidoctor.extension;

import org.asciidoctor.Asciidoctor;
import org.asciidoctor.extension.ExtensionGroup;
import org.asciidoctor.extension.spi.ExtensionRegistry;

import java.util.HashMap;

public class SampleExtensionRegistry implements ExtensionRegistry {

	@Override
	public void register(Asciidoctor asciidoctor) {
		 ExtensionGroup postprocessor = asciidoctor.createGroup("mygroup").postprocessor(PostProcessorExtension.class);
		 postprocessor.register();
	}

}
