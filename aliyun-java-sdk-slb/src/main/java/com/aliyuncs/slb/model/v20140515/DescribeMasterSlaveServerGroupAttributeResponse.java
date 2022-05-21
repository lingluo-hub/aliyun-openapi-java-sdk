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

package com.aliyuncs.slb.model.v20140515;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.slb.transform.v20140515.DescribeMasterSlaveServerGroupAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMasterSlaveServerGroupAttributeResponse extends AcsResponse {

	private String serviceManagedMode;

	private String requestId;

	private String loadBalancerId;

	private String masterSlaveServerGroupName;

	private String masterSlaveServerGroupId;

	private List<MasterSlaveBackendServer> masterSlaveBackendServers;

	public String getServiceManagedMode() {
		return this.serviceManagedMode;
	}

	public void setServiceManagedMode(String serviceManagedMode) {
		this.serviceManagedMode = serviceManagedMode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getLoadBalancerId() {
		return this.loadBalancerId;
	}

	public void setLoadBalancerId(String loadBalancerId) {
		this.loadBalancerId = loadBalancerId;
	}

	public String getMasterSlaveServerGroupName() {
		return this.masterSlaveServerGroupName;
	}

	public void setMasterSlaveServerGroupName(String masterSlaveServerGroupName) {
		this.masterSlaveServerGroupName = masterSlaveServerGroupName;
	}

	public String getMasterSlaveServerGroupId() {
		return this.masterSlaveServerGroupId;
	}

	public void setMasterSlaveServerGroupId(String masterSlaveServerGroupId) {
		this.masterSlaveServerGroupId = masterSlaveServerGroupId;
	}

	public List<MasterSlaveBackendServer> getMasterSlaveBackendServers() {
		return this.masterSlaveBackendServers;
	}

	public void setMasterSlaveBackendServers(List<MasterSlaveBackendServer> masterSlaveBackendServers) {
		this.masterSlaveBackendServers = masterSlaveBackendServers;
	}

	public static class MasterSlaveBackendServer {

		private String vpcId;

		private String type;

		private Integer weight;

		private String description;

		private String serverIp;

		private Integer port;

		private String serverId;

		private String serverType;

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Integer getWeight() {
			return this.weight;
		}

		public void setWeight(Integer weight) {
			this.weight = weight;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getServerIp() {
			return this.serverIp;
		}

		public void setServerIp(String serverIp) {
			this.serverIp = serverIp;
		}

		public Integer getPort() {
			return this.port;
		}

		public void setPort(Integer port) {
			this.port = port;
		}

		public String getServerId() {
			return this.serverId;
		}

		public void setServerId(String serverId) {
			this.serverId = serverId;
		}

		public String getServerType() {
			return this.serverType;
		}

		public void setServerType(String serverType) {
			this.serverType = serverType;
		}
	}

	@Override
	public DescribeMasterSlaveServerGroupAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeMasterSlaveServerGroupAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
