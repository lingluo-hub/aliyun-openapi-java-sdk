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

package com.aliyuncs.mindlive_biz.transform.v20210214;

import com.aliyuncs.mindlive_biz.model.v20210214.SearchDeviceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchDeviceResponseUnmarshaller {

	public static SearchDeviceResponse unmarshall(SearchDeviceResponse searchDeviceResponse, UnmarshallerContext _ctx) {
		
		searchDeviceResponse.setRequestId(_ctx.stringValue("SearchDeviceResponse.RequestId"));
		searchDeviceResponse.setErrorMessage(_ctx.stringValue("SearchDeviceResponse.ErrorMessage"));
		searchDeviceResponse.setSuccess(_ctx.booleanValue("SearchDeviceResponse.Success"));
		searchDeviceResponse.setErrorCode(_ctx.stringValue("SearchDeviceResponse.ErrorCode"));
	 
	 	return searchDeviceResponse;
	}
}