package org.nightlabs.vestigo.childvm.shared.dto;

import java.io.Serializable;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class QueryExecutionStatisticSetDTO
implements Serializable
{
	private static final long serialVersionUID = 1L;

	private long queryParameterEvaluationDurationMin = Long.MAX_VALUE;
	private long queryParameterEvaluationDurationMax = Long.MIN_VALUE;
	private long queryParameterEvaluationDurationTotal;
	private long queryExecutionDuration;

	/**
	 * Get the minimum duration in milliseconds of evaluating one query parameter value.
	 * @return the minimum duration in milliseconds of evaluating one query parameter value.
	 */
	public long getQueryParameterEvaluationDurationMin() {
		return queryParameterEvaluationDurationMin;
	}
	public void setQueryParameterEvaluationDurationMin(long duration) {
		this.queryParameterEvaluationDurationMin = duration;
	}

	/**
	 * Get the maximum duration in milliseconds of evaluating one query parameter value.
	 * @return the maximum duration in milliseconds of evaluating one query parameter value.
	 */
	public long getQueryParameterEvaluationDurationMax() {
		return queryParameterEvaluationDurationMax;
	}
	public void setQueryParameterEvaluationDurationMax(long duration) {
		this.queryParameterEvaluationDurationMax = duration;
	}

	/**
	 * Get the duration in milliseconds of evaluating all query parameter values.
	 * @return the duration in milliseconds of evaluating all query parameter values.
	 */
	public long getQueryParameterEvaluationDurationTotal() {
		return queryParameterEvaluationDurationTotal;
	}
	public void setQueryParameterEvaluationDurationTotal(long duration) {
		this.queryParameterEvaluationDurationTotal = duration;
	}

	/**
	 * Get the duration in milliseconds of executing the query. This does not include any preparation
	 * or iteration over the result set. It is merely the time the <code>query.executeWithMap(...)</code>
	 * or <code>query.getResultList()</code> took.
	 * @return the duration in milliseconds of executing the query.
	 */
	public long getQueryExecutionDuration() {
		return queryExecutionDuration;
	}
	public void setQueryExecutionDuration(long duration) {
		this.queryExecutionDuration = duration;
	}
}
