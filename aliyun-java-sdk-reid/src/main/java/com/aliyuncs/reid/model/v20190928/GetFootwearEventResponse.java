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

package com.aliyuncs.reid.model.v20190928;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.reid.transform.v20190928.GetFootwearEventResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetFootwearEventResponse extends AcsResponse {

	private String errorCode;

	private String errorMessage;

	private String message;

	private String code;

	private String dynamicCode;

	private String requestId;

	private Boolean success;

	private String dynamicMessage;

	private List<FootwearEvent> footwearEventList;

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
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

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public List<FootwearEvent> getFootwearEventList() {
		return this.footwearEventList;
	}

	public void setFootwearEventList(List<FootwearEvent> footwearEventList) {
		this.footwearEventList = footwearEventList;
	}

	public static class FootwearEvent {

		private String positionNumber;

		private Integer tryOnEventCount;

		private String skuId;

		private Long storeId;

		private Integer takeEventCount;

		private String date;

		public String getPositionNumber() {
			return this.positionNumber;
		}

		public void setPositionNumber(String positionNumber) {
			this.positionNumber = positionNumber;
		}

		public Integer getTryOnEventCount() {
			return this.tryOnEventCount;
		}

		public void setTryOnEventCount(Integer tryOnEventCount) {
			this.tryOnEventCount = tryOnEventCount;
		}

		public String getSkuId() {
			return this.skuId;
		}

		public void setSkuId(String skuId) {
			this.skuId = skuId;
		}

		public Long getStoreId() {
			return this.storeId;
		}

		public void setStoreId(Long storeId) {
			this.storeId = storeId;
		}

		public Integer getTakeEventCount() {
			return this.takeEventCount;
		}

		public void setTakeEventCount(Integer takeEventCount) {
			this.takeEventCount = takeEventCount;
		}

		public String getDate() {
			return this.date;
		}

		public void setDate(String date) {
			this.date = date;
		}
	}

	@Override
	public GetFootwearEventResponse getInstance(UnmarshallerContext context) {
		return	GetFootwearEventResponseUnmarshaller.unmarshall(this, context);
	}
}
