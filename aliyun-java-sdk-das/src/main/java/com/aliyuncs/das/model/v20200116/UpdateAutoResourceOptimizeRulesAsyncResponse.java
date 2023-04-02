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

package com.aliyuncs.das.model.v20200116;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.das.transform.v20200116.UpdateAutoResourceOptimizeRulesAsyncResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateAutoResourceOptimizeRulesAsyncResponse extends AcsResponse {

	private Long code;

	private String message;

	private String requestId;

	private Boolean success;

	private Data data;

	public Long getCode() {
		return this.code;
	}

	public void setCode(Long code) {
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

		private Boolean fail;

		private String resultId;

		private Boolean isFinish;

		private String state;

		private Boolean complete;

		private Long timestamp;

		private ConfigResponse configResponse;

		public Boolean getFail() {
			return this.fail;
		}

		public void setFail(Boolean fail) {
			this.fail = fail;
		}

		public String getResultId() {
			return this.resultId;
		}

		public void setResultId(String resultId) {
			this.resultId = resultId;
		}

		public Boolean getIsFinish() {
			return this.isFinish;
		}

		public void setIsFinish(Boolean isFinish) {
			this.isFinish = isFinish;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public Boolean getComplete() {
			return this.complete;
		}

		public void setComplete(Boolean complete) {
			this.complete = complete;
		}

		public Long getTimestamp() {
			return this.timestamp;
		}

		public void setTimestamp(Long timestamp) {
			this.timestamp = timestamp;
		}

		public ConfigResponse getConfigResponse() {
			return this.configResponse;
		}

		public void setConfigResponse(ConfigResponse configResponse) {
			this.configResponse = configResponse;
		}

		public static class ConfigResponse {

			private Long totalInstanceCount;

			private Long configSuccessInstanceCount;

			private Long configFailInstanceCount;

			private List<ConfigSuccessInstanceListItem> configSuccessInstanceList;

			private List<ConfigFailInstanceListItem> configFailInstanceList;

			public Long getTotalInstanceCount() {
				return this.totalInstanceCount;
			}

			public void setTotalInstanceCount(Long totalInstanceCount) {
				this.totalInstanceCount = totalInstanceCount;
			}

			public Long getConfigSuccessInstanceCount() {
				return this.configSuccessInstanceCount;
			}

			public void setConfigSuccessInstanceCount(Long configSuccessInstanceCount) {
				this.configSuccessInstanceCount = configSuccessInstanceCount;
			}

			public Long getConfigFailInstanceCount() {
				return this.configFailInstanceCount;
			}

			public void setConfigFailInstanceCount(Long configFailInstanceCount) {
				this.configFailInstanceCount = configFailInstanceCount;
			}

			public List<ConfigSuccessInstanceListItem> getConfigSuccessInstanceList() {
				return this.configSuccessInstanceList;
			}

			public void setConfigSuccessInstanceList(List<ConfigSuccessInstanceListItem> configSuccessInstanceList) {
				this.configSuccessInstanceList = configSuccessInstanceList;
			}

			public List<ConfigFailInstanceListItem> getConfigFailInstanceList() {
				return this.configFailInstanceList;
			}

			public void setConfigFailInstanceList(List<ConfigFailInstanceListItem> configFailInstanceList) {
				this.configFailInstanceList = configFailInstanceList;
			}

			public static class ConfigSuccessInstanceListItem {

				private Boolean configSuccess;

				private String instanceId;

				public Boolean getConfigSuccess() {
					return this.configSuccess;
				}

				public void setConfigSuccess(Boolean configSuccess) {
					this.configSuccess = configSuccess;
				}

				public String getInstanceId() {
					return this.instanceId;
				}

				public void setInstanceId(String instanceId) {
					this.instanceId = instanceId;
				}
			}

			public static class ConfigFailInstanceListItem {

				private Boolean configSuccess;

				private String instanceId;

				private String errorMessage;

				public Boolean getConfigSuccess() {
					return this.configSuccess;
				}

				public void setConfigSuccess(Boolean configSuccess) {
					this.configSuccess = configSuccess;
				}

				public String getInstanceId() {
					return this.instanceId;
				}

				public void setInstanceId(String instanceId) {
					this.instanceId = instanceId;
				}

				public String getErrorMessage() {
					return this.errorMessage;
				}

				public void setErrorMessage(String errorMessage) {
					this.errorMessage = errorMessage;
				}
			}
		}
	}

	@Override
	public UpdateAutoResourceOptimizeRulesAsyncResponse getInstance(UnmarshallerContext context) {
		return	UpdateAutoResourceOptimizeRulesAsyncResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
