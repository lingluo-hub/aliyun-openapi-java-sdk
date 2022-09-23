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

package com.aliyuncs.dbs.model.v20190306;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dbs.transform.v20190306.DescribeBackupGatewayListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBackupGatewayListResponse extends AcsResponse {

	private Integer httpStatusCode;

	private Integer pageNum;

	private String requestId;

	private String errCode;

	private Boolean success;

	private String errMessage;

	private Integer totalPages;

	private Integer totalElements;

	private Integer pageSize;

	private List<BackupGateway> items;

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrCode() {
		return this.errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrMessage() {
		return this.errMessage;
	}

	public void setErrMessage(String errMessage) {
		this.errMessage = errMessage;
	}

	public Integer getTotalPages() {
		return this.totalPages;
	}

	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}

	public Integer getTotalElements() {
		return this.totalElements;
	}

	public void setTotalElements(Integer totalElements) {
		this.totalElements = totalElements;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<BackupGateway> getItems() {
		return this.items;
	}

	public void setItems(List<BackupGateway> items) {
		this.items = items;
	}

	public static class BackupGateway {

		private String displayName;

		private Long backupGatewayCreateTime;

		private String backupGatewayId;

		private String region;

		private String identifier;

		private String sourceEndpointInternetIP;

		private String backupGatewayStatus;

		private String sourceEndpointIntranetIP;

		private Long lastHeartbeatTime;

		private String sourceEndpointHostname;

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public Long getBackupGatewayCreateTime() {
			return this.backupGatewayCreateTime;
		}

		public void setBackupGatewayCreateTime(Long backupGatewayCreateTime) {
			this.backupGatewayCreateTime = backupGatewayCreateTime;
		}

		public String getBackupGatewayId() {
			return this.backupGatewayId;
		}

		public void setBackupGatewayId(String backupGatewayId) {
			this.backupGatewayId = backupGatewayId;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getIdentifier() {
			return this.identifier;
		}

		public void setIdentifier(String identifier) {
			this.identifier = identifier;
		}

		public String getSourceEndpointInternetIP() {
			return this.sourceEndpointInternetIP;
		}

		public void setSourceEndpointInternetIP(String sourceEndpointInternetIP) {
			this.sourceEndpointInternetIP = sourceEndpointInternetIP;
		}

		public String getBackupGatewayStatus() {
			return this.backupGatewayStatus;
		}

		public void setBackupGatewayStatus(String backupGatewayStatus) {
			this.backupGatewayStatus = backupGatewayStatus;
		}

		public String getSourceEndpointIntranetIP() {
			return this.sourceEndpointIntranetIP;
		}

		public void setSourceEndpointIntranetIP(String sourceEndpointIntranetIP) {
			this.sourceEndpointIntranetIP = sourceEndpointIntranetIP;
		}

		public Long getLastHeartbeatTime() {
			return this.lastHeartbeatTime;
		}

		public void setLastHeartbeatTime(Long lastHeartbeatTime) {
			this.lastHeartbeatTime = lastHeartbeatTime;
		}

		public String getSourceEndpointHostname() {
			return this.sourceEndpointHostname;
		}

		public void setSourceEndpointHostname(String sourceEndpointHostname) {
			this.sourceEndpointHostname = sourceEndpointHostname;
		}
	}

	@Override
	public DescribeBackupGatewayListResponse getInstance(UnmarshallerContext context) {
		return	DescribeBackupGatewayListResponseUnmarshaller.unmarshall(this, context);
	}
}
