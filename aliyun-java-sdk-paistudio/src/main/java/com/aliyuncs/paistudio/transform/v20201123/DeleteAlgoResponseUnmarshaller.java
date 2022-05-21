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

package com.aliyuncs.paistudio.transform.v20201123;

import com.aliyuncs.paistudio.model.v20201123.DeleteAlgoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteAlgoResponseUnmarshaller {

	public static DeleteAlgoResponse unmarshall(DeleteAlgoResponse deleteAlgoResponse, UnmarshallerContext _ctx) {
		
		deleteAlgoResponse.setRequestId(_ctx.stringValue("DeleteAlgoResponse.RequestId"));
		deleteAlgoResponse.setCode(_ctx.stringValue("DeleteAlgoResponse.Code"));
		deleteAlgoResponse.setMessage(_ctx.stringValue("DeleteAlgoResponse.Message"));
		deleteAlgoResponse.setData(_ctx.booleanValue("DeleteAlgoResponse.Data"));
	 
	 	return deleteAlgoResponse;
	}
}