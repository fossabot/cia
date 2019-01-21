module com.hack23.cia.service.data.impl {
	exports com.hack23.cia.service.data.impl;
	
	opens com.hack23.cia.service.data.impl to spring.aop, spring.core, spring.beans, spring.context, spring.context.support;

	requires java.xml.bind;
	requires java.sql;
	requires java.desktop;
	requires java.annotation;
	requires commons.beanutils;
	requires org.slf4j;
	requires spring.context;
	requires spring.context.support;
	
	requires spring.beans;
	requires spring.jdbc;
	requires spring.tx;
	requires postgresql;
	requires java.naming;
	
	requires java.persistence;
	requires org.hibernate.orm.core;
	requires java.transaction;
	requires ehcache;
	requires cache.api;

	requires spring.security.core;

	requires org.hibernate.search.engine;
	requires org.hibernate.search.backend.lucene;
	requires org.hibernate.search.mapper.pojo;
	requires org.hibernate.search.mapper.orm;	
	requires com.fasterxml.jackson.databind;
	requires aws.java.sdk.secretsmanager;
	requires aws.java.sdk.core;
	requires aws.secretsmanager.caching.java;
	
	requires liquibase.core;
	requires commons.lang;
	requires org.apache.commons.lang3;
//	requires lucene.core;
	requires lucene.analyzers.common;
	
	
	requires javers.spring;
	requires javers.spring.jpa;
	requires javers.persistence.sql;
	requires javers.core;


	requires com.google.common;

    requires com.hack23.cia.service.data.api;
}