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
import com.aliyuncs.retailcloud.transform.v20180313.ListDeployOrdersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDeployOrdersResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private String errorMsg;

	private Integer pageNumber;

	private Integer pageSize;

	private Long totalCount;

	private List<DeployOrderInstance> data;

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

	public List<DeployOrderInstance> getData() {
		return this.data;
	}

	public void setData(List<DeployOrderInstance> data) {
		this.data = data;
	}

	public static class DeployOrderInstance {

		private Integer status;

		private String appInstanceType;

		private String deployType;

		private String userId;

		private String partitionTypeName;

		private String statusName;

		private String envType;

		private Integer totalAppInstanceCt;

		private Integer elapsedTime;

		private String description;

		private String name;

		private String deployTypeName;

		private Integer finishAppInstanceCt;

		private Long schemaId;

		private String deployPauseType;

		private Integer result;

		private String failureRate;

		private Integer totalPartitions;

		private String userNick;

		private String endTime;

		private String startTime;

		private Long deployOrderId;

		private String deployPauseTypeName;

		private String resultName;

		private Integer currentPartitionNum;

		private String partitionType;

		private Long envId;

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getAppInstanceType() {
			return this.appInstanceType;
		}

		public void setAppInstanceType(String appInstanceType) {
			this.appInstanceType = appInstanceType;
		}

		public String getDeployType() {
			return this.deployType;
		}

		public void setDeployType(String deployType) {
			this.deployType = deployType;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getPartitionTypeName() {
			return this.partitionTypeName;
		}

		public void setPartitionTypeName(String partitionTypeName) {
			this.partitionTypeName = partitionTypeName;
		}

		public String getStatusName() {
			return this.statusName;
		}

		public void setStatusName(String statusName) {
			this.statusName = statusName;
		}

		public String getEnvType() {
			return this.envType;
		}

		public void setEnvType(String envType) {
			this.envType = envType;
		}

		public Integer getTotalAppInstanceCt() {
			return this.totalAppInstanceCt;
		}

		public void setTotalAppInstanceCt(Integer totalAppInstanceCt) {
			this.totalAppInstanceCt = totalAppInstanceCt;
		}

		public Integer getElapsedTime() {
			return this.elapsedTime;
		}

		public void setElapsedTime(Integer elapsedTime) {
			this.elapsedTime = elapsedTime;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDeployTypeName() {
			return this.deployTypeName;
		}

		public void setDeployTypeName(String deployTypeName) {
			this.deployTypeName = deployTypeName;
		}

		public Integer getFinishAppInstanceCt() {
			return this.finishAppInstanceCt;
		}

		public void setFinishAppInstanceCt(Integer finishAppInstanceCt) {
			this.finishAppInstanceCt = finishAppInstanceCt;
		}

		public Long getSchemaId() {
			return this.schemaId;
		}

		public void setSchemaId(Long schemaId) {
			this.schemaId = schemaId;
		}

		public String getDeployPauseType() {
			return this.deployPauseType;
		}

		public void setDeployPauseType(String deployPauseType) {
			this.deployPauseType = deployPauseType;
		}

		public Integer getResult() {
			return this.result;
		}

		public void setResult(Integer result) {
			this.result = result;
		}

		public String getFailureRate() {
			return this.failureRate;
		}

		public void setFailureRate(String failureRate) {
			this.failureRate = failureRate;
		}

		public Integer getTotalPartitions() {
			return this.totalPartitions;
		}

		public void setTotalPartitions(Integer totalPartitions) {
			this.totalPartitions = totalPartitions;
		}

		public String getUserNick() {
			return this.userNick;
		}

		public void setUserNick(String userNick) {
			this.userNick = userNick;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public Long getDeployOrderId() {
			return this.deployOrderId;
		}

		public void setDeployOrderId(Long deployOrderId) {
			this.deployOrderId = deployOrderId;
		}

		public String getDeployPauseTypeName() {
			return this.deployPauseTypeName;
		}

		public void setDeployPauseTypeName(String deployPauseTypeName) {
			this.deployPauseTypeName = deployPauseTypeName;
		}

		public String getResultName() {
			return this.resultName;
		}

		public void setResultName(String resultName) {
			this.resultName = resultName;
		}

		public Integer getCurrentPartitionNum() {
			return this.currentPartitionNum;
		}

		public void setCurrentPartitionNum(Integer currentPartitionNum) {
			this.currentPartitionNum = currentPartitionNum;
		}

		public String getPartitionType() {
			return this.partitionType;
		}

		public void setPartitionType(String partitionType) {
			this.partitionType = partitionType;
		}

		public Long getEnvId() {
			return this.envId;
		}

		public void setEnvId(Long envId) {
			this.envId = envId;
		}
	}

	@Override
	public ListDeployOrdersResponse getInstance(UnmarshallerContext context) {
		return	ListDeployOrdersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
