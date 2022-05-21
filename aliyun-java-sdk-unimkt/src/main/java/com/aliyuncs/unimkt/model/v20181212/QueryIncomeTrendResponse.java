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

package com.aliyuncs.unimkt.model.v20181212;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.unimkt.transform.v20181212.QueryIncomeTrendResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryIncomeTrendResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer pageNumber;

	private Integer pageSize;

	private Long total;

	private List<Data> model;

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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List<Data> getModel() {
		return this.model;
	}

	public void setModel(List<Data> model) {
		this.model = model;
	}

	public static class Data {

		private String adSlotName;

		private String adSlotId;

		private Long clickTimes;

		private Long showTimes;

		private Long adSlotHitTimes;

		private String thisMonEstIncomeRate;

		private Long bizDate;

		private String accEstIncomeRate;

		private String thisYearEstIncomeRate;

		private Long adSlotRequests;

		private String mediaName;

		private String adSlotType;

		private String mediaId;

		private String thisDaysEstIncomeRate;

		private Long endTime;

		private Long startTime;

		private String adSlotShowRate;

		private String ecpmRate;

		private Long thisDaysEstIncome;

		private String channelName;

		private String adSlotClickRate;

		private Long estimatedIncome;

		private Long accessStatus;

		private String channelId;

		private Long ecpm;

		private String adSlotHitRate;

		public String getAdSlotName() {
			return this.adSlotName;
		}

		public void setAdSlotName(String adSlotName) {
			this.adSlotName = adSlotName;
		}

		public String getAdSlotId() {
			return this.adSlotId;
		}

		public void setAdSlotId(String adSlotId) {
			this.adSlotId = adSlotId;
		}

		public Long getClickTimes() {
			return this.clickTimes;
		}

		public void setClickTimes(Long clickTimes) {
			this.clickTimes = clickTimes;
		}

		public Long getShowTimes() {
			return this.showTimes;
		}

		public void setShowTimes(Long showTimes) {
			this.showTimes = showTimes;
		}

		public Long getAdSlotHitTimes() {
			return this.adSlotHitTimes;
		}

		public void setAdSlotHitTimes(Long adSlotHitTimes) {
			this.adSlotHitTimes = adSlotHitTimes;
		}

		public String getThisMonEstIncomeRate() {
			return this.thisMonEstIncomeRate;
		}

		public void setThisMonEstIncomeRate(String thisMonEstIncomeRate) {
			this.thisMonEstIncomeRate = thisMonEstIncomeRate;
		}

		public Long getBizDate() {
			return this.bizDate;
		}

		public void setBizDate(Long bizDate) {
			this.bizDate = bizDate;
		}

		public String getAccEstIncomeRate() {
			return this.accEstIncomeRate;
		}

		public void setAccEstIncomeRate(String accEstIncomeRate) {
			this.accEstIncomeRate = accEstIncomeRate;
		}

		public String getThisYearEstIncomeRate() {
			return this.thisYearEstIncomeRate;
		}

		public void setThisYearEstIncomeRate(String thisYearEstIncomeRate) {
			this.thisYearEstIncomeRate = thisYearEstIncomeRate;
		}

		public Long getAdSlotRequests() {
			return this.adSlotRequests;
		}

		public void setAdSlotRequests(Long adSlotRequests) {
			this.adSlotRequests = adSlotRequests;
		}

		public String getMediaName() {
			return this.mediaName;
		}

		public void setMediaName(String mediaName) {
			this.mediaName = mediaName;
		}

		public String getAdSlotType() {
			return this.adSlotType;
		}

		public void setAdSlotType(String adSlotType) {
			this.adSlotType = adSlotType;
		}

		public String getMediaId() {
			return this.mediaId;
		}

		public void setMediaId(String mediaId) {
			this.mediaId = mediaId;
		}

		public String getThisDaysEstIncomeRate() {
			return this.thisDaysEstIncomeRate;
		}

		public void setThisDaysEstIncomeRate(String thisDaysEstIncomeRate) {
			this.thisDaysEstIncomeRate = thisDaysEstIncomeRate;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public String getAdSlotShowRate() {
			return this.adSlotShowRate;
		}

		public void setAdSlotShowRate(String adSlotShowRate) {
			this.adSlotShowRate = adSlotShowRate;
		}

		public String getEcpmRate() {
			return this.ecpmRate;
		}

		public void setEcpmRate(String ecpmRate) {
			this.ecpmRate = ecpmRate;
		}

		public Long getThisDaysEstIncome() {
			return this.thisDaysEstIncome;
		}

		public void setThisDaysEstIncome(Long thisDaysEstIncome) {
			this.thisDaysEstIncome = thisDaysEstIncome;
		}

		public String getChannelName() {
			return this.channelName;
		}

		public void setChannelName(String channelName) {
			this.channelName = channelName;
		}

		public String getAdSlotClickRate() {
			return this.adSlotClickRate;
		}

		public void setAdSlotClickRate(String adSlotClickRate) {
			this.adSlotClickRate = adSlotClickRate;
		}

		public Long getEstimatedIncome() {
			return this.estimatedIncome;
		}

		public void setEstimatedIncome(Long estimatedIncome) {
			this.estimatedIncome = estimatedIncome;
		}

		public Long getAccessStatus() {
			return this.accessStatus;
		}

		public void setAccessStatus(Long accessStatus) {
			this.accessStatus = accessStatus;
		}

		public String getChannelId() {
			return this.channelId;
		}

		public void setChannelId(String channelId) {
			this.channelId = channelId;
		}

		public Long getEcpm() {
			return this.ecpm;
		}

		public void setEcpm(Long ecpm) {
			this.ecpm = ecpm;
		}

		public String getAdSlotHitRate() {
			return this.adSlotHitRate;
		}

		public void setAdSlotHitRate(String adSlotHitRate) {
			this.adSlotHitRate = adSlotHitRate;
		}
	}

	@Override
	public QueryIncomeTrendResponse getInstance(UnmarshallerContext context) {
		return	QueryIncomeTrendResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
