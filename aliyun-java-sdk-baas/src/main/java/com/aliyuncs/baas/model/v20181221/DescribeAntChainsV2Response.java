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

package com.aliyuncs.baas.model.v20181221;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.baas.transform.v20181221.DescribeAntChainsV2ResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAntChainsV2Response extends AcsResponse {

	private String httpStatusCode;

	private String requestId;

	private Boolean success;

	private String resultMessage;

	private String code;

	private String message;

	private String resultCode;

	private Result result;

	public String getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(String httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private Boolean isExist;

		private List<AntChainsItem> antChains;

		private Pagination pagination;

		public Boolean getIsExist() {
			return this.isExist;
		}

		public void setIsExist(Boolean isExist) {
			this.isExist = isExist;
		}

		public List<AntChainsItem> getAntChains() {
			return this.antChains;
		}

		public void setAntChains(List<AntChainsItem> antChains) {
			this.antChains = antChains;
		}

		public Pagination getPagination() {
			return this.pagination;
		}

		public void setPagination(Pagination pagination) {
			this.pagination = pagination;
		}

		public static class AntChainsItem {

			private Long expireTime;

			private Long createTime;

			private String restStatus;

			private String chainType;

			private Boolean isAdmin;

			private String merkleTreeSuit;

			private String memberStatus;

			private String instanceId;

			private String regionId;

			private String antChainName;

			private String network;

			private Boolean monitorStatus;

			private String tlsAlgo;

			private String version;

			private String cipherSuit;

			private String resourceSize;

			private Integer nodeNum;

			private String antChainId;

			public Long getExpireTime() {
				return this.expireTime;
			}

			public void setExpireTime(Long expireTime) {
				this.expireTime = expireTime;
			}

			public Long getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(Long createTime) {
				this.createTime = createTime;
			}

			public String getRestStatus() {
				return this.restStatus;
			}

			public void setRestStatus(String restStatus) {
				this.restStatus = restStatus;
			}

			public String getChainType() {
				return this.chainType;
			}

			public void setChainType(String chainType) {
				this.chainType = chainType;
			}

			public Boolean getIsAdmin() {
				return this.isAdmin;
			}

			public void setIsAdmin(Boolean isAdmin) {
				this.isAdmin = isAdmin;
			}

			public String getMerkleTreeSuit() {
				return this.merkleTreeSuit;
			}

			public void setMerkleTreeSuit(String merkleTreeSuit) {
				this.merkleTreeSuit = merkleTreeSuit;
			}

			public String getMemberStatus() {
				return this.memberStatus;
			}

			public void setMemberStatus(String memberStatus) {
				this.memberStatus = memberStatus;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getAntChainName() {
				return this.antChainName;
			}

			public void setAntChainName(String antChainName) {
				this.antChainName = antChainName;
			}

			public String getNetwork() {
				return this.network;
			}

			public void setNetwork(String network) {
				this.network = network;
			}

			public Boolean getMonitorStatus() {
				return this.monitorStatus;
			}

			public void setMonitorStatus(Boolean monitorStatus) {
				this.monitorStatus = monitorStatus;
			}

			public String getTlsAlgo() {
				return this.tlsAlgo;
			}

			public void setTlsAlgo(String tlsAlgo) {
				this.tlsAlgo = tlsAlgo;
			}

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}

			public String getCipherSuit() {
				return this.cipherSuit;
			}

			public void setCipherSuit(String cipherSuit) {
				this.cipherSuit = cipherSuit;
			}

			public String getResourceSize() {
				return this.resourceSize;
			}

			public void setResourceSize(String resourceSize) {
				this.resourceSize = resourceSize;
			}

			public Integer getNodeNum() {
				return this.nodeNum;
			}

			public void setNodeNum(Integer nodeNum) {
				this.nodeNum = nodeNum;
			}

			public String getAntChainId() {
				return this.antChainId;
			}

			public void setAntChainId(String antChainId) {
				this.antChainId = antChainId;
			}
		}

		public static class Pagination {

			private Integer pageSize;

			private Integer pageNumber;

			private Integer totalCount;

			public Integer getPageSize() {
				return this.pageSize;
			}

			public void setPageSize(Integer pageSize) {
				this.pageSize = pageSize;
			}

			public Integer getPageNumber() {
				return this.pageNumber;
			}

			public void setPageNumber(Integer pageNumber) {
				this.pageNumber = pageNumber;
			}

			public Integer getTotalCount() {
				return this.totalCount;
			}

			public void setTotalCount(Integer totalCount) {
				this.totalCount = totalCount;
			}
		}
	}

	@Override
	public DescribeAntChainsV2Response getInstance(UnmarshallerContext context) {
		return	DescribeAntChainsV2ResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
