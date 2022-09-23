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

package com.aliyuncs.swas.transform.v20170810;

import com.aliyuncs.swas.model.v20170810.GetServerPasswordsSettingResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetServerPasswordsSettingResponseUnmarshaller {

	public static GetServerPasswordsSettingResponse unmarshall(GetServerPasswordsSettingResponse getServerPasswordsSettingResponse, UnmarshallerContext _ctx) {
		
		getServerPasswordsSettingResponse.setRequestId(_ctx.stringValue("GetServerPasswordsSettingResponse.RequestId"));
		getServerPasswordsSettingResponse.setIsSuccess(_ctx.booleanValue("GetServerPasswordsSettingResponse.IsSuccess"));
		getServerPasswordsSettingResponse.setVncPasswordSetting(_ctx.booleanValue("GetServerPasswordsSettingResponse.VncPasswordSetting"));
		getServerPasswordsSettingResponse.setPasswordSetting(_ctx.booleanValue("GetServerPasswordsSettingResponse.PasswordSetting"));
		getServerPasswordsSettingResponse.setCode(_ctx.stringValue("GetServerPasswordsSettingResponse.Code"));
	 
	 	return getServerPasswordsSettingResponse;
	}
}