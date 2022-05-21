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

package com.aliyuncs.linkwan.model.v20190301;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkwan.transform.v20190301.ListNodesByNodeGroupIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListNodesByNodeGroupIdResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long totalCount;

		private List<Node> list;

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public List<Node> getList() {
			return this.list;
		}

		public void setList(List<Node> list) {
			this.list = list;
		}

		public static class Node {

			private String devEui;

			private String devAddr;

			private String classMode;

			private Long lastJoinMillis;

			private Long boundMillis;

			private String multicastGroupId;

			private String authTypes;

			private String joinEui;

			private String appkey;

			private String nodeType;

			public String getDevEui() {
				return this.devEui;
			}

			public void setDevEui(String devEui) {
				this.devEui = devEui;
			}

			public String getDevAddr() {
				return this.devAddr;
			}

			public void setDevAddr(String devAddr) {
				this.devAddr = devAddr;
			}

			public String getClassMode() {
				return this.classMode;
			}

			public void setClassMode(String classMode) {
				this.classMode = classMode;
			}

			public Long getLastJoinMillis() {
				return this.lastJoinMillis;
			}

			public void setLastJoinMillis(Long lastJoinMillis) {
				this.lastJoinMillis = lastJoinMillis;
			}

			public Long getBoundMillis() {
				return this.boundMillis;
			}

			public void setBoundMillis(Long boundMillis) {
				this.boundMillis = boundMillis;
			}

			public String getMulticastGroupId() {
				return this.multicastGroupId;
			}

			public void setMulticastGroupId(String multicastGroupId) {
				this.multicastGroupId = multicastGroupId;
			}

			public String getAuthTypes() {
				return this.authTypes;
			}

			public void setAuthTypes(String authTypes) {
				this.authTypes = authTypes;
			}

			public String getJoinEui() {
				return this.joinEui;
			}

			public void setJoinEui(String joinEui) {
				this.joinEui = joinEui;
			}

			public String getAppkey() {
				return this.appkey;
			}

			public void setAppkey(String appkey) {
				this.appkey = appkey;
			}

			public String getNodeType() {
				return this.nodeType;
			}

			public void setNodeType(String nodeType) {
				this.nodeType = nodeType;
			}
		}
	}

	@Override
	public ListNodesByNodeGroupIdResponse getInstance(UnmarshallerContext context) {
		return	ListNodesByNodeGroupIdResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
