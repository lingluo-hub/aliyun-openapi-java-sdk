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

package com.aliyuncs.mindlive.transform.v20210301;

import com.aliyuncs.mindlive.model.v20210301.RequestBackgroundResponse;
import com.aliyuncs.mindlive.model.v20210301.RequestBackgroundResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class RequestBackgroundResponseUnmarshaller {

	public static RequestBackgroundResponse unmarshall(RequestBackgroundResponse requestBackgroundResponse, UnmarshallerContext _ctx) {
		
		requestBackgroundResponse.setRequestId(_ctx.stringValue("RequestBackgroundResponse.RequestId"));
		requestBackgroundResponse.setErrorMessage(_ctx.stringValue("RequestBackgroundResponse.ErrorMessage"));
		requestBackgroundResponse.setSuccess(_ctx.booleanValue("RequestBackgroundResponse.Success"));
		requestBackgroundResponse.setErrorCode(_ctx.stringValue("RequestBackgroundResponse.ErrorCode"));

		Data data = new Data();
		data.setBgConfig(_ctx.mapValue("RequestBackgroundResponse.Data.BgConfig"));
		data.setDownloadUrl(_ctx.stringValue("RequestBackgroundResponse.Data.DownloadUrl"));
		data.setFileType(_ctx.stringValue("RequestBackgroundResponse.Data.FileType"));
		data.setOpen(_ctx.booleanValue("RequestBackgroundResponse.Data.Open"));
		data.setScope(_ctx.stringValue("RequestBackgroundResponse.Data.Scope"));
		data.setMode(_ctx.stringValue("RequestBackgroundResponse.Data.Mode"));
		data.setResourceUuid(_ctx.stringValue("RequestBackgroundResponse.Data.ResourceUuid"));
		requestBackgroundResponse.setData(data);
	 
	 	return requestBackgroundResponse;
	}
}