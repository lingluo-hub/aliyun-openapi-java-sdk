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

package com.aliyuncs.live.model.v20161101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.ListMessageGroupUserResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListMessageGroupUserResponse extends AcsResponse {

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

		private Integer total;

		private Boolean hasMore;

		private List<UserListItem> userList;

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public Boolean getHasMore() {
			return this.hasMore;
		}

		public void setHasMore(Boolean hasMore) {
			this.hasMore = hasMore;
		}

		public List<UserListItem> getUserList() {
			return this.userList;
		}

		public void setUserList(List<UserListItem> userList) {
			this.userList = userList;
		}

		public static class UserListItem {

			private String userId;

			private Long joinTime;

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public Long getJoinTime() {
				return this.joinTime;
			}

			public void setJoinTime(Long joinTime) {
				this.joinTime = joinTime;
			}
		}
	}

	@Override
	public ListMessageGroupUserResponse getInstance(UnmarshallerContext context) {
		return	ListMessageGroupUserResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
