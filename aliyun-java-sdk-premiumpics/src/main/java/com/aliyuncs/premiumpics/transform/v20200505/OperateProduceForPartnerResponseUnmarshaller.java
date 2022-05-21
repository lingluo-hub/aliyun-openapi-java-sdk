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

package com.aliyuncs.premiumpics.transform.v20200505;

import com.aliyuncs.premiumpics.model.v20200505.OperateProduceForPartnerResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OperateProduceForPartnerResponseUnmarshaller {

	public static OperateProduceForPartnerResponse unmarshall(OperateProduceForPartnerResponse operateProduceForPartnerResponse, UnmarshallerContext _ctx) {
		
		operateProduceForPartnerResponse.setRequestId(_ctx.stringValue("OperateProduceForPartnerResponse.RequestId"));
		operateProduceForPartnerResponse.setErrorCode(_ctx.stringValue("OperateProduceForPartnerResponse.ErrorCode"));
		operateProduceForPartnerResponse.setErrorMsg(_ctx.stringValue("OperateProduceForPartnerResponse.ErrorMsg"));
		operateProduceForPartnerResponse.setSuccess(_ctx.booleanValue("OperateProduceForPartnerResponse.Success"));
	 
	 	return operateProduceForPartnerResponse;
	}
}