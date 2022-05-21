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

package com.aliyuncs.retailcloud.model.v20180313;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.retailcloud.transform.v20180313.ListAppEnvironmentResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAppEnvironmentResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private String errorMsg;

	private Integer pageNumber;

	private Integer pageSize;

	private Long totalCount;

	private List<AppEnvironmentResponse> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

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

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<AppEnvironmentResponse> getData() {
		return this.data;
	}

	public void setData(List<AppEnvironmentResponse> data) {
		this.data = data;
	}

	public static class AppEnvironmentResponse {

		private Long appSchemaId;

		private String envTypeName;

		private String envName;

		private String region;

		private Long appId;

		private Long envId;

		private Integer envType;

		public Long getAppSchemaId() {
			return this.appSchemaId;
		}

		public void setAppSchemaId(Long appSchemaId) {
			this.appSchemaId = appSchemaId;
		}

		public String getEnvTypeName() {
			return this.envTypeName;
		}

		public void setEnvTypeName(String envTypeName) {
			this.envTypeName = envTypeName;
		}

		public String getEnvName() {
			return this.envName;
		}

		public void setEnvName(String envName) {
			this.envName = envName;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public Long getAppId() {
			return this.appId;
		}

		public void setAppId(Long appId) {
			this.appId = appId;
		}

		public Long getEnvId() {
			return this.envId;
		}

		public void setEnvId(Long envId) {
			this.envId = envId;
		}

		public Integer getEnvType() {
			return this.envType;
		}

		public void setEnvType(Integer envType) {
			this.envType = envType;
		}
	}

	@Override
	public ListAppEnvironmentResponse getInstance(UnmarshallerContext context) {
		return	ListAppEnvironmentResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
