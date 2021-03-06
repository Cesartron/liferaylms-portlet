/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.lms.service.persistence;

import com.liferay.lms.model.SurveyResult;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the survey result service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author TLS
 * @see SurveyResultPersistenceImpl
 * @see SurveyResultUtil
 * @generated
 */
public interface SurveyResultPersistence extends BasePersistence<SurveyResult> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SurveyResultUtil} to access the survey result persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the survey result in the entity cache if it is enabled.
	*
	* @param surveyResult the survey result
	*/
	public void cacheResult(com.liferay.lms.model.SurveyResult surveyResult);

	/**
	* Caches the survey results in the entity cache if it is enabled.
	*
	* @param surveyResults the survey results
	*/
	public void cacheResult(
		java.util.List<com.liferay.lms.model.SurveyResult> surveyResults);

	/**
	* Creates a new survey result with the primary key. Does not add the survey result to the database.
	*
	* @param surveyResultId the primary key for the new survey result
	* @return the new survey result
	*/
	public com.liferay.lms.model.SurveyResult create(long surveyResultId);

	/**
	* Removes the survey result with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param surveyResultId the primary key of the survey result
	* @return the survey result that was removed
	* @throws com.liferay.lms.NoSuchSurveyResultException if a survey result with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.lms.model.SurveyResult remove(long surveyResultId)
		throws com.liferay.lms.NoSuchSurveyResultException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.lms.model.SurveyResult updateImpl(
		com.liferay.lms.model.SurveyResult surveyResult, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the survey result with the primary key or throws a {@link com.liferay.lms.NoSuchSurveyResultException} if it could not be found.
	*
	* @param surveyResultId the primary key of the survey result
	* @return the survey result
	* @throws com.liferay.lms.NoSuchSurveyResultException if a survey result with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.lms.model.SurveyResult findByPrimaryKey(
		long surveyResultId)
		throws com.liferay.lms.NoSuchSurveyResultException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the survey result with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param surveyResultId the primary key of the survey result
	* @return the survey result, or <code>null</code> if a survey result with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.lms.model.SurveyResult fetchByPrimaryKey(
		long surveyResultId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the survey results where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching survey results
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.lms.model.SurveyResult> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the survey results where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of survey results
	* @param end the upper bound of the range of survey results (not inclusive)
	* @return the range of matching survey results
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.lms.model.SurveyResult> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the survey results where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of survey results
	* @param end the upper bound of the range of survey results (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching survey results
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.lms.model.SurveyResult> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first survey result in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching survey result
	* @throws com.liferay.lms.NoSuchSurveyResultException if a matching survey result could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.lms.model.SurveyResult findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.lms.NoSuchSurveyResultException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first survey result in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching survey result, or <code>null</code> if a matching survey result could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.lms.model.SurveyResult fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last survey result in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching survey result
	* @throws com.liferay.lms.NoSuchSurveyResultException if a matching survey result could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.lms.model.SurveyResult findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.lms.NoSuchSurveyResultException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last survey result in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching survey result, or <code>null</code> if a matching survey result could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.lms.model.SurveyResult fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the survey results before and after the current survey result in the ordered set where uuid = &#63;.
	*
	* @param surveyResultId the primary key of the current survey result
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next survey result
	* @throws com.liferay.lms.NoSuchSurveyResultException if a survey result with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.lms.model.SurveyResult[] findByUuid_PrevAndNext(
		long surveyResultId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.lms.NoSuchSurveyResultException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the survey results where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching survey results
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.lms.model.SurveyResult> findByUserId(
		long userId) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the survey results where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of survey results
	* @param end the upper bound of the range of survey results (not inclusive)
	* @return the range of matching survey results
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.lms.model.SurveyResult> findByUserId(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the survey results where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of survey results
	* @param end the upper bound of the range of survey results (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching survey results
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.lms.model.SurveyResult> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first survey result in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching survey result
	* @throws com.liferay.lms.NoSuchSurveyResultException if a matching survey result could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.lms.model.SurveyResult findByUserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.lms.NoSuchSurveyResultException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first survey result in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching survey result, or <code>null</code> if a matching survey result could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.lms.model.SurveyResult fetchByUserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last survey result in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching survey result
	* @throws com.liferay.lms.NoSuchSurveyResultException if a matching survey result could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.lms.model.SurveyResult findByUserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.lms.NoSuchSurveyResultException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last survey result in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching survey result, or <code>null</code> if a matching survey result could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.lms.model.SurveyResult fetchByUserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the survey results before and after the current survey result in the ordered set where userId = &#63;.
	*
	* @param surveyResultId the primary key of the current survey result
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next survey result
	* @throws com.liferay.lms.NoSuchSurveyResultException if a survey result with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.lms.model.SurveyResult[] findByUserId_PrevAndNext(
		long surveyResultId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.lms.NoSuchSurveyResultException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the survey results where actId = &#63;.
	*
	* @param actId the act ID
	* @return the matching survey results
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.lms.model.SurveyResult> findByActId(
		long actId) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the survey results where actId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param actId the act ID
	* @param start the lower bound of the range of survey results
	* @param end the upper bound of the range of survey results (not inclusive)
	* @return the range of matching survey results
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.lms.model.SurveyResult> findByActId(
		long actId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the survey results where actId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param actId the act ID
	* @param start the lower bound of the range of survey results
	* @param end the upper bound of the range of survey results (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching survey results
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.lms.model.SurveyResult> findByActId(
		long actId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first survey result in the ordered set where actId = &#63;.
	*
	* @param actId the act ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching survey result
	* @throws com.liferay.lms.NoSuchSurveyResultException if a matching survey result could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.lms.model.SurveyResult findByActId_First(long actId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.lms.NoSuchSurveyResultException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first survey result in the ordered set where actId = &#63;.
	*
	* @param actId the act ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching survey result, or <code>null</code> if a matching survey result could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.lms.model.SurveyResult fetchByActId_First(long actId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last survey result in the ordered set where actId = &#63;.
	*
	* @param actId the act ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching survey result
	* @throws com.liferay.lms.NoSuchSurveyResultException if a matching survey result could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.lms.model.SurveyResult findByActId_Last(long actId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.lms.NoSuchSurveyResultException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last survey result in the ordered set where actId = &#63;.
	*
	* @param actId the act ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching survey result, or <code>null</code> if a matching survey result could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.lms.model.SurveyResult fetchByActId_Last(long actId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the survey results before and after the current survey result in the ordered set where actId = &#63;.
	*
	* @param surveyResultId the primary key of the current survey result
	* @param actId the act ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next survey result
	* @throws com.liferay.lms.NoSuchSurveyResultException if a survey result with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.lms.model.SurveyResult[] findByActId_PrevAndNext(
		long surveyResultId, long actId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.lms.NoSuchSurveyResultException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the survey results where questionId = &#63; and actId = &#63;.
	*
	* @param questionId the question ID
	* @param actId the act ID
	* @return the matching survey results
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.lms.model.SurveyResult> findByQuestionIdActId(
		long questionId, long actId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the survey results where questionId = &#63; and actId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param questionId the question ID
	* @param actId the act ID
	* @param start the lower bound of the range of survey results
	* @param end the upper bound of the range of survey results (not inclusive)
	* @return the range of matching survey results
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.lms.model.SurveyResult> findByQuestionIdActId(
		long questionId, long actId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the survey results where questionId = &#63; and actId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param questionId the question ID
	* @param actId the act ID
	* @param start the lower bound of the range of survey results
	* @param end the upper bound of the range of survey results (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching survey results
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.lms.model.SurveyResult> findByQuestionIdActId(
		long questionId, long actId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first survey result in the ordered set where questionId = &#63; and actId = &#63;.
	*
	* @param questionId the question ID
	* @param actId the act ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching survey result
	* @throws com.liferay.lms.NoSuchSurveyResultException if a matching survey result could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.lms.model.SurveyResult findByQuestionIdActId_First(
		long questionId, long actId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.lms.NoSuchSurveyResultException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first survey result in the ordered set where questionId = &#63; and actId = &#63;.
	*
	* @param questionId the question ID
	* @param actId the act ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching survey result, or <code>null</code> if a matching survey result could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.lms.model.SurveyResult fetchByQuestionIdActId_First(
		long questionId, long actId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last survey result in the ordered set where questionId = &#63; and actId = &#63;.
	*
	* @param questionId the question ID
	* @param actId the act ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching survey result
	* @throws com.liferay.lms.NoSuchSurveyResultException if a matching survey result could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.lms.model.SurveyResult findByQuestionIdActId_Last(
		long questionId, long actId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.lms.NoSuchSurveyResultException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last survey result in the ordered set where questionId = &#63; and actId = &#63;.
	*
	* @param questionId the question ID
	* @param actId the act ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching survey result, or <code>null</code> if a matching survey result could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.lms.model.SurveyResult fetchByQuestionIdActId_Last(
		long questionId, long actId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the survey results before and after the current survey result in the ordered set where questionId = &#63; and actId = &#63;.
	*
	* @param surveyResultId the primary key of the current survey result
	* @param questionId the question ID
	* @param actId the act ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next survey result
	* @throws com.liferay.lms.NoSuchSurveyResultException if a survey result with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.lms.model.SurveyResult[] findByQuestionIdActId_PrevAndNext(
		long surveyResultId, long questionId, long actId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.lms.NoSuchSurveyResultException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the survey results where questionId = &#63;.
	*
	* @param questionId the question ID
	* @return the matching survey results
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.lms.model.SurveyResult> findByQuestionId(
		long questionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the survey results where questionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param questionId the question ID
	* @param start the lower bound of the range of survey results
	* @param end the upper bound of the range of survey results (not inclusive)
	* @return the range of matching survey results
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.lms.model.SurveyResult> findByQuestionId(
		long questionId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the survey results where questionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param questionId the question ID
	* @param start the lower bound of the range of survey results
	* @param end the upper bound of the range of survey results (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching survey results
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.lms.model.SurveyResult> findByQuestionId(
		long questionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first survey result in the ordered set where questionId = &#63;.
	*
	* @param questionId the question ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching survey result
	* @throws com.liferay.lms.NoSuchSurveyResultException if a matching survey result could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.lms.model.SurveyResult findByQuestionId_First(
		long questionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.lms.NoSuchSurveyResultException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first survey result in the ordered set where questionId = &#63;.
	*
	* @param questionId the question ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching survey result, or <code>null</code> if a matching survey result could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.lms.model.SurveyResult fetchByQuestionId_First(
		long questionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last survey result in the ordered set where questionId = &#63;.
	*
	* @param questionId the question ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching survey result
	* @throws com.liferay.lms.NoSuchSurveyResultException if a matching survey result could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.lms.model.SurveyResult findByQuestionId_Last(
		long questionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.lms.NoSuchSurveyResultException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last survey result in the ordered set where questionId = &#63;.
	*
	* @param questionId the question ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching survey result, or <code>null</code> if a matching survey result could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.lms.model.SurveyResult fetchByQuestionId_Last(
		long questionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the survey results before and after the current survey result in the ordered set where questionId = &#63;.
	*
	* @param surveyResultId the primary key of the current survey result
	* @param questionId the question ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next survey result
	* @throws com.liferay.lms.NoSuchSurveyResultException if a survey result with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.lms.model.SurveyResult[] findByQuestionId_PrevAndNext(
		long surveyResultId, long questionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.lms.NoSuchSurveyResultException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the survey results where answerId = &#63; and questionId = &#63;.
	*
	* @param answerId the answer ID
	* @param questionId the question ID
	* @return the matching survey results
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.lms.model.SurveyResult> findByAnswerIdQuestionId(
		long answerId, long questionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the survey results where answerId = &#63; and questionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param answerId the answer ID
	* @param questionId the question ID
	* @param start the lower bound of the range of survey results
	* @param end the upper bound of the range of survey results (not inclusive)
	* @return the range of matching survey results
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.lms.model.SurveyResult> findByAnswerIdQuestionId(
		long answerId, long questionId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the survey results where answerId = &#63; and questionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param answerId the answer ID
	* @param questionId the question ID
	* @param start the lower bound of the range of survey results
	* @param end the upper bound of the range of survey results (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching survey results
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.lms.model.SurveyResult> findByAnswerIdQuestionId(
		long answerId, long questionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first survey result in the ordered set where answerId = &#63; and questionId = &#63;.
	*
	* @param answerId the answer ID
	* @param questionId the question ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching survey result
	* @throws com.liferay.lms.NoSuchSurveyResultException if a matching survey result could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.lms.model.SurveyResult findByAnswerIdQuestionId_First(
		long answerId, long questionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.lms.NoSuchSurveyResultException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first survey result in the ordered set where answerId = &#63; and questionId = &#63;.
	*
	* @param answerId the answer ID
	* @param questionId the question ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching survey result, or <code>null</code> if a matching survey result could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.lms.model.SurveyResult fetchByAnswerIdQuestionId_First(
		long answerId, long questionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last survey result in the ordered set where answerId = &#63; and questionId = &#63;.
	*
	* @param answerId the answer ID
	* @param questionId the question ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching survey result
	* @throws com.liferay.lms.NoSuchSurveyResultException if a matching survey result could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.lms.model.SurveyResult findByAnswerIdQuestionId_Last(
		long answerId, long questionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.lms.NoSuchSurveyResultException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last survey result in the ordered set where answerId = &#63; and questionId = &#63;.
	*
	* @param answerId the answer ID
	* @param questionId the question ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching survey result, or <code>null</code> if a matching survey result could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.lms.model.SurveyResult fetchByAnswerIdQuestionId_Last(
		long answerId, long questionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the survey results before and after the current survey result in the ordered set where answerId = &#63; and questionId = &#63;.
	*
	* @param surveyResultId the primary key of the current survey result
	* @param answerId the answer ID
	* @param questionId the question ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next survey result
	* @throws com.liferay.lms.NoSuchSurveyResultException if a survey result with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.lms.model.SurveyResult[] findByAnswerIdQuestionId_PrevAndNext(
		long surveyResultId, long answerId, long questionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.lms.NoSuchSurveyResultException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the survey results.
	*
	* @return the survey results
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.lms.model.SurveyResult> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the survey results.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of survey results
	* @param end the upper bound of the range of survey results (not inclusive)
	* @return the range of survey results
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.lms.model.SurveyResult> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the survey results.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of survey results
	* @param end the upper bound of the range of survey results (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of survey results
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.lms.model.SurveyResult> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the survey results where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the survey results where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the survey results where actId = &#63; from the database.
	*
	* @param actId the act ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByActId(long actId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the survey results where questionId = &#63; and actId = &#63; from the database.
	*
	* @param questionId the question ID
	* @param actId the act ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByQuestionIdActId(long questionId, long actId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the survey results where questionId = &#63; from the database.
	*
	* @param questionId the question ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByQuestionId(long questionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the survey results where answerId = &#63; and questionId = &#63; from the database.
	*
	* @param answerId the answer ID
	* @param questionId the question ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByAnswerIdQuestionId(long answerId, long questionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the survey results from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of survey results where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching survey results
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of survey results where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching survey results
	* @throws SystemException if a system exception occurred
	*/
	public int countByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of survey results where actId = &#63;.
	*
	* @param actId the act ID
	* @return the number of matching survey results
	* @throws SystemException if a system exception occurred
	*/
	public int countByActId(long actId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of survey results where questionId = &#63; and actId = &#63;.
	*
	* @param questionId the question ID
	* @param actId the act ID
	* @return the number of matching survey results
	* @throws SystemException if a system exception occurred
	*/
	public int countByQuestionIdActId(long questionId, long actId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of survey results where questionId = &#63;.
	*
	* @param questionId the question ID
	* @return the number of matching survey results
	* @throws SystemException if a system exception occurred
	*/
	public int countByQuestionId(long questionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of survey results where answerId = &#63; and questionId = &#63;.
	*
	* @param answerId the answer ID
	* @param questionId the question ID
	* @return the number of matching survey results
	* @throws SystemException if a system exception occurred
	*/
	public int countByAnswerIdQuestionId(long answerId, long questionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of survey results.
	*
	* @return the number of survey results
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}