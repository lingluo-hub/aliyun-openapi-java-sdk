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

package com.aliyuncs.eas.transform.v20171023;

import com.aliyuncs.eas.model.v20171023.CreateStressResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateStressResponseUnmarshaller {

	public static CreateStressResponse unmarshall(CreateStressResponse createStressResponse, UnmarshallerContext _ctx) {
		
		createStressResponse.setRequestId(_ctx.stringValue("CreateStressResponse.RequestId"));
		createStressResponse.setCode(_ctx.longValue("CreateStressResponse.Code"));
		createStressResponse.setName(_ctx.stringValue("CreateStressResponse.Name"));
		createStressResponse.setRegion(_ctx.stringValue("CreateStressResponse.Region"));
		createStressResponse.setMessage(_ctx.stringValue("CreateStressResponse.Message"));
	 
	 	return createStressResponse;
	}
}