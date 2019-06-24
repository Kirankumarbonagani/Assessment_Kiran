/**
 * 
 */
package com.assessment.task2.page_object_model;

import java.util.Map;

import com.assessment.report.model.Report;

/**
 * @author Kiran
 *
 */
public interface CoreInterface {
	Report test(Map<String, String> map);

	void close();
}
