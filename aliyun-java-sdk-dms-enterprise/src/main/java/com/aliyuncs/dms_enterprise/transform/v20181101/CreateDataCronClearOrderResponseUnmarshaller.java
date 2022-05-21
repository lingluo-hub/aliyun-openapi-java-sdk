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

import com.aliyuncs.dms_enterprise.model.v20181101.CreateDataCronClearOrderResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDataCronClearOrderResponseUnmarshaller {

	public static CreateDataCronClearOrderResponse unmarshall(CreateDataCronClearOrderResponse createDataCronClearOrderResponse, UnmarshallerContext _ctx) {
		
		createDataCronClearOrderResponse.setRequestId(_ctx.stringValue("CreateDataCronClearOrderResponse.RequestId"));
		createDataCronClearOrderResponse.setSuccess(_ctx.booleanValue("CreateDataCronClearOrderResponse.Success"));
		createDataCronClearOrderResponse.setErrorMessage(_ctx.stringValue("CreateDataCronClearOrderResponse.ErrorMessage"));
		createDataCronClearOrderResponse.setErrorCode(_ctx.stringValue("CreateDataCronClearOrderResponse.ErrorCode"));

		List<Long> createOrderResult = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("CreateDataCronClearOrderResponse.CreateOrderResult.Length"); i++) {
			createOrderResult.add(_ctx.longValue("CreateDataCronClearOrderResponse.CreateOrderResult["+ i +"]"));
		}
		createDataCronClearOrderResponse.setCreateOrderResult(createOrderResult);
	 
	 	return createDataCronClearOrderResponse;
	}
}