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

package com.aliyuncs.dytnsapi.transform.v20200217;

import com.aliyuncs.dytnsapi.model.v20200217.PhoneNumberStatusForVirtualResponse;
import com.aliyuncs.dytnsapi.model.v20200217.PhoneNumberStatusForVirtualResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class PhoneNumberStatusForVirtualResponseUnmarshaller {

	public static PhoneNumberStatusForVirtualResponse unmarshall(PhoneNumberStatusForVirtualResponse phoneNumberStatusForVirtualResponse, UnmarshallerContext _ctx) {
		
		phoneNumberStatusForVirtualResponse.setRequestId(_ctx.stringValue("PhoneNumberStatusForVirtualResponse.RequestId"));
		phoneNumberStatusForVirtualResponse.setCode(_ctx.stringValue("PhoneNumberStatusForVirtualResponse.Code"));
		phoneNumberStatusForVirtualResponse.setMessage(_ctx.stringValue("PhoneNumberStatusForVirtualResponse.Message"));

		Data data = new Data();
		data.setIsPrivacyNumber(_ctx.booleanValue("PhoneNumberStatusForVirtualResponse.Data.IsPrivacyNumber"));
		phoneNumberStatusForVirtualResponse.setData(data);
	 
	 	return phoneNumberStatusForVirtualResponse;
	}
}