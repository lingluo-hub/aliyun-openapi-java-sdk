/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.pts.model.v20201020;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.pts.transform.v20201020.ListJMeterReportsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListJMeterReportsResponse extends AcsResponse {

	private Long totalCount;

	private String requestId;

	private String message;

	private Integer pageSize;

	private Integer pageNumber;

	private Integer httpStatusCode;

	private String code;

	private Boolean success;

	private List<JMeterReportView> reports;

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<JMeterReportView> getReports() {
		return this.reports;
	}

	public void setReports(List<JMeterReportView> reports) {
		this.reports = reports;
	}

	public static class JMeterReportView {

		private String reportName;

		private String duration;

		private String reportId;

		private Long vum;

		private Long actualStartTime;

		public String getReportName() {
			return this.reportName;
		}

		public void setReportName(String reportName) {
			this.reportName = reportName;
		}

		public String getDuration() {
			return this.duration;
		}

		public void setDuration(String duration) {
			this.duration = duration;
		}

		public String getReportId() {
			return this.reportId;
		}

		public void setReportId(String reportId) {
			this.reportId = reportId;
		}

		public Long getVum() {
			return this.vum;
		}

		public void setVum(Long vum) {
			this.vum = vum;
		}

		public Long getActualStartTime() {
			return this.actualStartTime;
		}

		public void setActualStartTime(Long actualStartTime) {
			this.actualStartTime = actualStartTime;
		}
	}

	@Override
	public ListJMeterReportsResponse getInstance(UnmarshallerContext context) {
		return	ListJMeterReportsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
