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

package com.aliyuncs.das.transform.v20200116;

import com.aliyuncs.das.model.v20200116.SyncHDMAliyunResourceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SyncHDMAliyunResourceResponseUnmarshaller {

	public static SyncHDMAliyunResourceResponse unmarshall(SyncHDMAliyunResourceResponse syncHDMAliyunResourceResponse, UnmarshallerContext _ctx) {
		
		syncHDMAliyunResourceResponse.setRequestId(_ctx.stringValue("SyncHDMAliyunResourceResponse.RequestId"));
		syncHDMAliyunResourceResponse.setMessage(_ctx.stringValue("SyncHDMAliyunResourceResponse.Message"));
		syncHDMAliyunResourceResponse.setSynchro(_ctx.stringValue("SyncHDMAliyunResourceResponse.Synchro"));
		syncHDMAliyunResourceResponse.setData(_ctx.stringValue("SyncHDMAliyunResourceResponse.Data"));
		syncHDMAliyunResourceResponse.setCode(_ctx.stringValue("SyncHDMAliyunResourceResponse.Code"));
		syncHDMAliyunResourceResponse.setSuccess(_ctx.stringValue("SyncHDMAliyunResourceResponse.Success"));
	 
	 	return syncHDMAliyunResourceResponse;
	}
}