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

package com.aliyuncs.mts.transform.v20140618;

import com.aliyuncs.mts.model.v20140618.CreateCustomEntityResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateCustomEntityResponseUnmarshaller {

	public static CreateCustomEntityResponse unmarshall(CreateCustomEntityResponse createCustomEntityResponse, UnmarshallerContext _ctx) {
		
		createCustomEntityResponse.setRequestId(_ctx.stringValue("CreateCustomEntityResponse.RequestId"));
		createCustomEntityResponse.setCustomEntityId(_ctx.stringValue("CreateCustomEntityResponse.CustomEntityId"));
	 
	 	return createCustomEntityResponse;
	}
}