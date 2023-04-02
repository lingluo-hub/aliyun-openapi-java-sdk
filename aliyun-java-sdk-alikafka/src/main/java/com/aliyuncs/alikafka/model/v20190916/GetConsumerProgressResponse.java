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

package com.aliyuncs.alikafka.model.v20190916;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.alikafka.transform.v20190916.GetConsumerProgressResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetConsumerProgressResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private Boolean success;

	private ConsumerProgress consumerProgress;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
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

	public ConsumerProgress getConsumerProgress() {
		return this.consumerProgress;
	}

	public void setConsumerProgress(ConsumerProgress consumerProgress) {
		this.consumerProgress = consumerProgress;
	}

	public static class ConsumerProgress {

		private Long lastTimestamp;

		private Long totalDiff;

		private List<TopicListItem> topicList;

		public Long getLastTimestamp() {
			return this.lastTimestamp;
		}

		public void setLastTimestamp(Long lastTimestamp) {
			this.lastTimestamp = lastTimestamp;
		}

		public Long getTotalDiff() {
			return this.totalDiff;
		}

		public void setTotalDiff(Long totalDiff) {
			this.totalDiff = totalDiff;
		}

		public List<TopicListItem> getTopicList() {
			return this.topicList;
		}

		public void setTopicList(List<TopicListItem> topicList) {
			this.topicList = topicList;
		}

		public static class TopicListItem {

			private Long totalDiff;

			private Long lastTimestamp;

			private String topic;

			private List<OffsetListItem> offsetList;

			public Long getTotalDiff() {
				return this.totalDiff;
			}

			public void setTotalDiff(Long totalDiff) {
				this.totalDiff = totalDiff;
			}

			public Long getLastTimestamp() {
				return this.lastTimestamp;
			}

			public void setLastTimestamp(Long lastTimestamp) {
				this.lastTimestamp = lastTimestamp;
			}

			public String getTopic() {
				return this.topic;
			}

			public void setTopic(String topic) {
				this.topic = topic;
			}

			public List<OffsetListItem> getOffsetList() {
				return this.offsetList;
			}

			public void setOffsetList(List<OffsetListItem> offsetList) {
				this.offsetList = offsetList;
			}

			public static class OffsetListItem {

				private Integer partition;

				private Long brokerOffset;

				private Long consumerOffset;

				private Long lastTimestamp;

				public Integer getPartition() {
					return this.partition;
				}

				public void setPartition(Integer partition) {
					this.partition = partition;
				}

				public Long getBrokerOffset() {
					return this.brokerOffset;
				}

				public void setBrokerOffset(Long brokerOffset) {
					this.brokerOffset = brokerOffset;
				}

				public Long getConsumerOffset() {
					return this.consumerOffset;
				}

				public void setConsumerOffset(Long consumerOffset) {
					this.consumerOffset = consumerOffset;
				}

				public Long getLastTimestamp() {
					return this.lastTimestamp;
				}

				public void setLastTimestamp(Long lastTimestamp) {
					this.lastTimestamp = lastTimestamp;
				}
			}
		}
	}

	@Override
	public GetConsumerProgressResponse getInstance(UnmarshallerContext context) {
		return	GetConsumerProgressResponseUnmarshaller.unmarshall(this, context);
	}
}
