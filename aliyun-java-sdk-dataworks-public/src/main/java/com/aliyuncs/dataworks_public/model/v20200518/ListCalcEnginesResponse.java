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

package com.aliyuncs.dataworks_public.model.v20200518;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20200518.ListCalcEnginesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCalcEnginesResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String requestId;

	private Boolean success;

	private Data data;

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
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

		private Integer pageNumber;

		private Integer pageSize;

		private Integer totalCount;

		private List<CalcEnginesItem> calcEngines;

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<CalcEnginesItem> getCalcEngines() {
			return this.calcEngines;
		}

		public void setCalcEngines(List<CalcEnginesItem> calcEngines) {
			this.calcEngines = calcEngines;
		}

		public static class CalcEnginesItem {

			private String bindingProjectName;

			private Boolean isDefault;

			private Integer engineId;

			private String dwRegion;

			private String taskAuthType;

			private String calcEngineType;

			private Map<Object,Object> engineInfo;

			private String envType;

			private String region;

			private String gmtCreate;

			private Integer bindingProjectId;

			private String name;

			private Long tenantId;

			public String getBindingProjectName() {
				return this.bindingProjectName;
			}

			public void setBindingProjectName(String bindingProjectName) {
				this.bindingProjectName = bindingProjectName;
			}

			public Boolean getIsDefault() {
				return this.isDefault;
			}

			public void setIsDefault(Boolean isDefault) {
				this.isDefault = isDefault;
			}

			public Integer getEngineId() {
				return this.engineId;
			}

			public void setEngineId(Integer engineId) {
				this.engineId = engineId;
			}

			public String getDwRegion() {
				return this.dwRegion;
			}

			public void setDwRegion(String dwRegion) {
				this.dwRegion = dwRegion;
			}

			public String getTaskAuthType() {
				return this.taskAuthType;
			}

			public void setTaskAuthType(String taskAuthType) {
				this.taskAuthType = taskAuthType;
			}

			public String getCalcEngineType() {
				return this.calcEngineType;
			}

			public void setCalcEngineType(String calcEngineType) {
				this.calcEngineType = calcEngineType;
			}

			public Map<Object,Object> getEngineInfo() {
				return this.engineInfo;
			}

			public void setEngineInfo(Map<Object,Object> engineInfo) {
				this.engineInfo = engineInfo;
			}

			public String getEnvType() {
				return this.envType;
			}

			public void setEnvType(String envType) {
				this.envType = envType;
			}

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public Integer getBindingProjectId() {
				return this.bindingProjectId;
			}

			public void setBindingProjectId(Integer bindingProjectId) {
				this.bindingProjectId = bindingProjectId;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Long getTenantId() {
				return this.tenantId;
			}

			public void setTenantId(Long tenantId) {
				this.tenantId = tenantId;
			}
		}
	}

	@Override
	public ListCalcEnginesResponse getInstance(UnmarshallerContext context) {
		return	ListCalcEnginesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
