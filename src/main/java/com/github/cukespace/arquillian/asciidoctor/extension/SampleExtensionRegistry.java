package com.github.cukespace.arquillian.asciidoctor.extension;

import org.asciidoctor.Asciidoctor;
import org.asciidoctor.extension.spi.ExtensionRegistry;

import java.util.HashMap;

public class SampleExtensionRegistry implements ExtensionRegistry {

	@Override
	public void register(Asciidoctor asciidoctor) {
		 asciidoctor.javaExtensionRegistry().postprocessor(new PostProcessorExtension(new HashMap<String, Object>()));
	}

}
