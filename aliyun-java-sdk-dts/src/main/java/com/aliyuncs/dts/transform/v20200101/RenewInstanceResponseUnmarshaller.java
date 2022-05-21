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

package com.aliyuncs.dts.transform.v20200101;

import com.aliyuncs.dts.model.v20200101.RenewInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RenewInstanceResponseUnmarshaller {

	public static RenewInstanceResponse unmarshall(RenewInstanceResponse renewInstanceResponse, UnmarshallerContext _ctx) {
		
		renewInstanceResponse.setRequestId(_ctx.stringValue("RenewInstanceResponse.RequestId"));
		renewInstanceResponse.setHttpStatusCode(_ctx.integerValue("RenewInstanceResponse.HttpStatusCode"));
		renewInstanceResponse.setEndTime(_ctx.stringValue("RenewInstanceResponse.EndTime"));
		renewInstanceResponse.setErrCode(_ctx.stringValue("RenewInstanceResponse.ErrCode"));
		renewInstanceResponse.setDtsJobId(_ctx.stringValue("RenewInstanceResponse.DtsJobId"));
		renewInstanceResponse.setSuccess(_ctx.booleanValue("RenewInstanceResponse.Success"));
		renewInstanceResponse.setErrMessage(_ctx.stringValue("RenewInstanceResponse.ErrMessage"));
		renewInstanceResponse.setChargeType(_ctx.stringValue("RenewInstanceResponse.ChargeType"));
		renewInstanceResponse.setCode(_ctx.stringValue("RenewInstanceResponse.Code"));
		renewInstanceResponse.setDynamicMessage(_ctx.stringValue("RenewInstanceResponse.DynamicMessage"));
		renewInstanceResponse.setInstanceId(_ctx.stringValue("RenewInstanceResponse.InstanceId"));
	 
	 	return renewInstanceResponse;
	}
}