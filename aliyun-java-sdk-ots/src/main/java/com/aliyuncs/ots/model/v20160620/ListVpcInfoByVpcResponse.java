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

package com.aliyuncs.ots.model.v20160620;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ots.transform.v20160620.ListVpcInfoByVpcResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListVpcInfoByVpcResponse extends AcsResponse {

	private String vpcId;

	private Long pageNum;

	private String requestId;

	private Long pageSize;

	private Long totalCount;

	private List<VpcInfo> vpcInfos;

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
	}

	public Long getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<VpcInfo> getVpcInfos() {
		return this.vpcInfos;
	}

	public void setVpcInfos(List<VpcInfo> vpcInfos) {
		this.vpcInfos = vpcInfos;
	}

	public static class VpcInfo {

		private String domain;

		private String instanceVpcName;

		private String regionNo;

		private String instanceName;

		private String endpoint;

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public String getInstanceVpcName() {
			return this.instanceVpcName;
		}

		public void setInstanceVpcName(String instanceVpcName) {
			this.instanceVpcName = instanceVpcName;
		}

		public String getRegionNo() {
			return this.regionNo;
		}

		public void setRegionNo(String regionNo) {
			this.regionNo = regionNo;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getEndpoint() {
			return this.endpoint;
		}

		public void setEndpoint(String endpoint) {
			this.endpoint = endpoint;
		}
	}

	@Override
	public ListVpcInfoByVpcResponse getInstance(UnmarshallerContext context) {
		return	ListVpcInfoByVpcResponseUnmarshaller.unmarshall(this, context);
	}
}
