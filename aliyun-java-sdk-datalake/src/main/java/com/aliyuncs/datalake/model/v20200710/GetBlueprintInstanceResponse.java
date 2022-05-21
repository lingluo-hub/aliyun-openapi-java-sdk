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

package com.aliyuncs.datalake.model.v20200710;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.datalake.transform.v20200710.GetBlueprintInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetBlueprintInstanceResponse extends AcsResponse {

	private String requestId;

	private String success;

	private BlueprintInstance blueprintInstance;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public BlueprintInstance getBlueprintInstance() {
		return this.blueprintInstance;
	}

	public void setBlueprintInstance(BlueprintInstance blueprintInstance) {
		this.blueprintInstance = blueprintInstance;
	}

	public static class BlueprintInstance {

		private String blueprintInstanceId;

		private String blueprintType;

		private String creator;

		private String workflowId;

		private String workflowProjectId;

		private Long executeCapacity;

		private String executeParameters;

		private String executeType;

		private String name;

		private String owner;

		private String regionId;

		private String roleName;

		private String dataSourceConfig;

		private String targetDatabase;

		private String targetFormat;

		private String targetLocationUri;

		private String targetTable;

		private String gmtCreate;

		private String gmtModified;

		private Integer status;

		private String failureInfo;

		private String preProcessingConfig;

		private String targetPartitions;

		private WorkflowLastRunInstance workflowLastRunInstance;

		private Workflow workflow;

		public String getBlueprintInstanceId() {
			return this.blueprintInstanceId;
		}

		public void setBlueprintInstanceId(String blueprintInstanceId) {
			this.blueprintInstanceId = blueprintInstanceId;
		}

		public String getBlueprintType() {
			return this.blueprintType;
		}

		public void setBlueprintType(String blueprintType) {
			this.blueprintType = blueprintType;
		}

		public String getCreator() {
			return this.creator;
		}

		public void setCreator(String creator) {
			this.creator = creator;
		}

		public String getWorkflowId() {
			return this.workflowId;
		}

		public void setWorkflowId(String workflowId) {
			this.workflowId = workflowId;
		}

		public String getWorkflowProjectId() {
			return this.workflowProjectId;
		}

		public void setWorkflowProjectId(String workflowProjectId) {
			this.workflowProjectId = workflowProjectId;
		}

		public Long getExecuteCapacity() {
			return this.executeCapacity;
		}

		public void setExecuteCapacity(Long executeCapacity) {
			this.executeCapacity = executeCapacity;
		}

		public String getExecuteParameters() {
			return this.executeParameters;
		}

		public void setExecuteParameters(String executeParameters) {
			this.executeParameters = executeParameters;
		}

		public String getExecuteType() {
			return this.executeType;
		}

		public void setExecuteType(String executeType) {
			this.executeType = executeType;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getRoleName() {
			return this.roleName;
		}

		public void setRoleName(String roleName) {
			this.roleName = roleName;
		}

		public String getDataSourceConfig() {
			return this.dataSourceConfig;
		}

		public void setDataSourceConfig(String dataSourceConfig) {
			this.dataSourceConfig = dataSourceConfig;
		}

		public String getTargetDatabase() {
			return this.targetDatabase;
		}

		public void setTargetDatabase(String targetDatabase) {
			this.targetDatabase = targetDatabase;
		}

		public String getTargetFormat() {
			return this.targetFormat;
		}

		public void setTargetFormat(String targetFormat) {
			this.targetFormat = targetFormat;
		}

		public String getTargetLocationUri() {
			return this.targetLocationUri;
		}

		public void setTargetLocationUri(String targetLocationUri) {
			this.targetLocationUri = targetLocationUri;
		}

		public String getTargetTable() {
			return this.targetTable;
		}

		public void setTargetTable(String targetTable) {
			this.targetTable = targetTable;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getFailureInfo() {
			return this.failureInfo;
		}

		public void setFailureInfo(String failureInfo) {
			this.failureInfo = failureInfo;
		}

		public String getPreProcessingConfig() {
			return this.preProcessingConfig;
		}

		public void setPreProcessingConfig(String preProcessingConfig) {
			this.preProcessingConfig = preProcessingConfig;
		}

		public String getTargetPartitions() {
			return this.targetPartitions;
		}

		public void setTargetPartitions(String targetPartitions) {
			this.targetPartitions = targetPartitions;
		}

		public WorkflowLastRunInstance getWorkflowLastRunInstance() {
			return this.workflowLastRunInstance;
		}

		public void setWorkflowLastRunInstance(WorkflowLastRunInstance workflowLastRunInstance) {
			this.workflowLastRunInstance = workflowLastRunInstance;
		}

		public Workflow getWorkflow() {
			return this.workflow;
		}

		public void setWorkflow(Workflow workflow) {
			this.workflow = workflow;
		}

		public static class WorkflowLastRunInstance {

			private String clusterId;

			private Long duration;

			private String endTime;

			private String flowId;

			private String flowInstanceId;

			private String flowName;

			private String projectId;

			private String startTime;

			private String status;

			private String failureInfo;

			public String getClusterId() {
				return this.clusterId;
			}

			public void setClusterId(String clusterId) {
				this.clusterId = clusterId;
			}

			public Long getDuration() {
				return this.duration;
			}

			public void setDuration(Long duration) {
				this.duration = duration;
			}

			public String getEndTime() {
				return this.endTime;
			}

			public void setEndTime(String endTime) {
				this.endTime = endTime;
			}

			public String getFlowId() {
				return this.flowId;
			}

			public void setFlowId(String flowId) {
				this.flowId = flowId;
			}

			public String getFlowInstanceId() {
				return this.flowInstanceId;
			}

			public void setFlowInstanceId(String flowInstanceId) {
				this.flowInstanceId = flowInstanceId;
			}

			public String getFlowName() {
				return this.flowName;
			}

			public void setFlowName(String flowName) {
				this.flowName = flowName;
			}

			public String getProjectId() {
				return this.projectId;
			}

			public void setProjectId(String projectId) {
				this.projectId = projectId;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getFailureInfo() {
				return this.failureInfo;
			}

			public void setFailureInfo(String failureInfo) {
				this.failureInfo = failureInfo;
			}
		}

		public static class Workflow {

			private String workflowId;

			private String latestInstanceStatus;

			private String latestStartTime;

			private String latestEndTime;

			public String getWorkflowId() {
				return this.workflowId;
			}

			public void setWorkflowId(String workflowId) {
				this.workflowId = workflowId;
			}

			public String getLatestInstanceStatus() {
				return this.latestInstanceStatus;
			}

			public void setLatestInstanceStatus(String latestInstanceStatus) {
				this.latestInstanceStatus = latestInstanceStatus;
			}

			public String getLatestStartTime() {
				return this.latestStartTime;
			}

			public void setLatestStartTime(String latestStartTime) {
				this.latestStartTime = latestStartTime;
			}

			public String getLatestEndTime() {
				return this.latestEndTime;
			}

			public void setLatestEndTime(String latestEndTime) {
				this.latestEndTime = latestEndTime;
			}
		}
	}

	@Override
	public GetBlueprintInstanceResponse getInstance(UnmarshallerContext context) {
		return	GetBlueprintInstanceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
