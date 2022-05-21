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
import com.aliyuncs.slb.transform.v20140515.RemoveVServerGroupBackendServersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RemoveVServerGroupBackendServersResponse extends AcsResponse {

	private String vServerGroupId;

	private String requestId;

	private List<BackendServer> backendServers;

	public String getVServerGroupId() {
		return this.vServerGroupId;
	}

	public void setVServerGroupId(String vServerGroupId) {
		this.vServerGroupId = vServerGroupId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<BackendServer> getBackendServers() {
		return this.backendServers;
	}

	public void setBackendServers(List<BackendServer> backendServers) {
		this.backendServers = backendServers;
	}

	public static class BackendServer {

		private String vpcId;

		private String type;

		private Integer weight;

		private String description;

		private String serverRegionId;

		private String serverIp;

		private Integer port;

		private String vbrId;

		private String serverId;

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

		public String getServerRegionId() {
			return this.serverRegionId;
		}

		public void setServerRegionId(String serverRegionId) {
			this.serverRegionId = serverRegionId;
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

		public String getVbrId() {
			return this.vbrId;
		}

		public void setVbrId(String vbrId) {
			this.vbrId = vbrId;
		}

		public String getServerId() {
			return this.serverId;
		}

		public void setServerId(String serverId) {
			this.serverId = serverId;
		}
	}

	@Override
	public RemoveVServerGroupBackendServersResponse getInstance(UnmarshallerContext context) {
		return	RemoveVServerGroupBackendServersResponseUnmarshaller.unmarshall(this, context);
	}
}
