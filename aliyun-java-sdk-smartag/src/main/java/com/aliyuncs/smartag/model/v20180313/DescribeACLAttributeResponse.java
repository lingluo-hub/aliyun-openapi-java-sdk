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

package com.aliyuncs.smartag.model.v20180313;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.smartag.transform.v20180313.DescribeACLAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeACLAttributeResponse extends AcsResponse {

	private Integer totalCount;

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private List<Acr> acrs;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<Acr> getAcrs() {
		return this.acrs;
	}

	public void setAcrs(List<Acr> acrs) {
		this.acrs = acrs;
	}

	public static class Acr {

		private String direction;

		private String type;

		private String ipProtocol;

		private Integer priority;

		private String aclId;

		private String policy;

		private String description;

		private Long gmtCreate;

		private String destCidr;

		private String destPortRange;

		private String name;

		private String acrId;

		private String sourceCidr;

		private String sourcePortRange;

		private List<String> dpiSignatureIds;

		private List<String> dpiGroupIds;

		public String getDirection() {
			return this.direction;
		}

		public void setDirection(String direction) {
			this.direction = direction;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getIpProtocol() {
			return this.ipProtocol;
		}

		public void setIpProtocol(String ipProtocol) {
			this.ipProtocol = ipProtocol;
		}

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public String getAclId() {
			return this.aclId;
		}

		public void setAclId(String aclId) {
			this.aclId = aclId;
		}

		public String getPolicy() {
			return this.policy;
		}

		public void setPolicy(String policy) {
			this.policy = policy;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getDestCidr() {
			return this.destCidr;
		}

		public void setDestCidr(String destCidr) {
			this.destCidr = destCidr;
		}

		public String getDestPortRange() {
			return this.destPortRange;
		}

		public void setDestPortRange(String destPortRange) {
			this.destPortRange = destPortRange;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAcrId() {
			return this.acrId;
		}

		public void setAcrId(String acrId) {
			this.acrId = acrId;
		}

		public String getSourceCidr() {
			return this.sourceCidr;
		}

		public void setSourceCidr(String sourceCidr) {
			this.sourceCidr = sourceCidr;
		}

		public String getSourcePortRange() {
			return this.sourcePortRange;
		}

		public void setSourcePortRange(String sourcePortRange) {
			this.sourcePortRange = sourcePortRange;
		}

		public List<String> getDpiSignatureIds() {
			return this.dpiSignatureIds;
		}

		public void setDpiSignatureIds(List<String> dpiSignatureIds) {
			this.dpiSignatureIds = dpiSignatureIds;
		}

		public List<String> getDpiGroupIds() {
			return this.dpiGroupIds;
		}

		public void setDpiGroupIds(List<String> dpiGroupIds) {
			this.dpiGroupIds = dpiGroupIds;
		}
	}

	@Override
	public DescribeACLAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeACLAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
