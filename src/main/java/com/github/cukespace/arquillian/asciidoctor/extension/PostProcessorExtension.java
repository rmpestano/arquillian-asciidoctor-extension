package com.github.cukespace.arquillian.asciidoctor.extension;

import org.asciidoctor.ast.Document;
import org.asciidoctor.extension.Postprocessor;

import java.util.Map;

public class PostProcessorExtension extends Postprocessor {

    public PostProcessorExtension(Map<String, Object> config) {
        super(config);
    }

    @Override
    public String process(Document document, String output) {
        return output;
    }

}
