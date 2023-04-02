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

package com.aliyuncs.linkvisual.transform.v20180120;

import com.aliyuncs.linkvisual.model.v20180120.AddFaceUserPictureResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddFaceUserPictureResponseUnmarshaller {

	public static AddFaceUserPictureResponse unmarshall(AddFaceUserPictureResponse addFaceUserPictureResponse, UnmarshallerContext _ctx) {
		
		addFaceUserPictureResponse.setRequestId(_ctx.stringValue("AddFaceUserPictureResponse.RequestId"));
		addFaceUserPictureResponse.setCode(_ctx.stringValue("AddFaceUserPictureResponse.Code"));
		addFaceUserPictureResponse.setData(_ctx.mapValue("AddFaceUserPictureResponse.Data"));
		addFaceUserPictureResponse.setErrorMessage(_ctx.stringValue("AddFaceUserPictureResponse.ErrorMessage"));
		addFaceUserPictureResponse.setSuccess(_ctx.booleanValue("AddFaceUserPictureResponse.Success"));
	 
	 	return addFaceUserPictureResponse;
	}
}