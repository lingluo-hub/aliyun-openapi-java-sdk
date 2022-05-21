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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.CreateFreeLockCorrectOrderResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateFreeLockCorrectOrderResponseUnmarshaller {

	public static CreateFreeLockCorrectOrderResponse unmarshall(CreateFreeLockCorrectOrderResponse createFreeLockCorrectOrderResponse, UnmarshallerContext _ctx) {
		
		createFreeLockCorrectOrderResponse.setRequestId(_ctx.stringValue("CreateFreeLockCorrectOrderResponse.RequestId"));
		createFreeLockCorrectOrderResponse.setSuccess(_ctx.booleanValue("CreateFreeLockCorrectOrderResponse.Success"));
		createFreeLockCorrectOrderResponse.setErrorMessage(_ctx.stringValue("CreateFreeLockCorrectOrderResponse.ErrorMessage"));
		createFreeLockCorrectOrderResponse.setErrorCode(_ctx.stringValue("CreateFreeLockCorrectOrderResponse.ErrorCode"));

		List<Long> createOrderResult = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("CreateFreeLockCorrectOrderResponse.CreateOrderResult.Length"); i++) {
			createOrderResult.add(_ctx.longValue("CreateFreeLockCorrectOrderResponse.CreateOrderResult["+ i +"]"));
		}
		createFreeLockCorrectOrderResponse.setCreateOrderResult(createOrderResult);
	 
	 	return createFreeLockCorrectOrderResponse;
	}
}