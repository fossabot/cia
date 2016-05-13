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

import org.springframework.stereotype.Service;

import com.hack23.cia.web.impl.ui.application.views.common.menufactory.api.PoliticianMenuItemFactory;
import com.hack23.cia.web.impl.ui.application.views.common.pagelinks.api.PageModeMenuCommand;
import com.hack23.cia.web.impl.ui.application.views.common.viewnames.PageMode;
import com.hack23.cia.web.impl.ui.application.views.common.viewnames.PoliticianPageMode;
import com.hack23.cia.web.impl.ui.application.views.common.viewnames.UserViews;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.MenuBar.MenuItem;

/**
 * The Class PoliticianMenuItemFactoryImpl.
 */
@Service
public final class PoliticianMenuItemFactoryImpl extends AbstractMenuItemFactoryImpl implements PoliticianMenuItemFactory {


	/** The Constant VOTE_HISTORY. */
	private static final String VOTE_HISTORY = "Vote history";

	/** The Constant ROLE_LIST. */
	private static final String ROLE_LIST = "RoleList";

	/** The Constant TOTAL_EXPERIENCE. */
	private static final String TOTAL_EXPERIENCE = "Total experience";

	/** The Constant DOCUMENT_HISTORY_TEXT. */
	private static final String DOCUMENT_HISTORY_TEXT = "Document history";

	/** The Constant INDICATORS_TEXT. */
	private static final String INDICATORS_TEXT = "Indicators";

	/** The Constant CHARTS_TEXT. */
	private static final String CHARTS_TEXT = "Charts";

	/** The Constant ROLE_GHANT_TEXT. */
	private static final String ROLE_GHANT_TEXT = "RoleGhant";

	/** The Constant ROLES_TEXT. */
	private static final String ROLES_TEXT = "Roles";

	/** The Constant DOCUMENTS_TEXT. */
	private static final String DOCUMENTS_TEXT = "Documents";

	/** The Constant BALLOT_DECISION_SUMMARY_TEXT. */
	private static final String BALLOT_DECISION_SUMMARY_TEXT = "Ballot Decision Summary";

	/** The Constant BALLOTS_TEXT. */
	private static final String BALLOTS_TEXT = "Ballots";

	/** The Constant DOCUMENT_ACTIVITY_TEXT. */
	private static final String DOCUMENT_ACTIVITY_TEXT = "Document Activity";
	
	/** The Constant OVERVIEW_TEXT. */
	private static final String OVERVIEW_TEXT = "Overview";

	/** The Constant PAGE_VISIT_HISTORY_TEXT. */
	private static final String PAGE_VISIT_HISTORY_TEXT = "Page Visit History";


	/**
	 * Instantiates a new politician menu item factory impl.
	 */
	public PoliticianMenuItemFactoryImpl() {
		super();
	}

	@Override
	public void createPoliticianMenuBar(final MenuBar menuBar, final String pageId) {
			initApplicationMenuBar(menuBar);

			menuBar.addItem(OVERVIEW_TEXT, null,
					new PageModeMenuCommand(UserViews.POLITICIAN_VIEW_NAME, PageMode.OVERVIEW, pageId));
			menuBar.addItem(CHARTS_TEXT, null,
					new PageModeMenuCommand(UserViews.POLITICIAN_VIEW_NAME, PageMode.CHARTS, pageId));
			menuBar.addItem(INDICATORS_TEXT, null,
					new PageModeMenuCommand(UserViews.POLITICIAN_VIEW_NAME, PageMode.INDICATORS, pageId));

			final MenuItem rolesItem = menuBar.addItem(ROLES_TEXT, null, null);

			rolesItem.addItem(TOTAL_EXPERIENCE, null, new PageModeMenuCommand(UserViews.POLITICIAN_VIEW_NAME,
					PoliticianPageMode.ROLESUMMARY.toString(), pageId));

			rolesItem.addItem(ROLE_LIST, null, new PageModeMenuCommand(UserViews.POLITICIAN_VIEW_NAME,
					PoliticianPageMode.ROLELIST.toString(), pageId));

			rolesItem.addItem(ROLE_GHANT_TEXT, null, new PageModeMenuCommand(UserViews.POLITICIAN_VIEW_NAME,
					PoliticianPageMode.ROLEGHANT.toString(), pageId));

			final MenuItem documentItem = menuBar.addItem(DOCUMENTS_TEXT, null, null);

			documentItem.addItem(DOCUMENT_ACTIVITY_TEXT, null, new PageModeMenuCommand(UserViews.POLITICIAN_VIEW_NAME,
					PoliticianPageMode.DOCUMENTACTIVITY.toString(), pageId));

			documentItem.addItem(DOCUMENT_HISTORY_TEXT, null, new PageModeMenuCommand(UserViews.POLITICIAN_VIEW_NAME,
					PoliticianPageMode.DOCUMENTHISTORY.toString(), pageId));

			final MenuItem ballotItem = menuBar.addItem(BALLOTS_TEXT, null, null);

			ballotItem.addItem(VOTE_HISTORY, null, new PageModeMenuCommand(UserViews.POLITICIAN_VIEW_NAME,
					PoliticianPageMode.VOTEHISTORY.toString(), pageId));

			ballotItem.addItem(BALLOT_DECISION_SUMMARY_TEXT, null, new PageModeMenuCommand(UserViews.POLITICIAN_VIEW_NAME,
					PoliticianPageMode.BALLOTDECISIONSUMMARY.toString(), pageId));

			menuBar.addItem(PAGE_VISIT_HISTORY_TEXT, null,
					new PageModeMenuCommand(UserViews.POLITICIAN_VIEW_NAME, PageMode.PAGEVISITHISTORY,pageId));

	}

}
