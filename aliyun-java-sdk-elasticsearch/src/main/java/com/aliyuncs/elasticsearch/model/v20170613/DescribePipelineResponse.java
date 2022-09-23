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

package com.aliyuncs.elasticsearch.model.v20170613;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.elasticsearch.transform.v20170613.DescribePipelineResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePipelineResponse extends AcsResponse {

	private String requestId;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String pipelineId;

		private String gmtUpdateTime;

		private String queueType;

		private Integer queueCheckPointWrites;

		private Integer queueMaxBytes;

		private String config;

		private Integer batchDelay;

		private Integer workers;

		private String description;

		private String gmtCreatedTime;

		private Integer batchSize;

		private String pipelineStatus;

		public String getPipelineId() {
			return this.pipelineId;
		}

		public void setPipelineId(String pipelineId) {
			this.pipelineId = pipelineId;
		}

		public String getGmtUpdateTime() {
			return this.gmtUpdateTime;
		}

		public void setGmtUpdateTime(String gmtUpdateTime) {
			this.gmtUpdateTime = gmtUpdateTime;
		}

		public String getQueueType() {
			return this.queueType;
		}

		public void setQueueType(String queueType) {
			this.queueType = queueType;
		}

		public Integer getQueueCheckPointWrites() {
			return this.queueCheckPointWrites;
		}

		public void setQueueCheckPointWrites(Integer queueCheckPointWrites) {
			this.queueCheckPointWrites = queueCheckPointWrites;
		}

		public Integer getQueueMaxBytes() {
			return this.queueMaxBytes;
		}

		public void setQueueMaxBytes(Integer queueMaxBytes) {
			this.queueMaxBytes = queueMaxBytes;
		}

		public String getConfig() {
			return this.config;
		}

		public void setConfig(String config) {
			this.config = config;
		}

		public Integer getBatchDelay() {
			return this.batchDelay;
		}

		public void setBatchDelay(Integer batchDelay) {
			this.batchDelay = batchDelay;
		}

		public Integer getWorkers() {
			return this.workers;
		}

		public void setWorkers(Integer workers) {
			this.workers = workers;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getGmtCreatedTime() {
			return this.gmtCreatedTime;
		}

		public void setGmtCreatedTime(String gmtCreatedTime) {
			this.gmtCreatedTime = gmtCreatedTime;
		}

		public Integer getBatchSize() {
			return this.batchSize;
		}

		public void setBatchSize(Integer batchSize) {
			this.batchSize = batchSize;
		}

		public String getPipelineStatus() {
			return this.pipelineStatus;
		}

		public void setPipelineStatus(String pipelineStatus) {
			this.pipelineStatus = pipelineStatus;
		}
	}

	@Override
	public DescribePipelineResponse getInstance(UnmarshallerContext context) {
		return	DescribePipelineResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
