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
import com.aliyuncs.r_kvstore.transform.v20150101.DescribeClusterMemberInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeClusterMemberInfoResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<Children> clusterChildren;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<Children> getClusterChildren() {
		return this.clusterChildren;
	}

	public void setClusterChildren(List<Children> clusterChildren) {
		this.clusterChildren = clusterChildren;
	}

	public static class Children {

		private Long capacity;

		private String userId;

		private String lockReason;

		private Integer diskSizeMB;

		private Long bandWidth;

		private Long currentBandWidth;

		private String classCode;

		private Integer creator;

		private String bizType;

		private String service;

		private Integer binlogRetentionDays;

		private String primaryInsName;

		private Integer modifier;

		private Long connections;

		private String health;

		private String resourceGroupName;

		private String nickname;

		private String serviceVersion;

		private Integer replicaSize;

		private String name;

		private Long id;

		private List<Item> items;

		public Long getCapacity() {
			return this.capacity;
		}

		public void setCapacity(Long capacity) {
			this.capacity = capacity;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getLockReason() {
			return this.lockReason;
		}

		public void setLockReason(String lockReason) {
			this.lockReason = lockReason;
		}

		public Integer getDiskSizeMB() {
			return this.diskSizeMB;
		}

		public void setDiskSizeMB(Integer diskSizeMB) {
			this.diskSizeMB = diskSizeMB;
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

		public String getClassCode() {
			return this.classCode;
		}

		public void setClassCode(String classCode) {
			this.classCode = classCode;
		}

		public Integer getCreator() {
			return this.creator;
		}

		public void setCreator(Integer creator) {
			this.creator = creator;
		}

		public String getBizType() {
			return this.bizType;
		}

		public void setBizType(String bizType) {
			this.bizType = bizType;
		}

		public String getService() {
			return this.service;
		}

		public void setService(String service) {
			this.service = service;
		}

		public Integer getBinlogRetentionDays() {
			return this.binlogRetentionDays;
		}

		public void setBinlogRetentionDays(Integer binlogRetentionDays) {
			this.binlogRetentionDays = binlogRetentionDays;
		}

		public String getPrimaryInsName() {
			return this.primaryInsName;
		}

		public void setPrimaryInsName(String primaryInsName) {
			this.primaryInsName = primaryInsName;
		}

		public Integer getModifier() {
			return this.modifier;
		}

		public void setModifier(Integer modifier) {
			this.modifier = modifier;
		}

		public Long getConnections() {
			return this.connections;
		}

		public void setConnections(Long connections) {
			this.connections = connections;
		}

		public String getHealth() {
			return this.health;
		}

		public void setHealth(String health) {
			this.health = health;
		}

		public String getResourceGroupName() {
			return this.resourceGroupName;
		}

		public void setResourceGroupName(String resourceGroupName) {
			this.resourceGroupName = resourceGroupName;
		}

		public String getNickname() {
			return this.nickname;
		}

		public void setNickname(String nickname) {
			this.nickname = nickname;
		}

		public String getServiceVersion() {
			return this.serviceVersion;
		}

		public void setServiceVersion(String serviceVersion) {
			this.serviceVersion = serviceVersion;
		}

		public Integer getReplicaSize() {
			return this.replicaSize;
		}

		public void setReplicaSize(Integer replicaSize) {
			this.replicaSize = replicaSize;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public List<Item> getItems() {
			return this.items;
		}

		public void setItems(List<Item> items) {
			this.items = items;
		}

		public static class Item {

			private String status;

			private String zoneId;

			private String hostName;

			private String ip;

			private String role;

			private Integer id;

			private List<Integer> ports;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getZoneId() {
				return this.zoneId;
			}

			public void setZoneId(String zoneId) {
				this.zoneId = zoneId;
			}

			public String getHostName() {
				return this.hostName;
			}

			public void setHostName(String hostName) {
				this.hostName = hostName;
			}

			public String getIp() {
				return this.ip;
			}

			public void setIp(String ip) {
				this.ip = ip;
			}

			public String getRole() {
				return this.role;
			}

			public void setRole(String role) {
				this.role = role;
			}

			public Integer getId() {
				return this.id;
			}

			public void setId(Integer id) {
				this.id = id;
			}

			public List<Integer> getPorts() {
				return this.ports;
			}

			public void setPorts(List<Integer> ports) {
				this.ports = ports;
			}
		}
	}

	@Override
	public DescribeClusterMemberInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeClusterMemberInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
