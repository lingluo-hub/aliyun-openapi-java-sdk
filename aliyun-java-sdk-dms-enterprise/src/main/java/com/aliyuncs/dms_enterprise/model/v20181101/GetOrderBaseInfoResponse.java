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

package com.aliyuncs.dms_enterprise.model.v20181101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dms_enterprise.transform.v20181101.GetOrderBaseInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOrderBaseInfoResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private String errorMessage;

	private Boolean success;

	private OrderBaseInfo orderBaseInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public OrderBaseInfo getOrderBaseInfo() {
		return this.orderBaseInfo;
	}

	public void setOrderBaseInfo(OrderBaseInfo orderBaseInfo) {
		this.orderBaseInfo = orderBaseInfo;
	}

	public static class OrderBaseInfo {

		private String comment;

		private String createTime;

		private String committer;

		private Long workflowInstanceId;

		private Long committerId;

		private String lastModifyTime;

		private String statusCode;

		private String workflowStatusDesc;

		private String statusDesc;

		private String pluginType;

		private Long orderId;

		private List<String> relatedUserNickList;

		private List<String> relatedUserList;

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getCommitter() {
			return this.committer;
		}

		public void setCommitter(String committer) {
			this.committer = committer;
		}

		public Long getWorkflowInstanceId() {
			return this.workflowInstanceId;
		}

		public void setWorkflowInstanceId(Long workflowInstanceId) {
			this.workflowInstanceId = workflowInstanceId;
		}

		public Long getCommitterId() {
			return this.committerId;
		}

		public void setCommitterId(Long committerId) {
			this.committerId = committerId;
		}

		public String getLastModifyTime() {
			return this.lastModifyTime;
		}

		public void setLastModifyTime(String lastModifyTime) {
			this.lastModifyTime = lastModifyTime;
		}

		public String getStatusCode() {
			return this.statusCode;
		}

		public void setStatusCode(String statusCode) {
			this.statusCode = statusCode;
		}

		public String getWorkflowStatusDesc() {
			return this.workflowStatusDesc;
		}

		public void setWorkflowStatusDesc(String workflowStatusDesc) {
			this.workflowStatusDesc = workflowStatusDesc;
		}

		public String getStatusDesc() {
			return this.statusDesc;
		}

		public void setStatusDesc(String statusDesc) {
			this.statusDesc = statusDesc;
		}

		public String getPluginType() {
			return this.pluginType;
		}

		public void setPluginType(String pluginType) {
			this.pluginType = pluginType;
		}

		public Long getOrderId() {
			return this.orderId;
		}

		public void setOrderId(Long orderId) {
			this.orderId = orderId;
		}

		public List<String> getRelatedUserNickList() {
			return this.relatedUserNickList;
		}

		public void setRelatedUserNickList(List<String> relatedUserNickList) {
			this.relatedUserNickList = relatedUserNickList;
		}

		public List<String> getRelatedUserList() {
			return this.relatedUserList;
		}

		public void setRelatedUserList(List<String> relatedUserList) {
			this.relatedUserList = relatedUserList;
		}
	}

	@Override
	public GetOrderBaseInfoResponse getInstance(UnmarshallerContext context) {
		return	GetOrderBaseInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
