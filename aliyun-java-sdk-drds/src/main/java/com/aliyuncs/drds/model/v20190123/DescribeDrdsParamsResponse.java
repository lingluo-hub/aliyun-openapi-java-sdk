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

package com.aliyuncs.drds.model.v20190123;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.drds.transform.v20190123.DescribeDrdsParamsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDrdsParamsResponse extends AcsResponse {

	private Boolean success;

	private String requestId;

	private List<ListItem> list;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ListItem> getList() {
		return this.list;
	}

	public void setList(List<ListItem> list) {
		this.list = list;
	}

	public static class ListItem {

		private String paramDefaultValue;

		private String paramLevel;

		private String paramName;

		private String paramType;

		private String paramValue;

		private Boolean needRestart;

		private String paramRanges;

		private Boolean userVisible;

		private String dbName;

		private String paramEnglishName;

		private String paramDesc;

		private String paramVariableName;

		public String getParamDefaultValue() {
			return this.paramDefaultValue;
		}

		public void setParamDefaultValue(String paramDefaultValue) {
			this.paramDefaultValue = paramDefaultValue;
		}

		public String getParamLevel() {
			return this.paramLevel;
		}

		public void setParamLevel(String paramLevel) {
			this.paramLevel = paramLevel;
		}

		public String getParamName() {
			return this.paramName;
		}

		public void setParamName(String paramName) {
			this.paramName = paramName;
		}

		public String getParamType() {
			return this.paramType;
		}

		public void setParamType(String paramType) {
			this.paramType = paramType;
		}

		public String getParamValue() {
			return this.paramValue;
		}

		public void setParamValue(String paramValue) {
			this.paramValue = paramValue;
		}

		public Boolean getNeedRestart() {
			return this.needRestart;
		}

		public void setNeedRestart(Boolean needRestart) {
			this.needRestart = needRestart;
		}

		public String getParamRanges() {
			return this.paramRanges;
		}

		public void setParamRanges(String paramRanges) {
			this.paramRanges = paramRanges;
		}

		public Boolean getUserVisible() {
			return this.userVisible;
		}

		public void setUserVisible(Boolean userVisible) {
			this.userVisible = userVisible;
		}

		public String getDbName() {
			return this.dbName;
		}

		public void setDbName(String dbName) {
			this.dbName = dbName;
		}

		public String getParamEnglishName() {
			return this.paramEnglishName;
		}

		public void setParamEnglishName(String paramEnglishName) {
			this.paramEnglishName = paramEnglishName;
		}

		public String getParamDesc() {
			return this.paramDesc;
		}

		public void setParamDesc(String paramDesc) {
			this.paramDesc = paramDesc;
		}

		public String getParamVariableName() {
			return this.paramVariableName;
		}

		public void setParamVariableName(String paramVariableName) {
			this.paramVariableName = paramVariableName;
		}
	}

	@Override
	public DescribeDrdsParamsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDrdsParamsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
