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

package com.aliyuncs.qualitycheck.transform.v20190115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.qualitycheck.model.v20190115.UpdateQualityCheckSchemeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateQualityCheckSchemeResponseUnmarshaller {

	public static UpdateQualityCheckSchemeResponse unmarshall(UpdateQualityCheckSchemeResponse updateQualityCheckSchemeResponse, UnmarshallerContext _ctx) {
		
		updateQualityCheckSchemeResponse.setRequestId(_ctx.stringValue("UpdateQualityCheckSchemeResponse.RequestId"));
		updateQualityCheckSchemeResponse.setSuccess(_ctx.booleanValue("UpdateQualityCheckSchemeResponse.Success"));
		updateQualityCheckSchemeResponse.setCode(_ctx.stringValue("UpdateQualityCheckSchemeResponse.Code"));
		updateQualityCheckSchemeResponse.setMessage(_ctx.stringValue("UpdateQualityCheckSchemeResponse.Message"));
		updateQualityCheckSchemeResponse.setHttpStatusCode(_ctx.integerValue("UpdateQualityCheckSchemeResponse.HttpStatusCode"));

		List<String> messages = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateQualityCheckSchemeResponse.Messages.Length"); i++) {
			messages.add(_ctx.stringValue("UpdateQualityCheckSchemeResponse.Messages["+ i +"]"));
		}
		updateQualityCheckSchemeResponse.setMessages(messages);
	 
	 	return updateQualityCheckSchemeResponse;
	}
}