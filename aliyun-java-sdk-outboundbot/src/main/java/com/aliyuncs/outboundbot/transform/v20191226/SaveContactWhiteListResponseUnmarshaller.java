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

package com.aliyuncs.outboundbot.transform.v20191226;

import com.aliyuncs.outboundbot.model.v20191226.SaveContactWhiteListResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveContactWhiteListResponseUnmarshaller {

	public static SaveContactWhiteListResponse unmarshall(SaveContactWhiteListResponse saveContactWhiteListResponse, UnmarshallerContext _ctx) {
		
		saveContactWhiteListResponse.setRequestId(_ctx.stringValue("SaveContactWhiteListResponse.RequestId"));
		saveContactWhiteListResponse.setHttpStatusCode(_ctx.integerValue("SaveContactWhiteListResponse.HttpStatusCode"));
		saveContactWhiteListResponse.setAffectedRows(_ctx.integerValue("SaveContactWhiteListResponse.AffectedRows"));
		saveContactWhiteListResponse.setSuccess(_ctx.booleanValue("SaveContactWhiteListResponse.Success"));
		saveContactWhiteListResponse.setCode(_ctx.stringValue("SaveContactWhiteListResponse.Code"));
		saveContactWhiteListResponse.setMessage(_ctx.stringValue("SaveContactWhiteListResponse.Message"));
	 
	 	return saveContactWhiteListResponse;
	}
}