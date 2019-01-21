/*
 * Copyright 2010 - 2019 James Pether Sörling
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *	$Id$
 *  $HeadURL$
*/
package com.hack23.cia.service.data.impl;

import org.hibernate.search.mapper.orm.mapping.HibernateOrmMappingDefinitionContainerContext;
import org.hibernate.search.mapper.orm.mapping.HibernateOrmSearchMappingConfigurer;
import org.hibernate.search.mapper.pojo.mapping.definition.programmatic.ProgrammaticMappingDefinitionContext;

import com.hack23.cia.model.external.riksdagen.documentcontent.impl.DocumentContentData;
import com.hack23.cia.model.external.riksdagen.dokumentlista.impl.DocumentElement;
import com.hack23.cia.model.external.riksdagen.dokumentstatus.impl.DocumentStatusContainer;

/**
 * The Class DataSearchMapping.
 */
public class DataSearchMapping implements HibernateOrmSearchMappingConfigurer {

	@Override
	public void configure(HibernateOrmMappingDefinitionContainerContext context) {
		ProgrammaticMappingDefinitionContext mapping = context.programmaticMapping();		
		mapping.type( DocumentContentData.class )
				.indexed().property("hjid").documentId().property("content").fullTextField().analyzer("se").property("id");		
//		mapping.type( DocumentElement.class )
//		.indexed( "default2").property("id").documentId().property("title").fullTextField().analyzer("se").property("subTitle").fullTextField().analyzer("se");
		mapping.type( DocumentStatusContainer.class )
		.indexed().property("hjid").documentId().property("documentCategory").fullTextField().analyzer("se");
	}
}
