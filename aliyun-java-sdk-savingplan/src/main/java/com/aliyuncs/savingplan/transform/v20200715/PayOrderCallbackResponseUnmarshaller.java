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

package com.aliyuncs.savingplan.transform.v20200715;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.savingplan.model.v20200715.PayOrderCallbackResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class PayOrderCallbackResponseUnmarshaller {

	public static PayOrderCallbackResponse unmarshall(PayOrderCallbackResponse payOrderCallbackResponse, UnmarshallerContext _ctx) {
		
		payOrderCallbackResponse.setCode(_ctx.stringValue("PayOrderCallbackResponse.code"));
		payOrderCallbackResponse.setRequestId(_ctx.stringValue("PayOrderCallbackResponse.requestId"));
		payOrderCallbackResponse.setMessage(_ctx.stringValue("PayOrderCallbackResponse.message"));
		payOrderCallbackResponse.setData(_ctx.stringValue("PayOrderCallbackResponse.data"));
		payOrderCallbackResponse.setSuccess(_ctx.booleanValue("PayOrderCallbackResponse.success"));
		payOrderCallbackResponse.setSynchro(_ctx.booleanValue("PayOrderCallbackResponse.synchro"));

		List<String> errorInfoList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("PayOrderCallbackResponse.errorInfoList.Length"); i++) {
			errorInfoList.add(_ctx.stringValue("PayOrderCallbackResponse.errorInfoList["+ i +"]"));
		}
		payOrderCallbackResponse.setErrorInfoList(errorInfoList);
	 
	 	return payOrderCallbackResponse;
	}
}