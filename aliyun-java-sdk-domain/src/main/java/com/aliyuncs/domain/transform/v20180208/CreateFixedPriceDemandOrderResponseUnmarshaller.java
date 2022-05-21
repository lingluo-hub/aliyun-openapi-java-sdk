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

package com.aliyuncs.domain.transform.v20180208;

import com.aliyuncs.domain.model.v20180208.CreateFixedPriceDemandOrderResponse;
import com.aliyuncs.domain.model.v20180208.CreateFixedPriceDemandOrderResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateFixedPriceDemandOrderResponseUnmarshaller {

	public static CreateFixedPriceDemandOrderResponse unmarshall(CreateFixedPriceDemandOrderResponse createFixedPriceDemandOrderResponse, UnmarshallerContext _ctx) {
		
		createFixedPriceDemandOrderResponse.setRequestId(_ctx.stringValue("CreateFixedPriceDemandOrderResponse.RequestId"));
		createFixedPriceDemandOrderResponse.setHttpStatusCode(_ctx.integerValue("CreateFixedPriceDemandOrderResponse.HttpStatusCode"));
		createFixedPriceDemandOrderResponse.setErrorCode(_ctx.stringValue("CreateFixedPriceDemandOrderResponse.ErrorCode"));
		createFixedPriceDemandOrderResponse.setSuccess(_ctx.booleanValue("CreateFixedPriceDemandOrderResponse.Success"));

		Module module = new Module();
		module.setOrderNo(_ctx.stringValue("CreateFixedPriceDemandOrderResponse.Module.OrderNo"));
		module.setPrice(_ctx.longValue("CreateFixedPriceDemandOrderResponse.Module.Price"));
		module.setDomain(_ctx.stringValue("CreateFixedPriceDemandOrderResponse.Module.Domain"));
		createFixedPriceDemandOrderResponse.setModule(module);
	 
	 	return createFixedPriceDemandOrderResponse;
	}
}