/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 SAP SE or an SAP affiliate company.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package com.athlon.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.athlon.fulfilmentprocess.constants.AthlonFulfilmentProcessConstants;

@SuppressWarnings("PMD")
public class AthlonFulfilmentProcessManager extends GeneratedAthlonFulfilmentProcessManager
{
	public static final AthlonFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (AthlonFulfilmentProcessManager) em.getExtension(AthlonFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
