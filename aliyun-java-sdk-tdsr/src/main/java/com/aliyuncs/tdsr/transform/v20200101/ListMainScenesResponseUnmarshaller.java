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

import com.aliyuncs.tdsr.model.v20200101.ListMainScenesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMainScenesResponseUnmarshaller {

	public static ListMainScenesResponse unmarshall(ListMainScenesResponse listMainScenesResponse, UnmarshallerContext _ctx) {
		
		listMainScenesResponse.setRequestId(_ctx.stringValue("ListMainScenesResponse.RequestId"));
		listMainScenesResponse.setSuccess(_ctx.booleanValue("ListMainScenesResponse.Success"));
		listMainScenesResponse.setErrMessage(_ctx.stringValue("ListMainScenesResponse.ErrMessage"));
		listMainScenesResponse.setData(_ctx.stringValue("ListMainScenesResponse.Data"));
		listMainScenesResponse.setObjectString(_ctx.stringValue("ListMainScenesResponse.ObjectString"));
	 
	 	return listMainScenesResponse;
	}
}