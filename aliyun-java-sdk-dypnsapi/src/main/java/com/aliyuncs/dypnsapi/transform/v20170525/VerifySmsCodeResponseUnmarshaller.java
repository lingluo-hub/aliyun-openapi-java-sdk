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

package com.aliyuncs.dypnsapi.transform.v20170525;

import com.aliyuncs.dypnsapi.model.v20170525.VerifySmsCodeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class VerifySmsCodeResponseUnmarshaller {

	public static VerifySmsCodeResponse unmarshall(VerifySmsCodeResponse verifySmsCodeResponse, UnmarshallerContext _ctx) {
		
		verifySmsCodeResponse.setRequestId(_ctx.stringValue("VerifySmsCodeResponse.RequestId"));
		verifySmsCodeResponse.setCode(_ctx.stringValue("VerifySmsCodeResponse.Code"));
		verifySmsCodeResponse.setMessage(_ctx.stringValue("VerifySmsCodeResponse.Message"));
		verifySmsCodeResponse.setData(_ctx.booleanValue("VerifySmsCodeResponse.Data"));
	 
	 	return verifySmsCodeResponse;
	}
}