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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeEventLevelCountResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEventLevelCountResponse extends AcsResponse {

	private Boolean success;

	private String code;

	private String message;

	private String requestId;

	private EventLevels eventLevels;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public EventLevels getEventLevels() {
		return this.eventLevels;
	}

	public void setEventLevels(EventLevels eventLevels) {
		this.eventLevels = eventLevels;
	}

	public static class EventLevels {

		private Integer serious;

		private Integer suspicious;

		private Integer remind;

		public Integer getSerious() {
			return this.serious;
		}

		public void setSerious(Integer serious) {
			this.serious = serious;
		}

		public Integer getSuspicious() {
			return this.suspicious;
		}

		public void setSuspicious(Integer suspicious) {
			this.suspicious = suspicious;
		}

		public Integer getRemind() {
			return this.remind;
		}

		public void setRemind(Integer remind) {
			this.remind = remind;
		}
	}

	@Override
	public DescribeEventLevelCountResponse getInstance(UnmarshallerContext context) {
		return	DescribeEventLevelCountResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
