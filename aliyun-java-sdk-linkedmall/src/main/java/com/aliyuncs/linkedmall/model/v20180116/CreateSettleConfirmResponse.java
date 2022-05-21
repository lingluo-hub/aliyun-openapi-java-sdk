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

package com.aliyuncs.linkedmall.model.v20180116;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkedmall.transform.v20180116.CreateSettleConfirmResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateSettleConfirmResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private TradeSettleConfirmResponse tradeSettleConfirmResponse;

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

	public TradeSettleConfirmResponse getTradeSettleConfirmResponse() {
		return this.tradeSettleConfirmResponse;
	}

	public void setTradeSettleConfirmResponse(TradeSettleConfirmResponse tradeSettleConfirmResponse) {
		this.tradeSettleConfirmResponse = tradeSettleConfirmResponse;
	}

	public static class TradeSettleConfirmResponse {

		private String tradeNo;

		private String outRequestNo;

		public String getTradeNo() {
			return this.tradeNo;
		}

		public void setTradeNo(String tradeNo) {
			this.tradeNo = tradeNo;
		}

		public String getOutRequestNo() {
			return this.outRequestNo;
		}

		public void setOutRequestNo(String outRequestNo) {
			this.outRequestNo = outRequestNo;
		}
	}

	@Override
	public CreateSettleConfirmResponse getInstance(UnmarshallerContext context) {
		return	CreateSettleConfirmResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
