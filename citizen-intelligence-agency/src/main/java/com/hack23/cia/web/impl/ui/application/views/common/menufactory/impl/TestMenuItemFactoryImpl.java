/*
 * Copyright 2014 James Pether Sörling
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
package com.hack23.cia.web.impl.ui.application.views.common.menufactory.impl;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hack23.cia.model.internal.application.data.impl.ViewWorldbankIndicatorDataCountrySummary;
import com.hack23.cia.model.internal.application.data.impl.WorldbankIndicatorDataCountrySummaryEmbeddedId;
import com.hack23.cia.service.api.ApplicationManager;
import com.hack23.cia.service.api.DataContainer;
import com.hack23.cia.web.impl.ui.application.views.common.menufactory.api.TestMenuItemFactory;
import com.hack23.cia.web.impl.ui.application.views.common.pagelinks.api.PageModeMenuCommand;
import com.hack23.cia.web.impl.ui.application.views.common.viewnames.ChartIndicators;
import com.hack23.cia.web.impl.ui.application.views.common.viewnames.PageMode;
import com.hack23.cia.web.impl.ui.application.views.common.viewnames.UserViews;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.MenuBar.MenuItem;

/**
 * The Class TestMenuItemFactoryImpl.
 */
@Service
public final class TestMenuItemFactoryImpl extends AbstractMenuItemFactoryImpl implements TestMenuItemFactory {

	/** The Constant AVERAGE_AGE. */
	private static final String AVERAGE_AGE = "Average age";

	/** The Constant PARTY_AGE. */
	private static final String PARTY_AGE = "Party Age";

	/** The Constant AVERAGE_PERCENTAGE_MALE. */
	private static final String AVERAGE_PERCENTAGE_MALE = "Average percentage male";

	/** The Constant PARTY_GENDER. */
	private static final String PARTY_GENDER = "Party Gender";

	/** The Constant COMMAND22. */
	private static final PageModeMenuCommand COMMAND22 = new PageModeMenuCommand(UserViews.TEST_CHART_VIEW_NAME, PageMode.PAGEVISITHISTORY);

	/** The Constant COMMAND21. */
	private static final PageModeMenuCommand COMMAND21 = new PageModeMenuCommand(
			UserViews.TEST_CHART_VIEW_NAME, PageMode.CHARTS, ChartIndicators.DECSIONACTIVITYBYTYPE.toString());

	/** The Constant COMMAND20. */
	private static final PageModeMenuCommand COMMAND20 = new PageModeMenuCommand(
			UserViews.TEST_CHART_VIEW_NAME, PageMode.CHARTS, ChartIndicators.DOCUMENTACTIVITYBYTYPE.toString());

	/** The Constant COMMAND19. */
	private static final PageModeMenuCommand COMMAND19 = new PageModeMenuCommand(
			UserViews.TEST_CHART_VIEW_NAME, PageMode.CHARTS, ChartIndicators.PARTYWINNER.toString());

	/** The Constant COMMAND23. */
	private static final PageModeMenuCommand COMMAND23 = new PageModeMenuCommand(
			UserViews.TEST_CHART_VIEW_NAME, PageMode.CHARTS, ChartIndicators.PARTYGENDER.toString());

	/** The Constant COMMAND24. */
	private static final PageModeMenuCommand COMMAND24 = new PageModeMenuCommand(
			UserViews.TEST_CHART_VIEW_NAME, PageMode.CHARTS, ChartIndicators.PARTYAGE.toString());


	/** The Constant COMMAND18. */
	private static final PageModeMenuCommand COMMAND18 = new PageModeMenuCommand(UserViews.TEST_CHART_VIEW_NAME, PageMode.OVERVIEW);

	/** The Constant BY_SOURCE. */
	private static final String BY_SOURCE = "By Source";

	/** The Constant DAILY_TOTAL_OF_NUMBER_OF_DECSIONS_MADE. */
	private static final String DAILY_TOTAL_OF_NUMBER_OF_DECSIONS_MADE = "daily total of number of decsions made";

	/** The Constant BY_TOPIC. */
	private static final String BY_TOPIC = "ByTopic";

	/** The Constant COUNTRY_INDICATORS_SWEDEN. */
	private static final String COUNTRY_INDICATORS_SWEDEN = "Country Indicators, Sweden";

	/** The Constant DECISION_ACTIVITY_BY_TYPE. */
	private static final String DECISION_ACTIVITY_BY_TYPE = "Decision activity by type";

	/** The Constant DAILY_TOTAL_OF_NUMBER_PUBLISHED_DOCUMENTS. */
	private static final String DAILY_TOTAL_OF_NUMBER_PUBLISHED_DOCUMENTS = "daily total of number published documents";

	/** The Constant DOCUMENT_ACTIVITY_BY_TYPE. */
	private static final String DOCUMENT_ACTIVITY_BY_TYPE = "Document activity by type";

	/** The Constant DAILY_AVERAGE_WON_BALLOTS. */
	private static final String DAILY_AVERAGE_WON_BALLOTS = "daily average % won ballots";

	/** The Constant PARTY_WINNER. */
	private static final String PARTY_WINNER = "Party Winner";

	/** The Constant SWEDISH_PARLIAMENT_INDICATORS. */
	private static final String SWEDISH_PARLIAMENT_INDICATORS = "Swedish parliament Indicators";

	/** The Constant CHARTS_TEXT. */
	private static final String CHARTS_TEXT = "Charts";

	/** The Constant OVERVIEW_TEXT. */
	private static final String OVERVIEW_TEXT = "Overview";

	/** The application manager. */
	@Autowired
	private ApplicationManager applicationManager;

	/** The Constant PAGE_VISIT_HISTORY_TEXT. */
	private static final String PAGE_VISIT_HISTORY_TEXT = "Page Visit History";

	/**
	 * Instantiates a new test menu item factory impl.
	 */
	public TestMenuItemFactoryImpl() {
		super();
	}

	@Override
	public void createTestTopicMenu(final MenuBar menuBar) {
		initApplicationMenuBar(menuBar);

		menuBar.addItem(OVERVIEW_TEXT, null,
				COMMAND18);

		final MenuItem charts = menuBar.addItem(CHARTS_TEXT, null, null);

		// Submenu item with a sub-submenu
		final MenuItem chartIndicators = charts.addItem(SWEDISH_PARLIAMENT_INDICATORS, null, null);

		final MenuItem addItem = chartIndicators.addItem(PARTY_WINNER, COMMAND19);
		addItem.setDescription(DAILY_AVERAGE_WON_BALLOTS);

		final MenuItem addItem2 = chartIndicators.addItem(PARTY_GENDER, COMMAND23);
		addItem2.setDescription(AVERAGE_PERCENTAGE_MALE);

		final MenuItem addItem3 = chartIndicators.addItem(PARTY_AGE, COMMAND24);
		addItem3.setDescription(AVERAGE_AGE);



		final MenuItem addItem4 = chartIndicators.addItem(DOCUMENT_ACTIVITY_BY_TYPE, COMMAND20);
		addItem4.setDescription(DAILY_TOTAL_OF_NUMBER_PUBLISHED_DOCUMENTS);
		final MenuItem addItem5 = chartIndicators.addItem(DECISION_ACTIVITY_BY_TYPE, COMMAND21);
		addItem5.setDescription(DAILY_TOTAL_OF_NUMBER_OF_DECSIONS_MADE);

		final DataContainer<ViewWorldbankIndicatorDataCountrySummary, WorldbankIndicatorDataCountrySummaryEmbeddedId> indicatorDataCountrSummaryDailyDataContainer = applicationManager
				.getDataContainer(ViewWorldbankIndicatorDataCountrySummary.class);

		final Map<String, List<ViewWorldbankIndicatorDataCountrySummary>> sourceIndicatorMap = indicatorDataCountrSummaryDailyDataContainer
				.getAll().parallelStream()
				.filter(t -> t != null && t.getSourceValue() != null && t.getEndYear() > 2010 && t.getDataPoint() > 10)
				.collect(Collectors.groupingBy(t -> t.getSourceValue()));

		final Map<String, List<ViewWorldbankIndicatorDataCountrySummary>> topicIndicatorMap = indicatorDataCountrSummaryDailyDataContainer
				.getAll().parallelStream()
				.filter(t -> t != null && t.getSourceValue() != null && t.getEndYear() > 2010 && t.getDataPoint() > 10)
				.flatMap(t -> Arrays.asList(t.getTopics().split(";")).stream()
						.map(topic -> new AbstractMap.SimpleEntry<>(topic, t)))

				.collect(Collectors.groupingBy(e -> e.getKey(),
						Collectors.mapping(v -> v.getValue(), Collectors.toList())));

		final MenuItem countryIndicators = charts.addItem(COUNTRY_INDICATORS_SWEDEN, null, null);

		final MenuItem byTopicItem = countryIndicators.addItem(BY_TOPIC, null);

		final MenuItem bySourceItem = countryIndicators.addItem(BY_SOURCE, null);

		addSourcesAndIndicatorsToMenu(byTopicItem, topicIndicatorMap);
		addSourcesAndIndicatorsToMenu(bySourceItem, sourceIndicatorMap);

		menuBar.addItem(PAGE_VISIT_HISTORY_TEXT, null,
				COMMAND22);

	}

	/**
	 * Adds the sources and indicators to menu.
	 *
	 * @param countryIndicators
	 *            the country indicators
	 * @param sourceIndicatorMap
	 *            the source indicator map
	 */
	private void addSourcesAndIndicatorsToMenu(final MenuItem countryIndicators,
			final Map<String, List<ViewWorldbankIndicatorDataCountrySummary>> sourceIndicatorMap) {

		final Map<String, List<ViewWorldbankIndicatorDataCountrySummary>> sortedIndicatorMap = sourceIndicatorMap
				.entrySet().stream().sorted((e1, e2) -> e1.getKey().compareTo(e2.getKey()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		for (final Entry<String, List<ViewWorldbankIndicatorDataCountrySummary>> entry : sortedIndicatorMap
				.entrySet()) {

			final MenuItem sourceItems = countryIndicators.addItem(entry.getKey(), null, null);

			final List<ViewWorldbankIndicatorDataCountrySummary> sortedEntries = entry.getValue().stream()
					.sorted((e1, e2) -> e1.getIndicatorName().compareTo(e2.getIndicatorName()))
					.collect(Collectors.toList());

			for (final ViewWorldbankIndicatorDataCountrySummary indciatorSummary : sortedEntries) {
				sourceItems.addItem(indciatorSummary.getIndicatorName(),
						new PageModeMenuCommand(UserViews.TEST_CHART_VIEW_NAME, PageMode.INDICATORS,
								indciatorSummary.getEmbeddedId().getIndicatorId()));
			}
		}

	}
}
