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

package com.aliyuncs.linkvisual.model.v20180120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkvisual.transform.v20180120.QueryEventRecordPlanDeviceByDeviceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryEventRecordPlanDeviceByDeviceResponse extends AcsResponse {

	private String code;

	private String requestId;

	private String errorMessage;

	private Boolean success;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer preRecordDuration;

		private String name;

		private String planId;

		private String templateId;

		private Integer recordDuration;

		private TemplateInfo templateInfo;

		public Integer getPreRecordDuration() {
			return this.preRecordDuration;
		}

		public void setPreRecordDuration(Integer preRecordDuration) {
			this.preRecordDuration = preRecordDuration;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPlanId() {
			return this.planId;
		}

		public void setPlanId(String planId) {
			this.planId = planId;
		}

		public String getTemplateId() {
			return this.templateId;
		}

		public void setTemplateId(String templateId) {
			this.templateId = templateId;
		}

		public Integer getRecordDuration() {
			return this.recordDuration;
		}

		public void setRecordDuration(Integer recordDuration) {
			this.recordDuration = recordDuration;
		}

		public TemplateInfo getTemplateInfo() {
			return this.templateInfo;
		}

		public void setTemplateInfo(TemplateInfo templateInfo) {
			this.templateInfo = templateInfo;
		}

		public static class TemplateInfo {

			private Integer allDay;

			private Integer _default;

			private String name;

			private String templateId;

			private List<TimeSectionListItem> timeSectionList;

			public Integer getAllDay() {
				return this.allDay;
			}

			public void setAllDay(Integer allDay) {
				this.allDay = allDay;
			}

			public Integer get_Default() {
				return this._default;
			}

			public void set_Default(Integer _default) {
				this._default = _default;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getTemplateId() {
				return this.templateId;
			}

			public void setTemplateId(String templateId) {
				this.templateId = templateId;
			}

			public List<TimeSectionListItem> getTimeSectionList() {
				return this.timeSectionList;
			}

			public void setTimeSectionList(List<TimeSectionListItem> timeSectionList) {
				this.timeSectionList = timeSectionList;
			}

			public static class TimeSectionListItem {

				private Integer end;

				private Integer dayOfWeek;

				private Integer begin;

				public Integer getEnd() {
					return this.end;
				}

				public void setEnd(Integer end) {
					this.end = end;
				}

				public Integer getDayOfWeek() {
					return this.dayOfWeek;
				}

				public void setDayOfWeek(Integer dayOfWeek) {
					this.dayOfWeek = dayOfWeek;
				}

				public Integer getBegin() {
					return this.begin;
				}

				public void setBegin(Integer begin) {
					this.begin = begin;
				}
			}
		}
	}

	@Override
	public QueryEventRecordPlanDeviceByDeviceResponse getInstance(UnmarshallerContext context) {
		return	QueryEventRecordPlanDeviceByDeviceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
