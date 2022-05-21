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

package com.aliyuncs.dyvmsapi.transform.v20170525;

import com.aliyuncs.dyvmsapi.model.v20170525.SubmitHotlineTransferRegisterResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitHotlineTransferRegisterResponseUnmarshaller {

	public static SubmitHotlineTransferRegisterResponse unmarshall(SubmitHotlineTransferRegisterResponse submitHotlineTransferRegisterResponse, UnmarshallerContext _ctx) {
		
		submitHotlineTransferRegisterResponse.setRequestId(_ctx.stringValue("SubmitHotlineTransferRegisterResponse.RequestId"));
		submitHotlineTransferRegisterResponse.setCode(_ctx.stringValue("SubmitHotlineTransferRegisterResponse.Code"));
		submitHotlineTransferRegisterResponse.setData(_ctx.longValue("SubmitHotlineTransferRegisterResponse.Data"));
		submitHotlineTransferRegisterResponse.setMessage(_ctx.stringValue("SubmitHotlineTransferRegisterResponse.Message"));
	 
	 	return submitHotlineTransferRegisterResponse;
	}
}