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
import com.aliyuncs.r_kvstore.transform.v20150101.DescribeDBInstanceNetInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBInstanceNetInfoResponse extends AcsResponse {

	private String instanceNetworkType;

	private String requestId;

	private List<InstanceNetInfo> netInfoItems;

	public String getInstanceNetworkType() {
		return this.instanceNetworkType;
	}

	public void setInstanceNetworkType(String instanceNetworkType) {
		this.instanceNetworkType = instanceNetworkType;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<InstanceNetInfo> getNetInfoItems() {
		return this.netInfoItems;
	}

	public void setNetInfoItems(List<InstanceNetInfo> netInfoItems) {
		this.netInfoItems = netInfoItems;
	}

	public static class InstanceNetInfo {

		private Integer directConnection;

		private String vSwitchId;

		private String dBInstanceNetType;

		private String upgradeable;

		private String expiredTime;

		private String connectionString;

		private String iPType;

		private String vPCInstanceId;

		private String port;

		private String vPCId;

		private String iPAddress;

		public Integer getDirectConnection() {
			return this.directConnection;
		}

		public void setDirectConnection(Integer directConnection) {
			this.directConnection = directConnection;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getDBInstanceNetType() {
			return this.dBInstanceNetType;
		}

		public void setDBInstanceNetType(String dBInstanceNetType) {
			this.dBInstanceNetType = dBInstanceNetType;
		}

		public String getUpgradeable() {
			return this.upgradeable;
		}

		public void setUpgradeable(String upgradeable) {
			this.upgradeable = upgradeable;
		}

		public String getExpiredTime() {
			return this.expiredTime;
		}

		public void setExpiredTime(String expiredTime) {
			this.expiredTime = expiredTime;
		}

		public String getConnectionString() {
			return this.connectionString;
		}

		public void setConnectionString(String connectionString) {
			this.connectionString = connectionString;
		}

		public String getIPType() {
			return this.iPType;
		}

		public void setIPType(String iPType) {
			this.iPType = iPType;
		}

		public String getVPCInstanceId() {
			return this.vPCInstanceId;
		}

		public void setVPCInstanceId(String vPCInstanceId) {
			this.vPCInstanceId = vPCInstanceId;
		}

		public String getPort() {
			return this.port;
		}

		public void setPort(String port) {
			this.port = port;
		}

		public String getVPCId() {
			return this.vPCId;
		}

		public void setVPCId(String vPCId) {
			this.vPCId = vPCId;
		}

		public String getIPAddress() {
			return this.iPAddress;
		}

		public void setIPAddress(String iPAddress) {
			this.iPAddress = iPAddress;
		}
	}

	@Override
	public DescribeDBInstanceNetInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBInstanceNetInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
