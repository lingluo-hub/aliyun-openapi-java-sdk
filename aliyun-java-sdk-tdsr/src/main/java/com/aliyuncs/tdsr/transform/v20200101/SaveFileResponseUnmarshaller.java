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

package com.aliyuncs.tdsr.transform.v20200101;

import com.aliyuncs.tdsr.model.v20200101.SaveFileResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveFileResponseUnmarshaller {

	public static SaveFileResponse unmarshall(SaveFileResponse saveFileResponse, UnmarshallerContext _ctx) {
		
		saveFileResponse.setRequestId(_ctx.stringValue("SaveFileResponse.RequestId"));
		saveFileResponse.setSuccess(_ctx.booleanValue("SaveFileResponse.Success"));
		saveFileResponse.setErrMessage(_ctx.stringValue("SaveFileResponse.ErrMessage"));
		saveFileResponse.setData(_ctx.stringValue("SaveFileResponse.Data"));
		saveFileResponse.setObjectString(_ctx.stringValue("SaveFileResponse.ObjectString"));
	 
	 	return saveFileResponse;
	}
}