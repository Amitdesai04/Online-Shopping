package com.microservices.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.support.RequestHandledEvent;

import com.sun.org.apache.xalan.internal.xsltc.dom.DocumentCache;
import com.sun.tools.doclint.DocLint;

import jdk.javadoc.doclet.Doclet;
import jdk.javadoc.internal.doclets.toolkit.util.DocLink;

@Configuration
public class SpringFoxConfiguration {

	@Bean
	public Doclet docket(Object PathSelectors){
		return new Docket(DocumentCache.SWAGGER_2).select()
                .apis(RequestHandledEvent.any())
                .paths(((Object) PathSelectors).any())
                .build();
	}
}