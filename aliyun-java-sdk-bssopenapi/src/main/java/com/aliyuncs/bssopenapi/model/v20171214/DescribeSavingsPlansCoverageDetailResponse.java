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

package com.aliyuncs.bssopenapi.model.v20171214;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.bssopenapi.transform.v20171214.DescribeSavingsPlansCoverageDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSavingsPlansCoverageDetailResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private Data data;

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

		private Integer totalCount;

		private String nextToken;

		private List<Item> items;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public String getNextToken() {
			return this.nextToken;
		}

		public void setNextToken(String nextToken) {
			this.nextToken = nextToken;
		}

		public List<Item> getItems() {
			return this.items;
		}

		public void setItems(List<Item> items) {
			this.items = items;
		}

		public static class Item {

			private Long userId;

			private String instanceId;

			private String currency;

			private String instanceSpec;

			private Float postpaidCost;

			private Float coveragePercentage;

			private String region;

			private Float deductAmount;

			private String startPeriod;

			private Float totalAmount;

			private String userName;

			private String endPeriod;

			public Long getUserId() {
				return this.userId;
			}

			public void setUserId(Long userId) {
				this.userId = userId;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getCurrency() {
				return this.currency;
			}

			public void setCurrency(String currency) {
				this.currency = currency;
			}

			public String getInstanceSpec() {
				return this.instanceSpec;
			}

			public void setInstanceSpec(String instanceSpec) {
				this.instanceSpec = instanceSpec;
			}

			public Float getPostpaidCost() {
				return this.postpaidCost;
			}

			public void setPostpaidCost(Float postpaidCost) {
				this.postpaidCost = postpaidCost;
			}

			public Float getCoveragePercentage() {
				return this.coveragePercentage;
			}

			public void setCoveragePercentage(Float coveragePercentage) {
				this.coveragePercentage = coveragePercentage;
			}

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
			}

			public Float getDeductAmount() {
				return this.deductAmount;
			}

			public void setDeductAmount(Float deductAmount) {
				this.deductAmount = deductAmount;
			}

			public String getStartPeriod() {
				return this.startPeriod;
			}

			public void setStartPeriod(String startPeriod) {
				this.startPeriod = startPeriod;
			}

			public Float getTotalAmount() {
				return this.totalAmount;
			}

			public void setTotalAmount(Float totalAmount) {
				this.totalAmount = totalAmount;
			}

			public String getUserName() {
				return this.userName;
			}

			public void setUserName(String userName) {
				this.userName = userName;
			}

			public String getEndPeriod() {
				return this.endPeriod;
			}

			public void setEndPeriod(String endPeriod) {
				this.endPeriod = endPeriod;
			}
		}
	}

	@Override
	public DescribeSavingsPlansCoverageDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeSavingsPlansCoverageDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
