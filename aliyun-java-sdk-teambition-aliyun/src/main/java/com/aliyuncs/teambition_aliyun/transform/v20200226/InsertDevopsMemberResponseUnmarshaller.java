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

package com.aliyuncs.teambition_aliyun.transform.v20200226;

import com.aliyuncs.teambition_aliyun.model.v20200226.InsertDevopsMemberResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class InsertDevopsMemberResponseUnmarshaller {

	public static InsertDevopsMemberResponse unmarshall(InsertDevopsMemberResponse insertDevopsMemberResponse, UnmarshallerContext _ctx) {
		
		insertDevopsMemberResponse.setRequestId(_ctx.stringValue("InsertDevopsMemberResponse.RequestId"));
		insertDevopsMemberResponse.setErrorCode(_ctx.stringValue("InsertDevopsMemberResponse.ErrorCode"));
		insertDevopsMemberResponse.setErrorMessage(_ctx.stringValue("InsertDevopsMemberResponse.ErrorMessage"));
		insertDevopsMemberResponse.setSuccess(_ctx.booleanValue("InsertDevopsMemberResponse.Success"));
		insertDevopsMemberResponse.setObject(_ctx.stringValue("InsertDevopsMemberResponse.Object"));
	 
	 	return insertDevopsMemberResponse;
	}
}