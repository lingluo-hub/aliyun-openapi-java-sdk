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

package com.aliyuncs.r_kvstore.model.v20150101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.r_kvstore.transform.v20150101.DescribeDedicatedClusterInstanceListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDedicatedClusterInstanceListResponse extends AcsResponse {

	private Integer pageNumber;

	private Integer pageSize;

	private String requestId;

	private Integer totalCount;

	private List<InstancesItem> instances;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<InstancesItem> getInstances() {
		return this.instances;
	}

	public void setInstances(List<InstancesItem> instances) {
		this.instances = instances;
	}

	public static class InstancesItem {

		private String vpcId;

		private String characterType;

		private String vswitchId;

		private String instanceClass;

		private String maintainStartTime;

		private String createTime;

		private String connectionDomain;

		private String maintainEndTime;

		private String storageType;

		private String instanceId;

		private Long bandWidth;

		private Long currentBandWidth;

		private String engineVersion;

		private String regionId;

		private String instanceName;

		private String zoneId;

		private String clusterName;

		private String instanceStatus;

		private String engine;

		private Integer shardCount;

		private String customId;

		private Integer proxyCount;

		private String clusterId;

		private List<InstanceNodes> instanceNodeList;

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getCharacterType() {
			return this.characterType;
		}

		public void setCharacterType(String characterType) {
			this.characterType = characterType;
		}

		public String getVswitchId() {
			return this.vswitchId;
		}

		public void setVswitchId(String vswitchId) {
			this.vswitchId = vswitchId;
		}

		public String getInstanceClass() {
			return this.instanceClass;
		}

		public void setInstanceClass(String instanceClass) {
			this.instanceClass = instanceClass;
		}

		public String getMaintainStartTime() {
			return this.maintainStartTime;
		}

		public void setMaintainStartTime(String maintainStartTime) {
			this.maintainStartTime = maintainStartTime;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getConnectionDomain() {
			return this.connectionDomain;
		}

		public void setConnectionDomain(String connectionDomain) {
			this.connectionDomain = connectionDomain;
		}

		public String getMaintainEndTime() {
			return this.maintainEndTime;
		}

		public void setMaintainEndTime(String maintainEndTime) {
			this.maintainEndTime = maintainEndTime;
		}

		public String getStorageType() {
			return this.storageType;
		}

		public void setStorageType(String storageType) {
			this.storageType = storageType;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Long getBandWidth() {
			return this.bandWidth;
		}

		public void setBandWidth(Long bandWidth) {
			this.bandWidth = bandWidth;
		}

		public Long getCurrentBandWidth() {
			return this.currentBandWidth;
		}

		public void setCurrentBandWidth(Long currentBandWidth) {
			this.currentBandWidth = currentBandWidth;
		}

		public String getEngineVersion() {
			return this.engineVersion;
		}

		public void setEngineVersion(String engineVersion) {
			this.engineVersion = engineVersion;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getClusterName() {
			return this.clusterName;
		}

		public void setClusterName(String clusterName) {
			this.clusterName = clusterName;
		}

		public String getInstanceStatus() {
			return this.instanceStatus;
		}

		public void setInstanceStatus(String instanceStatus) {
			this.instanceStatus = instanceStatus;
		}

		public String getEngine() {
			return this.engine;
		}

		public void setEngine(String engine) {
			this.engine = engine;
		}

		public Integer getShardCount() {
			return this.shardCount;
		}

		public void setShardCount(Integer shardCount) {
			this.shardCount = shardCount;
		}

		public String getCustomId() {
			return this.customId;
		}

		public void setCustomId(String customId) {
			this.customId = customId;
		}

		public Integer getProxyCount() {
			return this.proxyCount;
		}

		public void setProxyCount(Integer proxyCount) {
			this.proxyCount = proxyCount;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public List<InstanceNodes> getInstanceNodeList() {
			return this.instanceNodeList;
		}

		public void setInstanceNodeList(List<InstanceNodes> instanceNodeList) {
			this.instanceNodeList = instanceNodeList;
		}

		public static class InstanceNodes {

			private String nodeIp;

			private String dedicatedHostName;

			private String nodeType;

			private String zoneId;

			private String instanceId;

			private Integer port;

			private String role;

			private Integer nodeId;

			public String getNodeIp() {
				return this.nodeIp;
			}

			public void setNodeIp(String nodeIp) {
				this.nodeIp = nodeIp;
			}

			public String getDedicatedHostName() {
				return this.dedicatedHostName;
			}

			public void setDedicatedHostName(String dedicatedHostName) {
				this.dedicatedHostName = dedicatedHostName;
			}

			public String getNodeType() {
				return this.nodeType;
			}

			public void setNodeType(String nodeType) {
				this.nodeType = nodeType;
			}

			public String getZoneId() {
				return this.zoneId;
			}

			public void setZoneId(String zoneId) {
				this.zoneId = zoneId;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public Integer getPort() {
				return this.port;
			}

			public void setPort(Integer port) {
				this.port = port;
			}

			public String getRole() {
				return this.role;
			}

			public void setRole(String role) {
				this.role = role;
			}

			public Integer getNodeId() {
				return this.nodeId;
			}

			public void setNodeId(Integer nodeId) {
				this.nodeId = nodeId;
			}
		}
	}

	@Override
	public DescribeDedicatedClusterInstanceListResponse getInstance(UnmarshallerContext context) {
		return	DescribeDedicatedClusterInstanceListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
