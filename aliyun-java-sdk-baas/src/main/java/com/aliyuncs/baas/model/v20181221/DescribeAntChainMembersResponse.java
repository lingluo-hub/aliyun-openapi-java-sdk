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
import com.aliyuncs.baas.transform.v20181221.DescribeAntChainMembersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAntChainMembersResponse extends AcsResponse {

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

		private List<MembersItem> members;

		private Pagination pagination;

		public List<MembersItem> getMembers() {
			return this.members;
		}

		public void setMembers(List<MembersItem> members) {
			this.members = members;
		}

		public Pagination getPagination() {
			return this.pagination;
		}

		public void setPagination(Pagination pagination) {
			this.pagination = pagination;
		}

		public static class MembersItem {

			private String status;

			private String memberId;

			private String role;

			private String memberName;

			private Long joinTime;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getMemberId() {
				return this.memberId;
			}

			public void setMemberId(String memberId) {
				this.memberId = memberId;
			}

			public String getRole() {
				return this.role;
			}

			public void setRole(String role) {
				this.role = role;
			}

			public String getMemberName() {
				return this.memberName;
			}

			public void setMemberName(String memberName) {
				this.memberName = memberName;
			}

			public Long getJoinTime() {
				return this.joinTime;
			}

			public void setJoinTime(Long joinTime) {
				this.joinTime = joinTime;
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
	public DescribeAntChainMembersResponse getInstance(UnmarshallerContext context) {
		return	DescribeAntChainMembersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
