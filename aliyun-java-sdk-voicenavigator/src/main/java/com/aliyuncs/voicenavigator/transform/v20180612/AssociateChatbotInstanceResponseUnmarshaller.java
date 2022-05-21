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

package com.aliyuncs.voicenavigator.transform.v20180612;

import com.aliyuncs.voicenavigator.model.v20180612.AssociateChatbotInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AssociateChatbotInstanceResponseUnmarshaller {

	public static AssociateChatbotInstanceResponse unmarshall(AssociateChatbotInstanceResponse associateChatbotInstanceResponse, UnmarshallerContext _ctx) {
		
		associateChatbotInstanceResponse.setRequestId(_ctx.stringValue("AssociateChatbotInstanceResponse.RequestId"));
	 
	 	return associateChatbotInstanceResponse;
	}
}