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

package com.aliyuncs.edas.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.edas.transform.v20170801.ListApplicationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListApplicationResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private List<Application> applicationList;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
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

	public List<Application> getApplicationList() {
		return this.applicationList;
	}

	public void setApplicationList(List<Application> applicationList) {
		this.applicationList = applicationList;
	}

	public static class Application {

		private String appId;

		private String regionId;

		private String name;

		private Integer instances;

		private Integer port;

		private String state;

		private Long createTime;

		private String slbIp;

		private Integer slbPort;

		private Integer slbListenerPort;

		private Integer extSlbListenerPort;

		private Long buildPackageId;

		private String extSlbIp;

		private String applicationType;

		private Integer clusterType;

		private Integer runningInstanceCount;

		private String clusterId;

		private String resourceGroupId;

		private String k8sNamespace;

		private String namespaceId;

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getInstances() {
			return this.instances;
		}

		public void setInstances(Integer instances) {
			this.instances = instances;
		}

		public Integer getPort() {
			return this.port;
		}

		public void setPort(Integer port) {
			this.port = port;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getSlbIp() {
			return this.slbIp;
		}

		public void setSlbIp(String slbIp) {
			this.slbIp = slbIp;
		}

		public Integer getSlbPort() {
			return this.slbPort;
		}

		public void setSlbPort(Integer slbPort) {
			this.slbPort = slbPort;
		}

		public Integer getSlbListenerPort() {
			return this.slbListenerPort;
		}

		public void setSlbListenerPort(Integer slbListenerPort) {
			this.slbListenerPort = slbListenerPort;
		}

		public Integer getExtSlbListenerPort() {
			return this.extSlbListenerPort;
		}

		public void setExtSlbListenerPort(Integer extSlbListenerPort) {
			this.extSlbListenerPort = extSlbListenerPort;
		}

		public Long getBuildPackageId() {
			return this.buildPackageId;
		}

		public void setBuildPackageId(Long buildPackageId) {
			this.buildPackageId = buildPackageId;
		}

		public String getExtSlbIp() {
			return this.extSlbIp;
		}

		public void setExtSlbIp(String extSlbIp) {
			this.extSlbIp = extSlbIp;
		}

		public String getApplicationType() {
			return this.applicationType;
		}

		public void setApplicationType(String applicationType) {
			this.applicationType = applicationType;
		}

		public Integer getClusterType() {
			return this.clusterType;
		}

		public void setClusterType(Integer clusterType) {
			this.clusterType = clusterType;
		}

		public Integer getRunningInstanceCount() {
			return this.runningInstanceCount;
		}

		public void setRunningInstanceCount(Integer runningInstanceCount) {
			this.runningInstanceCount = runningInstanceCount;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getK8sNamespace() {
			return this.k8sNamespace;
		}

		public void setK8sNamespace(String k8sNamespace) {
			this.k8sNamespace = k8sNamespace;
		}

		public String getNamespaceId() {
			return this.namespaceId;
		}

		public void setNamespaceId(String namespaceId) {
			this.namespaceId = namespaceId;
		}
	}

	@Override
	public ListApplicationResponse getInstance(UnmarshallerContext context) {
		return	ListApplicationResponseUnmarshaller.unmarshall(this, context);
	}
}
