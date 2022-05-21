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

package com.aliyuncs.outboundbot.transform.v20191226;

import com.aliyuncs.outboundbot.model.v20191226.ModifyScriptResponse;
import com.aliyuncs.outboundbot.model.v20191226.ModifyScriptResponse.Script;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyScriptResponseUnmarshaller {

	public static ModifyScriptResponse unmarshall(ModifyScriptResponse modifyScriptResponse, UnmarshallerContext _ctx) {
		
		modifyScriptResponse.setRequestId(_ctx.stringValue("ModifyScriptResponse.RequestId"));
		modifyScriptResponse.setHttpStatusCode(_ctx.integerValue("ModifyScriptResponse.HttpStatusCode"));
		modifyScriptResponse.setSuccess(_ctx.booleanValue("ModifyScriptResponse.Success"));
		modifyScriptResponse.setChatbotId(_ctx.stringValue("ModifyScriptResponse.ChatbotId"));
		modifyScriptResponse.setCode(_ctx.stringValue("ModifyScriptResponse.Code"));
		modifyScriptResponse.setMessage(_ctx.stringValue("ModifyScriptResponse.Message"));

		Script script = new Script();
		script.setStatus(_ctx.stringValue("ModifyScriptResponse.Script.Status"));
		script.setUpdateTime(_ctx.longValue("ModifyScriptResponse.Script.UpdateTime"));
		script.setIndustry(_ctx.stringValue("ModifyScriptResponse.Script.Industry"));
		script.setScriptDescription(_ctx.stringValue("ModifyScriptResponse.Script.ScriptDescription"));
		script.setIsDrafted(_ctx.booleanValue("ModifyScriptResponse.Script.IsDrafted"));
		script.setDebugStatus(_ctx.stringValue("ModifyScriptResponse.Script.DebugStatus"));
		script.setScriptId(_ctx.stringValue("ModifyScriptResponse.Script.ScriptId"));
		script.setIsDebugDrafted(_ctx.booleanValue("ModifyScriptResponse.Script.IsDebugDrafted"));
		script.setScriptName(_ctx.stringValue("ModifyScriptResponse.Script.ScriptName"));
		script.setScene(_ctx.stringValue("ModifyScriptResponse.Script.Scene"));
		modifyScriptResponse.setScript(script);
	 
	 	return modifyScriptResponse;
	}
}