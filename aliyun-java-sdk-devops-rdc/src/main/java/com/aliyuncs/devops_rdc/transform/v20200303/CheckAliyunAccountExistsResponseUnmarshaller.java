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

package com.aliyuncs.devops_rdc.transform.v20200303;

import com.aliyuncs.devops_rdc.model.v20200303.CheckAliyunAccountExistsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckAliyunAccountExistsResponseUnmarshaller {

	public static CheckAliyunAccountExistsResponse unmarshall(CheckAliyunAccountExistsResponse checkAliyunAccountExistsResponse, UnmarshallerContext _ctx) {
		
		checkAliyunAccountExistsResponse.setRequestId(_ctx.stringValue("CheckAliyunAccountExistsResponse.RequestId"));
		checkAliyunAccountExistsResponse.setErrorMsg(_ctx.stringValue("CheckAliyunAccountExistsResponse.ErrorMsg"));
		checkAliyunAccountExistsResponse.setObject(_ctx.booleanValue("CheckAliyunAccountExistsResponse.Object"));
		checkAliyunAccountExistsResponse.setSuccessful(_ctx.booleanValue("CheckAliyunAccountExistsResponse.Successful"));
		checkAliyunAccountExistsResponse.setErrorCode(_ctx.stringValue("CheckAliyunAccountExistsResponse.ErrorCode"));
	 
	 	return checkAliyunAccountExistsResponse;
	}
}