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

package com.aliyuncs.vpc.model.v20160428;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.GetDhcpOptionsSetResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDhcpOptionsSetResponse extends AcsResponse {

	private String dhcpOptionsSetDescription;

	private String status;

	private String requestId;

	private String dhcpOptionsSetId;

	private String dhcpOptionsSetName;

	private Long ownerId;

	private List<AssociateVpc> associateVpcs;

	private DhcpOptions dhcpOptions;

	public String getDhcpOptionsSetDescription() {
		return this.dhcpOptionsSetDescription;
	}

	public void setDhcpOptionsSetDescription(String dhcpOptionsSetDescription) {
		this.dhcpOptionsSetDescription = dhcpOptionsSetDescription;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDhcpOptionsSetId() {
		return this.dhcpOptionsSetId;
	}

	public void setDhcpOptionsSetId(String dhcpOptionsSetId) {
		this.dhcpOptionsSetId = dhcpOptionsSetId;
	}

	public String getDhcpOptionsSetName() {
		return this.dhcpOptionsSetName;
	}

	public void setDhcpOptionsSetName(String dhcpOptionsSetName) {
		this.dhcpOptionsSetName = dhcpOptionsSetName;
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
	}

	public List<AssociateVpc> getAssociateVpcs() {
		return this.associateVpcs;
	}

	public void setAssociateVpcs(List<AssociateVpc> associateVpcs) {
		this.associateVpcs = associateVpcs;
	}

	public DhcpOptions getDhcpOptions() {
		return this.dhcpOptions;
	}

	public void setDhcpOptions(DhcpOptions dhcpOptions) {
		this.dhcpOptions = dhcpOptions;
	}

	public static class AssociateVpc {

		private String associateStatus;

		private String vpcId;

		public String getAssociateStatus() {
			return this.associateStatus;
		}

		public void setAssociateStatus(String associateStatus) {
			this.associateStatus = associateStatus;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}
	}

	public static class DhcpOptions {

		private String tFTPServerName;

		private String domainNameServers;

		private String domainName;

		private String bootFileName;

		public String getTFTPServerName() {
			return this.tFTPServerName;
		}

		public void setTFTPServerName(String tFTPServerName) {
			this.tFTPServerName = tFTPServerName;
		}

		public String getDomainNameServers() {
			return this.domainNameServers;
		}

		public void setDomainNameServers(String domainNameServers) {
			this.domainNameServers = domainNameServers;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getBootFileName() {
			return this.bootFileName;
		}

		public void setBootFileName(String bootFileName) {
			this.bootFileName = bootFileName;
		}
	}

	@Override
	public GetDhcpOptionsSetResponse getInstance(UnmarshallerContext context) {
		return	GetDhcpOptionsSetResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
