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

package com.aliyuncs.mts.model.v20140618;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.mts.transform.v20140618.AddPipelineResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class AddPipelineResponse extends AcsResponse {

	private String requestId;

	private Pipeline pipeline;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Pipeline getPipeline() {
		return this.pipeline;
	}

	public void setPipeline(Pipeline pipeline) {
		this.pipeline = pipeline;
	}

	public static class Pipeline {

		private String speed;

		private String state;

		private Long speedLevel;

		private String role;

		private String name;

		private String id;

		private Long quotaAllocate;

		private NotifyConfig notifyConfig;

		public String getSpeed() {
			return this.speed;
		}

		public void setSpeed(String speed) {
			this.speed = speed;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public Long getSpeedLevel() {
			return this.speedLevel;
		}

		public void setSpeedLevel(Long speedLevel) {
			this.speedLevel = speedLevel;
		}

		public String getRole() {
			return this.role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public Long getQuotaAllocate() {
			return this.quotaAllocate;
		}

		public void setQuotaAllocate(Long quotaAllocate) {
			this.quotaAllocate = quotaAllocate;
		}

		public NotifyConfig getNotifyConfig() {
			return this.notifyConfig;
		}

		public void setNotifyConfig(NotifyConfig notifyConfig) {
			this.notifyConfig = notifyConfig;
		}

		public static class NotifyConfig {

			private String mqTopic;

			private String queueName;

			private String mqTag;

			private String topic;

			public String getMqTopic() {
				return this.mqTopic;
			}

			public void setMqTopic(String mqTopic) {
				this.mqTopic = mqTopic;
			}

			public String getQueueName() {
				return this.queueName;
			}

			public void setQueueName(String queueName) {
				this.queueName = queueName;
			}

			public String getMqTag() {
				return this.mqTag;
			}

			public void setMqTag(String mqTag) {
				this.mqTag = mqTag;
			}

			public String getTopic() {
				return this.topic;
			}

			public void setTopic(String topic) {
				this.topic = topic;
			}
		}
	}

	@Override
	public AddPipelineResponse getInstance(UnmarshallerContext context) {
		return	AddPipelineResponseUnmarshaller.unmarshall(this, context);
	}
}
