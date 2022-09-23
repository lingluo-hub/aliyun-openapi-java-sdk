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

package com.aliyuncs.cloudesl.model.v20200201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudesl.transform.v20200201.QueryContainerListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryContainerListResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String message;

	private String errorCode;

	private String errorMessage;

	private String code;

	private String dynamicCode;

	private String dynamicMessage;

	private Integer pageSize;

	private Integer pageNumber;

	private Integer totalCount;

	private List<Container> containerList;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<Container> getContainerList() {
		return this.containerList;
	}

	public void setContainerList(List<Container> containerList) {
		this.containerList = containerList;
	}

	public static class Container {

		private String containerId;

		private String containerName;

		private String description;

		private Integer topPx;

		private Integer leftPx;

		private Integer widthPx;

		private Integer heightPx;

		private String groupId;

		private String groupName;

		private String demoTemplateId;

		private String demoTemplateName;

		public String getContainerId() {
			return this.containerId;
		}

		public void setContainerId(String containerId) {
			this.containerId = containerId;
		}

		public String getContainerName() {
			return this.containerName;
		}

		public void setContainerName(String containerName) {
			this.containerName = containerName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Integer getTopPx() {
			return this.topPx;
		}

		public void setTopPx(Integer topPx) {
			this.topPx = topPx;
		}

		public Integer getLeftPx() {
			return this.leftPx;
		}

		public void setLeftPx(Integer leftPx) {
			this.leftPx = leftPx;
		}

		public Integer getWidthPx() {
			return this.widthPx;
		}

		public void setWidthPx(Integer widthPx) {
			this.widthPx = widthPx;
		}

		public Integer getHeightPx() {
			return this.heightPx;
		}

		public void setHeightPx(Integer heightPx) {
			this.heightPx = heightPx;
		}

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public String getDemoTemplateId() {
			return this.demoTemplateId;
		}

		public void setDemoTemplateId(String demoTemplateId) {
			this.demoTemplateId = demoTemplateId;
		}

		public String getDemoTemplateName() {
			return this.demoTemplateName;
		}

		public void setDemoTemplateName(String demoTemplateName) {
			this.demoTemplateName = demoTemplateName;
		}
	}

	@Override
	public QueryContainerListResponse getInstance(UnmarshallerContext context) {
		return	QueryContainerListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
