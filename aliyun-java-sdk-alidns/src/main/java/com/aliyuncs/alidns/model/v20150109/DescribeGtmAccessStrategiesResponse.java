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

package com.aliyuncs.alidns.model.v20150109;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.alidns.transform.v20150109.DescribeGtmAccessStrategiesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGtmAccessStrategiesResponse extends AcsResponse {

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private Integer totalPages;

	private Integer totalItems;

	private List<Strategy> strategies;

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

	public Integer getTotalPages() {
		return this.totalPages;
	}

	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}

	public Integer getTotalItems() {
		return this.totalItems;
	}

	public void setTotalItems(Integer totalItems) {
		this.totalItems = totalItems;
	}

	public List<Strategy> getStrategies() {
		return this.strategies;
	}

	public void setStrategies(List<Strategy> strategies) {
		this.strategies = strategies;
	}

	public static class Strategy {

		private String accessMode;

		private String strategyName;

		private String defaultAddrPoolMonitorStatus;

		private String strategyMode;

		private String createTime;

		private String defaultAddrPoolStatus;

		private String instanceId;

		private String failoverAddrPoolId;

		private String defaultAddrPoolId;

		private String strategyId;

		private String failoverAddrPoolStatus;

		private String accessStatus;

		private String failoverAddrPoolMonitorStatus;

		private String defaultAddrPoolName;

		private String failoverAddrPoolName;

		private Long createTimestamp;

		private List<Line> lines;

		public String getAccessMode() {
			return this.accessMode;
		}

		public void setAccessMode(String accessMode) {
			this.accessMode = accessMode;
		}

		public String getStrategyName() {
			return this.strategyName;
		}

		public void setStrategyName(String strategyName) {
			this.strategyName = strategyName;
		}

		public String getDefaultAddrPoolMonitorStatus() {
			return this.defaultAddrPoolMonitorStatus;
		}

		public void setDefaultAddrPoolMonitorStatus(String defaultAddrPoolMonitorStatus) {
			this.defaultAddrPoolMonitorStatus = defaultAddrPoolMonitorStatus;
		}

		public String getStrategyMode() {
			return this.strategyMode;
		}

		public void setStrategyMode(String strategyMode) {
			this.strategyMode = strategyMode;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getDefaultAddrPoolStatus() {
			return this.defaultAddrPoolStatus;
		}

		public void setDefaultAddrPoolStatus(String defaultAddrPoolStatus) {
			this.defaultAddrPoolStatus = defaultAddrPoolStatus;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getFailoverAddrPoolId() {
			return this.failoverAddrPoolId;
		}

		public void setFailoverAddrPoolId(String failoverAddrPoolId) {
			this.failoverAddrPoolId = failoverAddrPoolId;
		}

		public String getDefaultAddrPoolId() {
			return this.defaultAddrPoolId;
		}

		public void setDefaultAddrPoolId(String defaultAddrPoolId) {
			this.defaultAddrPoolId = defaultAddrPoolId;
		}

		public String getStrategyId() {
			return this.strategyId;
		}

		public void setStrategyId(String strategyId) {
			this.strategyId = strategyId;
		}

		public String getFailoverAddrPoolStatus() {
			return this.failoverAddrPoolStatus;
		}

		public void setFailoverAddrPoolStatus(String failoverAddrPoolStatus) {
			this.failoverAddrPoolStatus = failoverAddrPoolStatus;
		}

		public String getAccessStatus() {
			return this.accessStatus;
		}

		public void setAccessStatus(String accessStatus) {
			this.accessStatus = accessStatus;
		}

		public String getFailoverAddrPoolMonitorStatus() {
			return this.failoverAddrPoolMonitorStatus;
		}

		public void setFailoverAddrPoolMonitorStatus(String failoverAddrPoolMonitorStatus) {
			this.failoverAddrPoolMonitorStatus = failoverAddrPoolMonitorStatus;
		}

		public String getDefaultAddrPoolName() {
			return this.defaultAddrPoolName;
		}

		public void setDefaultAddrPoolName(String defaultAddrPoolName) {
			this.defaultAddrPoolName = defaultAddrPoolName;
		}

		public String getFailoverAddrPoolName() {
			return this.failoverAddrPoolName;
		}

		public void setFailoverAddrPoolName(String failoverAddrPoolName) {
			this.failoverAddrPoolName = failoverAddrPoolName;
		}

		public Long getCreateTimestamp() {
			return this.createTimestamp;
		}

		public void setCreateTimestamp(Long createTimestamp) {
			this.createTimestamp = createTimestamp;
		}

		public List<Line> getLines() {
			return this.lines;
		}

		public void setLines(List<Line> lines) {
			this.lines = lines;
		}

		public static class Line {

			private String groupName;

			private String lineCode;

			private String lineName;

			private String groupCode;

			public String getGroupName() {
				return this.groupName;
			}

			public void setGroupName(String groupName) {
				this.groupName = groupName;
			}

			public String getLineCode() {
				return this.lineCode;
			}

			public void setLineCode(String lineCode) {
				this.lineCode = lineCode;
			}

			public String getLineName() {
				return this.lineName;
			}

			public void setLineName(String lineName) {
				this.lineName = lineName;
			}

			public String getGroupCode() {
				return this.groupCode;
			}

			public void setGroupCode(String groupCode) {
				this.groupCode = groupCode;
			}
		}
	}

	@Override
	public DescribeGtmAccessStrategiesResponse getInstance(UnmarshallerContext context) {
		return	DescribeGtmAccessStrategiesResponseUnmarshaller.unmarshall(this, context);
	}
}
