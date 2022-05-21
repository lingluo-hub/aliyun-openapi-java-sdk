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

package com.aliyuncs.cbn.model.v20170912;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cbn.transform.v20170912.DescribeCenVbrHealthCheckResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCenVbrHealthCheckResponse extends AcsResponse {

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private Integer totalCount;

	private List<VbrHealthCheck> vbrHealthChecks;

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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<VbrHealthCheck> getVbrHealthChecks() {
		return this.vbrHealthChecks;
	}

	public void setVbrHealthChecks(List<VbrHealthCheck> vbrHealthChecks) {
		this.vbrHealthChecks = vbrHealthChecks;
	}

	public static class VbrHealthCheck {

		private String healthCheckTargetIp;

		private String vbrInstanceId;

		private String vbrInstanceRegionId;

		private Long delay;

		private String linkStatus;

		private String cenId;

		private Integer healthyThreshold;

		private Integer healthCheckInterval;

		private String healthCheckSourceIp;

		private Long packetLoss;

		private Boolean healthCheckOnly;

		public String getHealthCheckTargetIp() {
			return this.healthCheckTargetIp;
		}

		public void setHealthCheckTargetIp(String healthCheckTargetIp) {
			this.healthCheckTargetIp = healthCheckTargetIp;
		}

		public String getVbrInstanceId() {
			return this.vbrInstanceId;
		}

		public void setVbrInstanceId(String vbrInstanceId) {
			this.vbrInstanceId = vbrInstanceId;
		}

		public String getVbrInstanceRegionId() {
			return this.vbrInstanceRegionId;
		}

		public void setVbrInstanceRegionId(String vbrInstanceRegionId) {
			this.vbrInstanceRegionId = vbrInstanceRegionId;
		}

		public Long getDelay() {
			return this.delay;
		}

		public void setDelay(Long delay) {
			this.delay = delay;
		}

		public String getLinkStatus() {
			return this.linkStatus;
		}

		public void setLinkStatus(String linkStatus) {
			this.linkStatus = linkStatus;
		}

		public String getCenId() {
			return this.cenId;
		}

		public void setCenId(String cenId) {
			this.cenId = cenId;
		}

		public Integer getHealthyThreshold() {
			return this.healthyThreshold;
		}

		public void setHealthyThreshold(Integer healthyThreshold) {
			this.healthyThreshold = healthyThreshold;
		}

		public Integer getHealthCheckInterval() {
			return this.healthCheckInterval;
		}

		public void setHealthCheckInterval(Integer healthCheckInterval) {
			this.healthCheckInterval = healthCheckInterval;
		}

		public String getHealthCheckSourceIp() {
			return this.healthCheckSourceIp;
		}

		public void setHealthCheckSourceIp(String healthCheckSourceIp) {
			this.healthCheckSourceIp = healthCheckSourceIp;
		}

		public Long getPacketLoss() {
			return this.packetLoss;
		}

		public void setPacketLoss(Long packetLoss) {
			this.packetLoss = packetLoss;
		}

		public Boolean getHealthCheckOnly() {
			return this.healthCheckOnly;
		}

		public void setHealthCheckOnly(Boolean healthCheckOnly) {
			this.healthCheckOnly = healthCheckOnly;
		}
	}

	@Override
	public DescribeCenVbrHealthCheckResponse getInstance(UnmarshallerContext context) {
		return	DescribeCenVbrHealthCheckResponseUnmarshaller.unmarshall(this, context);
	}
}
