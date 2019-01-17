package com.hack23.cia.service.data.impl;

import org.hibernate.search.mapper.orm.mapping.HibernateOrmMappingDefinitionContainerContext;
import org.hibernate.search.mapper.orm.mapping.HibernateOrmSearchMappingConfigurer;
import org.hibernate.search.mapper.pojo.mapping.definition.programmatic.ProgrammaticMappingDefinitionContext;

import com.hack23.cia.model.external.riksdagen.documentcontent.impl.DocumentContentData;

public class DataSearchMapping implements HibernateOrmSearchMappingConfigurer {

	@Override
	public void configure(HibernateOrmMappingDefinitionContainerContext context) {
		ProgrammaticMappingDefinitionContext mapping = context.programmaticMapping();
		mapping.type( DocumentContentData.class )
				.indexed( ).property("hjid").documentId().property("content").genericField();
		
		
		
//		.entity(DocumentContentData.class).indexed().property("hjid", ElementType.FIELD).documentId().property("content", ElementType.METHOD).field().analyzer("se").store(Store.NO).analyze(Analyze.YES).property("id", ElementType.METHOD).field()
//		.entity(DocumentElement.class).indexed().property("id", ElementType.FIELD).documentId().property("title", ElementType.METHOD).field().analyzer("se").store(Store.NO).analyze(Analyze.YES).property("subTitle", ElementType.METHOD).field().analyzer("se").store(Store.NO).analyze(Analyze.YES)
//		.entity(DocumentStatusContainer.class).indexed().property("hjid", ElementType.FIELD).documentId().property("documentCategory", ElementType.METHOD).field().analyzer("se").store(Store.NO).analyze(Analyze.YES);

		

	}
}
