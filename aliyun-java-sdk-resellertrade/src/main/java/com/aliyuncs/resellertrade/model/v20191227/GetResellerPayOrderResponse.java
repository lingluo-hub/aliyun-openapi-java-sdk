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

package com.aliyuncs.resellertrade.model.v20191227;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.resellertrade.transform.v20191227.GetResellerPayOrderResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetResellerPayOrderResponse extends AcsResponse {

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

		private String payAmount;

		private String orderStatus;

		private String orderId;

		private String buyerId;

		public String getPayAmount() {
			return this.payAmount;
		}

		public void setPayAmount(String payAmount) {
			this.payAmount = payAmount;
		}

		public String getOrderStatus() {
			return this.orderStatus;
		}

		public void setOrderStatus(String orderStatus) {
			this.orderStatus = orderStatus;
		}

		public String getOrderId() {
			return this.orderId;
		}

		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}

		public String getBuyerId() {
			return this.buyerId;
		}

		public void setBuyerId(String buyerId) {
			this.buyerId = buyerId;
		}
	}

	@Override
	public GetResellerPayOrderResponse getInstance(UnmarshallerContext context) {
		return	GetResellerPayOrderResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
